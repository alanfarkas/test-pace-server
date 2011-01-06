/*
 * SliceStateTest.java
 * Created by Jtest on 9/19/06 5:59:43 PM.
 * Updated by Jtest on 10/18/06 8:21:21 PM, 11 test cases added, 11 test cases removed.
 * Updated by Jtest on 11/9/06 3:28:06 AM, 11 test cases added, 11 test cases removed.
 */

package com.palladium.paf.state;

import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.comm.EvaluateViewRequest;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.mdb.PafDataSliceParms;
import com.palladium.paf.state.SliceState;

/**
 * SliceStateTest is a unit test class for class SliceState.
 * @see com.palladium.paf.state.SliceState
 * @author Parasoft Jtest 8.0
 */
public class SliceStateTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public SliceStateTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCells1() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		_f0 = new SimpleCoordList();
		_f1 = new SimpleCoordList();
		SliceState THIS = new SliceState(t0);
		String[] var1 = new String[] {};
		_f1.setAxis(var1);
		String[] var2 = new String[] {};
		_f1.setCoordinates(var2);
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getChangedCells();
		// ArithmeticException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedCells", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return _f1;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
					case 7 :
					case 8 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 5 :
					case 6 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 9 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCells2() throws Throwable {
		SliceState THIS = new SliceState();
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getChangedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCells4() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		THIS.setDataSliceParms(t1);
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getChangedCells();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSliceParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getDataSliceParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSliceParms1() throws Throwable {
		SliceState THIS = new SliceState();
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.getDataSliceParms();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSliceParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getDataSliceParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSliceParms2() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		String[] var5 = new String[] {};
		t1.setColDimensions(var5);
		String[][] var6 = new String[][] {};
		t1.setColTuples(var6);
		String[] var7 = new String[] {};
		t1.setPageDimensions(var7);
		String[] var8 = new String[] {};
		t1.setPageMembers(var8);
		String[] var9 = new String[] {};
		t1.setRowDimensions(var9);
		String[][] var10 = new String[][] {};
		t1.setRowTuples(var10);
		THIS.setDataSliceParms(t1);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.getDataSliceParms();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLockedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getLockedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedCells1() throws Throwable {
		SliceState THIS = new SliceState();
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getLockedCells();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getLockedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getLockedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedCells3() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		_f0 = new SimpleCoordList();
		_f1 = new SimpleCoordList();
		SliceState THIS = new SliceState(t0);
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getLockedCells();
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:100)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedCells3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedCells3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLockedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedCells", argument_types)) {
				return _f1;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 11 :
					case 12 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 9 :
					case 10 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 15 :
					case 16 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 11 :
					case 12 :
					case 13 :
					case 14 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getProtectedCellFormulas()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getProtectedCellFormulas()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedCellFormulas1() throws Throwable {
		SliceState THIS = new SliceState();
		// jtest_tested_method
		String[] RETVAL = THIS.getProtectedCellFormulas();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProtectedCellFormulas()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getProtectedCellFormulas()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedCellFormulas2() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		String[] var5 = new String[] {};
		t1.setColDimensions(var5);
		String[][] var6 = new String[][] {};
		t1.setColTuples(var6);
		String[] var7 = new String[] {};
		t1.setPageDimensions(var7);
		String[] var8 = new String[] {};
		t1.setPageMembers(var8);
		String[] var9 = new String[] {};
		t1.setRowDimensions(var9);
		String[][] var10 = new String[][] {};
		t1.setRowTuples(var10);
		THIS.setDataSliceParms(t1);
		// jtest_tested_method
		String[] RETVAL = THIS.getProtectedCellFormulas();
		assertEquals(var4, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getProtectedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getProtectedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedCells1() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		_f0 = new SimpleCoordList();
		SliceState THIS = new SliceState(t0);
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getProtectedCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetProtectedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetProtectedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
					case 6 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
					case 7 :
					case 8 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					case 5 :
					case 6 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getProtectedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getProtectedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetProtectedCells2() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		double[] var1 = new double[] {};
		PafDataSlice t2 = new PafDataSlice(var1, 7);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		_f0 = new SimpleCoordList();
		SliceState THIS = new SliceState(t0);
		PafDataSliceParms t7 = new PafDataSliceParms();
		String[] var2 = new String[] {};
		t0.setProtectedFormulas(var2);
		String[] var3 = new String[] {};
		t1.setAxis(var3);
		String[] var4 = new String[] {};
		t1.setCoordinates(var4);
		t0.setChangedCells(t1);
		t2.setColumnCount(7);
		double[] var5 = new double[] {};
		t2.setData(var5);
		t2.setCompressedData("");
		t2.setCompressed(true);
		t0.setDataSlice(t2);
		String[] var6 = new String[] {};
		t3.setAxis(var6);
		String[] var7 = new String[] {};
		t3.setCoordinates(var7);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(7);
		t0.setViewName("");
		t0.setRuleSetName("");
		Intersection[] var8 = new Intersection[] {};
		THIS.setChangedCells(var8);
		Intersection[] var9 = new Intersection[] {};
		THIS.setLockedCells(var9);
		Intersection[] var10 = new Intersection[] {};
		THIS.setProtectedCells(var10);
		String[] var11 = new String[] {};
		THIS.setProtectedCellFormulas(var11);
		String[] var12 = new String[] {};
		t7.setColDimensions(var12);
		String[][] var13 = new String[][] {};
		t7.setColTuples(var13);
		String[] var14 = new String[] {};
		t7.setPageDimensions(var14);
		String[] var15 = new String[] {};
		t7.setPageMembers(var15);
		String[] var16 = new String[] {};
		t7.setRowDimensions(var16);
		String[][] var17 = new String[][] {};
		t7.setRowTuples(var17);
		THIS.setDataSliceParms(t7);
		// jtest_tested_method
		Intersection[] RETVAL = THIS.getProtectedCells();
		assertEquals(var10, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetProtectedCells2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetProtectedCells2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 7 :
					case 8 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 5 :
					case 6 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 2 :
					case 3 :
					case 8 :
					case 9 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 4 :
					case 5 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 6 :
					case 7 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getViewName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#getViewName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewName1() throws Throwable {
		SliceState THIS = new SliceState();
		// jtest_tested_method
		String RETVAL = THIS.getViewName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setChangedCells(com.palladium.paf.data.Intersection[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#setChangedCells(com.palladium.paf.data.Intersection[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetChangedCells1() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		THIS.setDataSliceParms(t1);
		Intersection[] var5 = new Intersection[] {};
		// jtest_tested_method
		THIS.setChangedCells(var5);
		assertSame(var5, THIS.getChangedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDataSliceParms(com.palladium.paf.mdb.PafDataSliceParms)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#setDataSliceParms(com.palladium.paf.mdb.PafDataSliceParms)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDataSliceParms1() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		PafDataSliceParms t2 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		String[] var5 = new String[] {};
		t1.setColDimensions(var5);
		String[][] var6 = new String[][] {};
		t1.setColTuples(var6);
		String[] var7 = new String[] {};
		t1.setPageDimensions(var7);
		String[] var8 = new String[] {};
		t1.setPageMembers(var8);
		String[] var9 = new String[] {};
		t1.setRowDimensions(var9);
		String[][] var10 = new String[][] {};
		t1.setRowTuples(var10);
		THIS.setDataSliceParms(t1);
		// jtest_tested_method
		THIS.setDataSliceParms(t2);
		assertEquals(t2, THIS.getDataSliceParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setProtectedCellFormulas(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#setProtectedCellFormulas(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetProtectedCellFormulas1() throws Throwable {
		SliceState THIS = new SliceState();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setProtectedCellFormulas(var1);
		assertSame(var1, THIS.getProtectedCellFormulas()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setProtectedCells(com.palladium.paf.data.Intersection[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#setProtectedCells(com.palladium.paf.data.Intersection[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetProtectedCells1() throws Throwable {
		SliceState THIS = new SliceState();
		PafDataSliceParms t1 = new PafDataSliceParms();
		Intersection[] var1 = new Intersection[] {};
		THIS.setChangedCells(var1);
		Intersection[] var2 = new Intersection[] {};
		THIS.setLockedCells(var2);
		Intersection[] var3 = new Intersection[] {};
		THIS.setProtectedCells(var3);
		String[] var4 = new String[] {};
		THIS.setProtectedCellFormulas(var4);
		THIS.setDataSliceParms(t1);
		Intersection[] var5 = new Intersection[] {};
		// jtest_tested_method
		THIS.setProtectedCells(var5);
		assertSame(var5, THIS.getProtectedCells()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}
	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState1() throws Throwable {
		// jtest_tested_method
		SliceState THIS = new SliceState((EvaluateViewRequest) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.SliceState.<init>(Lcom/palladium/paf/comm/EvaluateViewRequest;)V>
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState2() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		assertNotNull(THIS.getChangedCells()); // jtest_unverified
		assertEquals(0, THIS.getChangedCells().length); // jtest_unverified
		assertNotNull(THIS.getLockedCells()); // jtest_unverified
		assertEquals(0, THIS.getLockedCells().length); // jtest_unverified
		assertNotNull(THIS.getProtectedCells()); // jtest_unverified
		assertEquals(0, THIS.getProtectedCells().length); // jtest_unverified
		assertEquals(null, THIS.getViewName()); // jtest_unverified
		assertEquals(null, THIS.getDataSliceParms()); // jtest_unverified
		assertEquals(null, THIS.getProtectedCellFormulas()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState4() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		t0.setChangedCells(t1);
		t0.setDataSlice(t2);
		String[] var2 = new String[] {};
		t3.setAxis(var2);
		String[] var3 = new String[] { null };
		t3.setCoordinates(var3);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// ArithmeticException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState5() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		_f0 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		t0.setChangedCells(t1);
		t0.setDataSlice(t2);
		String[] var2 = new String[] { null, null };
		t3.setAxis(var2);
		String[] var3 = new String[] { null };
		t3.setCoordinates(var3);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		String[] var4 = new String[] { null };
		_f0.setAxis(var4);
		String[] var5 = new String[] { null };
		_f0.setCoordinates(var5);
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:100)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState6() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice();
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		_f0 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		t0.setChangedCells(t1);
		t0.setDataSlice(t2);
		String[] var2 = new String[] { null, null };
		t3.setAxis(var2);
		String[] var3 = new String[] { null };
		t3.setCoordinates(var3);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		String[] var4 = new String[] { null };
		_f0.setAxis(var4);
		String[] var5 = new String[] { null };
		_f0.setCoordinates(var5);
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:100)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState7() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		String[] var2 = new String[] {};
		t1.setAxis(var2);
		String[] var3 = new String[] {};
		t1.setCoordinates(var3);
		t0.setChangedCells(t1);
		t2.setColumnCount(0);
		double[] var4 = new double[] {};
		t2.setData(var4);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t0.setDataSlice(t2);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				return new String[0];
				// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
				// 
				// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 4 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 2 :
					case 3 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState8() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice();
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		String[] var2 = new String[] {};
		t1.setAxis(var2);
		String[] var3 = new String[] {};
		t1.setCoordinates(var3);
		t0.setChangedCells(t1);
		t2.setColumnCount(0);
		double[] var4 = new double[] {};
		t2.setData(var4);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t0.setDataSlice(t2);
		String[] var5 = new String[] {};
		t3.setAxis(var5);
		String[] var6 = new String[] {};
		t3.setCoordinates(var6);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:97)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 5 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState9() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		t0.setChangedCells(t1);
		t2.setColumnCount(0);
		double[] var2 = new double[] {};
		t2.setData(var2);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t0.setDataSlice(t2);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:106)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:100)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
					case 6 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 5 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState10() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var1 = new String[] {};
		t0.setProtectedFormulas(var1);
		String[] var2 = new String[] {};
		t1.setAxis(var2);
		String[] var3 = new String[] {};
		t1.setCoordinates(var3);
		t0.setChangedCells(t1);
		t0.setDataSlice(t2);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(0);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// NullPointerException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 7 :
					case 8 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 5 :
					case 6 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 8 :
						return null;
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 2 :
					case 3 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 4 :
					case 5 :
					case 6 :
					case 7 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see SliceState#SliceState(com.palladium.paf.comm.EvaluateViewRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSliceState11() throws Throwable {
		EvaluateViewRequest t0 = new EvaluateViewRequest();
		SimpleCoordList t1 = new SimpleCoordList();
		double[] var1 = new double[] {};
		PafDataSlice t2 = new PafDataSlice(var1, 7);
		SimpleCoordList t3 = new SimpleCoordList();
		SimpleCoordList t4 = new SimpleCoordList();
		String[] var2 = new String[] {};
		t0.setProtectedFormulas(var2);
		String[] var3 = new String[] {};
		t1.setAxis(var3);
		String[] var4 = new String[] {};
		t1.setCoordinates(var4);
		t0.setChangedCells(t1);
		t2.setColumnCount(7);
		double[] var5 = new double[] {};
		t2.setData(var5);
		t2.setCompressedData("");
		t2.setCompressed(true);
		t0.setDataSlice(t2);
		String[] var6 = new String[] {};
		t3.setAxis(var6);
		String[] var7 = new String[] {};
		t3.setCoordinates(var7);
		t0.setLockedCells(t3);
		t0.setProtectedCells(t4);
		t0.setMeasureSetKey(7);
		t0.setViewName("");
		t0.setRuleSetName("");
		// jtest_tested_method
		SliceState THIS = new SliceState(t0);
		// ArithmeticException thrown
		// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
		// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSliceState11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSliceState11(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, SimpleCoordList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCoordinates", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getCoordinates()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 11 :
					case 12 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:86)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 3 :
					case 4 :
					case 9 :
					case 10 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:89)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxis", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.SimpleCoordList.getAxis()");
				switch (index) {
					case 1 :
					case 2 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 15 :
					case 16 :
						return new String[0];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:87)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:93)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					case 3 :
					case 4 :
						return new String[2];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					case 5 :
					case 6 :
					case 11 :
					case 12 :
					case 13 :
					case 14 :
						return new String[1];
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:55)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:88)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					// 
					// at com.palladium.paf.state.SliceState.buildIntersections(SliceState.java:91)
					// at com.palladium.paf.state.SliceState.<init>(SliceState.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, EvaluateViewRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCells", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:59)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProtectedFormulas", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:61)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewName", argument_types)) {
				return null;
				// at com.palladium.paf.state.SliceState.<init>(SliceState.java:62)
			}
		}
		return Stubs.NO_STUB_GENERATED;
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
	 * Usage: java com.palladium.paf.state.SliceStateTest
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
			SliceStateTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.state.SliceState",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return SliceState.class;
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
private SimpleCoordList _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private SimpleCoordList _f1;
}

// JTEST_CURRENT_ID=-2070655578.