/*
 * EsbCubeConnTest.java
 * Created by Jtest on 9/19/06 4:54:58 PM.
 * Updated by Jtest on 10/18/06 7:14:18 PM, 17 test cases added, 17 test cases removed.
 * Updated by Jtest on 11/9/06 2:20:19 AM, 17 test cases added, 17 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import com.essbase.api.session.Essbase;
import com.essbase.api.datasource.IEssOlapApplication;
import com.essbase.api.domain.IEssDomain;
import java.lang.reflect.Member;
import com.essbase.api.datasource.IEssOlapServer;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbCubeConn;

/**
 * EsbCubeConnTest is a unit test class for class EsbCubeConn.
 * @see com.palladium.paf.mdb.essbase.EsbCubeConn
 * @author Parasoft Jtest 8.0
 */
public class EsbCubeConnTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbCubeConnTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:163)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:152)
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:152)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect2() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// jtest_tested_method
		THIS.disconnect();
		assertEquals(t0, THIS.getEsbDomain()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:152)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: disconnect()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#disconnect()
	 * @author Parasoft Jtest 8.0
	 */
	public void testDisconnect4() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// jtest_tested_method
		THIS.disconnect();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:163)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:154)
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isConnected", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:152)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.disconnect(EsbCubeConn.java:154)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn1() throws Throwable {
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn((EsbDomain) null, (Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn2() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, (Properties) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn3() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn4() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn5() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn6() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:111)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn7() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn9() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
		assertEquals(t0, THIS.getEsbDomain()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
		assertNotNull(THIS.getEssOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getEssOlapServer().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn12() throws Throwable {
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(
			(EsbDomain) null,
			(EsbConnParms) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Lcom/palladium/paf/mdb/essbase/EsbConnParms;)V>
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn13() throws Throwable {
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(var1, (EsbConnParms) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(Lcom/palladium/paf/mdb/essbase/EsbDomain;Lcom/palladium/paf/mdb/essbase/EsbConnParms;)V>
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn14() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		EsbConnParms t1 = new EsbConnParms("0");
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn15() throws Throwable {
		EsbConnParms t0 = new EsbConnParms("TitanServer");
		EsbDomain var1 = (EsbDomain) Stubs.makeStubObject(EsbDomain.class);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(var1, t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn16() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn17() throws Throwable {
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
		EsbCubeConn THIS = new EsbCubeConn(var1, t0);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbDomain.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEssDomain", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn18() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:77)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn18(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn19() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		EsbConnType t2 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		t1.setEsbApp("");
		t1.setEsbConnType(t2);
		t1.setEsbDb("");
		t1.setEsbPswd("");
		t1.setEsbServer("");
		t1.setEsbUser("");
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn19(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#EsbCubeConn(com.palladium.paf.mdb.essbase.EsbDomain,com.palladium.paf.mdb.essbase.EsbConnParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbCubeConn20() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		EsbConnType t2 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		t1.setEsbApp("");
		t1.setEsbConnType(t2);
		t1.setEsbDb("");
		t1.setEsbPswd("");
		t1.setEsbServer("");
		t1.setEsbUser("");
		// jtest_tested_method
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
		assertEquals(t0, THIS.getEsbDomain()); // jtest_unverified
		assertEquals(null, THIS.getEssCube()); // jtest_unverified
		assertNotNull(THIS.getEssOlapServer()); // jtest_unverified
		assertEquals("0", THIS.getEssOlapServer().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbCubeConn20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbCubeConn20(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbDomain()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#getEsbDomain()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDomain1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssCube()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#getEssCube()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssCube1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms t1 = new EsbConnParms(var1);
		EsbCubeConn THIS = new EsbCubeConn(t0, t1);
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:63)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:66)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:70)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:71)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEssOlapServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCubeConn#getEssOlapServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEssOlapServer1() throws Throwable {
		EsbDomain t0 = new EsbDomain(
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbCubeConn THIS = new EsbCubeConn(t0, var1);
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
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:97)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:100)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:101)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:102)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getOlapServer", argument_types)) {
				return Stubs.makeStubObject(IEssOlapServer.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:104)
			}
		}
		if (Stubs.matches(method, IEssOlapServer.class)) {
			argument_types = new Class[] { Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "connect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:105)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return Stubs.makeStubObject(IEssOlapApplication.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
			}
		}
		if (Stubs.matches(method, IEssOlapApplication.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCube", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeConn.<init>(EsbCubeConn.java:106)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbCubeConnTest
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
			EsbCubeConnTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbCubeConn",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbCubeConn.class;
	}

			}

// JTEST_CURRENT_ID=1805825690.