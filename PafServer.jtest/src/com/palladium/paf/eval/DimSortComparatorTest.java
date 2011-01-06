/*
 * DimSortComparatorTest.java
 * Created by Jtest on 9/19/06 5:25:14 PM.
 * Updated by Jtest on 10/18/06 4:54:00 PM, 11 test cases added, 11 test cases removed.
 */

package com.palladium.paf.eval;

import jtest.mocks.java.util.ListMock;
import java.util.List;
import com.palladium.paf.data.Intersection;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.SortOrder;
import java.util.HashMap;
import com.palladium.paf.eval.DimSortComparator;

/**
 * DimSortComparatorTest is a unit test class for class DimSortComparator.
 * @see com.palladium.paf.eval.DimSortComparator
 * @author Parasoft Jtest 8.0
 */
public class DimSortComparatorTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public DimSortComparatorTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare1() throws Throwable {
		DimSortComparator THIS = new DimSortComparator(
			(HashMap) null,
			(String[]) null,
			(SortOrder) null);
		// jtest_tested_method
		int RETVAL = THIS.compare((Object) null, (Object) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.eval.DimSortComparator.<init>(Ljava/util/HashMap;[Ljava/lang/String;Lcom/palladium/paf/SortOrder;)V>
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:58)
		// jtest_unverified
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare3() throws Throwable {
		String[] var1 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			(HashMap) null,
			var1,
			(SortOrder) null);
		// jtest_tested_method
		int RETVAL = THIS.compare((Object) null, (Object) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.eval.DimSortComparator.<init>(Ljava/util/HashMap;[Ljava/lang/String;Lcom/palladium/paf/SortOrder;)V>
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
		// jtest_unverified
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare4() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		// jtest_tested_method
		int RETVAL = THIS.compare((Object) null, (Object) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare5() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		// jtest_tested_method
		int RETVAL = THIS.compare("", (Object) null);
		// ClassCastException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare7() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, (Object) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare9() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		String[] var3 = new String[] { null };
		Intersection t1 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, (Object) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:67)
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare11() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { "0" };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		Object[] var3 = new Object[] {};
		ListMock t1 = new ListMock(var3);
		Object[] var4 = new Object[] { null };
		ListMock t2 = new ListMock(var4);
		Object[] var5 = new Object[] { null };
		ListMock t3 = new ListMock(var5);
		String[] var6 = new String[] { "", "0" };
		Intersection t4 = Intersection.createIntersection(var6, t1, t3, t2);
		// jtest_tested_method
		int RETVAL = THIS.compare(t4, (Object) null);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
					case 2 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare16() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		String[] var3 = new String[] {};
		Intersection t1 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f0 = new Integer(0);
		Intersection t3 = new Intersection((String[]) null, (String[]) null);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
					case 2 :
						return _f0;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				return "";
				// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare18() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		Intersection t1 = new Intersection();
		_f0 = new Integer(0);
		String[] var3 = new String[] {};
		Intersection t3 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f1 = new Integer(0);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		// ClassCastException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare18(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
					case 2 :
						return _f0;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return _f1;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 4 :
						return "";
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare20() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		_f0 = new Integer(0);
		String[] var3 = new String[] {};
		Intersection t3 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f1 = new Integer(0);
		String[] var4 = new String[] {};
		t1.setCoordinates(var4);
		String[] var5 = new String[] {};
		t1.setDimensions(var5);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare20(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
					case 2 :
						return _f0;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return _f1;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 4 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare22() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		String[] var3 = new String[] {};
		Intersection t1 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f0 = new Integer(0);
		Intersection t3 = new Intersection((String[]) null, (String[]) null);
		_f1 = new Integer(0);
		_f2 = new Integer("0");
		String[] var4 = new String[] {};
		t3.setCoordinates(var4);
		String[] var5 = new String[] {};
		t3.setDimensions(var5);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		// NullPointerException thrown
		// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare22(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:60)
					case 2 :
						return _f0;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
						return _f1;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 4 :
						return _f2;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					case 5 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:66)
					case 3 :
					case 4 :
						return null;
					// at com.palladium.paf.eval.DimSortComparator.compare(DimSortComparator.java:67)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare23() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		String[] var3 = new String[] {};
		Intersection t1 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f0 = new Integer(0);
		Intersection t3 = new Intersection((String[]) null, (String[]) null);
		_f1 = new Integer(0);
		_f2 = new Integer("0");
		_f3 = new Integer(0);
		String[] var4 = new String[] {};
		t3.setCoordinates(var4);
		String[] var5 = new String[] {};
		t3.setDimensions(var5);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare23(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					case 2 :
						return _f0;
					case 3 :
						return _f1;
					case 4 :
						return _f2;
					case 5 :
						return _f3;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					case 3 :
					case 4 :
						return null;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare24() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] { null };
		DimSortComparator THIS = new DimSortComparator(
			var1,
			var2,
			(SortOrder) null);
		String[] var3 = new String[] {};
		Intersection t1 = Intersection.createIntersection(
			var3,
			(List) null,
			(List) null,
			(List) null);
		_f0 = new Integer(0);
		Intersection t3 = new Intersection((String[]) null, (String[]) null);
		_f1 = new Integer(0);
		_f2 = new Integer("0");
		_f3 = new Integer(-1);
		String[] var4 = new String[] {};
		t3.setCoordinates(var4);
		String[] var5 = new String[] {};
		t3.setDimensions(var5);
		// jtest_tested_method
		int RETVAL = THIS.compare(t1, t3);
		assertEquals(1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCompare24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCompare24(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					case 2 :
						return _f0;
					case 3 :
						return _f1;
					case 4 :
						return _f2;
					case 5 :
						return _f3;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.Intersection.getCoordinate(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					case 3 :
					case 4 :
						return null;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: compare(java.lang.Object,java.lang.Object)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#compare(java.lang.Object,java.lang.Object)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCompare26() throws Throwable {
		SortOrder t0 = SortOrder.valueOf("Ascending");
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		String[] var2 = new String[] {};
		// jtest_tested_method
		DimSortComparator THIS = new DimSortComparator(var1, var2, t0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: DimSortComparator(java.util.HashMap,java.lang.String[],com.palladium.paf.SortOrder)
	 * @throws Throwable Tests may throw any Throwable
	 * @see DimSortComparator#DimSortComparator(java.util.HashMap,java.lang.String[],com.palladium.paf.SortOrder)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDimSortComparator1() throws Throwable {
		// jtest_tested_method
		DimSortComparator THIS = new DimSortComparator(
			(HashMap) null,
			(String[]) null,
			(SortOrder) null);
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
     * Usage: java com.palladium.paf.eval.DimSortComparatorTest
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
            DimSortComparatorTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.DimSortComparator",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return DimSortComparator.class;
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
private Integer _f0;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Integer _f1;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Integer _f2;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Integer _f3;
}

// JTEST_CURRENT_ID=750388251.