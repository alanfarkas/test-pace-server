/*
 * PafMemberTest.java
 * Created by Jtest on 9/19/06 6:04:26 PM.
 * Updated by Jtest on 10/18/06 7:21:24 PM, 5 test cases added, 5 test cases removed.
 */

package com.palladium.paf.mdb;

import java.util.List;
import jtest.Repository;
import jtest.Stubs;
import java.util.Map;
import jtest.mocks.java.util.ListMock;
import com.essbase.api.metadata.IEssMember;
import com.palladium.paf.mdb.PafMember;

/**
 * PafMemberTest is a unit test class for class PafMember.
 * @see com.palladium.paf.mdb.PafMember
 * @author Parasoft Jtest 8.0
 */
public class PafMemberTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMemberTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: addChild(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#addChild(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		THIS.addChild((PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMember.addChild(PafMember.java:97)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMember.addChild(PafMember.java:88)
		// jtest_unverified
	}

	/**
	 * Test for method: addChild(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#addChild(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild2() throws Throwable {
		PafMember THIS = new PafMember();
		PafMember t1 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember();
		PafMemberAttr t5 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t6 = new ListMock(var2);
		PafMember t7 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t9 = new ListMock(var3);
		PafMember t10 = new PafMember((String) null);
		t1.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t1.setChildren(t3);
		t1.setKey("");
		t4.setPafMemberAttr(t5);
		t4.setChildren(t6);
		t4.setKey("");
		t7.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t7.setChildren(t9);
		t7.setKey("");
		t7.setParent(t10);
		t4.setParent(t7);
		t1.setParent(t4);
		// jtest_tested_method
		THIS.addChild(t1);
		assertEquals(null, THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		List RETVAL = THIS.getChildren();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren2() throws Throwable {
		PafMember THIS = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember((String) null);
		THIS.setPafMemberAttr(t1);
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		List RETVAL = THIS.getChildren();
		assertEquals(t2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren3() throws Throwable {
		PafMember THIS = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t2 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t3 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		PafMember t5 = new PafMember();
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var2);
		String[] var3 = new String[] {};
		t1.setAssociatedAttributes(var3);
		t1.setConsolidationType(t2);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(7);
		t1.setLastFormula("");
		t1.setLevelNumber(7);
		t1.setShareOption(t3);
		String[] var4 = new String[] {};
		t1.setUDAs(var4);
		THIS.setPafMemberAttr(t1);
		THIS.setChildren(t4);
		THIS.setKey("");
		THIS.setParent(t5);
		// jtest_tested_method
		List RETVAL = THIS.getChildren();
		assertEquals(t4, RETVAL); // jtest_unverified
		assertEquals(6, t2.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey1() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		// jtest_tested_method
		String RETVAL = THIS.getKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getPafMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberAttr1() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		// jtest_tested_method
		PafMemberAttr RETVAL = THIS.getPafMemberAttr();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPafMemberAttr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getPafMemberAttr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPafMemberAttr2() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember((String) null);
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember((String) null);
		PafMemberAttr t15 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t16 = new ListMock(var5);
		PafMember t17 = new PafMember((String) null);
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr(t4);
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var6);
		String[] var7 = new String[] {};
		t10.setAssociatedAttributes(var7);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var8 = new String[] {};
		t10.setUDAs(var8);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t14.setPafMemberAttr(t15);
		t14.setChildren(t16);
		t14.setKey("");
		t14.setParent(t17);
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		PafMemberAttr RETVAL = THIS.getPafMemberAttr();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("", RETVAL.getDescription()); // jtest_unverified
		assertEquals(null, RETVAL.getAliases()); // jtest_unverified
		assertNotNull(RETVAL.getAssociatedAttributes()); // jtest_unverified
		assertEquals(0, RETVAL.getAssociatedAttributes().length); // jtest_unverified
		assertEquals(null, RETVAL.getConsolidationType()); // jtest_unverified
		assertEquals("", RETVAL.getFormula()); // jtest_unverified
		assertEquals(0, RETVAL.getGenerationNumber()); // jtest_unverified
		assertEquals("", RETVAL.getLastFormula()); // jtest_unverified
		assertEquals(6, t12.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t11.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParent1() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		// jtest_tested_method
		PafMember RETVAL = THIS.getParent();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getParent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParent2() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember("");
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		THIS.setParent(t3);
		// jtest_tested_method
		PafMember RETVAL = THIS.getParent();
		assertEquals(t3, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getShallowDiscCopy()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getShallowDiscCopy()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetShallowDiscCopy1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		PafMember RETVAL = THIS.getShallowDiscCopy();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(null, RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getSimpleVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#getSimpleVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSimpleVersion1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		PafSimpleMember RETVAL = THIS.getSimpleVersion();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(null, RETVAL.getKey()); // jtest_unverified
		assertEquals(null, RETVAL.getPafSimpleMemberAttr()); // jtest_unverified
		assertEquals(null, RETVAL.getParentKey()); // jtest_unverified
		assertNotNull(RETVAL.getChildKeys()); // jtest_unverified
		assertEquals(0, RETVAL.getChildKeys().length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: hasChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#hasChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasChildren1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		boolean RETVAL = THIS.hasChildren();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: hasChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#hasChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasChildren3() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] { null };
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		Object[] var4 = new Object[] {};
		ListMock t11 = new ListMock(var4);
		PafMember t12 = new PafMember((String) null);
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		t9.setKey("");
		t9.setParent(t12);
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.hasChildren();
		assertEquals(true, RETVAL); // jtest_unverified
		assertEquals("[null]", t2.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: hasChildren()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#hasChildren()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasChildren4() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember();
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var3);
		String[] var4 = new String[] {};
		t4.setAssociatedAttributes(var4);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(7);
		t4.setLastFormula("");
		t4.setLevelNumber(7);
		t4.setShareOption(t6);
		String[] var5 = new String[] {};
		t4.setUDAs(var5);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t3.setParent(t8);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.hasChildren();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals(6, t5.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t6.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isFirstChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isFirstChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFirstChild1() throws Throwable {
		PafMember THIS = new PafMember();
		// jtest_tested_method
		boolean RETVAL = THIS.isFirstChild();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isFirstChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isFirstChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFirstChild3() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] { null };
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		Object[] var4 = new Object[] {};
		ListMock t11 = new ListMock(var4);
		PafMember t12 = new PafMember((String) null);
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		t9.setKey("");
		t9.setParent(t12);
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isFirstChild();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals("[null]", t5.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isFirstChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isFirstChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFirstChild4() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember((String) null);
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		t6.setKey("");
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isFirstChild();
		// IndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafMember.isFirstChild(PafMember.java:227)
		// jtest_unverified
	}

	/**
	 * Test for method: isFirstChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isFirstChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFirstChild7() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isFirstChild();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMember.isFirstChild(PafMember.java:227)
		// jtest_unverified
	}

	/**
	 * Test for method: isFirstChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isFirstChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFirstChild10() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] { null };
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember();
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var3);
		String[] var4 = new String[] {};
		t4.setAssociatedAttributes(var4);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(7);
		t4.setLastFormula("");
		t4.setLevelNumber(7);
		t4.setShareOption(t6);
		String[] var5 = new String[] {};
		t4.setUDAs(var5);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t3.setParent(t8);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isFirstChild();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals("[null]", t7.toString()); // jtest_unverified
		assertEquals(6, t6.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t5.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLastChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isLastChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLastChild1() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isLastChild();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLastChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isLastChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLastChild3() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] { null };
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		Object[] var4 = new Object[] {};
		ListMock t11 = new ListMock(var4);
		PafMember t12 = new PafMember((String) null);
		PafMemberAttr t13 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t14 = new ListMock(var5);
		PafMember t15 = new PafMember();
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		t9.setKey("");
		t12.setPafMemberAttr(t13);
		t12.setChildren(t14);
		t12.setKey("");
		t12.setParent(t15);
		t9.setParent(t12);
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isLastChild();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals("[null]", t5.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLastChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isLastChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLastChild4() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember((String) null);
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		t6.setParent(t9);
		t3.setParent(t6);
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isLastChild();
		// IndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafMember.isLastChild(PafMember.java:245)
		// jtest_unverified
	}

	/**
	 * Test for method: isLastChild()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#isLastChild()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLastChild7() throws Throwable {
		PafMember THIS = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		THIS.setPafMemberAttr(t1);
		THIS.setChildren(t2);
		THIS.setKey("");
		THIS.setParent(t3);
		// jtest_tested_method
		boolean RETVAL = THIS.isLastChild();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMember.isLastChild(PafMember.java:245)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#PafMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMember1() throws Throwable {
		// jtest_tested_method
		PafMember THIS = new PafMember();
		assertEquals(null, THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#PafMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMember2() throws Throwable {
		// jtest_tested_method
		PafMember THIS = new PafMember((String) null);
		assertEquals(null, THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#PafMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMember3() throws Throwable {
		// jtest_tested_method
		PafMember THIS = new PafMember("");
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setChildren(java.util.List)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#setChildren(java.util.List)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetChildren1() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t1 = new ListMock(var1);
		// jtest_tested_method
		THIS.setChildren(t1);
		assertEquals(t1, THIS.getChildren()); // jtest_unverified
		assertEquals(false, THIS.hasChildren()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#setKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetKey1() throws Throwable {
		PafMember THIS = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember();
		PafMemberAttr t9 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t10 = new ListMock(var3);
		PafMember t11 = new PafMember();
		THIS.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		THIS.setChildren(t2);
		THIS.setKey("");
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var4);
		String[] var5 = new String[] {};
		t4.setAssociatedAttributes(var5);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(7);
		t4.setLastFormula("");
		t4.setLevelNumber(7);
		t4.setShareOption(t6);
		String[] var6 = new String[] {};
		t4.setUDAs(var6);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t8.setPafMemberAttr(t9);
		t8.setChildren(t10);
		t8.setKey("");
		t8.setParent(t11);
		t3.setParent(t8);
		THIS.setParent(t3);
		// jtest_tested_method
		THIS.setKey("");
		assertEquals("", THIS.getKey()); // jtest_unverified
		assertEquals(6, t5.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t6.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPafMemberAttr(com.palladium.paf.mdb.PafMemberAttr)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#setPafMemberAttr(com.palladium.paf.mdb.PafMemberAttr)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPafMemberAttr1() throws Throwable {
		PafMember THIS = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		// jtest_tested_method
		THIS.setPafMemberAttr(t1);
		assertEquals(t1, THIS.getPafMemberAttr()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setParent(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#setParent(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetParent1() throws Throwable {
		PafMember THIS = new PafMember();
		PafMember t1 = new PafMember("");
		PafMemberAttr t2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t5 = new ListMock(var1);
		PafMember t6 = new PafMember();
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember();
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setAliases(var3);
		String[] var4 = new String[] {};
		t2.setAssociatedAttributes(var4);
		t2.setConsolidationType(t3);
		t2.setDescription("");
		t2.setFormula("");
		t2.setGenerationNumber(7);
		t2.setLastFormula("");
		t2.setLevelNumber(7);
		t2.setShareOption(t4);
		String[] var5 = new String[] {};
		t2.setUDAs(var5);
		t1.setPafMemberAttr(t2);
		t1.setChildren(t5);
		t1.setKey("");
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		t6.setKey("");
		t6.setParent(t9);
		t1.setParent(t6);
		// jtest_tested_method
		THIS.setParent(t1);
		assertEquals(t1, THIS.getParent()); // jtest_unverified
		assertEquals(6, t4.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		PafMember THIS = new PafMember((String) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMember#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString2() throws Throwable {
		PafMember THIS = new PafMember("");
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafMemberTest
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
			PafMemberTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafMember",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMember.class;
	}

}

// JTEST_CURRENT_ID=-519858492.