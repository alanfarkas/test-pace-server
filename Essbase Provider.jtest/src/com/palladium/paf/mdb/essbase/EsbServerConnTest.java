/*
 * EsbServerConnTest.java
 * Created by Jtest on 9/19/06 4:54:18 PM.
 * Updated by Jtest on 10/18/06 6:41:16 PM, 8 test cases added, 8 test cases removed.
 * Updated by Jtest on 11/9/06 2:16:17 AM, 8 test cases added, 8 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import java.util.Properties;
import com.essbase.api.base.EssException;
import com.essbase.api.session.Essbase;
import com.essbase.api.domain.IEssDomain;
import java.lang.reflect.Member;
import com.essbase.api.datasource.IEssOlapServer;
import jtest.Stubs;
import com.palladium.paf.mdb.essbase.EsbServerConn;

/**
 * EsbServerConnTest is a unit test class for class EsbServerConn.
 * @see com.palladium.paf.mdb.essbase.EsbServerConn
 * @author Parasoft Jtest 8.0
 */
public class EsbServerConnTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbServerConnTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:90)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:81)
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
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect2() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// jtest_tested_method
		THIS.disconnect();
		assertEquals(t0, THIS.getEsbDomain()); // jtest_unverified
		assertEquals(null, THIS.getEssOlapServer()); // jtest_unverified
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
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect4() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		EsbConnType t2 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		EsbDomain t4 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		t1.setEsbApp("");
		t1.setEsbConnType(t2);
		t1.setEsbDb("");
		t1.setEsbPswd("");
		t1.setEsbServer("");
		t1.setEsbUser("");
		THIS.setEsbDomain(t4);
		IEssOlapServer var1 = (IEssOlapServer) Stubs
			.makeStubObject(IEssOlapServer.class);
		THIS.setEssOlapServer(var1);
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:90)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:82)
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
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
				// 
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:81)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.disconnect(EsbServerConn.java:82)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn1() throws Throwable {
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(
			(EsbDomain) null,
			(EsbConnParms) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbServerConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Lcom/palladium/paf/mdb/essbase/EsbConnParms;)V>
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn2() throws Throwable {
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(var1, (EsbConnParms) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.essbase.EsbServerConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Lcom/palladium/paf/mdb/essbase/EsbConnParms;)V>
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn3() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn4() throws Throwable {
		EsbConnParms t0 = new EsbConnParms("TitanServer");
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(var1, t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn5() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn6() throws Throwable {
		EsbConnParms t0 = new EsbConnParms("0");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		t0.setEsbApp("");
		t0.setEsbConnType(t1);
		t0.setEsbDb("");
		t0.setEsbPswd("");
		t0.setEsbServer("");
		t0.setEsbUser("");
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(var1, t0);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:67)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#EsbServerConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbServerConn7() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		// jtest_tested_method
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		assertEquals(t0, THIS.getEsbDomain()); // jtest_unverified
		assertNotNull(THIS.getEssOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getEssOlapServer().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbServerConn7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbServerConn7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:59)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbDomain()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#getEsbDomain()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDomain1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// jtest_tested_method
		EsbDomain RETVAL = THIS.getEsbDomain();
		assertEquals(t0, RETVAL); // jtest_unverified
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
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssOlapServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#getEssOlapServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssOlapServer1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		// jtest_tested_method
		IEssOlapServer RETVAL = THIS.getEssOlapServer();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetEssOlapServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetEssOlapServer1(
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
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setEsbDomain(com.palladium.paf.mdb.essbase.EsbDomain)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#setEsbDomain(com.palladium.paf.mdb.essbase.EsbDomain)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbDomain1() throws Throwable {
		EsbDomain t0 = new EsbDomain("", "", "", "");
		EsbConnParms t1 = new EsbConnParms("0");
		EsbServerConn THIS = new EsbServerConn(t0, t1);
		EsbDomain t3 = new EsbDomain("", "", "", "");
		// jtest_tested_method
		THIS.setEsbDomain(t3);
		assertEquals(t3, THIS.getEsbDomain()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetEsbDomain1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetEsbDomain1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setEssOlapServer(com.essbase.api.datasource.IEssOlapServer)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbServerConn#setEssOlapServer(com.essbase.api.datasource.IEssOlapServer)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEssOlapServer1() throws Throwable {
		EsbConnParms t0 = new EsbConnParms("0");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		EsbServerConn THIS = new EsbServerConn(var1, t0);
		t0.setEsbApp("");
		t0.setEsbConnType(t1);
		t0.setEsbDb("");
		t0.setEsbPswd("");
		t0.setEsbServer("");
		t0.setEsbUser("");
		IEssOlapServer var2 = (IEssOlapServer) Stubs
			.makeStubObject(IEssOlapServer.class);
		// jtest_tested_method
		THIS.setEssOlapServer(var2);
		assertEquals(var2, THIS.getEssOlapServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetEssOlapServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetEssOlapServer1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:56)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:61)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbServerConn.<init>(EsbServerConn.java:62)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbServerConnTest
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
			EsbServerConnTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbServerConn",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbServerConn.class;
	}

			}

// JTEST_CURRENT_ID=1434001955.