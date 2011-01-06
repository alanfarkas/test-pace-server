/*
 * EsbConnParmsTest.java
 * Created by Jtest on 9/19/06 4:59:37 PM.
 * Updated by Jtest on 10/18/06 7:11:02 PM, 1 test case added, 1 test case removed.
 * Updated by Jtest on 11/9/06 2:17:23 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.mdb.essbase;

import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbConnParms;

/**
 * EsbConnParmsTest is a unit test class for class EsbConnParms.
 * @see com.palladium.paf.mdb.essbase.EsbConnParms
 * @author Parasoft Jtest 8.0
 */
public class EsbConnParmsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbConnParmsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: EsbConnParms(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#EsbConnParms(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnParms1() throws Throwable {
		// jtest_tested_method
		EsbConnParms THIS = new EsbConnParms((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbConnParms.<init>(Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbConnParms(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#EsbConnParms(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnParms2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbConnParms THIS = new EsbConnParms(var1);
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertNotNull(THIS.getEsbConnType()); // jtest_unverified
		assertEquals("PAF_CONN_ESB_CUBE", THIS.getEsbConnType().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbPswd()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEsbUser()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbConnParms2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbConnParms2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbConnParms(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#EsbConnParms(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbConnParms3() throws Throwable {
		// jtest_tested_method
		EsbConnParms THIS = new EsbConnParms("0");
		assertEquals(null, THIS.getEsbApp()); // jtest_unverified
		assertNotNull(THIS.getEsbConnType()); // jtest_unverified
		assertEquals("PAF_CONN_ESB_CUBE", THIS.getEsbConnType().toString()); // jtest_unverified
		assertEquals(null, THIS.getEsbDb()); // jtest_unverified
		assertEquals(null, THIS.getEsbPswd()); // jtest_unverified
		assertEquals(null, THIS.getEsbServer()); // jtest_unverified
		assertEquals(null, THIS.getEsbUser()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbApp1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		String RETVAL = THIS.getEsbApp();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbConnType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbConnType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbConnType1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		EsbConnType RETVAL = THIS.getEsbConnType();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("PAF_CONN_ESB_SERVER", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbConnType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbConnType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbConnType2() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		EsbConnType RETVAL = THIS.getEsbConnType();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbDb()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbDb()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDb1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		String RETVAL = THIS.getEsbDb();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbDb()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbDb()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbDb2() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		String RETVAL = THIS.getEsbDb();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbPswd()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbPswd()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbPswd1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		String RETVAL = THIS.getEsbPswd();
		assertEquals("password", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbConnParms THIS = new EsbConnParms(var1);
		// jtest_tested_method
		String RETVAL = THIS.getEsbServer();
		assertEquals(null, RETVAL); // jtest_unverified
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
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getEsbServer()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbServer()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbServer2() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		String RETVAL = THIS.getEsbServer();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEsbUser()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#getEsbUser()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEsbUser1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		String RETVAL = THIS.getEsbUser();
		assertEquals("system", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbApp(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbApp(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbApp1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("0");
		// jtest_tested_method
		THIS.setEsbApp("");
		assertEquals("", THIS.getEsbApp()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbConnType(com.palladium.paf.mdb.essbase.EsbConnType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbConnType(com.palladium.paf.mdb.essbase.EsbConnType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbConnType1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		EsbConnType t2 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		THIS.setEsbConnType(t2);
		assertEquals(t1, THIS.getEsbConnType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbDb(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbDb(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbDb1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		THIS.setEsbDb("");
		assertEquals("", THIS.getEsbDb()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbPswd(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbPswd(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbPswd1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		// jtest_tested_method
		THIS.setEsbPswd("");
		assertEquals("", THIS.getEsbPswd()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbServer(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbServer(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbServer1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("TitanServer");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		THIS.setEsbServer("");
		assertEquals("", THIS.getEsbServer()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEsbUser(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbConnParms#setEsbUser(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEsbUser1() throws Throwable {
		EsbConnParms THIS = new EsbConnParms("0");
		EsbConnType t1 = EsbConnType.valueOf("PAF_CONN_ESB_SERVER");
		THIS.setEsbApp("");
		THIS.setEsbConnType(t1);
		THIS.setEsbDb("");
		THIS.setEsbPswd("");
		THIS.setEsbServer("");
		THIS.setEsbUser("");
		// jtest_tested_method
		THIS.setEsbUser("");
		assertEquals("", THIS.getEsbUser()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbConnParmsTest
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
			EsbConnParmsTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbConnParms",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbConnParms.class;
	}

			}

// JTEST_CURRENT_ID=-831459193.