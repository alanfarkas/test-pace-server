/*
 * MeasureDefTest.java
 * Created by Jtest on 9/19/06 6:04:10 PM.
 * Updated by Jtest on 10/18/06 7:34:16 PM, 1 test case added, 1 test case removed.
 * Updated by Jtest on 11/9/06 3:28:37 AM, 1 test case added, 1 test case removed.
 */

package com.palladium.paf.app;

import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.app.MeasureDef;

/**
 * MeasureDefTest is a unit test class for class MeasureDef.
 * @see com.palladium.paf.app.MeasureDef
 * @author Parasoft Jtest 8.0
 */
public class MeasureDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public MeasureDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#addAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAlias1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		THIS.addAlias((String) null, (String) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getType()); // jtest_unverified
		assertNotNull(THIS.getAliases()); // jtest_unverified
		assertEquals("{null=null}", THIS.getAliases().toString()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getPlannable()); // jtest_unverified
		assertNotNull(THIS.getRecalcTBOveride()); // jtest_unverified
		assertEquals("Aggregate", THIS.getRecalcTBOveride().toString()); // jtest_unverified
		assertNotNull(THIS.getVarRptgFlag()); // jtest_unverified
		assertEquals("ExpenseReporting", THIS.getVarRptgFlag().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: addAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#addAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAlias2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.addAlias("", "");
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals(t0, THIS.getType()); // jtest_unverified
		assertEquals(var1, THIS.getAliases()); // jtest_unverified
		assertEquals("", THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(t4, THIS.getPlannable()); // jtest_unverified
		assertEquals(t0, THIS.getRecalcTBOveride()); // jtest_unverified
		assertEquals(t3, THIS.getVarRptgFlag()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddAlias2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddAlias2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.app.MeasureDef.addAlias(MeasureDef.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlias1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		String RETVAL = THIS.getAlias((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlias3() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		MeasureType t1 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t2 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t3 = new Boolean(false);
		MeasureType t4 = MeasureType.valueOf("TimeBalFirst");
		_f0 = new Object();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t1);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t2);
		THIS.setPlannable(t3);
		THIS.setRecalcTBOveride(t4);
		// jtest_tested_method
		String RETVAL = THIS.getAlias((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.app.MeasureDef.getAlias(MeasureDef.java:75)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAlias3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAlias3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.app.MeasureDef.getAlias(MeasureDef.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases2() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		MeasureType t1 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t2 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t3 = new Boolean(false);
		MeasureType t4 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t1);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t2);
		THIS.setPlannable(t3);
		THIS.setRecalcTBOveride(t4);
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlannable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getPlannable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannable1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		Boolean RETVAL = THIS.getPlannable();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPlannable()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getPlannable()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannable2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		Boolean RETVAL = THIS.getPlannable();
		assertEquals(t4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRecalcTBOveride()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getRecalcTBOveride()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRecalcTBOveride1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		MeasureType RETVAL = THIS.getRecalcTBOveride();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("Aggregate", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRecalcTBOveride()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getRecalcTBOveride()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRecalcTBOveride2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		MeasureType RETVAL = THIS.getRecalcTBOveride();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		MeasureType RETVAL = THIS.getType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		MeasureType RETVAL = THIS.getType();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarRptgFlag()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getVarRptgFlag()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarRptgFlag1() throws Throwable {
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		// jtest_tested_method
		VarRptgFlag RETVAL = THIS.getVarRptgFlag();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("ExpenseReporting", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarRptgFlag()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#getVarRptgFlag()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarRptgFlag2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		VarRptgFlag RETVAL = THIS.getVarRptgFlag();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureDef(java.lang.String,com.palladium.paf.app.MeasureType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#MeasureDef(java.lang.String,com.palladium.paf.app.MeasureType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureDef1() throws Throwable {
		// jtest_tested_method
		MeasureDef THIS = new MeasureDef((String) null, (MeasureType) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getPlannable()); // jtest_unverified
		assertNotNull(THIS.getRecalcTBOveride()); // jtest_unverified
		assertEquals("Aggregate", THIS.getRecalcTBOveride().toString()); // jtest_unverified
		assertNotNull(THIS.getVarRptgFlag()); // jtest_unverified
		assertEquals("ExpenseReporting", THIS.getVarRptgFlag().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureDef(java.lang.String,com.palladium.paf.app.MeasureType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#MeasureDef(java.lang.String,com.palladium.paf.app.MeasureType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureDef2() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		// jtest_tested_method
		MeasureDef THIS = new MeasureDef("", t0);
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals(t0, THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getPlannable()); // jtest_unverified
		assertNotNull(THIS.getRecalcTBOveride()); // jtest_unverified
		assertEquals("Aggregate", THIS.getRecalcTBOveride().toString()); // jtest_unverified
		assertNotNull(THIS.getVarRptgFlag()); // jtest_unverified
		assertEquals("ExpenseReporting", THIS.getVarRptgFlag().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#MeasureDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureDef3() throws Throwable {
		// jtest_tested_method
		MeasureDef THIS = new MeasureDef();
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertNotNull(THIS.getType()); // jtest_unverified
		assertEquals("Aggregate", THIS.getType().toString()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getPlannable()); // jtest_unverified
		assertSame(THIS.getType(), THIS.getRecalcTBOveride()); // jtest_unverified
		assertNotNull(THIS.getVarRptgFlag()); // jtest_unverified
		assertEquals("RevenueReporting", THIS.getVarRptgFlag().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliases(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setAliases(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliases1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setAliases(var2);
		assertEquals(var2, THIS.getAliases()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean("");
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNumericFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setNumericFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumericFormatName1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean("");
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setNumericFormatName("");
		assertEquals("", THIS.getNumericFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPlannable(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setPlannable(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPlannable1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean("");
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		Boolean t6 = new Boolean(true);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setPlannable(t6);
		assertEquals(t6, THIS.getPlannable()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRecalcTBOveride(com.palladium.paf.app.MeasureType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setRecalcTBOveride(com.palladium.paf.app.MeasureType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRecalcTBOveride1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		MeasureType t6 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setRecalcTBOveride(t6);
		assertEquals(t0, THIS.getRecalcTBOveride()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setType(com.palladium.paf.app.MeasureType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setType(com.palladium.paf.app.MeasureType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetType1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		MeasureType t6 = MeasureType.valueOf("TimeBalFirst");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setType(t6);
		assertEquals(t0, THIS.getType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVarRptgFlag(com.palladium.paf.app.VarRptgFlag)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureDef#setVarRptgFlag(com.palladium.paf.app.VarRptgFlag)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVarRptgFlag1() throws Throwable {
		MeasureType t0 = MeasureType.valueOf("TimeBalFirst");
		MeasureDef THIS = new MeasureDef("", t0);
		MeasureType t2 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t3 = VarRptgFlag.valueOf("ExpenseReporting");
		Boolean t4 = new Boolean(true);
		MeasureType t5 = MeasureType.valueOf("TimeBalFirst");
		VarRptgFlag t6 = VarRptgFlag.valueOf("ExpenseReporting");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setType(t2);
		THIS.setNumericFormatName("");
		THIS.setVarRptgFlag(t3);
		THIS.setPlannable(t4);
		THIS.setRecalcTBOveride(t5);
		// jtest_tested_method
		THIS.setVarRptgFlag(t6);
		assertEquals(t3, THIS.getVarRptgFlag()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.MeasureDefTest
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
			MeasureDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.MeasureDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return MeasureDef.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f0;
		}

// JTEST_CURRENT_ID=475548528.