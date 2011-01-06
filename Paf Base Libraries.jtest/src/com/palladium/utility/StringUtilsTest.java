/*
 * StringUtilsTest.java
 * Created by Jtest on 9/19/06 6:00:00 PM.
 * Updated by Jtest on 10/18/06 7:20:54 PM, 12 test cases added, 12 test cases removed.
 */

package com.palladium.utility;

import com.palladium.paf.mdb.PafMemberTree;
import com.palladium.paf.mdb.PafMemberAttr;
import jtest.Stubs;
import com.palladium.utility.StringUtils;

/**
 * StringUtilsTest is a unit test class for class StringUtils.
 * @see com.palladium.utility.StringUtils
 * @author Parasoft Jtest 8.0
 */
public class StringUtilsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public StringUtilsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString3() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(Object[]) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;>
		// at java.lang.StringBuffer.<init>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:121)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString4() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(Object[]) null,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:124)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString5() throws Throwable {
		Object[] var1 = new Object[] {};
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString7() throws Throwable {
		Object[] var1 = new Object[] { null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:128)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString8() throws Throwable {
		Object t0 = new Object();
		Object[] var1 = new Object[] { t0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(t0, var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString9() throws Throwable {
		Object t0 = new Object();
		Object t1 = new Object();
		Object[] var1 = new Object[] { t0, t1 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(t0, var1[0]); // jtest_unverified
		assertEquals(t1, var1[1]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString10() throws Throwable {
		Object t0 = new Object();
		Object[] var1 = new Object[] { t0,
				(Object) Stubs.makeStubObject(PafMemberAttr.class) };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1, "", "", "", "", "");
		assertTrue(var1[1] instanceof PafMemberAttr); // jtest_unverified
		assertEquals("", ((PafMemberAttr) var1[1]).getDescription()); // jtest_unverified
		assertEquals(null, ((PafMemberAttr) var1[1]).getAliases()); // jtest_unverified
		assertNotNull(((PafMemberAttr) var1[1]).getAssociatedAttributes()); // jtest_unverified
		assertEquals(
			0,
			((PafMemberAttr) var1[1]).getAssociatedAttributes().length); // jtest_unverified
		assertEquals(null, ((PafMemberAttr) var1[1]).getConsolidationType()); // jtest_unverified
		assertEquals("", ((PafMemberAttr) var1[1]).getFormula()); // jtest_unverified
		assertEquals(0, ((PafMemberAttr) var1[1]).getGenerationNumber()); // jtest_unverified
		assertEquals("", ((PafMemberAttr) var1[1]).getLastFormula()); // jtest_unverified
		assertEquals(0, ((PafMemberAttr) var1[1]).getLevelNumber()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString11() throws Throwable {
		Object[] var1 = new Object[] { null, null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:126)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString13() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString14() throws Throwable {
		String[] var1 = new String[] { null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals("nullnullnullnull", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString15() throws Throwable {
		String[] var1 = new String[] { null, null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals(null, var1[1]); // jtest_unverified
		assertEquals("nullnullnullnullnullnullnullnull", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString18() throws Throwable {
		int[] var1 = new int[] {};
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString19() throws Throwable {
		int[] var1 = new int[] { 0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(0, var1[0]); // jtest_unverified
		assertEquals("nullnull0nullnull", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString20() throws Throwable {
		int[] var1 = new int[] { 0, 0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		assertEquals(0, var1[0]); // jtest_unverified
		assertEquals(0, var1[1]); // jtest_unverified
		assertEquals("nullnull0nullnullnull0nullnull", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString21() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(String[]) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;>
		// at java.lang.StringBuffer.<init>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:83)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString22() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(String[]) null,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:86)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString24() throws Throwable {
		Object[] var1 = new Object[] {};
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString27() throws Throwable {
		Object t0 = new Object();
		Object[] var1 = new Object[] { t0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		assertEquals(t0, var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString29() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(int[]) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.StringUtils.arrayToString([ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:48)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString32() throws Throwable {
		Object t0 = new Object();
		Object[] var1 = new Object[] { t0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1);
		assertEquals(t0, var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString33() throws Throwable {
		int[] var1 = new int[] { 0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1);
		assertEquals(0, var1[0]); // jtest_unverified
		assertEquals("{[0]}", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(int[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(int[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString34() throws Throwable {
		int[] var1 = new int[] { 0, 0 };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1);
		assertEquals(0, var1[0]); // jtest_unverified
		assertEquals(0, var1[1]); // jtest_unverified
		assertEquals("{[0], [0]}", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString35() throws Throwable {
		String[] var1 = new String[] { null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals("{[null]}", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString36() throws Throwable {
		String[] var1 = new String[] { null, null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(var1);
		assertEquals(null, var1[0]); // jtest_unverified
		assertEquals(null, var1[1]); // jtest_unverified
		assertEquals("{[null], [null]}", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString39() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(Object[]) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;>
		// at java.lang.StringBuffer.<init>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:137)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString40() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			(Object[]) null,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.StringUtils.arrayToString([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;>
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:140)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString42() throws Throwable {
		Object[] var1 = new Object[] { null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		// NullPointerException thrown
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:145)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString43() throws Throwable {
		Object[] var1 = new Object[] { null, null };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			0);
		// NullPointerException thrown
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:142)
		// jtest_unverified
	}

	/**
	 * Test for method: static arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#arrayToString(java.lang.Object[],java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testArrayToString46() throws Throwable {
		Object[] var1 = new Object[] {
				(Object) Stubs.makeStubObject(PafMemberAttr.class),
				(Object) Stubs.makeStubObject(PafMemberTree.class) };
		// jtest_tested_method
		String RETVAL = StringUtils.arrayToString(
			var1,
			"",
			(String) null,
			(String) null,
			(String) null,
			(String) null,
			1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
		// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
		// at com.palladium.paf.mdb.PafMemberTree.toString(PafMemberTree.java:1347)
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:145)
		// jtest_unverified
	}

	/**
	 * Test for method: static doubleQuotes(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#doubleQuotes(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDoubleQuotes1() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.doubleQuotes((String) null);
		assertEquals("\"null\"", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static quotes(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see StringUtils#quotes(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testQuotes1() throws Throwable {
		// jtest_tested_method
		String RETVAL = StringUtils.quotes((String) null);
		assertEquals("'null'", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.utility.StringUtilsTest
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
			StringUtilsTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.StringUtils",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return StringUtils.class;
	}

}

// JTEST_CURRENT_ID=1802921734.