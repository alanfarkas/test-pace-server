/*
 * EsbCalculateTest.java
 * Created by Jtest on 9/19/06 4:55:23 PM.
 * Updated by Jtest on 10/18/06 6:42:44 PM, 15 test cases added, 15 test cases removed.
 * Updated by Jtest on 11/9/06 2:20:46 AM, 15 test cases added, 15 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import com.palladium.paf.PafException;
import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import java.io.File;
import com.essbase.api.session.Essbase;
import com.essbase.api.datasource.IEssOlapApplication;
import com.essbase.api.datasource.IEssOlapServer;
import com.essbase.api.domain.IEssDomain;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbCalculate;

/**
 * EsbCalculateTest is a unit test class for class EsbCalculate.
 * @see com.palladium.paf.mdb.essbase.EsbCalculate
 * @author Parasoft Jtest 8.0
 */
public class EsbCalculateTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbCalculateTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: EsbCalculate(java.util.Properties,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#EsbCalculate(java.util.Properties,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCalculate1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCalculate THIS = new EsbCalculate(var1, "", true);
		assertEquals("", THIS.getDataSourceID()); // jtest_unverified
		assertEquals(true, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCalculate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCalculate1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCalculate(java.util.Properties,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#EsbCalculate(java.util.Properties,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCalculate3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		assertEquals(null, THIS.getDataSourceID()); // jtest_unverified
		assertEquals(true, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCalculate3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCalculate3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCalculate(java.util.Properties,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#EsbCalculate(java.util.Properties,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCalculate4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCalculate THIS = new EsbCalculate(var1, "");
		assertEquals("", THIS.getDataSourceID()); // jtest_unverified
		assertEquals(true, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCalculate4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCalculate4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCalculate(java.util.Properties,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#EsbCalculate(java.util.Properties,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCalculate5() throws Throwable {
		// jtest_tested_method
		EsbCalculate THIS = new EsbCalculate((Properties) null, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbCalculate.<init>(Ljava/util/Properties;Ljava/lang/String;)V>
		// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
		// jtest_unverified
	}

	/**
	 * Test for method: getConnectionProps()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#getConnectionProps()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnectionProps1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, "", true);
		// jtest_tested_method
		Properties RETVAL = THIS.getConnectionProps();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnectionProps1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnectionProps1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataSourceID()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#getDataSourceID()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSourceID1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, "", true);
		// jtest_tested_method
		String RETVAL = THIS.getDataSourceID();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataSourceID1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataSourceID1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isUseConnPool()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#isUseConnPool()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsUseConnPool1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isUseConnPool();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsUseConnPool1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsUseConnPool1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((IEssCube) null, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(Lcom/essbase/api/datasource/IEssCube;Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:123)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		IEssCube var2 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript(var2, (String) null);
		assertEquals("Error occured", RETVAL); // jtest_unverified
		assertEquals(null, THIS.getDataSourceID()); // jtest_unverified
		assertEquals(false, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class };
			if (Stubs.matches(method, "calculate", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:123)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		IEssCube var2 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript(var2, (String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(null, THIS.getDataSourceID()); // jtest_unverified
		assertEquals(false, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class };
			if (Stubs.matches(method, "calculate", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:123)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, "", true);
		IEssCube var2 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript(var2, "");
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("", THIS.getDataSourceID()); // jtest_unverified
		assertEquals(true, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class };
			if (Stubs.matches(method, "calculate", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:123)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript8() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Cannot sign on user. Invalid sign on attempt.
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
		// Caused by: com.essbase.api.base.EssException: Cannot sign on user. Invalid sign on attempt.
		// at com.essbase.api.session.Essbase.signOn_internal(Essbase.java:337)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:307)
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript10() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[] { Properties.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript11() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: com.palladium.paf.PafException
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript12() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:96)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[] { Properties.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCube.class);
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript13() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(null, THIS.getDataSourceID()); // jtest_unverified
		assertEquals(true, THIS.isUseConnPool()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[] { Properties.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCube.class);
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssCube", argument_types)) {
				return Stubs.makeStubObject(IEssCube.class);
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:103)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class };
			if (Stubs.matches(method, "calculate", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:96)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript14() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript15() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[] { Properties.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCube.class);
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssCube", argument_types)) {
				return Stubs.makeStubObject(IEssCube.class);
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:103)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class };
			if (Stubs.matches(method, "calculate", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:96)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript16() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript16(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:109)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript19() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript20() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript21() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runCalcScript(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runCalcScript(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunCalcScript22() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.runCalcScript((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunCalcScript22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunCalcScript22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runCalcScript(EsbCalculate.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runTokenizedCalcScript(java.lang.String,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runTokenizedCalcScript(java.lang.String,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunTokenizedCalcScript1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		THIS.runTokenizedCalcScript((String) null, (Properties) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:196)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunTokenizedCalcScript1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunTokenizedCalcScript1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:160)
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "deleteOnExit", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToFile(EsbUtility.java:64)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:164)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runTokenizedCalcScript(java.lang.String,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalculate#runTokenizedCalcScript(java.lang.String,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunTokenizedCalcScript2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCalculate THIS = new EsbCalculate(var1, (String) null, false);
		// jtest_tested_method
		THIS.runTokenizedCalcScript((String) null, (Properties) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToFile(EsbUtility.java:64)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:164)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunTokenizedCalcScript2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunTokenizedCalcScript2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
			}
		}
		if (Stubs.matches(method, EsbCube.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:160)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:200)
			}
		}
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "deleteOnExit", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToFile(EsbUtility.java:64)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:164)
			}
		}
		if (Stubs.matches(method, EsbUtility.class)) {
			argument_types = new Class[] { IEssCube.class, String.class,
					Integer.TYPE };
			if (Stubs.matches(method, "deleteServerObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
				// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:196)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbCalculateTest
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
			EsbCalculateTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbCalculate",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbCalculate.class;
	}

			}

// JTEST_CURRENT_ID=-766364039.