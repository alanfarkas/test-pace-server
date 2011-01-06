/*
 * PafMemberTreeTest.java
 * Created by Jtest on 9/19/06 6:09:26 PM.
 * Updated by Jtest on 10/18/06 7:42:52 PM, 56 test cases added, 56 test cases removed.
 * Updated by Jtest on 11/9/06 3:35:16 AM, 56 test cases added, 56 test cases removed.
 */

package com.palladium.paf.mdb;

import java.util.AbstractList;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import com.palladium.paf.PafException;
import java.util.List;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.HashMap;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import jtest.Repository;
import com.essbase.api.metadata.IEssMember;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.mdb.PafMemberTree;

/**
 * PafMemberTreeTest is a unit test class for class PafMemberTree.
 * @see com.palladium.paf.mdb.PafMemberTree
 * @author Parasoft Jtest 8.0
 */
public class PafMemberTreeTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafMemberTreeTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:149)
		// jtest_unverified
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild3() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember();
		PafMemberAttr t15 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t16 = new ListMock(var5);
		PafMember t17 = new PafMember((String) null);
		Object[] var6 = new Object[] {};
		ListMock t19 = new ListMock(var6);
		PafMember t20 = new PafMember();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
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
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var7);
		String[] var8 = new String[] {};
		t10.setAssociatedAttributes(var8);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var9 = new String[] {};
		t10.setUDAs(var9);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t14.setPafMemberAttr(t15);
		t14.setChildren(t16);
		t14.setKey("");
		t17.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t17.setChildren(t19);
		t17.setKey("");
		t17.setParent(t20);
		t14.setParent(t17);
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild4() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		PafMemberAttr t4 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember();
		PafMemberAttr t15 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t16 = new ListMock(var5);
		PafMember t17 = new PafMember((String) null);
		Object[] var6 = new Object[] {};
		ListMock t19 = new ListMock(var6);
		PafMember t20 = new PafMember();
		Object[] var7 = new Object[] {};
		ListMock t22 = new ListMock(var7);
		PafMember t23 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t25 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t26 = new IEssMember.EEssShareOption();
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t28 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t29 = new IEssMember.EEssShareOption();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			1.000000f);
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr(t4);
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var8);
		String[] var9 = new String[] {};
		t10.setAssociatedAttributes(var9);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var10 = new String[] {};
		t10.setUDAs(var10);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t14.setPafMemberAttr(t15);
		t14.setChildren(t16);
		t14.setKey("");
		t17.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t17.setChildren(t19);
		t17.setKey("");
		t20.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t20.setChildren(t22);
		t20.setKey("");
		t20.setParent(t23);
		t17.setParent(t20);
		t14.setParent(t17);
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var11);
		String[] var12 = new String[] {};
		_f0.setAssociatedAttributes(var12);
		_f0.setConsolidationType(t25);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t26);
		String[] var13 = new String[] {};
		_f0.setUDAs(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var14);
		String[] var15 = new String[] {};
		_f2.setAssociatedAttributes(var15);
		_f2.setConsolidationType(t28);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t29);
		String[] var16 = new String[] {};
		_f2.setUDAs(var16);
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMember.addChild(PafMember.java:97)
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:155)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMember.addChild(PafMember.java:88)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild6() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:175)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
		// jtest_unverified
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild7() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);

		// jtest.ObjectCreationException thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addChild", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:155)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild8() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		_f4 = new PafMember((String) null);
		PafMemberAttr t8 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t9 = new ListMock(var2);
		PafMember t10 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t12 = new ListMock(var3);
		PafMember t13 = new PafMember();
		PafMemberAttr t14 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t15 = new ListMock(var4);
		PafMember t16 = new PafMember((String) null);
		PafMemberAttr t17 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t18 = new ListMock(var5);
		PafMember t19 = new PafMember((String) null);
		PafMember t20 = new PafMember();
		Object[] var6 = new Object[] {};
		ListMock t22 = new ListMock(var6);
		PafMember t23 = new PafMember();
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
		t0.setParent(t3);
		_f4.setPafMemberAttr(t8);
		_f4.setChildren(t9);
		_f4.setKey("");
		t10.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t10.setChildren(t12);
		t10.setKey("");
		t13.setPafMemberAttr(t14);
		t13.setChildren(t15);
		t13.setKey("");
		t16.setPafMemberAttr(t17);
		t16.setChildren(t18);
		t16.setKey("");
		t16.setParent(t19);
		t13.setParent(t16);
		t10.setParent(t13);
		_f4.setParent(t10);
		t20.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t20.setChildren(t22);
		t20.setKey("");
		t20.setParent(t23);
		// jtest_tested_method
		THIS.addChild((String) null, t20);
		assertEquals("[]", t9.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:160)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:159)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:158)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:164)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:165)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild10() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberAttr t10 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t11 = new ListMock(var4);
		PafMember t12 = new PafMember();
		_f0 = new PafMemberAttr();
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t15 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t16 = new IEssMember.EEssShareOption();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		PafMember t18 = new PafMember();
		_f4 = new PafMember((String) null);
		Object[] var5 = new Object[] {};
		ListMock t21 = new ListMock(var5);
		PafMember t22 = new PafMember();
		PafMemberAttr t23 = new PafMemberAttr();
		Object[] var6 = new Object[] {};
		ListMock t24 = new ListMock(var6);
		PafMember t25 = new PafMember((String) null);
		PafMember t26 = new PafMember((String) null);
		Object[] var7 = new Object[] {};
		ListMock t28 = new ListMock(var7);
		PafMember t29 = new PafMember();
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		t6.setKey("");
		t9.setPafMemberAttr(t10);
		t9.setChildren(t11);
		t9.setKey("");
		t9.setParent(t12);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var8);
		String[] var9 = new String[] {};
		_f2.setAssociatedAttributes(var9);
		_f2.setConsolidationType(t15);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t16);
		String[] var10 = new String[] {};
		_f2.setUDAs(var10);
		THIS.setRoot(t18);
		String[] var11 = new String[] {};
		THIS.setAliasTableNames(var11);
		THIS.setId("");
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t21);
		_f4.setKey("");
		t22.setPafMemberAttr(t23);
		t22.setChildren(t24);
		t22.setKey("");
		t22.setParent(t25);
		_f4.setParent(t22);
		t26.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t26.setChildren(t28);
		t26.setKey("");
		t26.setParent(t29);
		// jtest_tested_method
		THIS.addChild((String) null, t26);
		assertEquals("[]", t21.toString()); // jtest_unverified
		assertEquals(6, t15.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t16.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:160)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:159)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:158)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					case 3 :
					case 4 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:164)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:165)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChild(java.lang.String,com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChild11() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		PafMemberAttr t4 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		_f4 = new PafMember((String) null);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr(t4);
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		t6.setKey("");
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		// jtest_tested_method
		THIS.addChild((String) null, (PafMember) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:175)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:158)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChild11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChild11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addChild", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:155)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChildByName(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChildByName(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChildByName1() throws Throwable {
		PafMember t0 = new PafMember();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		_f4 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		// jtest_tested_method
		THIS.addChildByName((String) null, (String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChildByName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChildByName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:160)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:159)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:158)
					// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:164)
					// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
					case 4 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:165)
					// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChildByName(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChildByName(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChildByName3() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.addChildByName((String) null, (String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:149)
		// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
		// jtest_unverified
	}

	/**
	 * Test for method: addChildByName(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChildByName(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChildByName4() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.addChildByName((String) null, (String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:175)
		// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:164)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChildByName4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChildByName4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:159)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:160)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChildByName(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChildByName(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChildByName5() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember((String) null);
		String[] var3 = new String[] {};
		PafMemberTree THIS = new PafMemberTree(t0, var3, 7);
		_f4 = new PafMember("");
		Object[] var4 = new Object[] {};
		ListMock t14 = new ListMock(var4);
		PafMember t15 = new PafMember();
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var5);
		String[] var6 = new String[] {};
		t4.setAssociatedAttributes(var6);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(0);
		t4.setLastFormula("");
		t4.setLevelNumber(0);
		t4.setShareOption(t6);
		String[] var7 = new String[] {};
		t4.setUDAs(var7);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t3.setParent(t8);
		t0.setParent(t3);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t14);
		_f4.setKey("");
		_f4.setParent(t15);
		// jtest_tested_method
		THIS.addChildByName("", "");
		assertEquals(6, t5.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t6.getCountPossibleValues()); // jtest_unverified
		assertEquals("[]", t14.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChildByName5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChildByName5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:160)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:159)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:158)
					// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:164)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:165)
				// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChildByName(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#addChildByName(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChildByName6() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		THIS.addChildByName((String) null, (String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:175)
		// at com.palladium.paf.mdb.PafMemberTree.addChildByName(PafMemberTree.java:190)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addChild(PafMemberTree.java:144)
		// jtest_unverified
	}

	/**
	 * Test for method: getAliasTableName(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAliasTableName(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasTableName1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		String RETVAL = THIS.getAliasTableName(1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getAliasTableName(PafMemberTree.java:1300)
		// jtest_unverified
	}

	/**
	 * Test for method: getAliasTableName(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAliasTableName(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasTableName2() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		String RETVAL = THIS.getAliasTableName(0);
		assertEquals("Default", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAliasTableName(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAliasTableName(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAliasTableName4() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// jtest_tested_method
		String RETVAL = THIS.getAliasTableName(0);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafMemberTree.<init>(Lcom/palladium/paf/mdb/PafMember;[Ljava/lang/String;)V>
		// at com.palladium.paf.mdb.PafMemberTree.getAliasTableName(PafMemberTree.java:1300)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAliasTableName4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAliasTableName4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAncestors(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAncestors(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAncestors2() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		List RETVAL = THIS.getAncestors((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAncestors2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAncestors2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAncestors(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAncestors(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAncestors3() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t6 = new ListMock(var2);
		PafMember t7 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t9 = new ListMock(var3);
		PafMember t10 = new PafMember();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
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
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		List RETVAL = THIS.getAncestors((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[, , null]", RETVAL.toString()); // jtest_unverified
		assertEquals(
			"[Feb, WK01, WK02, WK03, WK04, Mar, WK05, WK06, WK07, WK08, Apr, WK09, WK10, WK11, WK12, WK13]",
			t3.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAncestors3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAncestors3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAncestors(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getAncestors(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAncestors6() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t8 = new ListMock(var1);
		PafMember t9 = new PafMember((String) null);
		_f5 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		ListMock t12 = new ListMock(var2);
		PafMember t13 = new PafMember();
		PafMemberAttr t14 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t15 = new ListMock(var3);
		PafMember t16 = new PafMember((String) null);
		Object[] var4 = new Object[] {};
		ListMock t18 = new ListMock(var4);
		PafMember t19 = new PafMember((String) null);
		PafMemberAttr t20 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t21 = new ListMock(var5);
		PafMember t22 = new PafMember((String) null);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var6);
		String[] var7 = new String[] {};
		_f0.setAssociatedAttributes(var7);
		_f0.setConsolidationType(t3);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t4);
		String[] var8 = new String[] {};
		_f0.setUDAs(var8);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t8);
		_f4.setKey("");
		_f4.setParent(t9);
		_f5.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f5.setChildren(t12);
		_f5.setKey("");
		t13.setPafMemberAttr(t14);
		t13.setChildren(t15);
		t13.setKey("");
		t16.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t16.setChildren(t18);
		t16.setKey("");
		t19.setPafMemberAttr(t20);
		t19.setChildren(t21);
		t19.setKey("");
		t19.setParent(t22);
		t16.setParent(t19);
		t13.setParent(t16);
		_f5.setParent(t13);
		// jtest_tested_method
		List RETVAL = THIS.getAncestors((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:587)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetAncestors6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetAncestors6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:579)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParent", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getParent()");
				switch (index) {
					case 1 :
						return _f5;
					// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:581)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.getAncestors(PafMemberTree.java:584)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getChildren(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren1() throws Throwable {
		_f4 = new PafMember();
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		List RETVAL = THIS.getChildren("");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"[Feb, WK01, WK02, WK03, WK04, Mar, WK05, WK06, WK07, WK08, Apr, WK09, WK10, WK11, WK12, WK13]",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCumMembers(java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getCumMembers(java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCumMembers1() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberAttr t2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t5 = new ListMock(var1);
		PafMember t6 = new PafMember();
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t2.setAliases(var2);
		String[] var3 = new String[] {};
		t2.setAssociatedAttributes(var3);
		t2.setConsolidationType(t3);
		t2.setDescription("");
		t2.setFormula("");
		t2.setGenerationNumber(0);
		t2.setLastFormula("");
		t2.setLevelNumber(0);
		t2.setShareOption(t4);
		String[] var4 = new String[] {};
		t2.setUDAs(var4);
		_f4.setPafMemberAttr(t2);
		_f4.setChildren(t5);
		_f4.setKey("");
		_f4.setParent(t6);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		List RETVAL = THIS.getCumMembers((String) null, -1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:441)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCumMembers1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCumMembers1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:432)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:432)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:433)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:434)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCumMembers(java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getCumMembers(java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCumMembers3() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		List RETVAL = THIS.getCumMembers((String) null, 0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
		// at com.palladium.paf.mdb.PafMemberTree.getCumMembers(PafMemberTree.java:432)
		// jtest_unverified
	}

	/**
	 * Test for method: getDescendants(java.lang.String,short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getDescendants(java.lang.String,short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescendants2() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		_f4 = new PafMember((String) null);
		Object[] var3 = new Object[] { null };
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t8);
		_f4.setKey("");
		_f4.setParent(t9);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getDescendants((String) null, (short) -32768);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:756)
		// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:731)
		// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:710)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDescendants2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDescendants2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
				// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:710)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:710)
					case 2 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:731)
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:710)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDescendants(java.lang.String,short,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getDescendants(java.lang.String,short,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDescendants5() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getDescendants(
			(String) null,
			(short) -32768,
			false);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
		// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
		// jtest_unverified
	}

	/**
	 * Test for method: getFirstChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getFirstChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFirstChild1() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getFirstChild((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFirstChild1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFirstChild1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:967)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getFirstChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getFirstChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFirstChild3() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] { null };
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getFirstChild((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(
			"[null, Feb, WK01, WK02, WK03, WK04, Mar, WK05, WK06, WK07, WK08, Apr, WK09, WK10, WK11, WK12, WK13]",
			t3.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFirstChild3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFirstChild3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getFirstChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getFirstChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFirstChild4() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getFirstChild((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:968)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFirstChild4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFirstChild4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:964)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:967)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getFirstChild(PafMemberTree.java:968)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getFirstDescendant(java.lang.String,short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getFirstDescendant(java.lang.String,short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFirstDescendant4() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		PafMember RETVAL = THIS.getFirstDescendant(
			(String) null,
			(short) -32768);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
		// at com.palladium.paf.mdb.PafMemberTree.getMembersAtLevel(PafMemberTree.java:824)
		// at com.palladium.paf.mdb.PafMemberTree.getFirstDescendant(PafMemberTree.java:1012)
		// jtest_unverified
	}

	/**
	 * Test for method: getHighestLevelInTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getHighestLevelInTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHighestLevelInTree1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		int RETVAL = THIS.getHighestLevelInTree();
		assertEquals(2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getHighestLevelInTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getHighestLevelInTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHighestLevelInTree3() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t4 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t5 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var3);
		String[] var4 = new String[] {};
		_f2.setAssociatedAttributes(var4);
		_f2.setConsolidationType(t4);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t5);
		String[] var5 = new String[] {};
		_f2.setUDAs(var5);
		// jtest_tested_method
		int RETVAL = THIS.getHighestLevelInTree();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getHighestLevelInTree(PafMemberTree.java:1173)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHighestLevelInTree3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHighestLevelInTree3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getHighestLevelInTree(PafMemberTree.java:1173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getHighestLevelInTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getHighestLevelInTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetHighestLevelInTree4() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t8 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t9 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t12 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t13 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		_f3 = new ListMock(var4);
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		t3.setParent(t6);
		t0.setParent(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var5);
		String[] var6 = new String[] {};
		_f0.setAssociatedAttributes(var6);
		_f0.setConsolidationType(t8);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t9);
		String[] var7 = new String[] {};
		_f0.setUDAs(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var8);
		String[] var9 = new String[] {};
		_f2.setAssociatedAttributes(var9);
		_f2.setConsolidationType(t12);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t13);
		String[] var10 = new String[] {};
		_f2.setUDAs(var10);
		// jtest_tested_method
		int RETVAL = THIS.getHighestLevelInTree();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getHighestLevelInTree(PafMemberTree.java:1173)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetHighestLevelInTree4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetHighestLevelInTree4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.getHighestLevelInTree(PafMemberTree.java:1173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getIDescendants(java.lang.String,short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getIDescendants(java.lang.String,short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIDescendants5() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getIDescendants((String) null, (short) -32768);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
		// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
		// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:658)
		// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:641)
		// jtest_unverified
	}

	/**
	 * Test for method: getIDescendants(java.lang.String,short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getIDescendants(java.lang.String,short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIDescendants6() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null, 0);
		_f4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t6 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t7 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] { null };
		ListMock t8 = new ListMock(var1);
		PafMember t9 = new PafMember((String) null);
		PafMemberAttr t10 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t11 = new ListMock(var2);
		PafMember t12 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t14 = new ListMock(var3);
		PafMember t15 = new PafMember();
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t5.setAliases(var4);
		String[] var5 = new String[] {};
		t5.setAssociatedAttributes(var5);
		t5.setConsolidationType(t6);
		t5.setDescription("");
		t5.setFormula("");
		t5.setGenerationNumber(0);
		t5.setLastFormula("");
		t5.setLevelNumber(0);
		t5.setShareOption(t7);
		String[] var6 = new String[] {};
		t5.setUDAs(var6);
		_f4.setPafMemberAttr(t5);
		_f4.setChildren(t8);
		_f4.setKey("");
		t9.setPafMemberAttr(t10);
		t9.setChildren(t11);
		t9.setKey("");
		t12.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t12.setChildren(t14);
		t12.setKey("");
		t12.setParent(t15);
		t9.setParent(t12);
		_f4.setParent(t9);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getIDescendants((String) null, (short) -32768);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:756)
		// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:731)
		// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:658)
		// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:641)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetIDescendants6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetIDescendants6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
				// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:658)
				// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:641)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:728)
					// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:658)
					// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:641)
					case 2 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.getDescendants(PafMemberTree.java:731)
					// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:658)
					// at com.palladium.paf.mdb.PafMemberTree.getIDescendants(PafMemberTree.java:641)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 2 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetId1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		String RETVAL = THIS.getId();
		assertEquals("Q1", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLastChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLastChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastChild1() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getLastChild((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLastChild1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLastChild1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:990)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLastChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLastChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastChild3() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] { null };
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getLastChild((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("WK13", RETVAL.toString()); // jtest_unverified
		assertEquals(
			"[null, Feb, WK01, WK02, WK03, WK04, Mar, WK05, WK06, WK07, WK08, Apr, WK09, WK10, WK11, WK12, WK13]",
			t3.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLastChild3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLastChild3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLastChild(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLastChild(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLastChild4() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getLastChild((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:991)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLastChild4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLastChild4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.mdb.PafMemberTree.getChildren(PafMemberTree.java:942)
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:987)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:990)
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:991)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getLastChild(PafMemberTree.java:991)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLowestLevelInTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLowestLevelInTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLowestLevelInTree1() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// jtest_tested_method
		int RETVAL = THIS.getLowestLevelInTree();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelInTree(PafMemberTree.java:1177)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLowestLevelInTree1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLowestLevelInTree1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelInTree(PafMemberTree.java:1177)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLowestLevelInTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLowestLevelInTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLowestLevelInTree2() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember();
		_f0 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t12 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t13 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		_f3 = new ListMock(var4);
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var5);
		String[] var6 = new String[] {};
		t4.setAssociatedAttributes(var6);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(0);
		t4.setLastFormula("");
		t4.setLevelNumber(0);
		t4.setShareOption(t6);
		String[] var7 = new String[] {};
		t4.setUDAs(var7);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t3.setParent(t8);
		t0.setParent(t3);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var8);
		String[] var9 = new String[] {};
		_f2.setAssociatedAttributes(var9);
		_f2.setConsolidationType(t12);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t13);
		String[] var10 = new String[] {};
		_f2.setUDAs(var10);
		// jtest_tested_method
		int RETVAL = THIS.getLowestLevelInTree();
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelInTree(PafMemberTree.java:1177)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLowestLevelInTree2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLowestLevelInTree2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelInTree(PafMemberTree.java:1177)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLowestLevelMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLowestLevelMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLowestLevelMembers1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		List RETVAL = THIS.getLowestLevelMembers();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"[WK01, WK02, WK03, WK04, WK05, WK06, WK07, WK08, WK09, WK10, WK11, WK12, WK13]",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLowestLevelMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLowestLevelMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLowestLevelMembers3() throws Throwable {
		PafMemberTree THIS = new PafMemberTree();
		// jtest_tested_method
		List RETVAL = THIS.getLowestLevelMembers();
		// java.util.NoSuchElementException thrown
		// at java.util.TreeMap.key(TreeMap.java:433)
		// at java.util.TreeMap.firstKey(TreeMap.java:287)
		// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelMembers(PafMemberTree.java:1181)
		// jtest_unverified
	}

	/**
	 * Test for method: getLowestLevelMembers()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getLowestLevelMembers()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLowestLevelMembers4() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t4 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t5 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null, 0);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var3);
		String[] var4 = new String[] {};
		_f2.setAssociatedAttributes(var4);
		_f2.setConsolidationType(t4);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t5);
		String[] var5 = new String[] {};
		_f2.setUDAs(var5);
		// jtest_tested_method
		List RETVAL = THIS.getLowestLevelMembers();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelMembers(PafMemberTree.java:1181)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLowestLevelMembers4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLowestLevelMembers4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelMembers(PafMemberTree.java:1181)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.getLowestLevelMembers(PafMemberTree.java:1181)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMember1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getMember((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:206)
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases2() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:366)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases5() throws Throwable {
		PafMember t0 = new PafMember();
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafMemberTree.<init>(Lcom/palladium/paf/mdb/PafMember;[Ljava/lang/String;IF)V>
		// at com.palladium.paf.mdb.PafMemberTree.validAliasTable(PafMemberTree.java:123)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:331)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases6() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		String[] var3 = new String[] {};
		PafMemberTree THIS = new PafMemberTree(t0, var3);
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var4);
		String[] var5 = new String[] {};
		t4.setAssociatedAttributes(var5);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(0);
		t4.setLastFormula("");
		t4.setLevelNumber(0);
		t4.setShareOption(t6);
		String[] var6 = new String[] {};
		t4.setUDAs(var6);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t3.setParent(t8);
		t0.setParent(t3);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var7);
		String[] var8 = new String[] {};
		_f0.setAssociatedAttributes(var8);
		_f0.setConsolidationType(t11);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t12);
		String[] var9 = new String[] {};
		_f0.setUDAs(var9);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:335)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases7() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember();
		PafMemberAttr t7 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t8 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t9 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		ListMock t10 = new ListMock(var3);
		PafMember t11 = new PafMember();
		PafMemberAttr t12 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t17 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t18 = new IEssMember.EEssShareOption();
		String[] var5 = new String[] { null };
		PafMemberTree THIS = new PafMemberTree(t0, var5);
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t3.setChildren(t5);
		t3.setKey("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t7.setAliases(var6);
		String[] var7 = new String[] {};
		t7.setAssociatedAttributes(var7);
		t7.setConsolidationType(t8);
		t7.setDescription("");
		t7.setFormula("");
		t7.setGenerationNumber(0);
		t7.setLastFormula("");
		t7.setLevelNumber(0);
		t7.setShareOption(t9);
		String[] var8 = new String[] {};
		t7.setUDAs(var8);
		t6.setPafMemberAttr(t7);
		t6.setChildren(t10);
		t6.setKey("");
		t11.setPafMemberAttr(t12);
		t11.setChildren(t13);
		t11.setKey("");
		t11.setParent(t14);
		t6.setParent(t11);
		t3.setParent(t6);
		t0.setParent(t3);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var9);
		String[] var10 = new String[] {};
		_f0.setAssociatedAttributes(var10);
		_f0.setConsolidationType(t17);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t18);
		String[] var11 = new String[] {};
		_f0.setUDAs(var11);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.validAliasTable(PafMemberTree.java:124)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:331)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases11() throws Throwable {
		TreeTraversalOrder t1 = TreeTraversalOrder.valueOf("POST_ORDER");
		_f0 = new PafMemberAttr();
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(t1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:366)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					case 2 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases13() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember();
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t17 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t18 = new IEssMember.EEssShareOption();
		String[] var5 = new String[] {};
		PafMemberTree THIS = new PafMemberTree(t0, var5);
		PafMember t20 = new PafMember();
		PafMemberAttr t21 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t22 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t23 = new IEssMember.EEssShareOption();
		Object[] var6 = new Object[] {};
		ListMock t24 = new ListMock(var6);
		PafMember t25 = new PafMember("");
		TreeTraversalOrder t26 = TreeTraversalOrder.valueOf("POST_ORDER");
		_f2 = new PafMemberAttr();
		Object[] var7 = new Object[] {};
		_f1 = new ListMock(var7);
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr(t4);
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var8);
		String[] var9 = new String[] {};
		t10.setAssociatedAttributes(var9);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var10 = new String[] {};
		t10.setUDAs(var10);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var11);
		String[] var12 = new String[] {};
		_f0.setAssociatedAttributes(var12);
		_f0.setConsolidationType(t17);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(7);
		_f0.setLastFormula("");
		_f0.setLevelNumber(7);
		_f0.setShareOption(t18);
		String[] var13 = new String[] {};
		_f0.setUDAs(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		t21.setAliases(var14);
		String[] var15 = new String[] {};
		t21.setAssociatedAttributes(var15);
		t21.setConsolidationType(t22);
		t21.setDescription("");
		t21.setFormula("");
		t21.setGenerationNumber(7);
		t21.setLastFormula("");
		t21.setLevelNumber(7);
		t21.setShareOption(t23);
		String[] var16 = new String[] {};
		t21.setUDAs(var16);
		t20.setPafMemberAttr(t21);
		t20.setChildren(t24);
		t20.setKey("");
		t20.setParent(t25);
		THIS.setRoot(t20);
		String[] var17 = new String[] { "0", "Default" };
		THIS.setAliasTableNames(var17);
		THIS.setId("");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(t26);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null]", RETVAL.toString()); // jtest_unverified
		assertEquals(6, t23.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t17.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t12.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t22.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t11.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t18.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
					case 3 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:366)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 4 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:378)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getLevelNumber()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return new Integer(1);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases17() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		String[] var1 = new String[] { "0", "Default" };
		PafMemberTree THIS = new PafMemberTree(t0, var1);
		TreeTraversalOrder t6 = TreeTraversalOrder.valueOf("POST_ORDER");
		_f2 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		_f1 = new ListMock(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var3);
		String[] var4 = new String[] {};
		_f0.setAssociatedAttributes(var4);
		_f0.setConsolidationType(t3);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(7);
		_f0.setLastFormula("");
		_f0.setLevelNumber(7);
		_f0.setShareOption(t4);
		String[] var5 = new String[] {};
		_f0.setUDAs(var5);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(t6);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null]", RETVAL.toString()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t4.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
					case 4 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:366)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:378)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getLevelNumber()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return new Integer(1);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:299)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:284)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases22() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null, 0);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases23() throws Throwable {
		_f4 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember();
		_f5 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember((String) null);
		PafMemberAttr t9 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t10 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t11 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		ListMock t12 = new ListMock(var3);
		PafMember t13 = new PafMember();
		Object[] var4 = new Object[] {};
		ListMock t15 = new ListMock(var4);
		PafMember t16 = new PafMember();
		_f6 = new PafMember();
		Object[] var5 = new Object[] {};
		ListMock t19 = new ListMock(var5);
		PafMember t20 = new PafMember((String) null);
		PafMemberAttr t21 = new PafMemberAttr();
		Object[] var6 = new Object[] {};
		ListMock t22 = new ListMock(var6);
		PafMember t23 = new PafMember();
		PafMemberAttr t24 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t25 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t26 = new IEssMember.EEssShareOption();
		Object[] var7 = new Object[] {};
		ListMock t27 = new ListMock(var7);
		PafMember t28 = new PafMember();
		Object[] var8 = new Object[] {};
		ListMock t30 = new ListMock(var8);
		PafMember t31 = new PafMember();
		_f8 = new PafMember();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		_f4.setParent(t4);
		_f5.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f5.setChildren(t7);
		_f5.setKey("");
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t9.setAliases(var9);
		String[] var10 = new String[] {};
		t9.setAssociatedAttributes(var10);
		t9.setConsolidationType(t10);
		t9.setDescription("");
		t9.setFormula("");
		t9.setGenerationNumber(0);
		t9.setLastFormula("");
		t9.setLevelNumber(0);
		t9.setShareOption(t11);
		String[] var11 = new String[] {};
		t9.setUDAs(var11);
		t8.setPafMemberAttr(t9);
		t8.setChildren(t12);
		t8.setKey("");
		t13.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t13.setChildren(t15);
		t13.setKey("");
		t13.setParent(t16);
		t8.setParent(t13);
		_f5.setParent(t8);
		_f6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f6.setChildren(t19);
		_f6.setKey("");
		t20.setPafMemberAttr(t21);
		t20.setChildren(t22);
		t20.setKey("");
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		t24.setAliases(var12);
		String[] var13 = new String[] {};
		t24.setAssociatedAttributes(var13);
		t24.setConsolidationType(t25);
		t24.setDescription("");
		t24.setFormula("");
		t24.setGenerationNumber(0);
		t24.setLastFormula("");
		t24.setLevelNumber(0);
		t24.setShareOption(t26);
		String[] var14 = new String[] {};
		t24.setUDAs(var14);
		t23.setPafMemberAttr(t24);
		t23.setChildren(t27);
		t23.setKey("");
		t28.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t28.setChildren(t30);
		t28.setKey("");
		t28.setParent(t31);
		t23.setParent(t28);
		t20.setParent(t23);
		_f6.setParent(t20);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases((TreeTraversalOrder) null, 0);
		assertEquals(t3, RETVAL); // jtest_unverified
		assertEquals(6, t11.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t26.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t10.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t25.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getLevelNumber()");
				switch (index) {
					case 1 :
					case 3 :
						return new Integer(1);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					case 2 :
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					case 2 :
						return _f5;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					case 3 :
						return _f6;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					case 4 :
						return _f8;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:314)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases27() throws Throwable {
		TreeTraversalOrder t1 = TreeTraversalOrder.valueOf("POST_ORDER");
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(t1, "Default", 7);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[null]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases27(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getLevelNumber()");
				switch (index) {
					case 1 :
					case 3 :
					case 5 :
					case 6 :
					case 8 :
					case 9 :
					case 11 :
					case 13 :
						return new Integer(8);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					case 2 :
					case 4 :
					case 7 :
					case 10 :
					case 12 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases31() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember();
		PafMemberAttr t5 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t6 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t7 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember((String) null);
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		ListMock t13 = new ListMock(var3);
		PafMember t14 = new PafMember();
		Object[] var4 = new Object[] {};
		ListMock t16 = new ListMock(var4);
		PafMember t17 = new PafMember();
		Object[] var5 = new Object[] {};
		ListMock t19 = new ListMock(var5);
		PafMember t20 = new PafMember((String) null);
		PafMemberAttr t21 = new PafMemberAttr();
		Object[] var6 = new Object[] {};
		ListMock t22 = new ListMock(var6);
		PafMember t23 = new PafMember();
		PafMemberAttr t24 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t25 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t26 = new IEssMember.EEssShareOption();
		Object[] var7 = new Object[] {};
		ListMock t27 = new ListMock(var7);
		PafMember t28 = new PafMember((String) null);
		Object[] var8 = new Object[] {};
		ListMock t30 = new ListMock(var8);
		PafMember t31 = new PafMember((String) null);
		_f5 = new PafMember();
		Object[] var9 = new Object[] {};
		ListMock t34 = new ListMock(var9);
		PafMember t35 = new PafMember();
		_f6 = new PafMember();
		PafMemberAttr t37 = new PafMemberAttr();
		Object[] var10 = new Object[] { null };
		ListMock t38 = new ListMock(var10);
		PafMember t39 = new PafMember();
		PafMemberAttr t40 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t41 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t42 = new IEssMember.EEssShareOption();
		Object[] var11 = new Object[] {};
		ListMock t43 = new ListMock(var11);
		PafMember t44 = new PafMember((String) null);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		t5.setAliases(var12);
		String[] var13 = new String[] {};
		t5.setAssociatedAttributes(var13);
		t5.setConsolidationType(t6);
		t5.setDescription("");
		t5.setFormula("");
		t5.setGenerationNumber(0);
		t5.setLastFormula("");
		t5.setLevelNumber(0);
		t5.setShareOption(t7);
		String[] var14 = new String[] {};
		t5.setUDAs(var14);
		t4.setPafMemberAttr(t5);
		t4.setChildren(t8);
		t4.setKey("");
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var15);
		String[] var16 = new String[] {};
		t10.setAssociatedAttributes(var16);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var17 = new String[] {};
		t10.setUDAs(var17);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t14.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t14.setChildren(t16);
		t14.setKey("");
		t17.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t17.setChildren(t19);
		t17.setKey("");
		t20.setPafMemberAttr(t21);
		t20.setChildren(t22);
		t20.setKey("");
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		t24.setAliases(var18);
		String[] var19 = new String[] {};
		t24.setAssociatedAttributes(var19);
		t24.setConsolidationType(t25);
		t24.setDescription("");
		t24.setFormula("");
		t24.setGenerationNumber(0);
		t24.setLastFormula("");
		t24.setLevelNumber(0);
		t24.setShareOption(t26);
		String[] var20 = new String[] {};
		t24.setUDAs(var20);
		t23.setPafMemberAttr(t24);
		t23.setChildren(t27);
		t23.setKey("");
		t28.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t28.setChildren(t30);
		t28.setKey("");
		t28.setParent(t31);
		t23.setParent(t28);
		t20.setParent(t23);
		t17.setParent(t20);
		t14.setParent(t17);
		t9.setParent(t14);
		t4.setParent(t9);
		_f4.setParent(t4);
		_f5.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f5.setChildren(t34);
		_f5.setKey("");
		_f5.setParent(t35);
		_f6.setPafMemberAttr(t37);
		_f6.setChildren(t38);
		_f6.setKey("");
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		t40.setAliases(var21);
		String[] var22 = new String[] {};
		t40.setAssociatedAttributes(var22);
		t40.setConsolidationType(t41);
		t40.setDescription("");
		t40.setFormula("");
		t40.setGenerationNumber(0);
		t40.setLastFormula("");
		t40.setLevelNumber(0);
		t40.setShareOption(t42);
		String[] var23 = new String[] {};
		t40.setUDAs(var23);
		t39.setPafMemberAttr(t40);
		t39.setChildren(t43);
		t39.setKey("");
		t39.setParent(t44);
		_f6.setParent(t39);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(
			(TreeTraversalOrder) null,
			"Default",
			-1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:366)
		// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
		// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
		// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
		// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberAliases31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberAliases31(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getLevelNumber()");
				switch (index) {
					case 1 :
					case 3 :
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					case 2 :
						return new Integer(1);
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:376)
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:381)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					case 2 :
						return _f5;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					case 3 :
						return _f6;
					// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:380)
					// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:339)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberAliases(com.palladium.paf.mdb.TreeTraversalOrder,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberAliases32() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMemberAliases(
			(TreeTraversalOrder) null,
			"0",
			0);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMemberAliases(PafMemberTree.java:335)
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberKeys()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberKeys()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberKeys1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		String[] RETVAL = THIS.getMemberKeys();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberKeys1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberKeys1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberKeys(PafMemberTree.java:1274)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberKeys(PafMemberTree.java:1276)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberTree.getMemberKeys(PafMemberTree.java:1276)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberValues()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMemberValues()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberValues1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember[] RETVAL = THIS.getMemberValues();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberValues1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberValues1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberValues(PafMemberTree.java:1287)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.mdb.PafMemberTree.getMemberValues(PafMemberTree.java:1289)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "toArray", argument_types)) {
				return new Object[0];
				// at com.palladium.paf.mdb.PafMemberTree.getMemberValues(PafMemberTree.java:1289)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersAtGen(java.lang.String,short)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMembersAtGen(java.lang.String,short)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersAtGen6() throws Throwable {
		PafMember t0 = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t2 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t3 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		PafMember t5 = new PafMember((String) null);
		PafMemberAttr t6 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t7 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t8 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t9 = new ListMock(var2);
		PafMember t10 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f3 = new ListMock(var4);
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		_f4 = new PafMember((String) null);
		PafMemberAttr t17 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t18 = new ListMock(var5);
		PafMember t19 = new PafMember();
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var6);
		String[] var7 = new String[] {};
		t1.setAssociatedAttributes(var7);
		t1.setConsolidationType(t2);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(0);
		t1.setLastFormula("");
		t1.setLevelNumber(0);
		t1.setShareOption(t3);
		String[] var8 = new String[] {};
		t1.setUDAs(var8);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t4);
		t0.setKey("");
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t6.setAliases(var9);
		String[] var10 = new String[] {};
		t6.setAssociatedAttributes(var10);
		t6.setConsolidationType(t7);
		t6.setDescription("");
		t6.setFormula("");
		t6.setGenerationNumber(0);
		t6.setLastFormula("");
		t6.setLevelNumber(0);
		t6.setShareOption(t8);
		String[] var11 = new String[] {};
		t6.setUDAs(var11);
		t5.setPafMemberAttr(t6);
		t5.setChildren(t9);
		t5.setKey("");
		t5.setParent(t10);
		t0.setParent(t5);
		_f4.setPafMemberAttr(t17);
		_f4.setChildren(t18);
		_f4.setKey("");
		_f4.setParent(t19);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getMembersAtGen((String) null, (short) -32768);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:794)
		// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersAtGen6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersAtGen6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:875)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:875)
					case 2 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:788)
				// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:794)
				// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberAttr.getGenerationNumber()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return new Integer(-32769);
					// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:788)
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByLevel()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getMembersByLevel()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByLevel1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		SortedMap RETVAL = THIS.getMembersByLevel();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(
			"{0=[WK01, WK02, WK03, WK04, WK05, WK06, WK07, WK08, WK09, WK10, WK11, WK12, WK13], 1=[Feb, Mar, Apr], 2=[Q1]}",
			RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNextSibling1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getNextSibling((PafMember) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafMemberTree.getNextSibling(Lcom/palladium/paf/mdb/PafMember;)Lcom/palladium/paf/mdb/PafMember;>
		// at com.palladium.paf.mdb.PafMemberTree.getNextSibling(PafMemberTree.java:1432)
		// at com.palladium.paf.mdb.PafMemberTree.getNextSibling(PafMemberTree.java:1427)
		// jtest_unverified
	}

	/**
	 * Test for method: getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNextSibling2() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getNextSibling(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNextSibling4() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		Object[] var2 = new Object[] { null };
		ListMock t6 = new ListMock(var2);
		PafMember t7 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t9 = new ListMock(var3);
		PafMember t10 = new PafMember((String) null);
		PafMemberAttr t11 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t12 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t13 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t14 = new ListMock(var4);
		PafMember t15 = new PafMember();
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
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t11.setAliases(var5);
		String[] var6 = new String[] {};
		t11.setAssociatedAttributes(var6);
		t11.setConsolidationType(t12);
		t11.setDescription("");
		t11.setFormula("");
		t11.setGenerationNumber(0);
		t11.setLastFormula("");
		t11.setLevelNumber(0);
		t11.setShareOption(t13);
		String[] var7 = new String[] {};
		t11.setUDAs(var7);
		t10.setPafMemberAttr(t11);
		t10.setChildren(t14);
		t10.setKey("");
		t10.setParent(t15);
		t7.setParent(t10);
		t4.setParent(t7);
		t1.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getNextSibling(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(6, t13.getCountPossibleValues()); // jtest_unverified
		assertEquals("[null]", t6.toString()); // jtest_unverified
		assertEquals(6, t12.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getNextSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetNextSibling5() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		Object[] var2 = new Object[] { "" };
		ListMock t6 = new ListMock(var2);
		PafMember t7 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t9 = new ListMock(var3);
		PafMember t10 = new PafMember();
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
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getNextSibling(t1);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getNextSibling(PafMemberTree.java:1438)
		// at com.palladium.paf.mdb.PafMemberTree.getNextSibling(PafMemberTree.java:1427)
		// jtest_unverified
	}

	/**
	 * Test for method: getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrevSibling1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getPrevSibling((PafMember) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafMemberTree.getPrevSibling(Lcom/palladium/paf/mdb/PafMember;)Lcom/palladium/paf/mdb/PafMember;>
		// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1405)
		// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
		// jtest_unverified
	}

	/**
	 * Test for method: getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrevSibling2() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getPrevSibling(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrevSibling7() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		t1.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t1.setChildren(t3);
		t1.setKey("");
		t1.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getPrevSibling(t1);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1411)
		// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPrevSibling7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPrevSibling7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "indexOf", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1409)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1411)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getPrevSibling(com.palladium.paf.mdb.PafMember)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrevSibling8() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		PafMemberAttr t2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t5 = new ListMock(var1);
		PafMember t6 = new PafMember((String) null);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t2.setAliases(var2);
		String[] var3 = new String[] {};
		t2.setAssociatedAttributes(var3);
		t2.setConsolidationType(t3);
		t2.setDescription("");
		t2.setFormula("");
		t2.setGenerationNumber(0);
		t2.setLastFormula("");
		t2.setLevelNumber(0);
		t2.setShareOption(t4);
		String[] var4 = new String[] {};
		t2.setUDAs(var4);
		t1.setPafMemberAttr(t2);
		t1.setChildren(t5);
		t1.setKey("");
		t1.setParent(t6);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getPrevSibling(t1);
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(6, t4.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPrevSibling8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPrevSibling8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "indexOf", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1409)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1411)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1400)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPrevSibling(com.palladium.paf.mdb.PafMember,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getPrevSibling(com.palladium.paf.mdb.PafMember,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPrevSibling12() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t2 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t3 = new IEssMember.EEssShareOption();
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		PafMember t5 = new PafMember();
		PafMemberAttr t6 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t7 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t8 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t9 = new ListMock(var2);
		PafMember t10 = new PafMember((String) null);
		PafMemberAttr t11 = new PafMemberAttr();
		Object[] var3 = new Object[] {};
		ListMock t12 = new ListMock(var3);
		PafMember t13 = new PafMember((String) null);
		PafMemberAttr t14 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t15 = new ListMock(var4);
		PafMember t16 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t18 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t19 = new IEssMember.EEssShareOption();
		Object[] var5 = new Object[] {};
		_f1 = new ListMock(var5);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t22 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t23 = new IEssMember.EEssShareOption();
		Object[] var6 = new Object[] {};
		_f3 = new ListMock(var6);
		PafMemberTree THIS = new PafMemberTree(
			t0,
			(String[]) null,
			0,
			0.000000f);
		PafMember t26 = new PafMember();
		PafMember t27 = new PafMember((String) null);
		Object[] var7 = new Object[] {};
		ListMock t29 = new ListMock(var7);
		PafMember t30 = new PafMember((String) null);
		PafMemberAttr t31 = new PafMemberAttr();
		Object[] var8 = new Object[] { null };
		ListMock t32 = new ListMock(var8);
		PafMember t33 = new PafMember((String) null);
		PafMemberAttr t34 = new PafMemberAttr();
		Object[] var9 = new Object[] {};
		ListMock t35 = new ListMock(var9);
		PafMember t36 = new PafMember();
		_f7 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t38 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t39 = new IEssMember.EEssShareOption();
		_f4 = new PafMember((String) null);
		_f11 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t42 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t43 = new IEssMember.EEssShareOption();
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setAliases(var10);
		String[] var11 = new String[] {};
		t1.setAssociatedAttributes(var11);
		t1.setConsolidationType(t2);
		t1.setDescription("");
		t1.setFormula("");
		t1.setGenerationNumber(0);
		t1.setLastFormula("");
		t1.setLevelNumber(0);
		t1.setShareOption(t3);
		String[] var12 = new String[] {};
		t1.setUDAs(var12);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t4);
		t0.setKey("");
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		t6.setAliases(var13);
		String[] var14 = new String[] {};
		t6.setAssociatedAttributes(var14);
		t6.setConsolidationType(t7);
		t6.setDescription("");
		t6.setFormula("");
		t6.setGenerationNumber(0);
		t6.setLastFormula("");
		t6.setLevelNumber(0);
		t6.setShareOption(t8);
		String[] var15 = new String[] {};
		t6.setUDAs(var15);
		t5.setPafMemberAttr(t6);
		t5.setChildren(t9);
		t5.setKey("");
		t10.setPafMemberAttr(t11);
		t10.setChildren(t12);
		t10.setKey("");
		t13.setPafMemberAttr(t14);
		t13.setChildren(t15);
		t13.setKey("");
		t13.setParent(t16);
		t10.setParent(t13);
		t5.setParent(t10);
		t0.setParent(t5);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var16);
		String[] var17 = new String[] {};
		_f0.setAssociatedAttributes(var17);
		_f0.setConsolidationType(t18);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t19);
		String[] var18 = new String[] {};
		_f0.setUDAs(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var19);
		String[] var20 = new String[] {};
		_f2.setAssociatedAttributes(var20);
		_f2.setConsolidationType(t22);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t23);
		String[] var21 = new String[] {};
		_f2.setUDAs(var21);
		THIS.setRoot(t26);
		String[] var22 = new String[] {};
		THIS.setAliasTableNames(var22);
		THIS.setId("");
		t27.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t27.setChildren(t29);
		t27.setKey("");
		t30.setPafMemberAttr(t31);
		t30.setChildren(t32);
		t30.setKey("");
		t33.setPafMemberAttr(t34);
		t33.setChildren(t35);
		t33.setKey("");
		t33.setParent(t36);
		t30.setParent(t33);
		t27.setParent(t30);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f7.setAliases(var23);
		String[] var24 = new String[] {};
		_f7.setAssociatedAttributes(var24);
		_f7.setConsolidationType(t38);
		_f7.setDescription("");
		_f7.setFormula("");
		_f7.setGenerationNumber(0);
		_f7.setLastFormula("");
		_f7.setLevelNumber(0);
		_f7.setShareOption(t39);
		String[] var25 = new String[] {};
		_f7.setUDAs(var25);
		Map var26 = (Map) Stubs.makeStubObject(Map.class);
		_f11.setAliases(var26);
		String[] var27 = new String[] {};
		_f11.setAssociatedAttributes(var27);
		_f11.setConsolidationType(t42);
		_f11.setDescription("");
		_f11.setFormula("");
		_f11.setGenerationNumber(0);
		_f11.setLastFormula("");
		_f11.setLevelNumber(0);
		_f11.setShareOption(t43);
		String[] var28 = new String[] {};
		_f11.setUDAs(var28);
		// jtest_tested_method
		PafMember RETVAL = THIS.getPrevSibling(t27, true);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1420)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPrevSibling12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPrevSibling12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:875)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:875)
					// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
					case 2 :
						return _f4;
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
					// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// 
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					case 3 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					case 3 :
						return _f7;
					// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
					case 4 :
						return _f11;
					// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:788)
					// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
					// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.treeTraversal(PafMemberTree.java:788)
				// at com.palladium.paf.mdb.PafMemberTree.getMembersAtGen(PafMemberTree.java:878)
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1414)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "indexOf", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1415)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1420)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getPrevSibling(PafMemberTree.java:1420)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRoot()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#getRoot()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRoot1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		PafMember RETVAL = THIS.getRoot();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("Q1", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: hasMember(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#hasMember(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testHasMember1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		boolean RETVAL = THIS.hasMember((String) null);
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree1() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(
			(PafMember) null,
			(String[]) null,
			1073741825,
			0.000000f);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// Caused by: java.lang.IllegalArgumentException: Illegal load factor: 0.0
		// at java.util.HashMap.<init>(HashMap.java:171)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree3() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(
			(PafMember) null,
			(String[]) null,
			-1,
			0.000000f);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// Caused by: java.lang.IllegalArgumentException: Illegal initial capacity: -1
		// at java.util.HashMap.<init>(HashMap.java:166)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree4() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(
			(PafMember) null,
			(String[]) null,
			0,
			-1.000000f);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// Caused by: java.lang.IllegalArgumentException: Illegal load factor: -1.0
		// at java.util.HashMap.<init>(HashMap.java:171)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int,float)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree5() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		_f2 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		String[] var3 = new String[] {};
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, var3, 7, 7.000000f);
		assertEquals("[null]", _f1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1462)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree7() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(
			(PafMember) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree8() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree9() throws Throwable {
		PafMember t0 = new PafMember();
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getKey()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree10() throws Throwable {
		PafMember t0 = new PafMember();
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree12() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberAttr t4 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember();
		PafMemberAttr t10 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t11 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t12 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember();
		PafMemberAttr t15 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t16 = new ListMock(var5);
		PafMember t17 = new PafMember((String) null);
		Object[] var6 = new Object[] {};
		ListMock t19 = new ListMock(var6);
		PafMember t20 = new PafMember();
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t3.setPafMemberAttr(t4);
		t3.setChildren(t5);
		t3.setKey("");
		t6.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t6.setChildren(t8);
		t6.setKey("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t10.setAliases(var7);
		String[] var8 = new String[] {};
		t10.setAssociatedAttributes(var8);
		t10.setConsolidationType(t11);
		t10.setDescription("");
		t10.setFormula("");
		t10.setGenerationNumber(0);
		t10.setLastFormula("");
		t10.setLevelNumber(0);
		t10.setShareOption(t12);
		String[] var9 = new String[] {};
		t10.setUDAs(var9);
		t9.setPafMemberAttr(t10);
		t9.setChildren(t13);
		t9.setKey("");
		t14.setPafMemberAttr(t15);
		t14.setChildren(t16);
		t14.setKey("");
		t17.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t17.setChildren(t19);
		t17.setKey("");
		t17.setParent(t20);
		t14.setParent(t17);
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.ClassCastException: java.lang.String
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree13() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		PafMemberAttr t4 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t7 = new ListMock(var2);
		PafMember t8 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t10 = new ListMock(var3);
		PafMember t11 = new PafMember((String) null);
		PafMemberAttr t12 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t13 = new ListMock(var4);
		PafMember t14 = new PafMember();
		PafMemberAttr t15 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t16 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t17 = new IEssMember.EEssShareOption();
		Object[] var5 = new Object[] {};
		ListMock t18 = new ListMock(var5);
		PafMember t19 = new PafMember();
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t4.setAliases(var6);
		String[] var7 = new String[] {};
		t4.setAssociatedAttributes(var7);
		t4.setConsolidationType(t5);
		t4.setDescription("");
		t4.setFormula("");
		t4.setGenerationNumber(0);
		t4.setLastFormula("");
		t4.setLevelNumber(0);
		t4.setShareOption(t6);
		String[] var8 = new String[] {};
		t4.setUDAs(var8);
		t3.setPafMemberAttr(t4);
		t3.setChildren(t7);
		t3.setKey("");
		t8.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t8.setChildren(t10);
		t8.setKey("");
		t11.setPafMemberAttr(t12);
		t11.setChildren(t13);
		t11.setKey("");
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t15.setAliases(var9);
		String[] var10 = new String[] {};
		t15.setAssociatedAttributes(var10);
		t15.setConsolidationType(t16);
		t15.setDescription("");
		t15.setFormula("");
		t15.setGenerationNumber(0);
		t15.setLastFormula("");
		t15.setLevelNumber(0);
		t15.setShareOption(t17);
		String[] var11 = new String[] {};
		t15.setUDAs(var11);
		t14.setPafMemberAttr(t15);
		t14.setChildren(t18);
		t14.setKey("");
		t14.setParent(t19);
		t11.setParent(t14);
		t8.setParent(t11);
		t3.setParent(t8);
		t0.setParent(t3);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree14() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f3 = new ListMock(var2);
		String[] var3 = new String[] {};
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, var3);
		assertEquals("\nnull\n", THIS.toString()); // jtest_unverified
		assertEquals("[null]", _f1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1455)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1462)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree15() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		_f1 = new ListMock(var2);
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t0.setParent(t3);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.ClassCastException: java.lang.String
		// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return "";
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree16() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree16(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1455)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1462)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree18() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null, 0);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree19() throws Throwable {
		PafMember t0 = new PafMember();
		_f0 = new PafMemberAttr();
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t3 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t4 = new IEssMember.EEssShareOption();
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var1);
		String[] var2 = new String[] {};
		_f2.setAssociatedAttributes(var2);
		_f2.setConsolidationType(t3);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(0);
		_f2.setLastFormula("");
		_f2.setLevelNumber(0);
		_f2.setShareOption(t4);
		String[] var3 = new String[] {};
		_f2.setUDAs(var3);
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, (String[]) null, 0);
		assertEquals(6, t4.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t3.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree20() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(
			(PafMember) null,
			(String[]) null,
			-1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
		// Caused by: java.lang.IllegalArgumentException: Illegal initial capacity: -1
		// at java.util.HashMap.<init>(HashMap.java:166)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
		// jtest_unverified
	}

	/**
	 * Test for method: PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree(com.palladium.paf.mdb.PafMember,java.lang.String[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree21() throws Throwable {
		PafMember t0 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		t0.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t0.setChildren(t2);
		t0.setKey("");
		t0.setParent(t3);
		String[] var2 = new String[] {};
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree(t0, var2, 7);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafMemberTree21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafMemberTree21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafMemberTree()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#PafMemberTree()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafMemberTree22() throws Throwable {
		// jtest_tested_method
		PafMemberTree THIS = new PafMemberTree();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch5() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t6 = new ListMock(var2);
		PafMember t7 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t9 = new ListMock(var3);
		PafMember t10 = new PafMember((String) null);
		PafMemberAttr t11 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t12 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t13 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t14 = new ListMock(var4);
		PafMember t15 = new PafMember();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		t4.setPafMemberAttr(t5);
		t4.setChildren(t6);
		t4.setKey("");
		t7.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t7.setChildren(t9);
		t7.setKey("");
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t11.setAliases(var5);
		String[] var6 = new String[] {};
		t11.setAssociatedAttributes(var6);
		t11.setConsolidationType(t12);
		t11.setDescription("");
		t11.setFormula("");
		t11.setGenerationNumber(0);
		t11.setLastFormula("");
		t11.setLevelNumber(0);
		t11.setShareOption(t13);
		String[] var7 = new String[] {};
		t11.setUDAs(var7);
		t10.setPafMemberAttr(t11);
		t10.setChildren(t14);
		t10.setKey("");
		t10.setParent(t15);
		t7.setParent(t10);
		t4.setParent(t7);
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1514)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasChildren", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1514)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch6() throws Throwable {
		_f4 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// StackOverflowError thrown
		// at java.lang.Class.searchMethods(Class.java:2587)
		// at java.lang.Class.getMethod0(Class.java:2611)
		// at java.lang.Class.getMethod0(Class.java:2620)
		// at java.lang.Class.getMethod0(Class.java:2620)
		// at java.lang.Class.getMethod(Class.java:1579)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "remove", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1537)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1531)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1534)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1531)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1534)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch7() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasChildren", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1514)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch9() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t6 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t7 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t11 = new ListMock(var3);
		PafMember t12 = new PafMember();
		Object[] var4 = new Object[] { null };
		_f1 = new ListMock(var4);
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t5.setAliases(var5);
		String[] var6 = new String[] {};
		t5.setAssociatedAttributes(var6);
		t5.setConsolidationType(t6);
		t5.setDescription("");
		t5.setFormula("");
		t5.setGenerationNumber(0);
		t5.setLastFormula("");
		t5.setLevelNumber(0);
		t5.setShareOption(t7);
		String[] var7 = new String[] {};
		t5.setUDAs(var7);
		t4.setPafMemberAttr(t5);
		t4.setChildren(t8);
		t4.setKey("");
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		t9.setKey("");
		t9.setParent(t12);
		t4.setParent(t9);
		_f4.setParent(t4);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasChildren", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChildren", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1514)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1514)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch10() throws Throwable {
		_f4 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		PafMemberAttr t5 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t6 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t7 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t11 = new ListMock(var3);
		PafMember t12 = new PafMember((String) null);
		PafMemberAttr t13 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t14 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t15 = new IEssMember.EEssShareOption();
		Object[] var4 = new Object[] {};
		ListMock t16 = new ListMock(var4);
		PafMember t17 = new PafMember();
		PafMemberAttr t18 = new PafMemberAttr();
		Object[] var5 = new Object[] {};
		ListMock t19 = new ListMock(var5);
		PafMember t20 = new PafMember((String) null);
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t23 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t24 = new IEssMember.EEssShareOption();
		_f4.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f4.setChildren(t3);
		_f4.setKey("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t5.setAliases(var6);
		String[] var7 = new String[] {};
		t5.setAssociatedAttributes(var7);
		t5.setConsolidationType(t6);
		t5.setDescription("");
		t5.setFormula("");
		t5.setGenerationNumber(0);
		t5.setLastFormula("");
		t5.setLevelNumber(0);
		t5.setShareOption(t7);
		String[] var8 = new String[] {};
		t5.setUDAs(var8);
		t4.setPafMemberAttr(t5);
		t4.setChildren(t8);
		t4.setKey("");
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		t9.setKey("");
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t13.setAliases(var9);
		String[] var10 = new String[] {};
		t13.setAssociatedAttributes(var10);
		t13.setConsolidationType(t14);
		t13.setDescription("");
		t13.setFormula("");
		t13.setGenerationNumber(0);
		t13.setLastFormula("");
		t13.setLevelNumber(0);
		t13.setShareOption(t15);
		String[] var11 = new String[] {};
		t13.setUDAs(var11);
		t12.setPafMemberAttr(t13);
		t12.setChildren(t16);
		t12.setKey("");
		t17.setPafMemberAttr(t18);
		t17.setChildren(t19);
		t17.setKey("");
		t17.setParent(t20);
		t12.setParent(t17);
		t9.setParent(t12);
		t4.setParent(t9);
		_f4.setParent(t4);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var12);
		String[] var13 = new String[] {};
		_f0.setAssociatedAttributes(var13);
		_f0.setConsolidationType(t23);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(0);
		_f0.setLastFormula("");
		_f0.setLevelNumber(0);
		_f0.setShareOption(t24);
		String[] var14 = new String[] {};
		_f0.setUDAs(var14);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// StackOverflowError thrown
		// at java.lang.Class.searchMethods(Class.java:2597)
		// at java.lang.Class.getMethod0(Class.java:2611)
		// at java.lang.Class.getMethod(Class.java:1579)
		// at com.palladium.paf.mdb.PafMember.hasChildren(PafMember.java:254)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1515)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "remove", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1537)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberAttr.class,
							"PafMemberAttr");
					// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1531)
					// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
					case 2 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1534)
					// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1531)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1534)
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeBranch(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#removeBranch(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveBranch12() throws Throwable {
		_f4 = new PafMember((String) null);
		_f5 = new PafMember((String) null);
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.removeBranch((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1528)
		// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveBranch12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveBranch12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1510)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasChildren", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1513)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParent", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getParent()");
				switch (index) {
					case 1 :
						return _f5;
					// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1527)
					// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
					case 2 :
						return null;
					// at com.palladium.paf.mdb.PafMemberTree.removeLeaf(PafMemberTree.java:1528)
					// at com.palladium.paf.mdb.PafMemberTree.removeBranch(PafMemberTree.java:1519)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setAliasTableNames(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#setAliasTableNames(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAliasTableNames1() throws Throwable {
		PafMember t0 = new PafMember("");
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		_f0 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t5 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t6 = new IEssMember.EEssShareOption();
		Object[] var2 = new Object[] {};
		_f1 = new ListMock(var2);
		_f2 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t9 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t10 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		_f3 = new ListMock(var3);
		String[] var4 = new String[] {};
		PafMemberTree THIS = new PafMemberTree(t0, var4, 7, 7.000000f);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		t0.setKey("");
		t0.setParent(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setAliases(var5);
		String[] var6 = new String[] {};
		_f0.setAssociatedAttributes(var6);
		_f0.setConsolidationType(t5);
		_f0.setDescription("");
		_f0.setFormula("");
		_f0.setGenerationNumber(7);
		_f0.setLastFormula("");
		_f0.setLevelNumber(7);
		_f0.setShareOption(t6);
		String[] var7 = new String[] {};
		_f0.setUDAs(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setAliases(var8);
		String[] var9 = new String[] {};
		_f2.setAssociatedAttributes(var9);
		_f2.setConsolidationType(t9);
		_f2.setDescription("");
		_f2.setFormula("");
		_f2.setGenerationNumber(7);
		_f2.setLastFormula("");
		_f2.setLevelNumber(7);
		_f2.setShareOption(t10);
		String[] var10 = new String[] {};
		_f2.setUDAs(var10);
		String[] var11 = new String[] {};
		// jtest_tested_method
		THIS.setAliasTableNames(var11);
		assertSame(var11, THIS.getAliasTableNames()); // jtest_unverified
		assertEquals("[]", _f1.toString()); // jtest_unverified
		assertEquals(6, t10.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t5.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t6.getCountPossibleValues()); // jtest_unverified
		assertEquals(6, t9.getCountPossibleValues()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetAliasTableNames1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetAliasTableNames1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getKey", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:98)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMember.getPafMemberAttr()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f2;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMemberAttr.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLevelNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getGenerationNumber", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1460)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1454)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// 
				// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1461)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1456)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
					case 2 :
						return _f3;
					// at com.palladium.paf.mdb.PafMemberTree.addToGenTree(PafMemberTree.java:1463)
					// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafMemberTree#setId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetId1() throws Throwable {
		PafMemberTree THIS = (PafMemberTree) Repository.getObject(
			PafMemberTree.class,
			"TimeTree");
		// jtest_tested_method
		THIS.setId("");
		assertEquals("", THIS.getId()); // jtest_unverified
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
	 * Usage: java com.palladium.paf.mdb.PafMemberTreeTest
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
			PafMemberTreeTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafMemberTree",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafMemberTree.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberAttr _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberAttr _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberAttr _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f9;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberAttr _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberAttr _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f15;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private IEssMember.EEssConsolidationType _f16;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private IEssMember.EEssShareOption _f17;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private IEssMember.EEssConsolidationType _f18;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f19;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f20;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f21;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f22;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f23;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f24;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f25;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafSimpleMemberAttr _f26;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f27;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f28;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f29;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f30;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f31;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f32;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f33;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f34;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f35;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f36;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f37;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f38;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f39;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f40;
}

// JTEST_CURRENT_ID=-2069204881.