/*
 * EsbCubeTest.java
 * Created by Jtest on 9/19/06 5:02:54 PM.
 * Updated by Jtest on 10/18/06 7:13:26 PM, 14 test cases added, 14 test cases removed.
 * Updated by Jtest on 11/9/06 2:19:26 AM, 14 test cases added, 14 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import java.util.Properties;
import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.session.Essbase;
import com.essbase.api.datasource.IEssOlapApplication;
import com.essbase.api.domain.IEssDomain;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.essbase.api.datasource.IEssOlapServer;
import com.palladium.paf.mdb.essbase.EsbCube;

/**
 * EsbCubeTest is a unit test class for class EsbCube.
 * @see com.palladium.paf.mdb.essbase.EsbCube
 * @author Parasoft Jtest 8.0
 */
public class EsbCubeTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbCubeTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect1() throws Throwable {
		EsbCube THIS = new EsbCube("0");
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:178)
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
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:195)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:178)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect2() throws Throwable {
		EsbCube THIS = new EsbCube("0");
		// jtest_tested_method
		THIS.disconnect();
		assertNotNull(THIS.getOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getOlapServer().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDisconnect2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDisconnect2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:195)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.disconnect(EsbCube.java:178)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube1() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube((Properties) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:122)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube6() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:128)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube8() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCube THIS = new EsbCube(var1);
		assertNotNull(THIS.getOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getOlapServer().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:112)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:113)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:116)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube10() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("0");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:88)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Cannot connect to enterprise serverConnection refused: connect. Make sure the sign on parameters are correct and the enterprise server is running
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
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
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube11() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("TitanServer");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:88)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube12() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("0");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:82)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube13() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("TitanServer");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:88)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube14() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("0");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:82)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube15() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("TitanServer");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:82)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube16() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("TitanServer");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:88)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCube(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#EsbCube(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCube17() throws Throwable {
		// jtest_tested_method
		EsbCube THIS = new EsbCube("TitanServer");
		assertNotNull(THIS.getOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getOlapServer().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals("localhost", THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCube17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCube17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#getEsbApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbApp1() throws Throwable {
		EsbCube THIS = new EsbCube("TitanServer");
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
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbDb()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#getEsbDb()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDb1() throws Throwable {
		EsbCube THIS = new EsbCube("0");
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
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer1() throws Throwable {
		EsbCube THIS = new EsbCube("TitanServer");
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
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssCube()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#getEssCube()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssCube1() throws Throwable {
		EsbCube THIS = new EsbCube("TitanServer");
		// jtest_tested_method
		IEssCube RETVAL = THIS.getEssCube();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEssCube1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEssCube1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getOlapServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCube#getOlapServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOlapServer1() throws Throwable {
		EsbCube THIS = new EsbCube("0");
		// jtest_tested_method
		IEssOlapServer RETVAL = THIS.getOlapServer();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetOlapServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetOlapServer1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:68)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:73)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:76)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbCubeTest
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
			EsbCubeTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbCube",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbCube.class;
	}

			}

// JTEST_CURRENT_ID=1380661082.