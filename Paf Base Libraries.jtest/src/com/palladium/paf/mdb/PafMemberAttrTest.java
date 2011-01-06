/*
 * PafMemberAttrTest.java
 * Created by Jtest on 9/19/06 5:31:48 PM.
 * Updated by Jtest on 10/18/06 7:28:29 PM, 4 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/9/06 3:14:30 AM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.paf.mdb;

import com.essbase.api.metadata.IEssMember.EEssConsolidationType;
import com.essbase.api.metadata.IEssMember.EEssShareOption;
import jtest.Repository;
import java.util.Collection;
import java.util.Set;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import com.essbase.api.metadata.IEssMember;
import com.palladium.paf.mdb.PafMemberAttr;

/**
 * PafMemberAttrTest is a unit test class for class PafMemberAttr.
 * @see com.palladium.paf.mdb.PafMemberAttr
 * @author Parasoft Jtest 8.0
 */
public class PafMemberAttrTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMemberAttrTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addMemberAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#addMemberAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddMemberAlias1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		THIS.addMemberAlias((String) null, (String) null);
		assertNotNull(THIS.getAliases()); // jtest_unverified
		assertEquals("{null=null}", THIS.getAliases().toString()); // jtest_unverified
		assertNotNull(THIS.getAssociatedAttributes()); // jtest_unverified
		assertEquals(0, THIS.getAssociatedAttributes().length); // jtest_unverified
		assertEquals(null, THIS.getConsolidationType()); // jtest_unverified
		assertEquals("", THIS.getDescription()); // jtest_unverified
		assertEquals("", THIS.getFormula()); // jtest_unverified
		assertEquals(0, THIS.getGenerationNumber()); // jtest_unverified
		assertEquals("", THIS.getLastFormula()); // jtest_unverified
		assertEquals(0, THIS.getLevelNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: addMemberAlias(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#addMemberAlias(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddMemberAlias2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.addMemberAlias("", "");
		assertEquals(var1, THIS.getAliases()); // jtest_unverified
		assertEquals(var2, THIS.getAssociatedAttributes()); // jtest_unverified
		assertEquals(t1, THIS.getConsolidationType()); // jtest_unverified
		assertEquals("", THIS.getDescription()); // jtest_unverified
		assertEquals("", THIS.getFormula()); // jtest_unverified
		assertEquals(7, THIS.getGenerationNumber()); // jtest_unverified
		assertEquals("", THIS.getLastFormula()); // jtest_unverified
		assertEquals(7, THIS.getLevelNumber()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddMemberAlias2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddMemberAlias2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberAttr.addMemberAlias(PafMemberAttr.java:346)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases1() throws Throwable {
		PafMemberAttr THIS = (PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr");
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliases()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getAliases()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliases2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		Map RETVAL = THIS.getAliases();
		assertEquals(var1, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAssociatedAttributes()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getAssociatedAttributes()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAssociatedAttributes1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getAssociatedAttributes();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAssociatedAttributes()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getAssociatedAttributes()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAssociatedAttributes2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String[] RETVAL = THIS.getAssociatedAttributes();
		assertEquals(var2, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getConsolidationType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getConsolidationType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConsolidationType1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		EEssConsolidationType RETVAL = THIS.getConsolidationType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getConsolidationType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getConsolidationType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetConsolidationType2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		EEssConsolidationType RETVAL = THIS.getConsolidationType();
		assertEquals(t1, RETVAL); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDescription()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getDescription()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescription2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String RETVAL = THIS.getDescription();
		assertEquals("", RETVAL); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getFormula();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String RETVAL = THIS.getFormula();
		assertEquals("", RETVAL); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getGenerationNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationNumber1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getGenerationNumber();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getGenerationNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getGenerationNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetGenerationNumber2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		int RETVAL = THIS.getGenerationNumber();
		assertEquals(7, RETVAL); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLastFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getLastFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastFormula1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getLastFormula();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLastFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getLastFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastFormula2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String RETVAL = THIS.getLastFormula();
		assertEquals("", RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevelNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getLevelNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelNumber1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		int RETVAL = THIS.getLevelNumber();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLevelNumber()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getLevelNumber()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLevelNumber2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		int RETVAL = THIS.getLevelNumber();
		assertEquals(7, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberAlias(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getMemberAlias(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAlias1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getMemberAlias("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getMemberAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAlias2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String RETVAL = THIS.getMemberAlias();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getMemberAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAlias4() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String RETVAL = THIS.getMemberAlias();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAlias4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAlias4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:326)
				// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:312)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAlias()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getMemberAlias()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAlias6() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		_f0 = new Object();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String RETVAL = THIS.getMemberAlias();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:326)
		// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:312)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAlias6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAlias6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:326)
				// at com.palladium.paf.mdb.PafMemberAttr.getMemberAlias(PafMemberAttr.java:312)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getShareOption()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getShareOption()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetShareOption1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		EEssShareOption RETVAL = THIS.getShareOption();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getShareOption()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getShareOption()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetShareOption2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		EEssShareOption RETVAL = THIS.getShareOption();
		assertEquals(t2, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSimpleVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getSimpleVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSimpleVersion1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getSimpleVersion();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:357)
		// jtest_unverified
	}

	/**
	 * Test for method: getSimpleVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getSimpleVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSimpleVersion2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getSimpleVersion();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:403)
		// Caused by: com.essbase.api.base.EssException: No matching Enum found.
		// at com.essbase.api.metadata.IEssMember$EEssConsolidationType.intValue(IEssMember.java:857)
		// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:390)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSimpleVersion2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSimpleVersion2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:357)
				// 
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:358)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSimpleVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getSimpleVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSimpleVersion3() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getSimpleVersion();
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:403)
		// Caused by: com.essbase.api.base.EssException: No matching Enum found.
		// at com.essbase.api.metadata.IEssMember$EEssShareOption.intValue(IEssMember.java:1308)
		// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:395)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSimpleVersion3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSimpleVersion3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:357)
				// 
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:358)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		if (Stubs.matches(method, IEssMember.EEssConsolidationType.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "intValue", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:390)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSimpleVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getSimpleVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSimpleVersion5() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		PafSimpleMemberAttr RETVAL = THIS.getSimpleVersion();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0L, RETVAL.getId()); // jtest_unverified
		assertNotNull(RETVAL.getAssociatedAttributes()); // jtest_unverified
		assertEquals(0, RETVAL.getAssociatedAttributes().length); // jtest_unverified
		assertEquals(0, RETVAL.getConsolidationType()); // jtest_unverified
		assertEquals("", RETVAL.getDescription()); // jtest_unverified
		assertEquals("", RETVAL.getFormula()); // jtest_unverified
		assertEquals(0, RETVAL.getGenerationNumber()); // jtest_unverified
		assertEquals("", RETVAL.getLastFormula()); // jtest_unverified
		assertEquals(0, RETVAL.getLevelNumber()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSimpleVersion5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSimpleVersion5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:357)
				// 
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:358)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:377)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:379)
			}
		}
		if (Stubs.matches(method, IEssMember.EEssConsolidationType.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "intValue", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:390)
			}
		}
		if (Stubs.matches(method, IEssMember.EEssShareOption.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "intValue", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberAttr.getSimpleVersion(PafMemberAttr.java:395)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUDAs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getUDAs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUDAs1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		// jtest_tested_method
		String[] RETVAL = THIS.getUDAs();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getUDAs()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#getUDAs()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUDAs2() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(0);
		THIS.setLastFormula("");
		THIS.setLevelNumber(0);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		String[] RETVAL = THIS.getUDAs();
		assertEquals(var3, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#PafMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberAttr1() throws Throwable {
		// jtest_tested_method
		PafMemberAttr THIS = new PafMemberAttr();
		assertEquals(null, THIS.getAliases()); // jtest_unverified
		assertNotNull(THIS.getAssociatedAttributes()); // jtest_unverified
		assertEquals(0, THIS.getAssociatedAttributes().length); // jtest_unverified
		assertEquals(null, THIS.getConsolidationType()); // jtest_unverified
		assertEquals("", THIS.getDescription()); // jtest_unverified
		assertEquals("", THIS.getFormula()); // jtest_unverified
		assertEquals(0, THIS.getGenerationNumber()); // jtest_unverified
		assertEquals("", THIS.getLastFormula()); // jtest_unverified
		assertEquals(0, THIS.getLevelNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAliases(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setAliases(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliases1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		THIS.setAliases(var4);
		assertEquals(var4, THIS.getAliases()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setAssociatedAttributes(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setAssociatedAttributes(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAssociatedAttributes1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		String[] var4 = new String[] {};
		// jtest_tested_method
		THIS.setAssociatedAttributes(var4);
		assertSame(var4, THIS.getAssociatedAttributes()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setConsolidationType(com.essbase.api.metadata.IEssMember.EEssConsolidationType)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setConsolidationType(com.essbase.api.metadata.IEssMember.EEssConsolidationType)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetConsolidationType1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setConsolidationType(t3);
		assertEquals(t3, THIS.getConsolidationType()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDescription(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setDescription(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDescription1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setDescription("");
		assertEquals("", THIS.getDescription()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFormula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setFormula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFormula1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setFormula("");
		assertEquals("", THIS.getFormula()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setGenerationNumber(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setGenerationNumber(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetGenerationNumber1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setGenerationNumber(7);
		assertEquals(7, THIS.getGenerationNumber()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLastFormula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setLastFormula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLastFormula1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setLastFormula("");
		assertEquals("", THIS.getLastFormula()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLevelNumber(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setLevelNumber(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLevelNumber1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setLevelNumber(7);
		assertEquals(7, THIS.getLevelNumber()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setShareOption(com.essbase.api.metadata.IEssMember.EEssShareOption)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setShareOption(com.essbase.api.metadata.IEssMember.EEssShareOption)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetShareOption1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		IEssMember.EEssShareOption t3 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		// jtest_tested_method
		THIS.setShareOption(t3);
		assertEquals(t3, THIS.getShareOption()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setUDAs(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberAttr#setUDAs(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetUDAs1() throws Throwable {
		PafMemberAttr THIS = new PafMemberAttr();
		IEssMember.EEssConsolidationType t1 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t2 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setAliases(var1);
		String[] var2 = new String[] {};
		THIS.setAssociatedAttributes(var2);
		THIS.setConsolidationType(t1);
		THIS.setDescription("");
		THIS.setFormula("");
		THIS.setGenerationNumber(7);
		THIS.setLastFormula("");
		THIS.setLevelNumber(7);
		THIS.setShareOption(t2);
		String[] var3 = new String[] {};
		THIS.setUDAs(var3);
		String[] var4 = new String[] {};
		// jtest_tested_method
		THIS.setUDAs(var4);
		assertSame(var4, THIS.getUDAs()); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t1.getCountPossibleValues()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafMemberAttrTest
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
			PafMemberAttrTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafMemberAttr",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMemberAttr.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f0;
		}

// JTEST_CURRENT_ID=-531696858.