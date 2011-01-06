/*
 * ES_EvalBaseTest.java
 * Created by Jtest on 9/19/06 5:19:34 PM.
 * Updated by Jtest on 10/18/06 2:10:42 PM, 27 test cases added, 20 test cases removed.
 * Updated by Jtest on 11/9/06 1:09:00 AM, 25 test cases added, 25 test cases removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.server.PafAppService;
import com.palladium.paf.mdb.IPafConnectionProps;
import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import java.sql.Statement;
import java.sql.PreparedStatement;
import org.hibernate.connection.UserSuppliedConnectionProvider;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import org.hibernate.cfg.SettingsFactory;
import jtest.JT;
import java.util.List;
import com.palladium.paf.data.Intersection;
import java.util.Iterator;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.state.SliceState;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.rules.RuleGroup;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import java.sql.DatabaseMetaData;
import com.palladium.paf.server.ServerSettings;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.sql.Connection;
import org.springframework.context.support.AbstractApplicationContext;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.hibernate.SessionFactory;
import com.palladium.paf.server.PafDataService;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.PafDataCache;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.eval.ES_EvalBase;

/**
 * ES_EvalBaseTest is a unit test class for class ES_EvalBase.
 * @see com.palladium.paf.eval.ES_EvalBase
 * @author Parasoft Jtest 8.0
 */
