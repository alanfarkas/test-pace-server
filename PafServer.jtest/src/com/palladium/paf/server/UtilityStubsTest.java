/*
 * UtilityStubsTest.java
 * Created by Jtest on 9/19/06 12:37:43 PM.
 * Updated by Jtest on 10/18/06 4:06:03 PM, 2 test cases added, 4 test cases removed.
 */

package com.palladium.paf.server;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.app.UnitOfWork;
import jtest.mocks.java.util.ListMock;
import org.hibernate.Query;
import org.hibernate.Session;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.server.UtilityStubs;

/**
 * UtilityStubsTest is a unit test class for class UtilityStubs.
 * @see com.palladium.paf.server.UtilityStubs
 * @author Parasoft Jtest 8.0
 */
public class UtilityStubsTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public UtilityStubsTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: static getSampleRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#getSampleRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSampleRuleSets1() throws Throwable {
		// jtest_tested_method
		RuleSet[] RETVAL = UtilityStubs.getSampleRuleSets();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertNotNull(RETVAL[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			RETVAL[0].toString()); // jtest_unverified
		assertNotNull(RETVAL[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			RETVAL[1].toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getTestSliceState()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#getTestSliceState()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTestSliceState1() throws Throwable {
		// jtest_tested_method
		SliceState RETVAL = UtilityStubs.getTestSliceState();
		assertNotNull(RETVAL); // jtest_unverified
		assertNotNull(RETVAL.getLockedCells()); // jtest_unverified
		assertEquals(1, RETVAL.getLockedCells().length); // jtest_unverified
		assertNotNull(RETVAL.getLockedCells()[0]); // jtest_unverified
		assertEquals("( Feb, SLS_DLR, DIV01, ClassChn, FY2005, WP )", RETVAL
			.getLockedCells()[0].toString()); // jtest_unverified
		assertEquals(null, RETVAL.getProtectedCells()); // jtest_unverified
		assertNotNull(RETVAL.getChangedCells()); // jtest_unverified
		assertEquals(2, RETVAL.getChangedCells().length); // jtest_unverified
		assertNotNull(RETVAL.getChangedCells()[0]); // jtest_unverified
		assertEquals(
			"( Q1, SLS_DLR, DPT111, ClassChn, FY2005, WP, StoreTotal )",
			RETVAL.getChangedCells()[0].toString()); // jtest_unverified
		assertNotNull(RETVAL.getChangedCells()[1]); // jtest_unverified
		assertEquals(
			"( Mar, SLS_DLR, DIV01, ClassChn, FY2005, WP, StoreTotal )",
			RETVAL.getChangedCells()[1].toString()); // jtest_unverified
		assertEquals(null, RETVAL.getViewName()); // jtest_unverified
		assertEquals(null, RETVAL.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, RETVAL.getDataSliceParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static getTestUow()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#getTestUow()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTestUow1() throws Throwable {
		// jtest_tested_method
		UnitOfWork RETVAL = UtilityStubs.getTestUow();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain5() throws Throwable {
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		String[] var2 = new String[] {};
		// jtest_tested_method
		UtilityStubs.main(var2);
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "currentSession", argument_types)) {
				return Stubs.makeStubObject(Session.class);
			}
		}
		if (Stubs.matches(method, Session.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "beginTransaction", argument_types)) {
				return null;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "createQuery", argument_types)) {
				return Stubs.makeStubObject(Query.class);
			}
		}
		if (Stubs.matches(method, Query.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "list", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain6() throws Throwable {
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		String[] var2 = new String[] {};
		// jtest_tested_method
		UtilityStubs.main(var2);
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		assertEquals("[null]", _f0.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "currentSession", argument_types)) {
				return Stubs.makeStubObject(Session.class);
			}
		}
		if (Stubs.matches(method, Session.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "beginTransaction", argument_types)) {
				return null;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "createQuery", argument_types)) {
				return Stubs.makeStubObject(Query.class);
			}
		}
		if (Stubs.matches(method, Query.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "list", argument_types)) {
				return _f0;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain17() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		UtilityStubs.main(var1);
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:124)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:133)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:135)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:137)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:139)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:141)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:143)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
				// 
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:145)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:163)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
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
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:134)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					// 
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:136)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					// 
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:138)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					// 
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:140)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					// 
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:142)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					// 
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:144)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					case 7 :
						throw new SQLException();
					// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:146)
					// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.UtilityStubs.clearTreeCache(UtilityStubs.java:155)
				// at com.palladium.paf.server.UtilityStubs.main(UtilityStubs.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static saveApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveApp1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveApp();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveMeasures1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveMeasures();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveRole1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveRole();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveRuleSet()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveRuleSet()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveRuleSet1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveRuleSet();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveSeason()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveSeason()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveSeason1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveSeason();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveTestView()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveTestView()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveTestView1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveTestView();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveUser()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveUser()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveUser1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveUser();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static saveVersionDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see UtilityStubs#saveVersionDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveVersionDef1() throws Throwable {
		// jtest_tested_method
		UtilityStubs.saveVersionDef();
		assertNotNull(UtilityStubs.getSampleRuleSets()); // jtest_unverified
		assertEquals(2, UtilityStubs.getSampleRuleSets().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[0]); // jtest_unverified
		assertEquals(
			"January  =  Week1 + Week2 + Week3 + Week4\nWeek1  =  January - ( Week2 + Week3 + Week4 )\nWeek2  =  January + ( Week1 + Week3 + Week4 )\nWeek3  =  January + ( Week1 + Week2 + Week4 )\nWeek4  =  January + ( Week1 + Week2 + Week3 )\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[0].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleRuleSets()[1]); // jtest_unverified
		assertEquals(
			"StoreTotal  =  Store1 + Store2\nStore1  =  StoreTotal - (Store2)\nStore2  =  StoreTotaL - (Store1)\n\n-----\n",
			UtilityStubs.getSampleRuleSets()[1].toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getLockedCells()); // jtest_unverified
		assertEquals(
			1,
			UtilityStubs.getTestSliceState().getLockedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getProtectedCells()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestSliceState().getChangedCells()); // jtest_unverified
		assertEquals(
			2,
			UtilityStubs.getTestSliceState().getChangedCells().length); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getViewName()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState()
			.getProtectedCellFormulas()); // jtest_unverified
		assertEquals(null, UtilityStubs.getTestSliceState().getDataSliceParms()); // jtest_unverified
		assertNotNull(UtilityStubs.getTestUow()); // jtest_unverified
		assertEquals(
			"UOW: Years : Time : Measures : Version : Product : PlanType : Location : ",
			UtilityStubs.getTestUow().toString()); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()); // jtest_unverified
		assertEquals(1, UtilityStubs.getSampleView().length); // jtest_unverified
		assertNotNull(UtilityStubs.getSampleView()[0]); // jtest_unverified
		assertEquals("System.Default", UtilityStubs.getSampleView()[0]
			.getName()); // jtest_unverified
		assertEquals("Default Sample View", UtilityStubs.getSampleView()[0]
			.getDesc()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getBackGroundColor()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getUserSelections()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0]
			.getViewSectionNames()); // jtest_unverified
		assertEquals(null, UtilityStubs.getSampleView()[0].getPageOrientation()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.UtilityStubsTest
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
            UtilityStubsTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.UtilityStubs",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return UtilityStubs.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ListMock _f0;
                                        	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-1137737007.