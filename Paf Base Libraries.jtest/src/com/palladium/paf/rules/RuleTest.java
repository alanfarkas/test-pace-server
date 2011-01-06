/*
 * RuleTest.java
 * Created by Jtest on 9/19/06 5:27:24 PM.
 * Updated by Jtest on 10/18/06 8:08:20 PM, 3 test cases added, 3 test cases removed.
 */

package com.palladium.paf.rules;

import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Rule;

/**
 * RuleTest is a unit test class for class Rule.
 * @see com.palladium.paf.rules.Rule
 * @author Parasoft Jtest 8.0
 */
public class RuleTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public RuleTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: getBaseAllocateMeasure()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getBaseAllocateMeasure()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBaseAllocateMeasure1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		String RETVAL = THIS.getBaseAllocateMeasure();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getEvalLockedIntersections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getEvalLockedIntersections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetEvalLockedIntersections1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.getEvalLockedIntersections();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFormula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getFormula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFormula1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		Formula RETVAL = THIS.getFormula();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		int RETVAL = THIS.getKey();
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetKey3() throws Throwable {
		Rule THIS = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula("", "", var1);
		Boolean t2 = new Boolean(true);
		THIS.setKey(7);
		t1.setExpression("");
		String[] var2 = new String[] {};
		t1.setExpressionTerms(var2);
		t1.setResultTerm("");
		t1.setResultFunction(true);
		t1.setParsed(true);
		THIS.setFormula(t1);
		String[] var3 = new String[] {};
		THIS.setTriggerMeasures(var3);
		THIS.setSkipAggregation(true);
		THIS.setSkipAllocation(true);
		THIS.setBaseAllocateMeasure("");
		THIS.setLockAllocation(true);
		THIS.setEvalLockedIntersections(true);
		THIS.setCalcAllPeriods(true);
		THIS.setLockSystemEvaluationResult(true);
		THIS.setLockUserEvaluationResult(t2);
		THIS.setLockAllPriorTime(true);
		THIS.setInitialTBFirstAllocation(true);
		// jtest_tested_method
		int RETVAL = THIS.getKey();
		assertEquals(7, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetKey3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetKey3(Member method, Object _this, Object[] args)
		throws Throwable {
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
	 * Test for method: getLockUserEvaluationResult()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getLockUserEvaluationResult()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockUserEvaluationResult1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		Boolean RETVAL = THIS.getLockUserEvaluationResult();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("false", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTriggerMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#getTriggerMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTriggerMeasures1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		String[] RETVAL = THIS.getTriggerMeasures();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isCalcAllPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isCalcAllPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsCalcAllPeriods1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isCalcAllPeriods();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isInitialTBFirstAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isInitialTBFirstAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsInitialTBFirstAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isInitialTBFirstAllocation();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLockAllPriorTime()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isLockAllPriorTime()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLockAllPriorTime1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isLockAllPriorTime();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLockAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isLockAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLockAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isLockAllocation();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isLockSystemEvaluationResult()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isLockSystemEvaluationResult()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsLockSystemEvaluationResult1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isLockSystemEvaluationResult();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isSkipAggregation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isSkipAggregation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsSkipAggregation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isSkipAggregation();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isSkipAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#isSkipAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsSkipAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		boolean RETVAL = THIS.isSkipAllocation();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Rule()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#Rule()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRule1() throws Throwable {
		// jtest_tested_method
		Rule THIS = new Rule();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Rule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#Rule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRule3() throws Throwable {
		// jtest_tested_method
		Rule THIS = new Rule((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.Rule.<init>(Ljava/lang/String;)V>
		// at com.palladium.paf.rules.Rule.<init>(Rule.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: Rule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#Rule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRule4() throws Throwable {
		// jtest_tested_method
		Rule THIS = new Rule("");
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.rules.Rule.<init>(Rule.java:56)
		// jtest_unverified
	}

	/**
	 * Test for method: setBaseAllocateMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setBaseAllocateMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBaseAllocateMeasure1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setBaseAllocateMeasure("");
		assertEquals("", THIS.getBaseAllocateMeasure()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setCalcAllPeriods(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setCalcAllPeriods(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetCalcAllPeriods1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setCalcAllPeriods(true);
		assertEquals(true, THIS.isCalcAllPeriods()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setEvalLockedIntersections(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setEvalLockedIntersections(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetEvalLockedIntersections1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setEvalLockedIntersections(true);
		assertEquals(true, THIS.getEvalLockedIntersections()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setFormula(com.palladium.paf.rules.Formula)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setFormula(com.palladium.paf.rules.Formula)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetFormula1() throws Throwable {
		Rule THIS = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t1 = new Formula("", "", var1);
		t1.setExpression("");
		String[] var2 = new String[] {};
		t1.setExpressionTerms(var2);
		t1.setResultTerm("");
		t1.setResultFunction(true);
		t1.setParsed(true);
		// jtest_tested_method
		THIS.setFormula(t1);
		assertEquals(t1, THIS.getFormula()); // jtest_unverified
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
	 * Test for method: setInitialTBFirstAllocation(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setInitialTBFirstAllocation(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetInitialTBFirstAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setInitialTBFirstAllocation(true);
		assertEquals(true, THIS.isInitialTBFirstAllocation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setKey(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setKey(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetKey1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setKey(7);
		assertEquals(7, THIS.getKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockAllPriorTime(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setLockAllPriorTime(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockAllPriorTime1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setLockAllPriorTime(true);
		assertEquals(true, THIS.isLockAllPriorTime()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockAllocation(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setLockAllocation(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setLockAllocation(true);
		assertEquals(true, THIS.isLockAllocation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockSystemEvaluationResult(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setLockSystemEvaluationResult(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockSystemEvaluationResult1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setLockSystemEvaluationResult(true);
		assertEquals(true, THIS.isLockSystemEvaluationResult()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setLockUserEvaluationResult(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setLockUserEvaluationResult(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetLockUserEvaluationResult1() throws Throwable {
		Rule THIS = new Rule();
		Boolean t1 = new Boolean(true);
		// jtest_tested_method
		THIS.setLockUserEvaluationResult(t1);
		assertEquals(t1, THIS.getLockUserEvaluationResult()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSkipAggregation(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setSkipAggregation(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSkipAggregation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setSkipAggregation(true);
		assertEquals(true, THIS.isSkipAggregation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSkipAllocation(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setSkipAllocation(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSkipAllocation1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		THIS.setSkipAllocation(true);
		assertEquals(true, THIS.isSkipAllocation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setTriggerMeasures(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#setTriggerMeasures(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetTriggerMeasures1() throws Throwable {
		Rule THIS = new Rule();
		String[] var1 = new String[] {};
		// jtest_tested_method
		THIS.setTriggerMeasures(var1);
		assertSame(var1, THIS.getTriggerMeasures()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		Rule THIS = new Rule();
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// NullPointerException thrown
		// at com.palladium.paf.rules.Rule.toString(Rule.java:66)
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Rule#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString2() throws Throwable {
		Rule THIS = new Rule();
		Formula t1 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t2 = new Boolean(false);
		THIS.setKey(0);
		THIS.setFormula(t1);
		String[] var1 = new String[] {};
		THIS.setTriggerMeasures(var1);
		THIS.setSkipAggregation(false);
		THIS.setSkipAllocation(false);
		THIS.setBaseAllocateMeasure("");
		THIS.setLockAllocation(false);
		THIS.setEvalLockedIntersections(false);
		THIS.setCalcAllPeriods(false);
		THIS.setLockSystemEvaluationResult(false);
		THIS.setLockUserEvaluationResult(t2);
		THIS.setLockAllPriorTime(false);
		THIS.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("null = ", RETVAL); // jtest_unverified
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
	 * Usage: java com.palladium.paf.rules.RuleTest
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
			RuleTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.Rule",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Rule.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=1962065222.