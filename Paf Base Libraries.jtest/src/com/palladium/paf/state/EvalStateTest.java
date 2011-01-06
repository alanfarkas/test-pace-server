/*
 * EvalStateTest.java
 * Created by Jtest on 9/19/06 5:55:32 PM.
 * Updated by Jtest on 10/18/06 8:20:24 PM, 15 test cases added, 15 test cases removed.
 * Updated by Jtest on 11/9/06 3:25:23 AM, 15 test cases added, 15 test cases removed.
 */

package com.palladium.paf.state;

import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.data.PafMemberList;
import com.palladium.paf.comm.EvaluateViewRequest;
import com.palladium.paf.data.PafSimpleUow;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import java.util.Iterator;
import java.util.Map;
import com.palladium.paf.mdb.PafMember;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.app.VersionDef;
import java.util.HashMap;
import java.util.Set;
import com.palladium.paf.data.Intersection;
import java.util.HashSet;
import com.palladium.paf.rules.RuleSet;
import java.util.ArrayList;
import com.palladium.paf.mdb.PafMemberTree;
import jtest.Repository;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.state.EvalState;

/**
 * EvalStateTest is a unit test class for class EvalState.
 * @see com.palladium.paf.state.EvalState
 * @author Parasoft Jtest 8.0
 */
