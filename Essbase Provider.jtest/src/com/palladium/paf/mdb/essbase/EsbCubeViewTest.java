/*
 * EsbCubeViewTest.java
 * Created by Jtest on 9/19/06 5:00:43 PM.
 * Updated by Jtest on 10/18/06 6:47:39 PM, 13 test cases added, 13 test cases removed.
 * Updated by Jtest on 11/9/06 2:25:23 AM, 13 test cases added, 13 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import java.util.Properties;
import com.essbase.api.dataquery.IEssOperation;
import com.essbase.api.dataquery.IEssOpMdxQuery.EEssMemberIdentifierType;
import com.essbase.api.dataquery.IEssOpMdxQuery;
import com.essbase.api.base.EssException;
import com.essbase.api.dataquery.IEssCubeView;
import com.essbase.api.session.Essbase;
import com.essbase.api.domain.IEssDomain;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.palladium.paf.mdb.essbase.EsbCubeView;

/**
 * EsbCubeViewTest is a unit test class for class EsbCubeView.
 * @see com.palladium.paf.mdb.essbase.EsbCubeView
 * @author Parasoft Jtest 8.0
 */
public class EsbCubeViewTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbCubeViewTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		THIS.disconnect();
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCubeView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect3() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		THIS.disconnect();
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertNotNull(THIS.getEssCubeView()); // jtest_unverified
		assertEquals("0", THIS.getEssCubeView().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect4() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:261)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView1() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			(Properties) null,
			false,
			false,
			false,
			false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:156)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			var1,
			false,
			false,
			false,
			false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:150)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.util.Properties,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			var1,
			false,
			false,
			false,
			false);
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCubeView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView6() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals("localhost", THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCubeView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView7() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView("", "0", true, true, true, true);
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCubeView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView8() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"0",
			false,
			false,
			false,
			false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:109)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView11() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCubeView()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView12() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
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
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView13() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#EsbCubeView(java.lang.String,java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeView14() throws Throwable {
		// jtest_tested_method
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:73)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeView14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeView14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#getEsbApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbApp1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getEsbApp();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEsbApp1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEsbApp1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbDb()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#getEsbDb()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDb1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		String RETVAL = THIS.getEsbDb();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEsbDb1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEsbDb1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		String RETVAL = THIS.getEsbServer();
		assertEquals("localhost", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEsbServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEsbServer1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer2() throws Throwable {
		EsbCubeView THIS = new EsbCubeView("", "", true);
		// jtest_tested_method
		String RETVAL = THIS.getEsbServer();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEsbServer2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEsbServer2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssCubeView()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#getEssCubeView()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssCubeView1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		IEssCubeView RETVAL = THIS.getEssCubeView();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEssCubeView1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEssCubeView1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery1() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:209)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery2() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery3() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:209)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery4() throws Throwable {
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			"TitanServer",
			false,
			false,
			false,
			false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery5() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
			argument_types = new Class[] { IEssOperation.class };
			if (Stubs.matches(method, "performOperation", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery6() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCubeView THIS = new EsbCubeView(
			(String) null,
			var1,
			false,
			false,
			false,
			false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:198)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
			argument_types = new Class[] { IEssOperation.class };
			if (Stubs.matches(method, "performOperation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdDataSet", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:198)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery7() throws Throwable {
		EsbCubeView THIS = new EsbCubeView((String) null, (String) null, false);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertNotNull(THIS.getEssCubeView()); // jtest_unverified
		assertEquals("0", THIS.getEssCubeView().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
			argument_types = new Class[] { IEssOperation.class };
			if (Stubs.matches(method, "performOperation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdDataSet", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:198)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: runMdxQuery(java.lang.String,boolean,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeView#runMdxQuery(java.lang.String,boolean,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRunMdxQuery9() throws Throwable {
		EsbCubeView THIS = new EsbCubeView("", "", true);
		// jtest_tested_method
		IEssMdDataSet RETVAL = THIS.runMdxQuery("", true, true);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertNotNull(THIS.getEssCubeView()); // jtest_unverified
		assertEquals("0", THIS.getEssCubeView().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRunMdxQuery9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRunMdxQuery9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:67)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
			}
			argument_types = new Class[] { IEssOperation.class };
			if (Stubs.matches(method, "performOperation", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdDataSet", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:198)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbCubeViewTest
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
			EsbCubeViewTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbCubeView",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbCubeView.class;
	}

			}

// JTEST_CURRENT_ID=-988123836.