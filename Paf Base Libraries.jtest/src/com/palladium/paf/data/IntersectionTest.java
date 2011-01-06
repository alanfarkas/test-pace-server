/*
 * IntersectionTest.java
 * Created by Jtest on 9/19/06 6:11:49 PM.
 * Updated by Jtest on 10/18/06 7:43:28 PM, 15 test cases added, 15 test cases removed.
 * Updated by Jtest on 11/9/06 3:35:59 AM, 15 test cases added, 15 test cases removed.
 */

package com.palladium.paf.data;

import java.util.List;
import java.util.Iterator;
import jtest.Stubs;
import java.lang.reflect.Member;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.data.Intersection;

/**
 * IntersectionTest is a unit test class for class Intersection.
 * @see com.palladium.paf.data.Intersection
 * @author Parasoft Jtest 8.0
 */
public class IntersectionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public IntersectionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertEquals(THIS, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testClone1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClone1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone5() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null };
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		Intersection RETVAL = THIS.clone();
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testClone5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClone5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone6() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		Intersection RETVAL = THIS.clone();
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:127)
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone7() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] { null };
		THIS.setCoordinates(var1);
		String[] var2 = new String[] {};
		THIS.setDimensions(var2);
		// jtest_tested_method
		Intersection RETVAL = THIS.clone();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:132)
		// jtest_unverified
	}

	/**
	 * Test for method: static createIntersection(java.lang.String[],java.util.List,java.util.List,java.util.List)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#createIntersection(java.lang.String[],java.util.List,java.util.List,java.util.List)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateIntersection1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		// jtest_tested_method
		Intersection RETVAL = Intersection.createIntersection(var4, t0, t1, t2);
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateIntersection1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateIntersection1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		boolean RETVAL = THIS.equals((Object) null);
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEquals1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEquals1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals2() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		boolean RETVAL = THIS.equals("");
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEquals2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEquals2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals3() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		Intersection t4 = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.equals(t4);
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEquals3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEquals3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals10() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { "" };
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		String[] var5 = new String[] { "0" };
		Intersection t4 = new Intersection(var5, (String[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.equals(t4);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEquals10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEquals10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals14() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.equals(t1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.equals(Intersection.java:96)
		// jtest_unverified
	}

	/**
	 * Test for method: equals(java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#equals(java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEquals15() throws Throwable {
		String[] var1 = new String[] { "" };
		Intersection THIS = new Intersection(var1);
		String[] var2 = new String[] { "" };
		String[] var3 = new String[] { null };
		Intersection t1 = new Intersection(var2, var3);
		// jtest_tested_method
		boolean RETVAL = THIS.equals(t1);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.equals(Intersection.java:98)
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinate(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinate(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinate1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		String RETVAL = THIS.getCoordinate((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCoordinate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCoordinate1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCoordinate(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinate(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinate6() throws Throwable {
		String[] var1 = new String[] {};
		Intersection THIS = new Intersection(var1);
		String[] var2 = new String[] {};
		THIS.setCoordinates(var2);
		String[] var3 = new String[] { "", "0" };
		THIS.setDimensions(var3);
		// jtest_tested_method
		String RETVAL = THIS.getCoordinate("0");
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:68)
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinates()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinates()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinates1() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getCoordinates();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinates()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinates()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinates2() throws Throwable {
		String[] var1 = new String[] {};
		Intersection THIS = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getCoordinates();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinates()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinates()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinates3() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getCoordinates();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(2, RETVAL.length); // jtest_unverified
		assertEquals(null, RETVAL[0]); // jtest_unverified
		assertEquals(null, RETVAL[1]); // jtest_unverified
		assertEquals("[null]", t1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getCoordinates()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getCoordinates()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCoordinates5() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] {};
		THIS.setCoordinates(var1);
		String[] var2 = new String[] {};
		THIS.setDimensions(var2);
		// jtest_tested_method
		String[] RETVAL = THIS.getCoordinates();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensions1() throws Throwable {
		Object[] var1 = new Object[] { null };
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getDimensions();
		assertEquals(var4, RETVAL); // jtest_unverified
		assertEquals("[null]", t0.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDimensions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#getDimensions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDimensions2() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t1, t2);
		// jtest_tested_method
		String[] RETVAL = THIS.getDimensions();
		assertEquals(var4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDimensions2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDimensions2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: hashCode()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#hashCode()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHashCode1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		int RETVAL = THIS.hashCode();
		assertEquals(17, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testHashCode1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsHashCode1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: hashCode()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#hashCode()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHashCode5() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		int RETVAL = THIS.hashCode();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:106)
		// jtest_unverified
	}

	/**
	 * Test for method: hashCode()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#hashCode()
	 * @author Parasoft Jtest 8.0
	 */
	public void testHashCode6() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] {};
		THIS.setCoordinates(var1);
		String[] var2 = new String[] { "" };
		THIS.setDimensions(var2);
		// jtest_tested_method
		int RETVAL = THIS.hashCode();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// jtest_unverified
	}

	/**
	 * Test for method: Intersection(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#Intersection(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testIntersection1() throws Throwable {
		// jtest_tested_method
		Intersection THIS = new Intersection((String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.<init>(Intersection.java:39)
		// jtest_unverified
	}

	/**
	 * Test for method: Intersection(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#Intersection(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testIntersection2() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		Intersection THIS = new Intersection(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Intersection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#Intersection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIntersection3() throws Throwable {
		// jtest_tested_method
		Intersection THIS = new Intersection();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Intersection(java.lang.String[],java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#Intersection(java.lang.String[],java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testIntersection4() throws Throwable {
		// jtest_tested_method
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCoordinate(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#setCoordinate(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCoordinate1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		THIS.setCoordinate((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.data.Intersection.setCoordinate(Intersection.java:84)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetCoordinate1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetCoordinate1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setCoordinate(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#setCoordinate(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCoordinate5() throws Throwable {
		Intersection THIS = new Intersection();
		// jtest_tested_method
		THIS.setCoordinate((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.setCoordinate(Intersection.java:77)
		// jtest_unverified
	}

	/**
	 * Test for method: setCoordinate(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#setCoordinate(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCoordinate6() throws Throwable {
		String[] var1 = new String[] { "", "0" };
		Intersection THIS = new Intersection(var1, (String[]) null);
		// jtest_tested_method
		THIS.setCoordinate("0", (String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.setCoordinate(Intersection.java:79)
		// jtest_unverified
	}

	/**
	 * Test for method: setDimensions(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#setDimensions(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDimensions1() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection THIS = new Intersection(var1, var2);
		String[] var3 = new String[] {};
		THIS.setCoordinates(var3);
		String[] var4 = new String[] {};
		THIS.setDimensions(var4);
		String[] var5 = new String[] {};
		// jtest_tested_method
		THIS.setDimensions(var5);
		assertSame(var5, THIS.getDimensions()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}
	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] {};
		Intersection THIS = Intersection.createIntersection(var4, t0, t2, t1);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// StringIndexOutOfBoundsException thrown
		// at java.lang.AbstractStringBuilder.deleteCharAt(AbstractStringBuilder.java:773)
		// at java.lang.StringBuffer.deleteCharAt(StringBuffer.java:383)
		// at com.palladium.paf.data.Intersection.toString(Intersection.java:117)
		// jtest_unverified
	}

	/**
	 * Stubs method for testToString1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsToString1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:148)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:154)
				// 
				// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:160)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Intersection#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString3() throws Throwable {
		Intersection THIS = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.toString(Intersection.java:115)
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
	 * Usage: java com.palladium.paf.data.IntersectionTest
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
			IntersectionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.data.Intersection",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Intersection.class;
	}

			}

// JTEST_CURRENT_ID=-2123045461.