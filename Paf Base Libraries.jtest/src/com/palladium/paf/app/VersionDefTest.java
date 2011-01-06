/*
 * VersionDefTest.java
 * Created by Jtest on 9/19/06 5:46:11 PM.
 * Updated by Jtest on 10/18/06 7:18:54 PM, 4 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 3:00:48 AM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.paf.app;

import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.app.VersionDef;

/**
 * VersionDefTest is a unit test class for class VersionDef.
 * @see com.palladium.paf.app.VersionDef
 * @author Parasoft Jtest 8.0
 */
public class VersionDefTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public VersionDefTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#addAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAlias1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		THIS.addAlias((String) null, (String) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getType()); // jtest_unverified
		assertNotNull(THIS.getAliases()); // jtest_unverified
		assertEquals("{null=null}", THIS.getAliases().toString()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getVarianceFormulaString()); // jtest_unverified
		assertEquals(null, THIS.getVersionFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: addAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#addAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAlias2() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		THIS.addAlias("", "");
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals(t1, THIS.getType()); // jtest_unverified
		assertEquals(var1, THIS.getAliases()); // jtest_unverified
		assertEquals("", THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(" =  - ", THIS.getVarianceFormulaString()); // jtest_unverified
		assertEquals(t3, THIS.getVersionFormula()); // jtest_unverified
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
				// at com.palladium.paf.app.VersionDef.addAlias(VersionDef.java:79)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlias1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getAlias("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlias2() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getAlias();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAlias5() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		_f0 = new Object();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getAlias();
		// ClassCastException thrown
		// at com.palladium.paf.app.VersionDef.getAlias(VersionDef.java:62)
		// at com.palladium.paf.app.VersionDef.getAlias(VersionDef.java:49)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAlias5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAlias5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.app.VersionDef.getAlias(VersionDef.java:62)
				// at com.palladium.paf.app.VersionDef.getAlias(VersionDef.java:49)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases1() throws Throwable {
		VersionDef THIS = new VersionDef((String) null, (VersionType) null);
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases2() throws Throwable {
		VersionDef THIS = new VersionDef((String) null, (VersionType) null);
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t2.setBaseVersion("");
		t2.setCompareVersion("");
		t2.setVarianceType(t3);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString((VarRptgFlag) null, 0.0);
		assertEquals(" =  - ", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString3() throws Throwable {
		VersionDef THIS = new VersionDef();
		VarRptgFlag t1 = VarRptgFlag.valueOf("ExpenseReporting");
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString(t1, 7.0);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString4() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString(com.palladium.paf.app.VarRptgFlag,double)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString5() throws Throwable {
		VersionDef THIS = new VersionDef((String) null, (VersionType) null);
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString((VarRptgFlag) null, 0.0);
		// UnsupportedOperationException thrown
		// at com.palladium.paf.app.VersionDef.getBaseFormulaString(VersionDef.java:208)
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString6() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t2.setBaseVersion("");
		t2.setCompareVersion("");
		t2.setVarianceType(t3);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString();
		assertEquals(" =  + ", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBaseFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getBaseFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseFormulaString9() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getBaseFormulaString();
		// UnsupportedOperationException thrown
		// at com.palladium.paf.app.VersionDef.getBaseFormulaString(VersionDef.java:208)
		// at com.palladium.paf.app.VersionDef.getBaseFormulaString(VersionDef.java:159)
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetName2() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		String RETVAL = THIS.getName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNumericFormatName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getNumericFormatName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNumericFormatName2() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula();
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t2.setBaseVersion("");
		t2.setCompareVersion("");
		t2.setVarianceType(t3);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getNumericFormatName();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		VersionType RETVAL = THIS.getType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetType2() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		VersionType RETVAL = THIS.getType();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getVarianceFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceFormulaString1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		String RETVAL = THIS.getVarianceFormulaString();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getVarianceFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceFormulaString3() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		VersionVarianceType t3 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t2.setBaseVersion("");
		t2.setCompareVersion("");
		t2.setVarianceType(t3);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getVarianceFormulaString();
		assertEquals(" =  - ", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVarianceFormulaString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getVarianceFormulaString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVarianceFormulaString4() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula(
			(String) null,
			(String) null,
			(VersionVarianceType) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
		// jtest_tested_method
		String RETVAL = THIS.getVarianceFormulaString();
		// UnsupportedOperationException thrown
		// at com.palladium.paf.app.VersionDef.getVarianceFormulaString(VersionDef.java:150)
		// jtest_unverified
	}

	/**
	 * Test for method: getVersionFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getVersionFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionFormula1() throws Throwable {
		VersionDef THIS = new VersionDef();
		// jtest_tested_method
		VersionFormula RETVAL = THIS.getVersionFormula();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getVersionFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#getVersionFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetVersionFormula2() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		VersionFormula RETVAL = THIS.getVersionFormula();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliases(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#setAliases(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliases1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionFormula t2 = new VersionFormula();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		THIS.setVersionFormula(t2);
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
	 * @see VersionDef#setName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetName1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		THIS.setName("");
		assertEquals("", THIS.getName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setNumericFormatName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#setNumericFormatName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetNumericFormatName1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		THIS.setNumericFormatName("");
		assertEquals("", THIS.getNumericFormatName()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setType(com.palladium.paf.app.VersionType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#setType(com.palladium.paf.app.VersionType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetType1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		VersionType t5 = VersionType.valueOf("Calculated");
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		THIS.setType(t5);
		assertEquals(t1, THIS.getType()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setVersionFormula(com.palladium.paf.app.VersionFormula)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#setVersionFormula(com.palladium.paf.app.VersionFormula)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetVersionFormula1() throws Throwable {
		VersionDef THIS = new VersionDef();
		VersionType t1 = VersionType.valueOf("Calculated");
		VersionVarianceType t2 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t3 = new VersionFormula("", "", t2);
		VersionVarianceType t4 = VersionVarianceType.valueOf("SimpleVariance");
		VersionVarianceType t5 = VersionVarianceType.valueOf("SimpleVariance");
		VersionFormula t6 = new VersionFormula("", "", t5);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		THIS.setName("");
		THIS.setNumericFormatName("");
		THIS.setType(t1);
		t3.setBaseVersion("");
		t3.setCompareVersion("");
		t3.setVarianceType(t4);
		THIS.setVersionFormula(t3);
		// jtest_tested_method
		THIS.setVersionFormula(t6);
		assertEquals(t6, THIS.getVersionFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}
	/**
	 * Test for method: VersionDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#VersionDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testVersionDef1() throws Throwable {
		// jtest_tested_method
		VersionDef THIS = new VersionDef();
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getVarianceFormulaString()); // jtest_unverified
		assertEquals(null, THIS.getVersionFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: VersionDef(java.lang.String,com.palladium.paf.app.VersionType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#VersionDef(java.lang.String,com.palladium.paf.app.VersionType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVersionDef2() throws Throwable {
		// jtest_tested_method
		VersionDef THIS = new VersionDef((String) null, (VersionType) null);
		assertEquals(null, THIS.getName()); // jtest_unverified
		assertEquals(null, THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getVarianceFormulaString()); // jtest_unverified
		assertEquals(null, THIS.getVersionFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: VersionDef(java.lang.String,com.palladium.paf.app.VersionType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see VersionDef#VersionDef(java.lang.String,com.palladium.paf.app.VersionType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testVersionDef3() throws Throwable {
		VersionType t0 = VersionType.valueOf("Calculated");
		// jtest_tested_method
		VersionDef THIS = new VersionDef("", t0);
		assertEquals("", THIS.getName()); // jtest_unverified
		assertEquals(t0, THIS.getType()); // jtest_unverified
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertEquals(null, THIS.getNumericFormatName()); // jtest_unverified
		assertEquals(null, THIS.getVarianceFormulaString()); // jtest_unverified
		assertEquals(null, THIS.getVersionFormula()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.app.VersionDefTest
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
			VersionDefTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.VersionDef",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return VersionDef.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f0;
		}

// JTEST_CURRENT_ID=-977200100.