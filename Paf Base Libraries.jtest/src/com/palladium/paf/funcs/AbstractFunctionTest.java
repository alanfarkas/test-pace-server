/*
 * AbstractFunctionTest.java
 * Created by Jtest on 9/19/06 5:58:10 PM.
 * Updated by Jtest on 10/18/06 7:32:31 PM, 17 test cases added, 11 test cases removed.
 * Updated by Jtest on 11/9/06 3:27:02 AM, 17 test cases added, 17 test cases removed.
 */

package com.palladium.paf.funcs;

import java.util.Collection;
import jtest.mocks.java.util.ListMock;
import java.util.Iterator;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Map;
import java.util.List;
import java.util.Set;
import com.palladium.paf.state.IPafEvalState;
import com.palladium.paf.data.IPafDataCache;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.funcs.AbstractFunction;

/**
 * AbstractFunctionTest is a unit test class for class AbstractFunction.
 * @see com.palladium.paf.funcs.AbstractFunction
 * @author Parasoft Jtest 8.0
 */
public class AbstractFunctionTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public AbstractFunctionTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections((Map) null, (String[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.AbstractFunction.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/List;>
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
		// jtest_unverified
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections2() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections(var1, (String[]) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.funcs.AbstractFunction.buildIntersections(Ljava/util/Map;[Ljava/lang/String;)Ljava/util/List;>
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:92)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections3() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] {};
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections(var1, var2);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Odometer.<init>(Odometer.java:47)
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections4() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections5() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections(var1, var2);
		// NullPointerException thrown
		// at java.util.ArrayList.<init>(ArrayList.java:133)
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildIntersections(java.util.Map,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#buildIntersections(java.util.Map,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildIntersections6() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		String[] var2 = new String[] { null };
		// jtest_tested_method
		List RETVAL = THIS.buildIntersections(var1, var2);
		// ClassCastException thrown
		// at $Proxy1.toArray(Unknown Source)
		// at java.util.ArrayList.<init>(ArrayList.java:137)
		// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:89)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.funcs.AbstractFunction.buildIntersections(AbstractFunction.java:93)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#createFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateFunction1() throws Throwable {
		// jtest_tested_method
		IPafFunction RETVAL = AbstractFunction.createFunction((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, (Set) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.funcs.AbstractFunction.findIntersections(Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;>
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
		// jtest_unverified
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections2() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var1);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.size()); // jtest_unverified
		assertEquals(null, THIS.getMeasureName()); // jtest_unverified
		assertEquals(null, THIS.getOpCode()); // jtest_unverified
		assertEquals(null, THIS.getParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections4() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var1);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections5() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		_f0 = new Intersection((String[]) null, (String[]) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		Set var2 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var1, var2);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					// 
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections6() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		_f0 = new Intersection((String[]) null, (String[]) null);
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections((Map) null, var1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.AbstractFunction.findIntersections(Ljava/util/Map;Ljava/util/Set;)Ljava/util/List;>
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections8() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		String[] var1 = new String[] {};
		_f1 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		_f2 = new Object();
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var2, var3);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
						return _f2;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections9() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		String[] var1 = new String[] {};
		_f0 = new Intersection(var1);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var2, var3);
		// ClassCastException thrown
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
						return "";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections10() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Object[] var1 = new Object[] {};
		ListMock t1 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t2 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t3 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		_f1 = Intersection.createIntersection(var4, t1, t3, t2);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		Set var6 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var5, var6);
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
						return "";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections11() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		_f0 = new Intersection((String[]) null, (String[]) null);
		String[] var1 = new String[] {};
		_f0.setCoordinates(var1);
		String[] var2 = new String[] { "" };
		_f0.setDimensions(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var3, var4);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:108)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
						return "";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections12() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		String[] var1 = new String[] {};
		_f1 = Intersection.createIntersection(
			var1,
			(List) null,
			(List) null,
			(List) null);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		Set var3 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var2, var3);
		// NullPointerException thrown
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
						return "";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
			}
		}
		if (Stubs.matches(method, Intersection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getCoordinate", argument_types)) {
				return "";
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findIntersections(java.util.Map,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#findIntersections(java.util.Map,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindIntersections14() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		Object[] var1 = new Object[] { null };
		ListMock t1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		ListMock t2 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t3 = new ListMock(var3);
		String[] var4 = new String[] { "", "" };
		_f1 = Intersection.createIntersection(var4, t1, t3, t2);
		String[] var5 = new String[] {};
		_f0 = new Intersection(var5);
		_f3 = new Intersection();
		String[] var6 = new String[] { null };
		_f0.setCoordinates(var6);
		String[] var7 = new String[] { "" };
		_f0.setDimensions(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		Set var9 = (Set) Stubs.makeStubObject(Set.class);
		// jtest_tested_method
		List RETVAL = THIS.findIntersections(var8, var9);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.data.Intersection.getCoordinate(Intersection.java:66)
		// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindIntersections14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindIntersections14(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "contains", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Set.contains(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
					case 2 :
					case 3 :
						return Boolean.FALSE;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
				// 
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f1;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 2 :
					case 5 :
					case 7 :
						return "";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					case 3 :
						return "0";
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
					case 4 :
						return _f0;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					case 6 :
						return _f3;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:73)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:75)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
						return Stubs.makeStubObject(Set.class);
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
					case 4 :
						return null;
					// at com.palladium.paf.funcs.AbstractFunction.findIntersections(AbstractFunction.java:76)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMeasureName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#getMeasureName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMeasureName1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		String RETVAL = THIS.getMeasureName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getOpCode()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#getOpCode()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetOpCode1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		String RETVAL = THIS.getOpCode();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getParms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#getParms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetParms1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		String[] RETVAL = THIS.getParms();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: parseParameters(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#parseParameters(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParseParameters1() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		THIS.parseParameters((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.funcs.AbstractFunction.parseParameters(Ljava/lang/String;)V>
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:38)
		// jtest_unverified
	}

	/**
	 * Test for method: parseParameters(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see AbstractFunction#parseParameters(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParseParameters2() throws Throwable {
		AbstractFunction THIS = new AbstractFunction() {
			public double calculate(
				Intersection arg0,
				IPafDataCache arg1,
				IPafEvalState arg2) {
				return 0;
			}
			public Set getDirtyIntersections(IPafEvalState arg0) {
				return null;
			}
		};
		// jtest_tested_method
		THIS.parseParameters("");
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:44)
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
	 * Usage: java com.palladium.paf.funcs.AbstractFunctionTest
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
			AbstractFunctionTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.funcs.AbstractFunction",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return AbstractFunction.class;
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
private Intersection _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private com.palladium.paf.data.Intersection _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Intersection _f3;
									}

// JTEST_CURRENT_ID=1315361350.