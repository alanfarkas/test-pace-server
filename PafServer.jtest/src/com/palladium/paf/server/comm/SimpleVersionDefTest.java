/*
 * SimpleVersionDefTest.java
 * Created by Jtest on 9/19/06 6:16:44 PM.
 * Updated by Jtest on 10/18/06 11:56:37 AM, 2 test cases added, 2 test cases removed.
 * Updated by Jtest on 11/8/06 10:05:27 PM, 2 test cases added, 2 test cases removed.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.app.VersionVarianceType;
import java.util.Map;
import com.palladium.paf.app.VersionFormula;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.server.comm.SimpleVersionDef;

/**
 * SimpleVersionDefTest is a unit test class for class SimpleVersionDef.
 * @see com.palladium.paf.server.comm.SimpleVersionDef
 * @author Parasoft Jtest 8.0
 */
public class SimpleVersionDefTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public SimpleVersionDefTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		VersionDef t0 = new VersionDef((String) null, (VersionType) null);
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula();
		SimpleVersionDef THIS = new SimpleVersionDef(t0);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t0.setAliases(var1);
		t0.setName("");
		t0.setNumericFormatName("");
		t0.setType(t1);
		t0.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		// NullPointerException thrown
		// at com.palladium.paf.server.comm.SimpleVersionDef.<init>(SimpleVersionDef.java:17)
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		SimpleVersionDef THIS = new SimpleVersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName4() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		VersionDef t1 = new VersionDef("", t0);
		VersionType t2 = VersionType.valueOf("Calculated");
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t4 = new VersionFormula("", "", t3);
		VersionVarianceType t5 = VersionVarianceType.valueOf("SimpleVariance");
		_f0 = VersionType.valueOf("Calculated");
		SimpleVersionDef THIS = new SimpleVersionDef(t1);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var1);
		t1.setName("");
		t1.setNumericFormatName("");
		t1.setType(t2);
		t4.setBaseVersion("");
		t4.setCompareVersion("");
		t4.setVarianceType(t5);
		t1.setVersionFormula(t4);
		THIS.setName("");
		THIS.setNumericFormat("");
		THIS.setType("");
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetName4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetName4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getNumericFormat()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#getNumericFormat()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormat2() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		VersionDef t1 = new VersionDef("", t0);
		VersionType t2 = VersionType.valueOf("Calculated");
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t4 = new VersionFormula("", "", t3);
		_f0 = VersionType.valueOf("Calculated");
		SimpleVersionDef THIS = new SimpleVersionDef(t1);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var1);
		t1.setName("");
		t1.setNumericFormatName("");
		t1.setType(t2);
		t1.setVersionFormula(t4);
		THIS.setName("");
		THIS.setNumericFormat("");
		THIS.setType("");
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormat();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetNumericFormat2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetNumericFormat2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType1() throws Throwable {
		VersionDef t0 = new VersionDef();
		_f0 = VersionType.valueOf("Calculated");
		SimpleVersionDef THIS = new SimpleVersionDef(t0);
		// jtest_tested_method
		String RETVAL = THIS.getType();
		assertEquals("Calculated", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetType1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetType1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		VersionDef t1 = new VersionDef("", t0);
		_f0 = VersionType.valueOf("Calculated");
		SimpleVersionDef THIS = new SimpleVersionDef(t1);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetName1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setNumericFormat(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#setNumericFormat(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumericFormat1() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		VersionDef t1 = new VersionDef("", t0);
		SimpleVersionDef THIS = new SimpleVersionDef(t1);
		// jtest_tested_method
		THIS.setNumericFormat("");
		assertEquals("", THIS.getNumericFormat()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setType(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#setType(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetType1() throws Throwable {
		VersionDef t0 = new VersionDef();
		_f0 = VersionType.valueOf("Calculated");
		SimpleVersionDef THIS = new SimpleVersionDef(t0);
		THIS.setName("");
		THIS.setNumericFormat("");
		THIS.setType("");
		// jtest_tested_method
		THIS.setType("");
		assertEquals("", THIS.getType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetType1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetType1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleVersionDef1() throws Throwable {
		// jtest_tested_method
		SimpleVersionDef THIS = new SimpleVersionDef((VersionDef) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.comm.SimpleVersionDef.<init>(Lcom/palladium/paf/app/VersionDef;)V>
		// at com.palladium.paf.server.comm.SimpleVersionDef.<init>(SimpleVersionDef.java:16)
		// jtest_unverified
	}

	/**
	 * Test for method: SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleVersionDef3() throws Throwable {
		VersionDef t0 = new VersionDef();
		_f0 = VersionType.valueOf("Calculated");
		// jtest_tested_method
		SimpleVersionDef THIS = new SimpleVersionDef(t0);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals("Calculated", THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormat()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSimpleVersionDef3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSimpleVersionDef3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleVersionDef#SimpleVersionDef(com.palladium.paf.app.VersionDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleVersionDef5() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		VersionDef t1 = new VersionDef("", t0);
		VersionType t2 = VersionType.valueOf("Calculated");
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t4 = new VersionFormula("", "", t3);
		VersionVarianceType t5 = VersionVarianceType.valueOf("SimpleVariance");
		_f0 = VersionType.valueOf("Calculated");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var1);
		t1.setName("");
		t1.setNumericFormatName("");
		t1.setType(t2);
		t4.setBaseVersion("");
		t4.setCompareVersion("");
		t4.setVarianceType(t5);
		t1.setVersionFormula(t4);
		// jtest_tested_method
		SimpleVersionDef THIS = new SimpleVersionDef(t1);
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals("Calculated", THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormat()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSimpleVersionDef5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSimpleVersionDef5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, VersionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
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
     * Usage: java com.palladium.paf.server.comm.SimpleVersionDefTest
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
            SimpleVersionDefTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.SimpleVersionDef",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return SimpleVersionDef.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private com.palladium.paf.app.VersionType _f0;
		}

// JTEST_CURRENT_ID=-678746653.