/*
 * PafDataCacheCalcTest.java
 * Created by Jtest on 9/19/06 5:49:29 PM.
 * Updated by Jtest on 10/18/06 8:13:42 PM, 33 test cases added, 33 test cases removed.
 * Updated by Jtest on 11/9/06 3:19:42 AM, 33 test cases added, 33 test cases removed.
 */

package com.palladium.paf.mdb;

import jtest.Repository;
import com.essbase.api.metadata.IEssMember;
import com.palladium.paf.app.VersionDef;
import java.util.Arrays;
import jtest.mocks.java.util.ListMock;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.PafDataCacheCalc;

/**
 * PafDataCacheCalcTest is a unit test class for class PafDataCacheCalc.
 * @see com.palladium.paf.mdb.PafDataCacheCalc
 * @author Parasoft Jtest 8.0
 */
public class PafDataCacheCalcTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafDataCacheCalcTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension2() throws Throwable {
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var2,
			(PafMemberTree) null,
			false);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateMemberFilters(PafDataCache.java:1972)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:174)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "initChangedCells", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:144)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension4() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null,
			true);
		// NullPointerException thrown, originator is possible setup problem
		// at java.util.Arrays$ArrayList.<init>
		// at java.util.Arrays.asList
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension5() throws Throwable {
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var2,
			(PafMemberTree) null,
			false);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:170)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "initChangedCells", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:144)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension6() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null,
			true);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.getDimension(PafDataCache.java:1558)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:184)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:179)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension10() throws Throwable {
		PafMember t0 = new PafMember("");
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
		String[] var6 = new String[] {};
		PafMemberTree t18 = new PafMemberTree(t0, var6, 7, 7.000000f);
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
		t14.setParent(t17);
		t9.setParent(t14);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		PafDataCache var10 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var10,
			t18,
			true);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension21() throws Throwable {
		PafMember t0 = new PafMember();
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember((String) null);
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		Object[] var3 = new Object[] {};
		ListMock t8 = new ListMock(var3);
		PafMember t9 = new PafMember((String) null);
		PafMemberAttr t10 = new PafMemberAttr();
		Object[] var4 = new Object[] {};
		ListMock t11 = new ListMock(var4);
		PafMember t12 = new PafMember();
		String[] var5 = new String[] {};
		PafMemberTree t13 = new PafMemberTree(t0, var5);
		PafMember t14 = new PafMember("");
		PafMemberAttr t15 = new PafMemberAttr();
		Object[] var6 = new Object[] {};
		ListMock t16 = new ListMock(var6);
		PafMember t17 = new PafMember((String) null);
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
		t9.setPafMemberAttr(t10);
		t9.setChildren(t11);
		t9.setKey("");
		t9.setParent(t12);
		t6.setParent(t9);
		t3.setParent(t6);
		t0.setParent(t3);
		t14.setPafMemberAttr(t15);
		t14.setChildren(t16);
		t14.setKey("");
		t14.setParent(t17);
		t13.setRoot(t14);
		String[] var7 = new String[] {};
		t13.setAliasTableNames(var7);
		t13.setId("");
		PafDataCache var8 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc
			.aggDimension("", var8, t13, true);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension21(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension24() throws Throwable {
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			(String) null,
			(PafDataCache) null,
			(PafMemberTree) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(Ljava/lang/String;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/mdb/PafMemberTree;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
		// jtest_unverified
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension25() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			(String) null,
			var1,
			(PafMemberTree) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(Ljava/lang/String;Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/mdb/PafMemberTree;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:155)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension25(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension26() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.util.Arrays$ArrayList.<init>
		// at java.util.Arrays.asList
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension26(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension28() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.getDimension(PafDataCache.java:1558)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:184)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension28(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { Map.class };
			if (Stubs.matches(method, "validateMemberFilters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:174)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:179)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension30() throws Throwable {
		_f0 = new Object();
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null);
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension30.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension30(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension43() throws Throwable {
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var2,
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"));
		// jtest.ObjectCreationException thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension43.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension43(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { Map.class };
			if (Stubs.matches(method, "validateMemberFilters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:174)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:179)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
						return Boolean.TRUE;
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
					case 10 :
						return Boolean.FALSE;
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
					// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:90)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:72)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension44() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null,
			var2);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:170)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension44.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension44(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension48() throws Throwable {
		PafMember t0 = new PafMember("");
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t5 = new ListMock(var2);
		PafMember t6 = new PafMember((String) null);
		PafMemberAttr t7 = new PafMemberAttr();
		IEssMember.EEssConsolidationType t8 = new IEssMember.EEssConsolidationType();
		IEssMember.EEssShareOption t9 = new IEssMember.EEssShareOption();
		Object[] var3 = new Object[] {};
		ListMock t10 = new ListMock(var3);
		PafMember t11 = new PafMember();
		String[] var4 = new String[] {};
		PafMemberTree t12 = new PafMemberTree(t0, var4, 7);
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
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t7.setAliases(var5);
		String[] var6 = new String[] {};
		t7.setAssociatedAttributes(var6);
		t7.setConsolidationType(t8);
		t7.setDescription("");
		t7.setFormula("");
		t7.setGenerationNumber(0);
		t7.setLastFormula("");
		t7.setLevelNumber(0);
		t7.setShareOption(t9);
		String[] var7 = new String[] {};
		t7.setUDAs(var7);
		t6.setPafMemberAttr(t7);
		t6.setChildren(t10);
		t6.setKey("");
		t6.setParent(t11);
		t3.setParent(t6);
		t0.setParent(t3);
		PafDataCache var8 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc
			.aggDimension("", var8, t12, var9);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension48.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension48(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension49() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null,
			(Map) null,
			false);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:170)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension49.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension49(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "initChangedCells", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:144)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:159)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension53() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var1,
			(PafMemberTree) null,
			(Map) null,
			true);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.validateMemberFilters(PafDataCache.java:1972)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:174)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension53.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension53(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:167)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#aggDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafMemberTree,java.util.Map,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAggDimension55() throws Throwable {
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.aggDimension(
			"",
			var2,
			(PafMemberTree) null,
			(Map) null,
			false);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafDataCache.getDimension(PafDataCache.java:1558)
		// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:184)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAggDimension55.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAggDimension55(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:127)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return "0";
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:130)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:131)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:140)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "initChangedCells", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:144)
			}
			argument_types = new Class[] { Map.class };
			if (Stubs.matches(method, "validateMemberFilters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:174)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:179)
			}
		}
		if (Stubs.matches(method, Arrays.class)) {
			argument_types = new Class[] { Object[].class };
			if (Stubs.matches(method, "asList", argument_types)) {
				return _f1;
				// at com.palladium.paf.mdb.PafDataCacheCalc.aggDimension(PafDataCacheCalc.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static allocateDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,java.util.HashMap)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#allocateDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,java.util.HashMap)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAllocateDimension1() throws Throwable {
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.allocateDimension(
			(String) null,
			(PafDataCache) null,
			(HashMap) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static allocateDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,java.util.HashMap)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#allocateDimension(java.lang.String,com.palladium.paf.mdb.PafDataCache,java.util.HashMap)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAllocateDimension2() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		HashMap var2 = (HashMap) Stubs.makeStubObject(HashMap.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc
			.allocateDimension("", var1, var2);
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim1() throws Throwable {
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			(PafDataSliceParms) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(Lcom/palladium/paf/mdb/PafDataCache;Lcom/palladium/paf/mdb/PafDataSliceParms;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:574)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim2() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:584)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim3() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:591)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim4() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] { null };
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:586)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim5() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:586)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim7() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:593)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim9() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:594)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[4];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return new String[4];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new String[1][];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim10() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] {};
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] { null, null, null, null, null };
		t0.setPageDimensions(var3);
		String[] var4 = new String[] { null, null, null, null, null };
		t0.setPageMembers(var4);
		String[] var5 = new String[] { null };
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] { {} };
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:594)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim11() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] { null };
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:605)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[6];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return new String[6];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new String[][] { { null, "" } };
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim12() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] { null };
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] { null };
		t0.setColTuples(var2);
		String[] var3 = new String[] { null, null, null, null, null, null, null };
		t0.setPageDimensions(var3);
		String[] var4 = new String[] { null, null, null, null, null, null, null };
		t0.setPageMembers(var4);
		String[] var5 = new String[] { null, null, null };
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] { { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null } };
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:606)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "contains", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.contains(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:595)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 11 :
					case 12 :
						return Boolean.FALSE;
					// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:595)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "add", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:596)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim13() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] { null };
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:606)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[8];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return new String[8];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return new String[4];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new String[][] { {} };
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new String[0][];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim17() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(
			(PafDataCache) null,
			t0);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:603)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataSliceParms.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageDimensions", argument_types)) {
				return new String[0];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:575)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageMembers", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:576)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowDimensions", argument_types)) {
				return new String[8];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:577)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new String[0][];
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:579)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim21() throws Throwable {
		PafDataSliceParms t0 = new PafDataSliceParms();
		String[] var1 = new String[] { null, null, null, null, null, null, null };
		t0.setColDimensions(var1);
		String[][] var2 = new String[][] {};
		t0.setColTuples(var2);
		String[] var3 = new String[] {};
		t0.setPageDimensions(var3);
		String[] var4 = new String[] {};
		t0.setPageMembers(var4);
		String[] var5 = new String[] {};
		t0.setRowDimensions(var5);
		String[][] var6 = new String[][] {};
		t0.setRowTuples(var6);
		PafDataCache var7 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(var7, t0);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:359)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:332)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:335)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:339)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:340)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:353)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:615)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim25() throws Throwable {
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc
			.calcVersionDim((PafDataCache) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(Lcom/palladium/paf/mdb/PafDataCache;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:332)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
		// jtest_unverified
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim27() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(var1);
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim27(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:332)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:335)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:339)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:340)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[] { String[].class };
			if (Stubs
				.matches(method, "getDependentVersionDefs", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:377)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:380)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim42() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(var1);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:359)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim42.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim42(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:332)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:335)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:339)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:340)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:353)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:318)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static calcVersionDim(com.palladium.paf.mdb.PafDataCache,java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#calcVersionDim(com.palladium.paf.mdb.PafDataCache,java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalcVersionDim46() throws Throwable {
		PafDataCache var1 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = PafDataCacheCalc.calcVersionDim(var1, var2);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:359)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalcVersionDim46.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalcVersionDim46(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:332)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:334)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:335)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:338)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearDim", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:339)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:340)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:353)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.PafDataCacheCalc.calcVersionDim(PafDataCacheCalc.java:356)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafDataCacheCalc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataCacheCalc#PafDataCacheCalc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafDataCacheCalc1() throws Throwable {
		// jtest_tested_method
		PafDataCacheCalc THIS = new PafDataCacheCalc() {
		};
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
	 * Usage: java com.palladium.paf.mdb.PafDataCacheCalcTest
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
			PafDataCacheCalcTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.PafDataCacheCalc",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafDataCacheCalc.class;
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
private Object _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f1;
									}

// JTEST_CURRENT_ID=-2146889843.