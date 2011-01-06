/*
 * EsbConnMgrTest.java
 * Created by Jtest on 9/19/06 4:52:46 PM.
 * Updated by Jtest on 10/18/06 7:10:15 PM, 28 test cases added, 28 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import com.essbase.api.datasource.IEssOlapServer;
import com.palladium.paf.PafException;
import com.essbase.api.base.EssException;
import com.palladium.paf.mdb.IPafConnection;
import com.essbase.api.session.Essbase;
import com.essbase.api.domain.IEssDomain;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbConnMgr;

/**
 * EsbConnMgrTest is a unit test class for class EsbConnMgr.
 * @see com.palladium.paf.mdb.essbase.EsbConnMgr
 * @author Parasoft Jtest 8.0
 */
public class EsbConnMgrTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbConnMgrTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: cleanup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#cleanup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCleanup1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.cleanup();
		assertEquals(null, THIS.getEsbDomain()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCleanup1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCleanup1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: cleanup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#cleanup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCleanup4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.cleanup();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:212)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCleanup4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCleanup4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:209)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "entrySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:211)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:212)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: cleanup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#cleanup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCleanup5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.cleanup();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:213)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCleanup5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCleanup5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:209)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "entrySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:211)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return Stubs.makeStubObject(Map.Entry.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:212)
			}
		}
		if (Stubs.matches(method, Map.Entry.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getValue", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:213)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: cleanup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#cleanup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCleanup6() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.cleanup();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:214)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCleanup6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCleanup6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:209)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "entrySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:211)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return Stubs.makeStubObject(Map.Entry.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:212)
			}
		}
		if (Stubs.matches(method, Map.Entry.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getValue", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:213)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect(com.palladium.paf.mdb.IPafConnection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#disconnect(com.palladium.paf.mdb.IPafConnection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.disconnect((IPafConnection) null);
		assertNotNull(THIS.getEsbDomain()); // jtest_unverified
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
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbConnMgr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#EsbConnMgr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnMgr1() throws Throwable {
		// jtest_tested_method
		EsbConnMgr THIS = new EsbConnMgr();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
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
	 * Test for method: EsbConnMgr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#EsbConnMgr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnMgr2() throws Throwable {
		// jtest_tested_method
		EsbConnMgr THIS = new EsbConnMgr();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbConnMgr2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbConnMgr2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbConnMgr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#EsbConnMgr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnMgr3() throws Throwable {
		// jtest_tested_method
		EsbConnMgr THIS = new EsbConnMgr();
		assertNotNull(THIS.getEsbDomain()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbConnMgr3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbConnMgr3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbConnMgr(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#EsbConnMgr(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnMgr5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbConnMgr THIS = new EsbConnMgr(var1);
		assertNotNull(THIS.getEsbDomain()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbConnMgr5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbConnMgr5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbConnMgr(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#EsbConnMgr(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnMgr6() throws Throwable {
		// jtest_tested_method
		EsbConnMgr THIS = new EsbConnMgr((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
		// jtest_unverified
	}

	/**
	 * Test for method: finalize()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#finalize()
	 * @author Parasoft Jtest 8.0
	 */
	public void testFinalize1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		THIS.finalize();
		assertEquals(null, THIS.getEsbDomain()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFinalize1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFinalize1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:209)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "entrySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:210)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
						return Boolean.TRUE;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:211)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
					case 11 :
						return Boolean.FALSE;
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:211)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return Stubs.makeStubObject(Map.Entry.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:212)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "remove", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:222)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
		}
		if (Stubs.matches(method, Map.Entry.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getValue", argument_types)) {
				return Stubs.makeStubObject(IPafConnection.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:213)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.finalize(EsbConnMgr.java:241)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(Ljava/util/Properties;)Lcom/palladium/paf/mdb/IPafConnection;>
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:164)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:170)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection3(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					case 5 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:176)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection4(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
					case 5 :
					case 6 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
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
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection5(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection6() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection6(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection7() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection7(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, Properties.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection8() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection8(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection9() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection9(Member method, Object _this, Object[] args)
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, Properties.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCubeConn.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection11() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection12() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:184)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection14() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection(var2);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:181)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
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
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					case 5 :
					case 6 :
					case 7 :
						return "";
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:160)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:166)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:172)
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
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:180)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:181)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection17() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection18() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("TitanServer");
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection18(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection19() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:119)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:118)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:119)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection20() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection22() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("TitanServer");
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection23() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection24() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("TitanServer");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:118)
			}
		}
		if (Stubs.matches(method, EsbServerConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection25() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection25(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, EsbCubeConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCubeConn.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection26() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("0");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection26(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection28() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection28(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection29() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("TitanServer");

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection29.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection29(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection30() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection("TitanServer");
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection30.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection30(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, EsbServerConn.class)) {
			argument_types = new Class[] { EsbDomain.class, EsbConnParms.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbServerConn.class);
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:132)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getConnection(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getConnection(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConnection31() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		IPafConnection RETVAL = THIS.getConnection((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetConnection31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetConnection31(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.getConnection(EsbConnMgr.java:137)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbDomain()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnMgr#getEsbDomain()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDomain1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnMgr THIS = new EsbConnMgr(var1);
		// jtest_tested_method
		EsbDomain RETVAL = THIS.getEsbDomain();
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEsbDomain1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEsbDomain1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbConnMgrTest
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
			EsbConnMgrTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbConnMgr",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbConnMgr.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-119579759.