public class EvalStateTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EvalStateTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: addAllChangedCells(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#addAllChangedCells(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAllChangedCells1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.addAllChangedCells((Set) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.EvalState.addAllChangedCells(Ljava/util/Set;)V>
		// at com.palladium.paf.state.EvalState.addAllChangedCells(EvalState.java:385)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddAllChangedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddAllChangedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addAllChangedCells(java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#addAllChangedCells(java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddAllChangedCells2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		THIS.addAllChangedCells(var3);
		assertNotNull(THIS.getChangedCellsByMsr()); // jtest_unverified
		assertEquals("{}", THIS.getChangedCellsByMsr().toString()); // jtest_unverified
		assertSame(THIS.getChangedCellsByMsr(), THIS.getChangedCellsByTime()); // jtest_unverified
		assertEquals(t1, THIS.getClientState()); // jtest_unverified
		assertEquals(null, THIS.getMeasureRuleSet()); // jtest_unverified
		assertEquals(null, THIS.getMsrDim()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddAllChangedCells2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddAllChangedCells2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.state.EvalState.addAllChangedCells(EvalState.java:385)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.state.EvalState.addAllChangedCells(EvalState.java:385)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChangedCell(com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#addChangedCell(com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChangedCell1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f6 = new MdbDef();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.addChangedCell((Intersection) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.EvalState.addChangedCell(Lcom/palladium/paf/data/Intersection;)V>
		// at com.palladium.paf.state.EvalState.addChangedCellByMsr(EvalState.java:391)
		// at com.palladium.paf.state.EvalState.addChangedCell(EvalState.java:377)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChangedCell1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChangedCell1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 3 :
						return _f6;
					// at com.palladium.paf.state.EvalState.addChangedCellByMsr(EvalState.java:391)
					// at com.palladium.paf.state.EvalState.addChangedCell(EvalState.java:377)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addChangedCell(com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#addChangedCell(com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddChangedCell2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f6 = new MdbDef();
		Intersection t9 = new Intersection();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.addChangedCell(t9);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.state.EvalState.addChangedCellByMsr(EvalState.java:391)
		// at com.palladium.paf.state.EvalState.addChangedCell(EvalState.java:377)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddChangedCell2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddChangedCell2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 3 :
						return _f6;
					// at com.palladium.paf.state.EvalState.addChangedCellByMsr(EvalState.java:391)
					// at com.palladium.paf.state.EvalState.addChangedCell(EvalState.java:377)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState1() throws Throwable {
		// jtest_tested_method
		EvalState THIS = new EvalState((PafClientState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.EvalState.<init>(Lcom/palladium/paf/state/PafClientState;)V>
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
		// jtest_unverified
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] { null, "", null };
		UnitOfWork t5 = new UnitOfWork(var1);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var2);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var5);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var6);
		Set var7 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var7);
		t1.setPlannerConfig(t8);
		// jtest_tested_method
		EvalState THIS = new EvalState(t1);
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
		// jtest_unverified
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState3() throws Throwable {
		// jtest_tested_method
		EvalState THIS = new EvalState((SliceState) null, (PafClientState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.state.EvalState.<init>(Lcom/palladium/paf/state/SliceState;Lcom/palladium/paf/state/PafClientState;)V>
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
		// jtest_unverified
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState4() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		// jtest_tested_method
		EvalState THIS = new EvalState((SliceState) null, t1);
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
		// jtest_unverified
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState5() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		_f0 = new PafApplicationDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var6);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var8);
		t1.setPlannerConfig(t8);
		_f0.setSeasonList(t10);
		_f0.setAppId("");
		PlanCycle[] var9 = new PlanCycle[] {};
		_f0.setPlanCycles(var9);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t11);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var11);
		// jtest_tested_method
		EvalState THIS = new EvalState((SliceState) null, t1);
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalState5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalState5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState7() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken();
		PafApplicationDef t4 = new PafApplicationDef();
		PafSimpleUow t5 = new PafSimpleUow();
		UnitOfWork t6 = new UnitOfWork(t5);
		PafPlannerRole t7 = new PafPlannerRole();
		Season t8 = new Season();
		PafPlannerConfig t9 = new PafPlannerConfig();
		_f0 = new PafApplicationDef();
		SeasonList t11 = new SeasonList();
		MdbDef t12 = new MdbDef();
		EvaluateViewRequest t13 = new EvaluateViewRequest();
		SliceState t14 = new SliceState(t13);
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		PafMemberList[] var1 = new PafMemberList[] {};
		t5.setPafMemberEntries(var1);
		t1.setUnitOfWork(t6);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var2);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var5);
		t7.setRoleDesc("");
		t7.setRoleName("");
		t7.setPlanType("");
		t7.setPlanVersion("");
		String[] var6 = new String[] {};
		t7.setSeasonIds(var6);
		t1.setPlannerRole(t7);
		t8.setOpen(false);
		PafDimSpec[] var7 = new PafDimSpec[] {};
		t8.setOtherDims(var7);
		t8.setYear("");
		t8.setId("");
		t8.setTimePeriod("");
		t8.setPlanCycle("");
		t1.setPlanSeason(t8);
		t1.setClientLanguage("");
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var8);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var9);
		t9.setCycle("");
		String[] var10 = new String[] {};
		t9.setMenuItemNames(var10);
		t9.setRole("");
		String[] var11 = new String[] {};
		t9.setViewTreeItemNames(var11);
		t9.setDefaultEvalEnabled(false);
		t9.setDefaultRulesetName("");
		String[] var12 = new String[] {};
		t9.setRuleSetNames(var12);
		String[] var13 = new String[] {};
		t9.setVersionFilter(var13);
		t1.setPlannerConfig(t9);
		_f0.setSeasonList(t11);
		_f0.setAppId("");
		PlanCycle[] var14 = new PlanCycle[] {};
		_f0.setPlanCycles(var14);
		_f0.setLastPeriod("");
		_f0.setCurrentYear("");
		_f0.setMdbDef(t12);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f0.setVersions(var16);
		// jtest_tested_method
		EvalState THIS = new EvalState(t14, t1);
		// NullPointerException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:41)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalState7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalState7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(
				method,
				"getCurrentLockedIntersections",
				argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:113)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#EvalState(com.palladium.paf.state.SliceState,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalState10() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		String[] var1 = new String[] {};
		UnitOfWork t7 = new UnitOfWork(var1);
		PafPlannerRole t8 = new PafPlannerRole();
		Season t9 = new Season();
		PafPlannerConfig t10 = new PafPlannerConfig();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("0");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t4.setSeasonList(t5);
		t4.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t4.setPlanCycles(var2);
		t4.setLastPeriod("");
		t4.setCurrentYear("");
		t6.setYearDim("");
		String[] var3 = new String[] {};
		t6.setHierDims(var3);
		t6.setMeasureDim("");
		t6.setPlanTypeDim("");
		t6.setTimeDim("");
		t6.setVersionDim("");
		t6.setDataSourceId("");
		String[] var4 = new String[] {};
		t6.setAxisPriority(var4);
		t4.setMdbDef(t6);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t4.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t4.setVersions(var6);
		t1.setApp(t4);
		t1.setUnitOfWork(t7);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var9);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var10);
		t1.setPlannerRole(t8);
		t1.setPlanSeason(t9);
		t1.setClientLanguage("");
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var11);
		Set var12 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var12);
		t1.setPlannerConfig(t10);
		// jtest_tested_method
		EvalState THIS = new EvalState((SliceState) null, t1);
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalState10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalState10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:133)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.state.EvalState.init(EvalState.java:133)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChangedCellsByMsr()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getChangedCellsByMsr()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCellsByMsr1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Map RETVAL = THIS.getChangedCellsByMsr();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangedCellsByMsr1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangedCellsByMsr1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChangedCellsByTime()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getChangedCellsByTime()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChangedCellsByTime1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Map RETVAL = THIS.getChangedCellsByTime();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChangedCellsByTime1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChangedCellsByTime1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientState()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getClientState()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientState1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		PafClientState RETVAL = THIS.getClientState();
		assertEquals(t1, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientState1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientState1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentTimeBasedChanges()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getCurrentTimeBasedChanges()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentTimeBasedChanges1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Set RETVAL = THIS.getCurrentTimeBasedChanges();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentTimeBasedChanges1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentTimeBasedChanges1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.getCurrentTimeBasedChanges(EvalState.java:355)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentTimeBasedChanges()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getCurrentTimeBasedChanges()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentTimeBasedChanges3() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f5 = new Object();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Set RETVAL = THIS.getCurrentTimeBasedChanges();
		// ClassCastException thrown
		// at com.palladium.paf.state.EvalState.getCurrentTimeBasedChanges(EvalState.java:358)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentTimeBasedChanges3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentTimeBasedChanges3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f5;
					// at com.palladium.paf.state.EvalState.getCurrentTimeBasedChanges(EvalState.java:355)
					case 2 :
						return "";
					// at com.palladium.paf.state.EvalState.getCurrentTimeBasedChanges(EvalState.java:358)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentTimeMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getCurrentTimeMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentTimeMember1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		PafMember RETVAL = THIS.getCurrentTimeMember();
		// ClassCastException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
		// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentTimeMember1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentTimeMember1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentTimeMember()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getCurrentTimeMember()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentTimeMember2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		PafMember RETVAL = THIS.getCurrentTimeMember();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentTimeMember2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentTimeMember2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:201)
				// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:210)
				// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getFirstTimeSlice()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getFirstTimeSlice()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFirstTimeSlice1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getFirstTimeSlice();
		assertEquals("WK01", RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFirstTimeSlice1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFirstTimeSlice1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureRuleSet()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getMeasureRuleSet()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureRuleSet1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState(t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		RuleSet RETVAL = THIS.getMeasureRuleSet();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMeasureRuleSet1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMeasureRuleSet1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMsrDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getMsrDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrDim1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getMsrDim();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrDim1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrDim1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getOrigChangedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getOrigChangedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOrigChangedCells1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		HashSet RETVAL = THIS.getOrigChangedCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetOrigChangedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetOrigChangedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getOrigLockedCells()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getOrigLockedCells()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOrigLockedCells1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		HashSet RETVAL = THIS.getOrigLockedCells();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetOrigLockedCells1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetOrigLockedCells1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getPlanVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanVersion1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		VersionDef RETVAL = THIS.getPlanVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanVersion1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanVersion1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPlanningVersion", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.getPlanVersion(EvalState.java:373)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanningVersionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getPlanningVersionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanningVersionName1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getPlanningVersionName();
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.getPlanningVersionName(EvalState.java:422)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanningVersionName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanningVersionName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPlanningVersion", argument_types)) {
				return null;
				// at com.palladium.paf.state.EvalState.getPlanningVersionName(EvalState.java:422)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanningVersionName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getPlanningVersionName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanningVersionName2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f4 = new VersionDef((String) null, (VersionType) null);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getPlanningVersionName();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanningVersionName2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanningVersionName2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPlanningVersion", argument_types)) {
				return _f4;
				// at com.palladium.paf.state.EvalState.getPlanningVersionName(EvalState.java:422)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPreviousTimeBasedChanges()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getPreviousTimeBasedChanges()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPreviousTimeBasedChanges1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Set RETVAL = THIS.getPreviousTimeBasedChanges();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("[]", RETVAL.toString()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPreviousTimeBasedChanges1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPreviousTimeBasedChanges1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.state.EvalState.getPreviousTimeBasedChanges(EvalState.java:362)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPreviousTimeBasedChanges()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getPreviousTimeBasedChanges()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPreviousTimeBasedChanges3() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		Set RETVAL = THIS.getPreviousTimeBasedChanges();
		// ClassCastException thrown
		// at com.palladium.paf.state.EvalState.getPreviousTimeBasedChanges(EvalState.java:363)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPreviousTimeBasedChanges3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPreviousTimeBasedChanges3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.state.EvalState.getPreviousTimeBasedChanges(EvalState.java:362)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.state.EvalState.getPreviousTimeBasedChanges(EvalState.java:363)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getStartTime()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getStartTime()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetStartTime1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		SliceState t5 = new SliceState();
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		// jtest_tested_method
		_f2.setAxisPriority(var2);
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetStartTime1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetStartTime1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(
				method,
				"getCurrentLockedIntersections",
				argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.state.EvalState.init(EvalState.java:113)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getTimeDim()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#getTimeDim()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTimeDim1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		String RETVAL = THIS.getTimeDim();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetTimeDim1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetTimeDim1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isStateChanged()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#isStateChanged()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsStateChanged1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState(t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		boolean RETVAL = THIS.isStateChanged();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsStateChanged1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsStateChanged1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isTimeSliceMode()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#isTimeSliceMode()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsTimeSliceMode1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		boolean RETVAL = THIS.isTimeSliceMode();
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsTimeSliceMode1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsTimeSliceMode1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeProtectedCell(com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#removeProtectedCell(com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveProtectedCell1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.removeProtectedCell((Intersection) null);
		assertNotNull(THIS.getChangedCellsByMsr()); // jtest_unverified
		assertEquals("{}", THIS.getChangedCellsByMsr().toString()); // jtest_unverified
		assertSame(THIS.getChangedCellsByMsr(), THIS.getChangedCellsByTime()); // jtest_unverified
		assertEquals(t1, THIS.getClientState()); // jtest_unverified
		assertEquals(null, THIS.getMeasureRuleSet()); // jtest_unverified
		assertEquals(null, THIS.getMsrDim()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveProtectedCell1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveProtectedCell1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setClientState(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setClientState(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetClientState1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState(t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setClientState((PafClientState) null);
		assertEquals(null, THIS.getClientState()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetClientState1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetClientState1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setCurrentTimeSlice(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setCurrentTimeSlice(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCurrentTimeSlice1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setCurrentTimeSlice((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:206)
		// at com.palladium.paf.state.EvalState.getCurrentTimeMember(EvalState.java:369)
		// at com.palladium.paf.state.EvalState.setCurrentTimeSlice(EvalState.java:339)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetCurrentTimeSlice1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetCurrentTimeSlice1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setForcedCalcs(java.util.HashSet)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setForcedCalcs(java.util.HashSet)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetForcedCalcs1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setForcedCalcs((HashSet) null);
		assertEquals(null, THIS.getForcedCalcs()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetForcedCalcs1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetForcedCalcs1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setMeasureRuleSet(com.palladium.paf.rules.RuleSet)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setMeasureRuleSet(com.palladium.paf.rules.RuleSet)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMeasureRuleSet1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState(t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setMeasureRuleSet((RuleSet) null);
		assertEquals(null, THIS.getMeasureRuleSet()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetMeasureRuleSet1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetMeasureRuleSet1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setStateChanged(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setStateChanged(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetStateChanged1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setStateChanged(false);
		assertEquals(false, THIS.isStateChanged()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetStateChanged1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetStateChanged1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setTimeSliceMode(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalState#setTimeSliceMode(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTimeSliceMode1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
		_f0 = new PafApplicationDef();
		_f1 = new MdbDef();
		_f2 = new MdbDef();
		_f3 = new MemberTreeSet();
		EvalState THIS = new EvalState((SliceState) null, t1);
		_f2.setYearDim("");
		String[] var1 = new String[] {};
		_f2.setHierDims(var1);
		_f2.setMeasureDim("");
		_f2.setPlanTypeDim("");
		_f2.setTimeDim("");
		_f2.setVersionDim("");
		_f2.setDataSourceId("");
		String[] var2 = new String[] {};
		_f2.setAxisPriority(var2);
		// jtest_tested_method
		THIS.setTimeSliceMode(false);
		assertEquals(false, THIS.isTimeSliceMode()); // jtest_unverified
		assertEquals(5, _f2.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetTimeSliceMode1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetTimeSliceMode1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApp", argument_types)) {
				return _f0;
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:90)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getUowTrees", argument_types)) {
				return _f3;
				// at com.palladium.paf.state.EvalState.init(EvalState.java:148)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					case 2 :
						return _f2;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
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
	 * Usage: java com.palladium.paf.state.EvalStateTest
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
			EvalStateTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.state.EvalState",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EvalState.class;
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
private MdbDef _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MemberTreeSet _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private VersionDef _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f6;
}

// JTEST_CURRENT_ID=1041441152.