/*
 * SimpleMeasureDefTest.java
 * Created by Jtest on 9/19/06 5:03:31 PM.
 * Updated by Jtest on 10/18/06 12:02:49 PM, 3 test cases added, 3 test cases removed.
 * Updated by Jtest on 11/8/06 10:44:52 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.server.comm;

import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.app.VarRptgFlag;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.server.comm.SimpleMeasureDef;

/**
 * SimpleMeasureDefTest is a unit test class for class SimpleMeasureDef.
 * @see com.palladium.paf.server.comm.SimpleMeasureDef
 * @author Parasoft Jtest 8.0
 */
public class SimpleMeasureDefTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public SimpleMeasureDefTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		SimpleMeasureDef THIS = new SimpleMeasureDef();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName3() throws Throwable {
		MeasureDef t0 = new MeasureDef((String) null, (MeasureType) null);
		MeasureType t1 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t2 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t3 = new Boolean(false);
		MeasureType t4 = MeasureType.valueOf("TimeBalFirst");
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t0.setAliases(var1);
		t0.setName("");
		t0.setType(t1);
		t0.setNumericFormatName("");
		t0.setVarRptgFlag(t2);
		t0.setPlannable(t3);
		t0.setRecalcTBOveride(t4);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType("");
		THIS.setRecalcTBOveride("");
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetName3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetName3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName1() throws Throwable {
		MeasureDef t0 = new MeasureDef((String) null, (MeasureType) null);
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetNumericFormatName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetNumericFormatName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef t1 = new MeasureDef("", t0);
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType("");
		THIS.setRecalcTBOveride("");
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetNumericFormatName2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetNumericFormatName2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRecalcTBOveride()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getRecalcTBOveride()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRecalcTBOveride1() throws Throwable {
		MeasureDef t0 = new MeasureDef((String) null, (MeasureType) null);
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		// jtest_tested_method
		String RETVAL = THIS.getRecalcTBOveride();
		assertEquals("TimeBalFirst", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRecalcTBOveride1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRecalcTBOveride1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType1() throws Throwable {
		MeasureDef t0 = new MeasureDef((String) null, (MeasureType) null);
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		// jtest_tested_method
		String RETVAL = THIS.getType();
		assertEquals("TimeBalFirst", RETVAL); // jtest_unverified
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
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		MeasureDef t0 = new MeasureDef();
		MeasureType t1 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t2 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t3 = new Boolean(true);
		MeasureType t4 = MeasureType.valueOf("TimeBalFirst");
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t0.setAliases(var1);
		t0.setName("");
		t0.setType(t1);
		t0.setNumericFormatName("");
		t0.setVarRptgFlag(t2);
		t0.setPlannable(t3);
		t0.setRecalcTBOveride(t4);
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
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setNumericFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#setNumericFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumericFormatName1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef t1 = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t1);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var1);
		t1.setName("");
		t1.setType(t2);
		t1.setNumericFormatName("");
		t1.setVarRptgFlag(t3);
		t1.setPlannable(t4);
		t1.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setNumericFormatName("");
		assertEquals("", THIS.getNumericFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetNumericFormatName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetNumericFormatName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setRecalcTBOveride(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#setRecalcTBOveride(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRecalcTBOveride1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef t1 = new MeasureDef("", t0);
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType("");
		THIS.setRecalcTBOveride("");
		// jtest_tested_method
		THIS.setRecalcTBOveride("");
		assertEquals("", THIS.getRecalcTBOveride()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetRecalcTBOveride1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetRecalcTBOveride1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setType(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#setType(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetType1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef t1 = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		_f0 = MeasureType.valueOf("TimeBalFirst");
		_f1 = MeasureType.valueOf("TimeBalFirst");
		SimpleMeasureDef THIS = new SimpleMeasureDef(t1);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var1);
		t1.setName("");
		t1.setType(t2);
		t1.setNumericFormatName("");
		t1.setVarRptgFlag(t3);
		t1.setPlannable(t4);
		t1.setRecalcTBOveride(t5);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType("");
		THIS.setRecalcTBOveride("");
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
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return _f1;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleMeasureDef1() throws Throwable {
		// jtest_tested_method
		SimpleMeasureDef THIS = new SimpleMeasureDef((MeasureDef) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.comm.SimpleMeasureDef.<init>(Lcom/palladium/paf/app/MeasureDef;)V>
		// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:39)
		// jtest_unverified
	}

	/**
	 * Test for method: SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleMeasureDef2() throws Throwable {
		MeasureDef t0 = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		// NullPointerException thrown
		// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:40)
		// jtest_unverified
	}

	/**
	 * Test for method: SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleMeasureDef3() throws Throwable {
		MeasureDef t0 = new MeasureDef();
		_f0 = MeasureType.valueOf("TimeBalFirst");
		// jtest_tested_method
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		// NullPointerException thrown
		// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:42)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSimpleMeasureDef3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSimpleMeasureDef3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getType", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:40)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getNumericFormatName", argument_types)) {
				return null;
				// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:41)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRecalcTBOveride", argument_types)) {
				return null;
				// at com.palladium.paf.server.comm.SimpleMeasureDef.<init>(SimpleMeasureDef.java:42)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SimpleMeasureDef#SimpleMeasureDef(com.palladium.paf.app.MeasureDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSimpleMeasureDef4() throws Throwable {
		MeasureDef t0 = new MeasureDef();
		// jtest_tested_method
		SimpleMeasureDef THIS = new SimpleMeasureDef(t0);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals("Aggregate", THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals("Aggregate", THIS.getRecalcTBOveride()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.SimpleMeasureDefTest
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
            SimpleMeasureDefTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.SimpleMeasureDef",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return SimpleMeasureDef.class;
    }

        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private com.palladium.paf.app.MeasureType _f0;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private com.palladium.paf.app.MeasureType _f1;
		}

// JTEST_CURRENT_ID=-1280222796.