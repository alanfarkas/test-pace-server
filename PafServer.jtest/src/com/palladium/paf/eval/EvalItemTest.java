/*
 * EvalItemTest.java
 * Created by Jtest on 9/19/06 5:59:52 PM.
 * Updated by Jtest on 10/18/06 10:41:22 AM, 3 test cases added, 1 test case removed.
 */

package com.palladium.paf.eval;

import com.palladium.paf.funcs.CustomFunctionDef;
import jtest.mocks.java.util.ListMock;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.eval.EvalItem;

/**
 * EvalItemTest is a unit test class for class EvalItem.
 * @see com.palladium.paf.eval.EvalItem
 * @author Parasoft Jtest 8.0
 */
public class EvalItemTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public EvalItemTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalItem1() throws Throwable {
		// jtest_tested_method
		EvalItem THIS = new EvalItem(
			(Intersection) null,
			(Formula) null,
			(String) null);
		assertEquals(null, THIS.getAxis()); // jtest_unverified
		assertEquals(null, THIS.getFormula()); // jtest_unverified
		assertEquals(null, THIS.getIntersection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalItem2() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection t0 = new Intersection(var1, var2);
		CustomFunctionDef[] var3 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t1 = new MeasureFunctionFactory(var3);
		Formula t2 = new Formula("0", "", t1);
		// jtest_tested_method
		EvalItem THIS = new EvalItem(t0, t2, "");
		assertEquals("", THIS.getAxis()); // jtest_unverified
		assertEquals(t2, THIS.getFormula()); // jtest_unverified
		assertEquals(t0, THIS.getIntersection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalItem4() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		Intersection t3 = Intersection.createIntersection(var4, t0, t1, t2);
		Formula t4 = new Formula();
		// jtest_tested_method
		EvalItem THIS = new EvalItem(t3, t4, "");
		assertEquals("", THIS.getAxis()); // jtest_unverified
		assertEquals(t4, THIS.getFormula()); // jtest_unverified
		assertSame(t3, THIS.getIntersection()); // jtest_unverified
		assertEquals("[null]", t1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#EvalItem(com.palladium.paf.data.Intersection,com.palladium.paf.rules.Formula,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvalItem13() throws Throwable {
		Object[] var1 = new Object[] { null };
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		Intersection t3 = Intersection.createIntersection(var4, t0, t1, t2);
		MeasureFunctionFactory var5 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t4 = new Formula("", "()*+,-.", var5);
		t4.setExpression("/0123456");
		String[] var6 = new String[] {};
		t4.setExpressionTerms(var6);
		t4.setResultTerm("");
		t4.setResultFunction(true);
		t4.setParsed(true);
		// jtest_tested_method
		EvalItem THIS = new EvalItem(t3, t4, "");
		// NullPointerException thrown
		// at com.palladium.paf.data.Intersection.hashCode(Intersection.java:107)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.data.Intersection.createIntersection(Intersection.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvalItem13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvalItem13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MeasureFunctionFactory.isFunction(java.lang.String)");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis1() throws Throwable {
		EvalItem THIS = new EvalItem(
			(Intersection) null,
			(Formula) null,
			(String) null);
		// jtest_tested_method
		String RETVAL = THIS.getAxis();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getAxis()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getAxis()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetAxis2() throws Throwable {
		EvalItem THIS = new EvalItem(
			(Intersection) null,
			(Formula) null,
			(String) null);
		Formula t1 = new Formula((String) null, (String) null);
		Intersection t2 = new Intersection();
		THIS.setAxis("");
		THIS.setFormula(t1);
		THIS.setIntersection(t2);
		// jtest_tested_method
		String RETVAL = THIS.getAxis();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula1() throws Throwable {
		EvalItem THIS = new EvalItem(
			(Intersection) null,
			(Formula) null,
			(String) null);
		// jtest_tested_method
		Formula RETVAL = THIS.getFormula();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula2() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection t0 = new Intersection(var1, var2);
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula("", "", var3);
		EvalItem THIS = new EvalItem(t0, t1, "");
		// jtest_tested_method
		Formula RETVAL = THIS.getFormula();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFormula2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFormula2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getIntersection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getIntersection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIntersection1() throws Throwable {
		EvalItem THIS = new EvalItem(
			(Intersection) null,
			(Formula) null,
			(String) null);
		// jtest_tested_method
		Intersection RETVAL = THIS.getIntersection();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getIntersection()
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#getIntersection()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetIntersection3() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection t0 = new Intersection(var1, var2);
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula("", "", var3);
		EvalItem THIS = new EvalItem(t0, t1, "");
		t1.setExpression("");
		String[] var4 = new String[] {};
		t1.setExpressionTerms(var4);
		t1.setResultTerm("");
		t1.setResultFunction(true);
		t1.setParsed(true);
		// jtest_tested_method
		Intersection RETVAL = THIS.getIntersection();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetIntersection3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetIntersection3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MeasureFunctionFactory.isFunction(java.lang.String)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#setAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetAxis1() throws Throwable {
		Object[] var1 = new Object[] {};
		ListMock t0 = new ListMock(var1);
		Object[] var2 = new Object[] { null };
		ListMock t1 = new ListMock(var2);
		Object[] var3 = new Object[] { null };
		ListMock t2 = new ListMock(var3);
		String[] var4 = new String[] { null, null };
		Intersection t3 = Intersection.createIntersection(var4, t0, t1, t2);
		Formula t4 = new Formula();
		EvalItem THIS = new EvalItem(t3, t4, "");
		t4.setExpression("");
		String[] var5 = new String[] {};
		t4.setExpressionTerms(var5);
		t4.setResultTerm("");
		t4.setResultFunction(true);
		t4.setParsed(true);
		// jtest_tested_method
		THIS.setAxis("");
		assertEquals("", THIS.getAxis()); // jtest_unverified
		assertEquals("[null]", t1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFormula(com.palladium.paf.rules.Formula)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#setFormula(com.palladium.paf.rules.Formula)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFormula1() throws Throwable {
		String[] var1 = new String[] {};
		Intersection t0 = new Intersection(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula("", "", var2);
		EvalItem THIS = new EvalItem(t0, t1, "");
		Formula t3 = new Formula("", "");
		String[] var3 = new String[] {};
		t0.setCoordinates(var3);
		String[] var4 = new String[] {};
		t0.setDimensions(var4);
		t3.setExpression("");
		String[] var5 = new String[] {};
		t3.setExpressionTerms(var5);
		t3.setResultTerm("");
		t3.setResultFunction(true);
		t3.setParsed(true);
		// jtest_tested_method
		THIS.setFormula(t3);
		assertEquals(t3, THIS.getFormula()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetFormula1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetFormula1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setIntersection(com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#setIntersection(com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetIntersection1() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection t0 = new Intersection(var1, var2);
		Formula t1 = new Formula("", "");
		EvalItem THIS = new EvalItem(t0, t1, "");
		Intersection t3 = new Intersection();
		// jtest_tested_method
		THIS.setIntersection(t3);
		assertSame(t3, THIS.getIntersection()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}
	/**
	 * Test for method: setIntersection(com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EvalItem#setIntersection(com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetIntersection2() throws Throwable {
		String[] var1 = new String[] {};
		String[] var2 = new String[] {};
		Intersection t0 = new Intersection(var1, var2);
		Formula t1 = new Formula();
		EvalItem THIS = new EvalItem(t0, t1, "");
		Object[] var3 = new Object[] { null };
		ListMock t3 = new ListMock(var3);
		Object[] var4 = new Object[] { null };
		ListMock t4 = new ListMock(var4);
		Object[] var5 = new Object[] { null };
		ListMock t5 = new ListMock(var5);
		String[] var6 = new String[] { null, null, null };
		Intersection t6 = Intersection.createIntersection(var6, t3, t4, t5);
		// jtest_tested_method
		THIS.setIntersection(t6);
		assertSame(t6, THIS.getIntersection()); // jtest_unverified
		assertEquals("[null]", t3.toString()); // jtest_unverified
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
     * Usage: java com.palladium.paf.eval.EvalItemTest
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
            EvalItemTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.eval.EvalItem",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return EvalItem.class;
    }

    	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=393302642.