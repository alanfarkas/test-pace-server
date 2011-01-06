/*
 * F_CumTest.java
 * Created by Jtest on 9/19/06 5:32:09 PM.
 * Updated by Jtest on 10/18/06 7:28:48 PM, 16 test cases added, 12 test cases removed.
 * Updated by Jtest on 11/9/06 3:14:44 AM, 14 test cases added, 14 test cases removed.
 */

package com.palladium.paf.funcs;

import java.util.Iterator;
import java.util.List;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.PafApplicationDef;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.state.IPafEvalState;
import java.util.Set;
import com.palladium.paf.funcs.F_Cum;

/**
 * F_CumTest is a unit test class for class F_Cum.
 * @see com.palladium.paf.funcs.F_Cum
 * @author Parasoft Jtest 8.0
 */
public class F_CumTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public F_CumTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate1() throws Throwable {
		F_Cum THIS = new F_Cum();
		// jtest_tested_method
		double RETVAL = THIS.calculate(
			(Intersection) null,
			(IPafDataCache) null,
			(IPafEvalState) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.funcs.F_Cum.calculate(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/IPafDataCache;Lcom/palladium/paf/state/IPafEvalState;)D>
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
		// jtest_unverified
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate2() throws Throwable {
		F_Cum THIS = new F_Cum();
		IPafEvalState var1 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(
			(Intersection) null,
			(IPafDataCache) null,
			var1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.F_Cum.calculate(Lcom/palladium/paf/data/Intersection;Lcom/palladium/paf/data/IPafDataCache;Lcom/palladium/paf/state/IPafEvalState;)D>
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate3() throws Throwable {
		F_Cum THIS = new F_Cum();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		IPafEvalState var1 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var1);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.data.Intersection.<init>([Ljava/lang/String;[Ljava/lang/String;)V>
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:127)
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate5() throws Throwable {
		F_Cum THIS = new F_Cum();
		String[] var1 = new String[] { null };
		Intersection t1 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate6() throws Throwable {
		F_Cum THIS = new F_Cum();
		String[] var1 = new String[] { null, null };
		Intersection t1 = new Intersection(var1);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate13() throws Throwable {
		F_Cum THIS = new F_Cum();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] { null };
		t1.setCoordinates(var1);
		String[] var2 = new String[] {};
		t1.setDimensions(var2);
		IPafEvalState var3 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var3);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.clone(Intersection.java:132)
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#calculate(com.palladium.paf.data.Intersection,com.palladium.paf.data.IPafDataCache,com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculate14() throws Throwable {
		F_Cum THIS = new F_Cum();
		Intersection t1 = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] {};
		_f2 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		IPafEvalState var2 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		double RETVAL = THIS.calculate(t1, (IPafDataCache) null, var2);
		// NullPointerException thrown
		// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculate14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculate14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:46)
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clone", argument_types)) {
				return _f2;
				// at com.palladium.paf.funcs.F_Cum.calculate(F_Cum.java:48)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: F_Cum()
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#F_Cum()
	 * @author Parasoft Jtest 8.0
	 */
	public void testF_Cum1() throws Throwable {
		// jtest_tested_method
		F_Cum THIS = new F_Cum();
		assertEquals(null, THIS.getMeasureName()); // jtest_unverified
		assertEquals(null, THIS.getOpCode()); // jtest_unverified
		assertEquals(null, THIS.getParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections1() throws Throwable {
		F_Cum THIS = new F_Cum();
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections((IPafEvalState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.F_Cum.getDirtyIntersections(Lcom/palladium/paf/state/IPafEvalState;)Ljava/util/Set;>
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
		// jtest_unverified
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections4() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f1.setYearDim("");
		String[] var4 = new String[] {};
		_f1.setHierDims(var4);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var5 = new String[] {};
		_f1.setAxisPriority(var5);
		IPafEvalState var6 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var6);
		// NullPointerException thrown
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections5() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		IPafEvalState var4 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var4);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections6() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f1 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		_f1.setYearDim("");
		String[] var4 = new String[] {};
		_f1.setHierDims(var4);
		_f1.setMeasureDim("");
		_f1.setPlanTypeDim("");
		_f1.setTimeDim("");
		_f1.setVersionDim("");
		_f1.setDataSourceId("");
		String[] var5 = new String[] {};
		_f1.setAxisPriority(var5);
		IPafEvalState var6 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var6);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f1.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f1;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections7() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		IPafEvalState var4 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var4);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections10() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f0.setPlanCycles(var1);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var3);
		IPafEvalState var4 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var4);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections12() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		String[] var1 = new String[] { "", "", "", "", "", "", "", "", "" };
		_f2 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f0.setPlanCycles(var2);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var4);
		IPafEvalState var5 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var5);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:110)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f2;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections14() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		String[] var1 = new String[] {};
		_f2 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f0.setPlanCycles(var2);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var4);
		IPafEvalState var5 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var5);
		// IllegalArgumentException thrown
		// at com.palladium.paf.data.Intersection.setCoordinate(Intersection.java:84)
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:110)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:110)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f2;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see F_Cum#getDirtyIntersections(com.palladium.paf.state.IPafEvalState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDirtyIntersections17() throws Throwable {
		F_Cum THIS = new F_Cum();
		_f0 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		String[] var1 = new String[] {};
		_f3 = new Intersection((String[]) null, var1);
		_f0.setSeasonList(t2);
		_f0.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f0.setPlanCycles(var2);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var4);
		IPafEvalState var5 = (IPafEvalState) Stubs
			.makeStubObject(IPafEvalState.class);
		// jtest_tested_method
		Set RETVAL = THIS.getDirtyIntersections(var5);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:106)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:109)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDirtyIntersections17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDirtyIntersections17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafEvalState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppDef", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getChangedCellsByMsr", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentTimeSlice", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:110)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:105)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f3;
				// at com.palladium.paf.funcs.F_Cum.getDirtyIntersections(F_Cum.java:108)
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
	 * Usage: java com.palladium.paf.funcs.F_CumTest
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
			F_CumTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.funcs.F_Cum",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return F_Cum.class;
	}

		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafApplicationDef _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f1;
										/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f3;
}

// JTEST_CURRENT_ID=1769402200.