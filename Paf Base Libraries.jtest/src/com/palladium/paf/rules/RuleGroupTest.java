/*
 * RuleGroupTest.java
 * Created by Jtest on 9/19/06 5:36:53 PM.
 * Updated by Jtest on 10/18/06 8:09:42 PM, 9 test cases added, 8 test cases removed.
 * Updated by Jtest on 11/9/06 3:16:16 AM, 8 test cases added, 8 test cases removed.
 */

package com.palladium.paf.rules;

import com.palladium.paf.funcs.CustomFunctionDef;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.RuleGroup;

/**
 * RuleGroupTest is a unit test class for class RuleGroup.
 * @see com.palladium.paf.rules.RuleGroup
 * @author Parasoft Jtest 8.0
 */
public class RuleGroupTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public RuleGroupTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: clone()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#clone()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClone2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		// jtest_tested_method
		Object RETVAL = THIS.clone();
		assertTrue(RETVAL instanceof RuleGroup); // jtest_unverified
		assertEquals("", RETVAL.toString()); // jtest_unverified
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.RuleGroup.<init>([Lcom/palladium/paf/rules/Rule;)V>
		// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:73)
		// jtest_unverified
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure3() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		Boolean t1 = new Boolean((String) null);
		Rule[] var1 = new Rule[] { null };
		THIS.setRules(var1);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(false);
		THIS.setDelayedPerpetual(false);
		THIS.setSkipProtProc(false);
		THIS.setPerpetualAllocation(false);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
		// jtest_unverified
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure6() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t2 = new Formula((String) null, "", var2);
		Boolean t3 = new Boolean((String) null);
		MeasureFunctionFactory var3 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f0 = new Formula((String) null, "", var3);
		t1.setKey(0);
		t1.setFormula(t2);
		String[] var4 = new String[] {};
		t1.setTriggerMeasures(var4);
		t1.setSkipAggregation(false);
		t1.setSkipAllocation(false);
		t1.setBaseAllocateMeasure("");
		t1.setLockAllocation(false);
		t1.setEvalLockedIntersections(false);
		t1.setCalcAllPeriods(false);
		t1.setLockSystemEvaluationResult(false);
		t1.setLockUserEvaluationResult(t3);
		t1.setLockAllPriorTime(false);
		t1.setInitialTBFirstAllocation(false);
		_f0.setExpression("");
		String[] var5 = new String[] {};
		_f0.setExpressionTerms(var5);
		_f0.setResultTerm("");
		_f0.setResultFunction(false);
		_f0.setParsed(false);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure("0");
		assertEquals(false, RETVAL); // jtest_unverified
		assertEquals("null = \n", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testContainsResultMeasure6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsContainsResultMeasure6(
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
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.Formula.init(Formula.java:87)
					// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
					// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
					case 3 :
						return Boolean.TRUE;
					// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
					// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f0;
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure7() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		Boolean t1 = new Boolean((String) null);
		Rule t2 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f0 = new Formula((String) null, "", var1);
		Rule[] var2 = new Rule[] { t2 };
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(false);
		THIS.setDelayedPerpetual(false);
		THIS.setSkipProtProc(false);
		THIS.setPerpetualAllocation(false);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure("");
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testContainsResultMeasure7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsContainsResultMeasure7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f0;
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure8() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t2 = new Formula((String) null, "", var2);
		Boolean t3 = new Boolean((String) null);
		_f0 = new Formula();
		t1.setKey(0);
		t1.setFormula(t2);
		String[] var3 = new String[] {};
		t1.setTriggerMeasures(var3);
		t1.setSkipAggregation(false);
		t1.setSkipAllocation(false);
		t1.setBaseAllocateMeasure("");
		t1.setLockAllocation(false);
		t1.setEvalLockedIntersections(false);
		t1.setCalcAllPeriods(false);
		t1.setLockSystemEvaluationResult(false);
		t1.setLockUserEvaluationResult(t3);
		t1.setLockAllPriorTime(false);
		t1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
		// jtest_unverified
	}

	/**
	 * Stubs method for testContainsResultMeasure8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsContainsResultMeasure8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f0;
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return null;
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: containsResultMeasure(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#containsResultMeasure(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testContainsResultMeasure11() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule t2 = new Rule();
		Formula t3 = new Formula();
		Boolean t4 = new Boolean(true);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		_f0 = new Formula("", "", var2);
		Rule[] var3 = new Rule[] { t2 };
		THIS.setRules(var3);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		t2.setKey(7);
		t3.setExpression("");
		String[] var4 = new String[] {};
		t3.setExpressionTerms(var4);
		t3.setResultTerm("");
		t3.setResultFunction(true);
		t3.setParsed(true);
		t2.setFormula(t3);
		String[] var5 = new String[] {};
		t2.setTriggerMeasures(var5);
		t2.setSkipAggregation(true);
		t2.setSkipAllocation(true);
		t2.setBaseAllocateMeasure("");
		t2.setLockAllocation(true);
		t2.setEvalLockedIntersections(true);
		t2.setCalcAllPeriods(true);
		t2.setLockSystemEvaluationResult(true);
		t2.setLockUserEvaluationResult(t4);
		t2.setLockAllPriorTime(true);
		t2.setInitialTBFirstAllocation(true);
		_f0.setExpression("");
		String[] var6 = new String[] {};
		_f0.setExpressionTerms(var6);
		_f0.setResultTerm("");
		_f0.setResultFunction(true);
		_f0.setParsed(true);
		// jtest_tested_method
		boolean RETVAL = THIS.containsResultMeasure("");
		assertEquals(true, RETVAL); // jtest_unverified
		assertEquals(" = \n", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testContainsResultMeasure11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsContainsResultMeasure11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f0;
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
				// at com.palladium.paf.rules.RuleGroup.containsResultMeasure(RuleGroup.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getBalanceSetKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getBalanceSetKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBalanceSetKey1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		String RETVAL = THIS.getBalanceSetKey();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getBalanceSetKey()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getBalanceSetKey()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetBalanceSetKey2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		String RETVAL = THIS.getBalanceSetKey();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPerformInitialAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getPerformInitialAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPerformInitialAllocation1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		Boolean RETVAL = THIS.getPerformInitialAllocation();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getPerformInitialAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getPerformInitialAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPerformInitialAllocation2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		Boolean RETVAL = THIS.getPerformInitialAllocation();
		assertEquals(t1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRule1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		Formula RETVAL = THIS.getRule((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.RuleGroup.<init>([Lcom/palladium/paf/rules/Rule;)V>
		// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:50)
		// jtest_unverified
	}

	/**
	 * Test for method: getRule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRule6() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		Formula t2 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t3 = new Boolean((String) null);
		_f0 = new Formula();
		t1.setKey(0);
		t1.setFormula(t2);
		String[] var2 = new String[] {};
		t1.setTriggerMeasures(var2);
		t1.setSkipAggregation(false);
		t1.setSkipAllocation(false);
		t1.setBaseAllocateMeasure("");
		t1.setLockAllocation(false);
		t1.setEvalLockedIntersections(false);
		t1.setCalcAllPeriods(false);
		t1.setLockSystemEvaluationResult(false);
		t1.setLockUserEvaluationResult(t3);
		t1.setLockAllPriorTime(false);
		t1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Formula RETVAL = THIS.getRule((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRule6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRule6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f0;
				// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRule7() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		CustomFunctionDef[] var2 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t2 = new MeasureFunctionFactory(
			var2,
			(ClassLoader) null);
		Formula t3 = new Formula("0", " ", t2);
		Boolean t4 = new Boolean((String) null);
		t1.setKey(0);
		t1.setFormula(t3);
		String[] var3 = new String[] {};
		t1.setTriggerMeasures(var3);
		t1.setSkipAggregation(false);
		t1.setSkipAllocation(false);
		t1.setBaseAllocateMeasure("");
		t1.setLockAllocation(false);
		t1.setEvalLockedIntersections(false);
		t1.setCalcAllPeriods(false);
		t1.setLockSystemEvaluationResult(false);
		t1.setLockUserEvaluationResult(t4);
		t1.setLockAllPriorTime(false);
		t1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Formula RETVAL = THIS.getRule((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:54)
		// jtest_unverified
	}

	/**
	 * Test for method: getRule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRule9() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t2 = new Formula((String) null, "-./0", var2);
		Boolean t3 = new Boolean((String) null);
		t1.setKey(0);
		t1.setFormula(t2);
		String[] var3 = new String[] {};
		t1.setTriggerMeasures(var3);
		t1.setSkipAggregation(false);
		t1.setSkipAllocation(false);
		t1.setBaseAllocateMeasure("");
		t1.setLockAllocation(false);
		t1.setEvalLockedIntersections(false);
		t1.setCalcAllPeriods(false);
		t1.setLockSystemEvaluationResult(false);
		t1.setLockUserEvaluationResult(t3);
		t1.setLockAllPriorTime(false);
		t1.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		Formula RETVAL = THIS.getRule("");
		assertEquals(t2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRule9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRule9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
				// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRule(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRule(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRule18() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule t2 = new Rule();
		MeasureFunctionFactory var2 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t3 = new Formula("", "", var2);
		Boolean t4 = new Boolean(true);
		_f0 = new Formula("", "");
		Rule[] var3 = new Rule[] { t2 };
		THIS.setRules(var3);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		t2.setKey(7);
		t2.setFormula(t3);
		String[] var4 = new String[] {};
		t2.setTriggerMeasures(var4);
		t2.setSkipAggregation(true);
		t2.setSkipAllocation(true);
		t2.setBaseAllocateMeasure("");
		t2.setLockAllocation(true);
		t2.setEvalLockedIntersections(true);
		t2.setCalcAllPeriods(true);
		t2.setLockSystemEvaluationResult(true);
		t2.setLockUserEvaluationResult(t4);
		t2.setLockAllPriorTime(true);
		t2.setInitialTBFirstAllocation(true);
		// jtest_tested_method
		Formula RETVAL = THIS.getRule("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRule18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRule18(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.Rule.getFormula()");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:51)
					case 2 :
						return null;
					// at com.palladium.paf.rules.RuleGroup.getRule(RuleGroup.java:52)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRuleGroupId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupId1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		String RETVAL = THIS.getRuleGroupId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleGroupId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRuleGroupId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupId2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		String RETVAL = THIS.getRuleGroupId();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRules()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRules()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRules1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		Rule[] RETVAL = THIS.getRules();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getRules()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#getRules()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRules2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean(true);
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		Rule[] RETVAL = THIS.getRules();
		assertEquals(var2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDelayedPerpetual()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isDelayedPerpetual()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDelayedPerpetual1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isDelayedPerpetual();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isDelayedPerpetual()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isDelayedPerpetual()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsDelayedPerpetual2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isDelayedPerpetual();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isPerpetual()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isPerpetual()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsPerpetual1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isPerpetual();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isPerpetual()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isPerpetual()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsPerpetual2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean(true);
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isPerpetual();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isPerpetualAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isPerpetualAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsPerpetualAllocation1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isPerpetualAllocation();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isPerpetualAllocation()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isPerpetualAllocation()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsPerpetualAllocation2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isPerpetualAllocation();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isSkipProtProc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isSkipProtProc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsSkipProtProc1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isSkipProtProc();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isSkipProtProc()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#isSkipProtProc()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsSkipProtProc2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean(true);
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		boolean RETVAL = THIS.isSkipProtProc();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: readResolve()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#readResolve()
	 * @author Parasoft Jtest 8.0
	 */
	public void testReadResolve1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		Object RETVAL = THIS.readResolve();
		assertEquals(THIS, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: readResolve()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#readResolve()
	 * @author Parasoft Jtest 8.0
	 */
	public void testReadResolve2() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		Boolean t1 = new Boolean(false);
		Rule[] var1 = new Rule[] {};
		THIS.setRules(var1);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(false);
		THIS.setDelayedPerpetual(false);
		THIS.setSkipProtProc(false);
		THIS.setPerpetualAllocation(false);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		Object RETVAL = THIS.readResolve();
		assertEquals(THIS, RETVAL); // jtest_unverified
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: RuleGroup()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#RuleGroup()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRuleGroup1() throws Throwable {
		// jtest_tested_method
		RuleGroup THIS = new RuleGroup();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: RuleGroup(com.palladium.paf.rules.Rule[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#RuleGroup(com.palladium.paf.rules.Rule[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testRuleGroup2() throws Throwable {
		// jtest_tested_method
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: RuleGroup(com.palladium.paf.rules.Rule[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#RuleGroup(com.palladium.paf.rules.Rule[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testRuleGroup3() throws Throwable {
		Rule[] var1 = new Rule[] {};
		// jtest_tested_method
		RuleGroup THIS = new RuleGroup(var1);
		assertEquals("", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setBalanceSetKey(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setBalanceSetKey(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetBalanceSetKey1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setBalanceSetKey("");
		assertEquals("", THIS.getBalanceSetKey()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setDelayedPerpetual(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setDelayedPerpetual(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetDelayedPerpetual1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setDelayedPerpetual(true);
		assertEquals(true, THIS.isDelayedPerpetual()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPerformInitialAllocation(java.lang.Boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setPerformInitialAllocation(java.lang.Boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPerformInitialAllocation1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean(true);
		Boolean t2 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setPerformInitialAllocation(t2);
		assertEquals(t2, THIS.getPerformInitialAllocation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPerpetual(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setPerpetual(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPerpetual1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setPerpetual(true);
		assertEquals(true, THIS.isPerpetual()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setPerpetualAllocation(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setPerpetualAllocation(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetPerpetualAllocation1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setPerpetualAllocation(true);
		assertEquals(true, THIS.isPerpetualAllocation()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRuleGroupId(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setRuleGroupId(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRuleGroupId1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean(true);
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setRuleGroupId("");
		assertEquals("", THIS.getRuleGroupId()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setRules(com.palladium.paf.rules.Rule[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setRules(com.palladium.paf.rules.Rule[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetRules1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		Rule[] var3 = new Rule[] {};
		// jtest_tested_method
		THIS.setRules(var3);
		assertSame(var3, THIS.getRules()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSkipProtProc(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#setSkipProtProc(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSkipProtProc1() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		Boolean t1 = new Boolean("");
		Rule[] var2 = new Rule[] {};
		THIS.setRules(var2);
		THIS.setRuleGroupId("");
		THIS.setBalanceSetKey("");
		THIS.setPerpetual(true);
		THIS.setDelayedPerpetual(true);
		THIS.setSkipProtProc(true);
		THIS.setPerpetualAllocation(true);
		THIS.setPerformInitialAllocation(t1);
		// jtest_tested_method
		THIS.setSkipProtProc(true);
		assertEquals(true, THIS.isSkipProtProc()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		RuleGroup THIS = new RuleGroup((Rule[]) null);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.RuleGroup.<init>([Lcom/palladium/paf/rules/Rule;)V>
		// at com.palladium.paf.rules.RuleGroup.toString(RuleGroup.java:81)
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString2() throws Throwable {
		Rule[] var1 = new Rule[] {};
		RuleGroup THIS = new RuleGroup(var1);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleGroup#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString5() throws Throwable {
		Rule t1 = new Rule();
		Rule[] var1 = new Rule[] { t1 };
		RuleGroup THIS = new RuleGroup(var1);
		// jtest_tested_method
		String RETVAL = THIS.toString();
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.rules.Rule.toString(Rule.java:66)
		// at com.palladium.paf.rules.RuleGroup.toString(RuleGroup.java:81)
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
	 * Usage: java com.palladium.paf.rules.RuleGroupTest
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
			RuleGroupTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.RuleGroup",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return RuleGroup.class;
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
private Formula _f0;
	}

// JTEST_CURRENT_ID=-559067015.