public class ES_EvalBaseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public ES_EvalBaseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: ES_EvalBase()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#ES_EvalBase()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalBase1() throws Throwable {
		// jtest_tested_method
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
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
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalBase1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalBase1(Member method, Object _this, Object[] args)
		throws Throwable {
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_EvalBase()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#ES_EvalBase()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalBase3() throws Throwable {
		// jtest_tested_method
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalBase3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalBase3(Member method, Object _this, Object[] args)
		throws Throwable {
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: ES_EvalBase()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#ES_EvalBase()
	 * @author Parasoft Jtest 8.0
	 */
	public void testES_EvalBase5() throws Throwable {
		// jtest_tested_method
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testES_EvalBase5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsES_EvalBase5(Member method, Object _this, Object[] args)
		throws Throwable {
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
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections1() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, (Set) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.ES_EvalBase.findIntersections(Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;>
		// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
		// jtest_unverified
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections2() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections4() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var1);
		// ClassCastException thrown
		// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections5() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		String[] var1 = new String[] {};
		_f9 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var2, var3);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
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
					case 2 :
					case 3 :
						return Boolean.FALSE;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections6() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		String[] var1 = new String[] {};
		_f9 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		Set var2 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var2);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_EvalBase.findIntersections(Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;>
		// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections8() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		String[] var1 = new String[] {};
		_f9 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var2, var3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:167)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
				// 
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
				// 
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f9;
					// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections9() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		Object[] var1 = new Object[] {};
		ListMock t1 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t2 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t3 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		_f9 = Intersection.createIntersection(var4, t1, t2, t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var5, var6);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections9(
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
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
				// 
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
				// 
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f9;
					// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:164)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.findIntersections(ES_EvalBase.java:166)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList1() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(
			(Rule) null,
			(EvalState) null,
			(String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.ES_EvalBase.impactingChangeList(Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;Ljava/lang/String;)Ljava/util/Set;>
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
		// jtest_unverified
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList5() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f2 = new PafApplicationDef();
		_f3 = new MdbDef();
		_f3.setYearDim("");
		String[] var1 = new String[] {};
		_f3.setHierDims(var1);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var2 = new String[] {};
		_f3.setAxisPriority(var2);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList((Rule) null, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f3;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList8() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		_f5 = new MdbDef();
		Rule t8 = new Rule();
		Formula t9 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t10 = new Boolean(false);
		_f3.setYearDim("");
		String[] var1 = new String[] {};
		_f3.setHierDims(var1);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var2 = new String[] {};
		_f3.setAxisPriority(var2);
		_f5.setYearDim("");
		String[] var3 = new String[] {};
		_f5.setHierDims(var3);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var4 = new String[] {};
		_f5.setAxisPriority(var4);
		t8.setKey(0);
		t8.setFormula(t9);
		String[] var5 = new String[] {};
		t8.setTriggerMeasures(var5);
		t8.setSkipAggregation(false);
		t8.setSkipAllocation(false);
		t8.setBaseAllocateMeasure("");
		t8.setLockAllocation(false);
		t8.setEvalLockedIntersections(false);
		t8.setCalcAllPeriods(false);
		t8.setLockSystemEvaluationResult(false);
		t8.setLockUserEvaluationResult(t10);
		t8.setLockAllPriorTime(false);
		t8.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t8, t3, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList8(
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
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					case 2 :
						return _f4;
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
						return _f3;
					case 2 :
						return _f5;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList9() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		_f5 = new MdbDef();
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f5.setYearDim("");
		String[] var8 = new String[] {};
		_f5.setHierDims(var8);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var9 = new String[] {};
		_f5.setAxisPriority(var9);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList((Rule) null, t3, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_EvalBase.impactingChangeList(Lcom/palladium/paf/rules/Rule;Lcom/palladium/paf/state/EvalState;Ljava/lang/String;)Ljava/util/Set;>
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList10() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f4.setPlanCycles(var8);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var12);
		_f5.setYearDim("");
		String[] var13 = new String[] {};
		_f5.setHierDims(var13);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var14 = new String[] {};
		_f5.setAxisPriority(var14);
		t12.setKey(0);
		t12.setFormula(t13);
		String[] var15 = new String[] {};
		t12.setTriggerMeasures(var15);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, t10.getDimCount()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t6.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList12() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
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
		_f2 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t16 = new SeasonList();
		MdbDef t17 = new MdbDef();
		_f5 = new MdbDef();
		Rule t19 = new Rule();
		CustomFunctionDef[] var2 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t20 = new MeasureFunctionFactory(
			var2,
			(ClassLoader) null);
		Formula t21 = new Formula("0", " ", t20);
		Boolean t22 = new Boolean(false);
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
		_f2.setSeasonList(t12);
		_f2.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f2.setPlanCycles(var6);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t13);
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
		_f4.setSeasonList(t16);
		_f4.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		_f4.setPlanCycles(var13);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t17);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var16);
		Map var17 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var17);
		_f5.setYearDim("");
		String[] var18 = new String[] {};
		_f5.setHierDims(var18);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var19 = new String[] {};
		_f5.setAxisPriority(var19);
		t19.setKey(0);
		t19.setFormula(t21);
		String[] var20 = new String[] { null };
		t19.setTriggerMeasures(var20);
		t19.setSkipAggregation(false);
		t19.setSkipAllocation(false);
		t19.setBaseAllocateMeasure("");
		t19.setLockAllocation(false);
		t19.setEvalLockedIntersections(false);
		t19.setCalcAllPeriods(false);
		t19.setLockSystemEvaluationResult(false);
		t19.setLockUserEvaluationResult(t22);
		t19.setLockAllPriorTime(false);
		t19.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t19, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getCurrentTimeBasedChanges",
				argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:64)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureDim", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList13() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
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
		_f2 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f5 = new MdbDef();
		Rule t20 = new Rule();
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
		_f2.setSeasonList(t13);
		_f2.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f2.setPlanCycles(var5);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t14);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var9);
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
		_f4.setSeasonList(t17);
		_f4.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f4.setPlanCycles(var12);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t18);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var16);
		_f5.setYearDim("");
		String[] var17 = new String[] {};
		_f5.setHierDims(var17);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var18 = new String[] {};
		_f5.setAxisPriority(var18);
		t20.setKey(0);
		t20.setFormula(t21);
		String[] var19 = new String[] {};
		t20.setTriggerMeasures(var19);
		t20.setSkipAggregation(false);
		t20.setSkipAllocation(false);
		t20.setBaseAllocateMeasure("");
		t20.setLockAllocation(false);
		t20.setEvalLockedIntersections(false);
		t20.setCalcAllPeriods(false);
		t20.setLockSystemEvaluationResult(false);
		t20.setLockUserEvaluationResult(t22);
		t20.setLockAllPriorTime(false);
		t20.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t20, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.Formula.getTermMeasures(Formula.java:222)
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList13(
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
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList14() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"()",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		_f2.setMdbDef(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var3);
		_f3.setYearDim("");
		String[] var4 = new String[] {};
		_f3.setHierDims(var4);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var5 = new String[] {};
		_f3.setAxisPriority(var5);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f4.setPlanCycles(var6);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var10);
		_f5.setYearDim("");
		String[] var11 = new String[] {};
		_f5.setHierDims(var11);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var12 = new String[] {};
		_f5.setAxisPriority(var12);
		t12.setKey(0);
		t13.setExpression("*+,");
		String[] var13 = new String[] {};
		t13.setExpressionTerms(var13);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		t12.setFormula(t13);
		String[] var14 = new String[] { null };
		t12.setTriggerMeasures(var14);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f3.getDimCount()); // jtest_unverified
		assertEquals(5, t10.getDimCount()); // jtest_unverified
		assertEquals(5, _f5.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getCurrentTimeBasedChanges",
				argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:64)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList15() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState((SliceState) null, t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f4.setPlanCycles(var8);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var12);
		_f5.setYearDim("");
		String[] var13 = new String[] {};
		_f5.setHierDims(var13);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var14 = new String[] {};
		_f5.setAxisPriority(var14);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureDim", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList22() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		String[] var1 = new String[] {};
		_f9 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f2.setPlanCycles(var2);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var6);
		_f3.setYearDim("");
		String[] var7 = new String[] {};
		_f3.setHierDims(var7);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var8 = new String[] {};
		_f3.setAxisPriority(var8);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f4.setPlanCycles(var9);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var13);
		_f5.setYearDim("");
		String[] var14 = new String[] {};
		_f5.setHierDims(var14);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var15 = new String[] {};
		_f5.setAxisPriority(var15);
		t12.setKey(0);
		t13.setExpression("");
		String[] var16 = new String[] {};
		t13.setExpressionTerms(var16);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		t12.setFormula(t13);
		String[] var17 = new String[] { null };
		t12.setTriggerMeasures(var17);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getCurrentTimeBasedChanges",
				argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:64)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList24() throws Throwable {
		_f2 = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f3 = new MdbDef();
		_f5 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		_f11 = new MdbDef();
		_f12 = new MdbDef();
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t11 = new ClientInitRequest();
		PafClientState t12 = new PafClientState((String) null, t11);
		EvalState t13 = new EvalState(t12);
		_f13 = new PafApplicationDef();
		_f14 = new MdbDef();
		_f15 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f16 = new MdbDef();
		Rule t20 = new Rule();
		Formula t21 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t22 = new Boolean(false);
		Object[] var1 = new Object[] {};
		ListMock t23 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t24 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t25 = new ListMock(var3);
		String[] var4 = new String[] { "", null };
		_f9 = Intersection.createIntersection(var4, t23, t25, t24);
		_f2.setSeasonList(t1);
		_f2.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f2.setPlanCycles(var5);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t2.setYearDim("");
		String[] var6 = new String[] {};
		t2.setHierDims(var6);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var7 = new String[] {};
		t2.setAxisPriority(var7);
		_f2.setMdbDef(t2);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var9);
		_f3.setYearDim("");
		String[] var10 = new String[] { null, null, null, null, null };
		_f3.setHierDims(var10);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var11 = new String[] {};
		_f3.setAxisPriority(var11);
		_f5.setYearDim("");
		String[] var12 = new String[] {};
		_f5.setHierDims(var12);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var13 = new String[] {};
		_f5.setAxisPriority(var13);
		_f4.setSeasonList(t6);
		_f4.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f4.setPlanCycles(var14);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
		_f4.setMdbDef(t7);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var16);
		_f11.setYearDim("");
		String[] var17 = new String[] { null, null, null, null, null, null };
		_f11.setHierDims(var17);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var18 = new String[] {};
		_f11.setAxisPriority(var18);
		_f12.setYearDim("");
		String[] var19 = new String[] {};
		_f12.setHierDims(var19);
		_f12.setMeasureDim("");
		_f12.setPlanTypeDim("");
		_f12.setTimeDim("");
		_f12.setVersionDim("");
		_f12.setDataSourceId("");
		String[] var20 = new String[] {};
		_f12.setAxisPriority(var20);
		_f14.setYearDim("");
		String[] var21 = new String[] {};
		_f14.setHierDims(var21);
		_f14.setMeasureDim("");
		_f14.setPlanTypeDim("");
		_f14.setTimeDim("");
		_f14.setVersionDim("");
		_f14.setDataSourceId("");
		String[] var22 = new String[] {};
		_f14.setAxisPriority(var22);
		_f15.setSeasonList(t17);
		_f15.setAppId("");
		PlanCycle[] var23 = new PlanCycle[] {};
		_f15.setPlanCycles(var23);
		_f15.setLastPeriod("");
		_f15.setCurrentYear("");
		_f15.setMdbDef(t18);
		Map var24 = (Map) Stubs.makeStubObject(Map.class);
		_f15.setMeasures(var24);
		Map var25 = (Map) Stubs.makeStubObject(Map.class);
		_f15.setVersions(var25);
		_f16.setYearDim("");
		String[] var26 = new String[] {};
		_f16.setHierDims(var26);
		_f16.setMeasureDim("");
		_f16.setPlanTypeDim("");
		_f16.setTimeDim("");
		_f16.setVersionDim("");
		_f16.setDataSourceId("");
		String[] var27 = new String[] {};
		_f16.setAxisPriority(var27);
		t20.setKey(0);
		t21.setExpression("");
		String[] var28 = new String[] {};
		t21.setExpressionTerms(var28);
		t21.setResultTerm("");
		t21.setResultFunction(false);
		t21.setParsed(false);
		t20.setFormula(t21);
		String[] var29 = new String[] { null };
		t20.setTriggerMeasures(var29);
		t20.setSkipAggregation(false);
		t20.setSkipAllocation(false);
		t20.setBaseAllocateMeasure("");
		t20.setLockAllocation(false);
		t20.setEvalLockedIntersections(false);
		t20.setCalcAllPeriods(false);
		t20.setLockSystemEvaluationResult(false);
		t20.setLockUserEvaluationResult(t22);
		t20.setLockAllPriorTime(false);
		t20.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t20, t13, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2, _f4 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					case 2 :
						return _f5;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					case 3 :
						return _f11;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					case 4 :
						return _f12;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
					case 5 :
						return _f14;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 6 :
						return _f16;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f13;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f15;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getCurrentTimeBasedChanges",
				argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:64)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f9;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList26() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		String[] var1 = new String[] { "" };
		_f10 = new Intersection(var1);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f2.setPlanCycles(var2);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var6);
		_f3.setYearDim("");
		String[] var7 = new String[] {};
		_f3.setHierDims(var7);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var8 = new String[] {};
		_f3.setAxisPriority(var8);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f4.setPlanCycles(var9);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var12);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var13);
		_f5.setYearDim("");
		String[] var14 = new String[] {};
		_f5.setHierDims(var14);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var15 = new String[] {};
		_f5.setAxisPriority(var15);
		t12.setKey(0);
		t13.setExpression("");
		String[] var16 = new String[] {};
		t13.setExpressionTerms(var16);
		t13.setResultTerm("");
		t13.setResultFunction(false);
		t13.setParsed(false);
		t12.setFormula(t13);
		String[] var17 = new String[] { null };
		t12.setTriggerMeasures(var17);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList26(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getCurrentTimeBasedChanges",
				argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:64)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f10;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:65)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList33() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		_f6 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		_f2.setMdbDef(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var3);
		_f3.setYearDim("");
		String[] var4 = new String[] {};
		_f3.setHierDims(var4);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var5 = new String[] {};
		_f3.setAxisPriority(var5);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		_f4.setPlanCycles(var6);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var10);
		_f5.setYearDim("");
		String[] var11 = new String[] {};
		_f5.setHierDims(var11);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var12 = new String[] {};
		_f5.setAxisPriority(var12);
		t12.setKey(0);
		t12.setFormula(t13);
		String[] var13 = new String[] {};
		t12.setTriggerMeasures(var13);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		_f6.setExpression("");
		String[] var14 = new String[] { null };
		_f6.setExpressionTerms(var14);
		_f6.setResultTerm("");
		_f6.setResultFunction(false);
		_f6.setParsed(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.rules.Formula.getTermMeasures(Formula.java:225)
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList33.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList33(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				return new String[0];
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f6;
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList34() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t9 = new SeasonList();
		MdbDef t10 = new MdbDef();
		_f5 = new MdbDef();
		Rule t12 = new Rule();
		Formula t13 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t14 = new Boolean(false);
		_f6 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f2.setSeasonList(t5);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
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
		_f2.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f3.setYearDim("");
		String[] var6 = new String[] {};
		_f3.setHierDims(var6);
		_f3.setMeasureDim("");
		_f3.setPlanTypeDim("");
		_f3.setTimeDim("");
		_f3.setVersionDim("");
		_f3.setDataSourceId("");
		String[] var7 = new String[] {};
		_f3.setAxisPriority(var7);
		_f4.setSeasonList(t9);
		_f4.setAppId("");
		PlanCycle[] var8 = new PlanCycle[] {};
		_f4.setPlanCycles(var8);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
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
		_f4.setMdbDef(t10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var12);
		_f5.setYearDim("");
		String[] var13 = new String[] {};
		_f5.setHierDims(var13);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var14 = new String[] {};
		_f5.setAxisPriority(var14);
		t12.setKey(0);
		t12.setFormula(t13);
		String[] var15 = new String[] {};
		t12.setTriggerMeasures(var15);
		t12.setSkipAggregation(false);
		t12.setSkipAllocation(false);
		t12.setBaseAllocateMeasure("");
		t12.setLockAllocation(false);
		t12.setEvalLockedIntersections(false);
		t12.setCalcAllPeriods(false);
		t12.setLockSystemEvaluationResult(false);
		t12.setLockUserEvaluationResult(t14);
		t12.setLockAllPriorTime(false);
		t12.setInitialTBFirstAllocation(false);
		_f6.setExpression("");
		String[] var16 = new String[] {};
		_f6.setExpressionTerms(var16);
		_f6.setResultTerm("");
		_f6.setResultFunction(false);
		_f6.setParsed(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t12, t3, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList34.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList34(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTriggerMeasures", argument_types)) {
				return new String[0];
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f6;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
					case 2 :
						return null;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTermMeasures", argument_types)) {
				return new String[1];
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#impactingChangeList(com.palladium.paf.rules.Rule,com.palladium.paf.state.EvalState,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImpactingChangeList37() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		EvalState t3 = new EvalState(t2);
		_f2 = new PafApplicationDef();
		_f3 = new MdbDef();
		_f4 = new PafApplicationDef();
		SeasonList t7 = new SeasonList();
		MdbDef t8 = new MdbDef();
		_f5 = new MdbDef();
		Rule t10 = new Rule();
		Formula t11 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t12 = new Boolean(false);
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f6 = new Formula((String) null, "", var1);
		_f7 = new Formula((String) null, "", (MeasureFunctionFactory) null);
		_f4.setSeasonList(t7);
		_f4.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f4.setPlanCycles(var2);
		_f4.setLastPeriod("");
		_f4.setCurrentYear("");
		t8.setYearDim("");
		String[] var3 = new String[] {};
		t8.setHierDims(var3);
		t8.setMeasureDim("");
		t8.setPlanTypeDim("");
		t8.setTimeDim("");
		t8.setVersionDim("");
		t8.setDataSourceId("");
		String[] var4 = new String[] {};
		t8.setAxisPriority(var4);
		_f4.setMdbDef(t8);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f4.setVersions(var6);
		_f5.setYearDim("");
		String[] var7 = new String[] {};
		_f5.setHierDims(var7);
		_f5.setMeasureDim("");
		_f5.setPlanTypeDim("");
		_f5.setTimeDim("");
		_f5.setVersionDim("");
		_f5.setDataSourceId("");
		String[] var8 = new String[] {};
		_f5.setAxisPriority(var8);
		t10.setKey(0);
		t11.setExpression("");
		String[] var9 = new String[] {};
		t11.setExpressionTerms(var9);
		t11.setResultTerm("");
		t11.setResultFunction(false);
		t11.setParsed(false);
		t10.setFormula(t11);
		String[] var10 = new String[] {};
		t10.setTriggerMeasures(var10);
		t10.setSkipAggregation(false);
		t10.setSkipAllocation(false);
		t10.setBaseAllocateMeasure("");
		t10.setLockAllocation(false);
		t10.setEvalLockedIntersections(false);
		t10.setCalcAllPeriods(false);
		t10.setLockSystemEvaluationResult(false);
		t10.setLockUserEvaluationResult(t12);
		t10.setLockAllPriorTime(false);
		t10.setInitialTBFirstAllocation(false);
		_f7.setExpression("");
		String[] var11 = new String[] {};
		_f7.setExpressionTerms(var11);
		_f7.setResultTerm("");
		_f7.setResultFunction(false);
		_f7.setParsed(false);
		// jtest_tested_method
		Set RETVAL = THIS.impactingChangeList(t10, t3, (String) null);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImpactingChangeList37.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImpactingChangeList37(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.state.EvalState.getAppDef()");
				switch (index) {
					case 1 :
						return _f2;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f4;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f3;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:54)
					case 2 :
						return _f5;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:55)
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
						return _f6;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
					case 2 :
						return _f7;
					// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:84)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTermMeasures", argument_types)) {
				return new String[1];
				// at com.palladium.paf.eval.ES_EvalBase.impactingChangeList(ES_EvalBase.java:82)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail1() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		// jtest_tested_method
		THIS.logEvalDetail(
			(IEvalStep) null,
			(EvalState) null,
			(PafDataCache) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafDataService.class);
			}
		}
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
				return "";
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail8() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		THIS.logEvalDetail(
			(IEvalStep) null,
			(EvalState) null,
			(PafDataCache) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.ES_EvalBase.logEvalDetail(Lcom/palladium/paf/eval/IEvalStep;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;)V>
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.lang.Class.forName(java.lang.String)");
				switch (index) {
					case 1 :
					case 3 :
						return java.lang.Object.class;
					// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
					// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					// 
					// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
					// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					case 2 :
						throw new ClassNotFoundException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail10() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		_f8 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { null },
			new Class[] { SettingsFactory.class });
		ClientInitRequest t3 = new ClientInitRequest();
		PafClientState t4 = new PafClientState((String) null, t3);
		EvalState t5 = new EvalState(t4);
		_f1 = new Rule();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		// jtest_tested_method
		THIS.logEvalDetail((IEvalStep) null, t5, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.Rule.toString(Rule.java:66)
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail10(
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.lang.Class.forName(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 4 :
						return java.lang.Object.class;
					// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
					// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					// 
					// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
					// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					case 3 :
						throw new ClassNotFoundException();
					// at jtest.wbstubs.java.sql.DriverManagerWBS.class$(DriverManagerWBS.java:14)
					// at jtest.wbstubs.java.sql.DriverManagerWBS.getConnection(DriverManagerWBS.java:28)
					// at java.sql.DriverManager.getConnection
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				throw new NoClassDefFoundError();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail11() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		SettingsFactory t3 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f8 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t3 },
			new Class[] { SettingsFactory.class });
		ClientInitRequest t4 = new ClientInitRequest();
		PafClientState t5 = new PafClientState((String) null, t4);
		MemberTreeSet t6 = new MemberTreeSet();
		PafSecurityToken t7 = new PafSecurityToken();
		PafApplicationDef t8 = new PafApplicationDef();
		String[] var1 = new String[] { null, null, null };
		UnitOfWork t9 = new UnitOfWork(var1);
		PafPlannerRole t10 = new PafPlannerRole();
		Season t11 = new Season();
		PafPlannerConfig t12 = new PafPlannerConfig();
		EvalState t13 = new EvalState(t5);
		Object[] var2 = new Object[] {};
		ListMock t14 = new ListMock(var2);
		RuleGroup t15 = new RuleGroup();
		Rule t16 = new Rule();
		Long t17 = new Long("0");
		RuleSet t18 = new RuleSet();
		ClientInitRequest t19 = new ClientInitRequest();
		PafClientState t20 = new PafClientState((String) null, t19);
		_f1 = new Rule();
		Formula t22 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t23 = new Boolean(false);
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		t4.setClientType("");
		t4.setClientVersion("");
		t4.setIpAddress("");
		t4.setClientLanguage("0");
		t5.setUowTrees(t6);
		t5.setSecurityToken(t7);
		t5.setApp(t8);
		t5.setUnitOfWork(t9);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t5.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t5.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t5.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t5.setLockedNotPlannableInterMap(var6);
		t5.setPlannerRole(t10);
		t5.setPlanSeason(t11);
		t5.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t5.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t5.setActiveVersions(var8);
		t5.setPlannerConfig(t12);
		t13.setTimePeriodList(t14);
		t13.setRuleGroup(t15);
		t13.setRule(t16);
		t13.setStartTime(t17);
		HashSet var9 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setForcedCalcs(var9);
		HashSet var10 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setRequiredCalcs(var10);
		t13.setMeasureRuleSet(t18);
		t13.setStateChanged(false);
		t13.setClientState(t20);
		t13.setTimeSliceMode(false);
		_f1.setKey(0);
		_f1.setFormula(t22);
		String[] var11 = new String[] {};
		_f1.setTriggerMeasures(var11);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t23);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.logEvalDetail((IEvalStep) null, t13, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail11(
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.getDatabaseMajorVersion(SettingsFactory.java:288)
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:76)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new SQLException();
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail13() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		SettingsFactory t3 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f8 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t3 },
			new Class[] { SettingsFactory.class });
		ClientInitRequest t4 = new ClientInitRequest();
		PafClientState t5 = new PafClientState((String) null, t4);
		EvalState t6 = new EvalState(t5);
		Object[] var1 = new Object[] {};
		ListMock t7 = new ListMock(var1);
		RuleGroup t8 = new RuleGroup();
		Rule t9 = new Rule();
		Formula t10 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t11 = new Boolean(false);
		Long t12 = new Long("0");
		RuleSet t13 = new RuleSet();
		ClientInitRequest t14 = new ClientInitRequest();
		PafClientState t15 = new PafClientState((String) null, t14);
		MemberTreeSet t16 = new MemberTreeSet();
		PafSecurityToken t17 = new PafSecurityToken();
		Boolean t18 = new Boolean(false);
		PafApplicationDef t19 = new PafApplicationDef();
		SeasonList t20 = new SeasonList();
		MdbDef t21 = new MdbDef();
		String[] var2 = new String[] { null, null, null, null, null };
		UnitOfWork t22 = new UnitOfWork(var2);
		PafPlannerRole t23 = new PafPlannerRole();
		Season t24 = new Season();
		PafPlannerConfig t25 = new PafPlannerConfig();
		_f1 = new Rule();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		t6.setTimePeriodList(t7);
		t6.setRuleGroup(t8);
		t9.setKey(0);
		t9.setFormula(t10);
		String[] var3 = new String[] {};
		t9.setTriggerMeasures(var3);
		t9.setSkipAggregation(false);
		t9.setSkipAllocation(false);
		t9.setBaseAllocateMeasure("");
		t9.setLockAllocation(false);
		t9.setEvalLockedIntersections(false);
		t9.setCalcAllPeriods(false);
		t9.setLockSystemEvaluationResult(false);
		t9.setLockUserEvaluationResult(t11);
		t9.setLockAllPriorTime(false);
		t9.setInitialTBFirstAllocation(false);
		t6.setRule(t9);
		t6.setStartTime(t12);
		HashSet var4 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t6.setForcedCalcs(var4);
		HashSet var5 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t6.setRequiredCalcs(var5);
		t6.setMeasureRuleSet(t13);
		t6.setStateChanged(false);
		t14.setClientType("");
		t14.setClientVersion("");
		t14.setIpAddress("");
		t14.setClientLanguage("0");
		t15.setUowTrees(t16);
		t17.setUserName("");
		t17.setValid(false);
		t17.setSessionToken("");
		t17.setAdmin(t18);
		t15.setSecurityToken(t17);
		t19.setSeasonList(t20);
		t19.setAppId("");
		PlanCycle[] var6 = new PlanCycle[] {};
		t19.setPlanCycles(var6);
		t19.setLastPeriod("");
		t19.setCurrentYear("");
		t19.setMdbDef(t21);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t19.setMeasures(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t19.setVersions(var8);
		t15.setApp(t19);
		t15.setUnitOfWork(t22);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t15.setRuleSets(var9);
		Set var10 = (Set) Stubs.makeStubObject(Set.class);
		t15.setLockedPeriods(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t15.setLockedForwardPlannableInterMap(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		t15.setLockedNotPlannableInterMap(var12);
		t23.setRoleDesc("");
		t23.setRoleName("");
		t23.setPlanType("");
		t23.setPlanVersion("");
		String[] var13 = new String[] {};
		t23.setSeasonIds(var13);
		t15.setPlannerRole(t23);
		t24.setOpen(false);
		PafDimSpec[] var14 = new PafDimSpec[] {};
		t24.setOtherDims(var14);
		t24.setYear("");
		t24.setId("");
		t24.setTimePeriod("");
		t24.setPlanCycle("");
		t15.setPlanSeason(t24);
		t15.setClientLanguage("");
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		t15.setUserSelections(var15);
		Set var16 = (Set) Stubs.makeStubObject(Set.class);
		t15.setActiveVersions(var16);
		t25.setCycle("");
		String[] var17 = new String[] {};
		t25.setMenuItemNames(var17);
		t25.setRole("");
		String[] var18 = new String[] {};
		t25.setViewTreeItemNames(var18);
		t25.setDefaultEvalEnabled(false);
		t25.setDefaultRulesetName("");
		String[] var19 = new String[] {};
		t25.setRuleSetNames(var19);
		String[] var20 = new String[] {};
		t25.setVersionFilter(var20);
		t15.setPlannerConfig(t25);
		t6.setClientState(t15);
		t6.setTimeSliceMode(false);
		// jtest_tested_method
		THIS.logEvalDetail((IEvalStep) null, t6, (PafDataCache) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.ES_EvalBase.logEvalDetail(Lcom/palladium/paf/eval/IEvalStep;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/mdb/PafDataCache;)V>
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:192)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail13(
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.getDatabaseMajorVersion(SettingsFactory.java:288)
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:76)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					case 2 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "toString", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail14() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		_f8 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { null },
			new Class[] { SettingsFactory.class });
		ClientInitRequest t3 = new ClientInitRequest();
		PafClientState t4 = new PafClientState((String) null, t3);
		EvalState t5 = new EvalState(t4);
		_f1 = new Rule();
		Formula t7 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t8 = new Boolean(false);
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		_f1.setKey(0);
		t7.setExpression("");
		String[] var1 = new String[] {};
		t7.setExpressionTerms(var1);
		t7.setResultTerm("");
		t7.setResultFunction(false);
		t7.setParsed(false);
		_f1.setFormula(t7);
		String[] var2 = new String[] {};
		_f1.setTriggerMeasures(var2);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t8);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.logEvalDetail((IEvalStep) null, t5, (PafDataCache) null);
		// NullPointerException thrown
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:145)
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:163)
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail14(
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.sql.PreparedStatement.executeUpdate()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					case 2 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[1];
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ES_EvalBase#logEvalDetail(com.palladium.paf.eval.IEvalStep,com.palladium.paf.state.EvalState,com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLogEvalDetail15() throws Throwable {
		ES_EvalBase THIS = new ES_EvalBase() {
			public void performEvaluation(
				EvalState arg0,
				PafDataCache arg1,
				IFormulaEvalEngine arg2) {
			}
		};
		_f0 = new ServerSettings();
		SettingsFactory t3 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f8 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t3 },
			new Class[] { SettingsFactory.class });
		ClientInitRequest t4 = new ClientInitRequest();
		PafClientState t5 = new PafClientState((String) null, t4);
		MemberTreeSet t6 = new MemberTreeSet();
		PafSecurityToken t7 = new PafSecurityToken();
		PafApplicationDef t8 = new PafApplicationDef();
		String[] var1 = new String[] { null, null, null, null, null, null };
		UnitOfWork t9 = new UnitOfWork(var1);
		PafPlannerRole t10 = new PafPlannerRole();
		Season t11 = new Season();
		PafPlannerConfig t12 = new PafPlannerConfig();
		EvalState t13 = new EvalState(t5);
		Object[] var2 = new Object[] {};
		ListMock t14 = new ListMock(var2);
		RuleGroup t15 = new RuleGroup();
		Boolean t16 = new Boolean(false);
		Rule t17 = new Rule();
		Long t18 = new Long("0");
		RuleSet t19 = new RuleSet();
		ClientInitRequest t20 = new ClientInitRequest();
		PafClientState t21 = new PafClientState((String) null, t20);
		_f1 = new Rule();
		Formula t23 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t24 = new Boolean(false);
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(false);
		_f0.setEvaluationStepLogging(false);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(false);
		t4.setClientType("");
		t4.setClientVersion("");
		t4.setIpAddress("");
		t4.setClientLanguage("0");
		t5.setUowTrees(t6);
		t5.setSecurityToken(t7);
		t5.setApp(t8);
		t5.setUnitOfWork(t9);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t5.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t5.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t5.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t5.setLockedNotPlannableInterMap(var6);
		t5.setPlannerRole(t10);
		t5.setPlanSeason(t11);
		t5.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t5.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t5.setActiveVersions(var8);
		t5.setPlannerConfig(t12);
		t13.setTimePeriodList(t14);
		Rule[] var9 = new Rule[] {};
		t15.setRules(var9);
		t15.setRuleGroupId("");
		t15.setBalanceSetKey("");
		t15.setPerpetual(false);
		t15.setDelayedPerpetual(false);
		t15.setSkipProtProc(false);
		t15.setPerpetualAllocation(false);
		t15.setPerformInitialAllocation(t16);
		t13.setRuleGroup(t15);
		t13.setRule(t17);
		t13.setStartTime(t18);
		HashSet var10 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setForcedCalcs(var10);
		HashSet var11 = (HashSet) Stubs.makeStubObject(HashSet.class);
		t13.setRequiredCalcs(var11);
		t19.setDimension("");
		t19.setType(0);
		t19.setName("");
		String[] var12 = new String[] {};
		t19.setMeasureList(var12);
		t13.setMeasureRuleSet(t19);
		t13.setStateChanged(false);
		t13.setClientState(t21);
		t13.setTimeSliceMode(false);
		_f1.setKey(0);
		_f1.setFormula(t23);
		String[] var13 = new String[] {};
		_f1.setTriggerMeasures(var13);
		_f1.setSkipAggregation(false);
		_f1.setSkipAllocation(false);
		_f1.setBaseAllocateMeasure("");
		_f1.setLockAllocation(false);
		_f1.setEvalLockedIntersections(false);
		_f1.setCalcAllPeriods(false);
		_f1.setLockSystemEvaluationResult(false);
		_f1.setLockUserEvaluationResult(t24);
		_f1.setLockAllPriorTime(false);
		_f1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		THIS.logEvalDetail((IEvalStep) null, t13, (PafDataCache) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:142)
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:163)
		// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLogEvalDetail15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLogEvalDetail15(
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:559)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.Configuration.class$(Configuration.java:111)
				// at org.hibernate.cfg.Configuration.<clinit>(Configuration.java:111)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.<clinit>(SettingsFactory.java:46)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at org.hibernate.cfg.SettingsFactory.class$(SettingsFactory.java:46)
				// at org.hibernate.cfg.SettingsFactory.getDatabaseMajorVersion(SettingsFactory.java:288)
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:76)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					// 
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					case 3 :
						throw new SQLException();
					// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
					// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if ("org.hibernate.cfg.Configuration".equals(method.getDeclaringClass()
			.getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
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
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs
				.matches(method, "isEvaluationStepLogging", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:187)
			}
		}
		if (Stubs.matches(method, EvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "init", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeMember", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRule", argument_types)) {
				return _f1;
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentChangedCells", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "toString", argument_types)) {
				return "";
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:190)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[2];
				// at com.palladium.paf.eval.ES_EvalBase.logEvalDetail(ES_EvalBase.java:191)
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
     * Usage: java com.palladium.paf.eval.ES_EvalBaseTest
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
            ES_EvalBaseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.ES_EvalBase",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return ES_EvalBase.class;
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
private Rule _f1;
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
private PafApplicationDef _f4;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f5;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Formula _f6;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Formula _f7;
        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private com.palladium.paf.data.Intersection _f9;
    	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Configuration _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f15;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f16;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f17;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f18;
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
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f21;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f22;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f23;
}

// JTEST_CURRENT_ID=238404526.