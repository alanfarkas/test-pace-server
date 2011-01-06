/*
 * EsbMetaDataTest.java
 * Created by Jtest on 9/19/06 5:22:34 PM.
 * Updated by Jtest on 10/18/06 7:07:52 PM, 28 test cases added, 28 test cases removed.
 * Updated by Jtest on 11/9/06 2:44:54 AM, 28 test cases added, 28 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import com.essbase.api.datasource.IEssOlapServer;
import com.palladium.paf.PafException;
import com.essbase.api.base.EssException;
import com.essbase.api.session.Essbase;
import com.essbase.api.domain.IEssDomain;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbMetaData;

/**
 * EsbMetaDataTest is a unit test class for class EsbMetaData.
 * @see com.palladium.paf.mdb.essbase.EsbMetaData
 * @author Parasoft Jtest 8.0
 */
public class EsbMetaDataTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbMetaDataTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData1() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbMetaData.<init>(Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:164)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:170)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 6 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:176)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 7 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData6() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, Properties.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData7() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData8() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, Properties.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCubeConn.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData10() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData11() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData12() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData14() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData(var1);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 8 :
					case 9 :
					case 10 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:76)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:77)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData16() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
		// Caused by: com.essbase.api.base.EssException: Cannot connect to enterprise serverConnection refused: connect. Make sure the sign on parameters are correct and the enterprise server is running
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:185)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.invokeMethod(EssOrbPluginTcpip.java:85)
		// at com.essbase.api.session.EssOrbPluginTcpip.invokeMethod(EssOrbPluginTcpip.java:74)
		// at com.essbase.api.session.EssOrbPlugin.signOn(EssOrbPlugin.java:138)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:398)
		// at com.essbase.api.session.Essbase.signOn_internal(Essbase.java:363)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:307)
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData17() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData18() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData18(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData19() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData19(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData20() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData20(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData21() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData21(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData22() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData22(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData23() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData23(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, EsbServerConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData24() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData24(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData25() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");
		// ClassCastException thrown
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData25(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, EsbServerConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbServerConn.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData26() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData("TitanServer");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData26(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData27() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData27(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, EsbConnMgr.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData28() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData28(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, EsbConnMgr.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData29() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData29.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData29(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData31() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData31(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData34() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData34.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData34(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData35() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData35.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData35(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbMetaData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbMetaData#EsbMetaData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbMetaData38() throws Throwable {
		// jtest_tested_method
		EsbMetaData THIS = new EsbMetaData((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbMetaData38.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbMetaData38(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
				// at com.palladium.paf.mdb.essbase.EsbMetaData.<init>(EsbMetaData.java:60)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbMetaDataTest
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
			EsbMetaDataTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbMetaData",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbMetaData.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-1802862053.