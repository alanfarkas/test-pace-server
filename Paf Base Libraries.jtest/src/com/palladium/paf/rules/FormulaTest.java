/*
 * FormulaTest.java
 * Created by Jtest on 9/19/06 6:03:54 PM.
 * Updated by Jtest on 10/18/06 7:33:56 PM, 10 test cases added, 9 test cases removed.
 * Updated by Jtest on 11/9/06 3:28:22 AM, 9 test cases added, 9 test cases removed.
 */

package com.palladium.paf.rules;

import com.palladium.paf.PafException;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.funcs.IPafFunction;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.Formula;

/**
 * FormulaTest is a unit test class for class Formula.
 * @see com.palladium.paf.rules.Formula
 * @author Parasoft Jtest 8.0
 */
public class FormulaTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public FormulaTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: extractFunctionTerms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#extractFunctionTerms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExtractFunctionTerms1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		IPafFunction[] RETVAL = THIS.extractFunctionTerms();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("null = null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: extractFunctionTerms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#extractFunctionTerms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExtractFunctionTerms2() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		// jtest_tested_method
		IPafFunction[] RETVAL = THIS.extractFunctionTerms();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		assertEquals(" = ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExtractFunctionTerms2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExtractFunctionTerms2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
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
	 * Test for method: extractResultFunction()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#extractResultFunction()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExtractResultFunction1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		IPafFunction RETVAL = THIS.extractResultFunction();
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("null = null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Formula()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula()
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula1() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula();
		assertEquals("null = null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula3() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula(
			(String) null,
			(String) null,
			(MeasureFunctionFactory) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.rules.Formula.<init>(Ljava/lang/String;Ljava/lang/String;Lcom/palladium/paf/app/MeasureFunctionFactory;)V>
		// at com.palladium.paf.rules.Formula.parseExpression(Formula.java:108)
		// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:196)
		// at com.palladium.paf.rules.Formula.init(Formula.java:86)
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula5() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula(
			(String) null,
			"()",
			(MeasureFunctionFactory) null);
		assertEquals("null = ()", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula6() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		// jtest_tested_method
		Formula THIS = new Formula((String) null, "*+,", var1);
		assertEquals("null = *+,", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFormula6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFormula6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula7() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		MeasureFunctionFactory t0 = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// jtest_tested_method
		Formula THIS = new Formula((String) null, " ", t0);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.Formula.<init>(Ljava/lang/String;Ljava/lang/String;Lcom/palladium/paf/app/MeasureFunctionFactory;)V>
		// at com.palladium.paf.app.MeasureFunctionFactory.isFunction(MeasureFunctionFactory.java:89)
		// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
		// at com.palladium.paf.rules.Formula.init(Formula.java:87)
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula10() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		// jtest_tested_method
		Formula THIS = new Formula((String) null, "6789@B ()", var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFormula10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFormula10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula12() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		// jtest_tested_method
		Formula THIS = new Formula((String) null, "12345", var1);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
		// at com.palladium.paf.rules.Formula.init(Formula.java:87)
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFormula12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFormula12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula13() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula(
			(String) null,
			"6789@B",
			(MeasureFunctionFactory) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.rules.Formula.<init>(Ljava/lang/String;Ljava/lang/String;Lcom/palladium/paf/app/MeasureFunctionFactory;)V>
		// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
		// at com.palladium.paf.rules.Formula.init(Formula.java:86)
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula14() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula((String) null, (String) null);
		assertEquals("null = null", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String,java.lang.String,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula15() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		// jtest_tested_method
		Formula THIS = new Formula((String) null, "6789@B./0", var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFormula15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFormula15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:204)
				// at com.palladium.paf.rules.Formula.init(Formula.java:86)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: Formula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula18() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.rules.Formula.<init>(Ljava/lang/String;)V>
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:46)
		// jtest_unverified
	}

	/**
	 * Test for method: Formula(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#Formula(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFormula19() throws Throwable {
		// jtest_tested_method
		Formula THIS = new Formula("");
		// IllegalArgumentException thrown
		// at com.palladium.paf.rules.Formula.<init>(Formula.java:47)
		// jtest_unverified
	}

	/**
	 * Test for method: getExpression()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getExpression()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpression1() throws Throwable {
		Formula THIS = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		// jtest_tested_method
		String RETVAL = THIS.getExpression();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpressionTerms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getExpressionTerms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpressionTerms1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getExpressionTerms();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpressionTerms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getExpressionTerms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpressionTerms2() throws Throwable {
		Formula THIS = new Formula((String) null, "");
		// jtest_tested_method
		String[] RETVAL = THIS.getExpressionTerms();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getExpressionTerms()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getExpressionTerms()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetExpressionTerms3() throws Throwable {
		Formula THIS = new Formula("", "");
		THIS.setExpression("");
		String[] var1 = new String[] {};
		THIS.setExpressionTerms(var1);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		// jtest_tested_method
		String[] RETVAL = THIS.getExpressionTerms();
		assertEquals(var1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFunctionTermFlags()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getFunctionTermFlags()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionTermFlags1() throws Throwable {
		Formula THIS = new Formula();
		// jtest_tested_method
		boolean[] RETVAL = THIS.getFunctionTermFlags();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getFunctionTermFlags()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getFunctionTermFlags()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionTermFlags2() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		THIS.setExpression("");
		String[] var2 = new String[] {};
		THIS.setExpressionTerms(var2);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		// jtest_tested_method
		boolean[] RETVAL = THIS.getFunctionTermFlags();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFunctionTermFlags2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFunctionTermFlags2(
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
	 * Test for method: getResultTerm()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getResultTerm()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetResultTerm1() throws Throwable {
		Formula THIS = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		// jtest_tested_method
		String RETVAL = THIS.getResultTerm();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getResultTerm()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getResultTerm()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetResultTerm2() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		THIS.setExpression("");
		String[] var2 = new String[] {};
		THIS.setExpressionTerms(var2);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		// jtest_tested_method
		String RETVAL = THIS.getResultTerm();
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetResultTerm2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetResultTerm2(Member method, Object _this, Object[] args)
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
	 * Test for method: getTermMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getTermMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTermMeasures1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		String[] RETVAL = THIS.getTermMeasures();
		// NullPointerException thrown
		// at com.palladium.paf.rules.Formula.getTermMeasures(Formula.java:222)
		// jtest_unverified
	}

	/**
	 * Test for method: getTermMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getTermMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTermMeasures2() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		THIS.setExpression("");
		String[] var1 = new String[] {};
		THIS.setExpressionTerms(var1);
		THIS.setResultTerm("");
		THIS.setResultFunction(false);
		THIS.setParsed(false);
		// jtest_tested_method
		String[] RETVAL = THIS.getTermMeasures();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getTermMeasures()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#getTermMeasures()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetTermMeasures4() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		THIS.setExpression("");
		String[] var1 = new String[] { null };
		THIS.setExpressionTerms(var1);
		THIS.setResultTerm("");
		THIS.setResultFunction(false);
		THIS.setParsed(false);
		// jtest_tested_method
		String[] RETVAL = THIS.getTermMeasures();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.rules.Formula.getTermMeasures(Formula.java:225)
		// jtest_unverified
	}

	/**
	 * Test for method: isParsed()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#isParsed()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsParsed1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isParsed();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isResultFunction()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#isResultFunction()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsResultFunction1() throws Throwable {
		Formula THIS = new Formula((String) null, (String) null);
		// jtest_tested_method
		boolean RETVAL = THIS.isResultFunction();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: parse(com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#parse(com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParse1() throws Throwable {
		Formula THIS = new Formula((String) null, "");
		// jtest_tested_method
		THIS.parse((MeasureFunctionFactory) null);
		assertEquals("null = ", THIS.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: parse(com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#parse(com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParse3() throws Throwable {
		Formula THIS = new Formula();
		// jtest_tested_method
		THIS.parse((MeasureFunctionFactory) null);
		// NullPointerException thrown
		// at com.palladium.paf.rules.Formula.parseExpression(Formula.java:108)
		// at com.palladium.paf.rules.Formula.extractTerms(Formula.java:196)
		// at com.palladium.paf.rules.Formula.init(Formula.java:86)
		// at com.palladium.paf.rules.Formula.parse(Formula.java:330)
		// jtest_unverified
	}

	/**
	 * Test for method: setExpression(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#setExpression(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetExpression1() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		// jtest_tested_method
		THIS.setExpression("");
		assertEquals("", THIS.getExpression()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetExpression1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetExpression1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
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
	 * Test for method: setExpressionTerms(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#setExpressionTerms(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetExpressionTerms1() throws Throwable {
		Formula THIS = new Formula();
		THIS.setExpression("");
		String[] var1 = new String[] {};
		THIS.setExpressionTerms(var1);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		String[] var2 = new String[] {};
		// jtest_tested_method
		THIS.setExpressionTerms(var2);
		assertSame(var2, THIS.getExpressionTerms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setParsed(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#setParsed(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetParsed1() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		THIS.setExpression("");
		String[] var2 = new String[] {};
		THIS.setExpressionTerms(var2);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		// jtest_tested_method
		THIS.setParsed(true);
		assertEquals(true, THIS.isParsed()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetParsed1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetParsed1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// 
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setResultFunction(boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#setResultFunction(boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetResultFunction1() throws Throwable {
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula THIS = new Formula("", "", var1);
		THIS.setExpression("");
		String[] var2 = new String[] {};
		THIS.setExpressionTerms(var2);
		THIS.setResultTerm("");
		THIS.setResultFunction(true);
		THIS.setParsed(true);
		// jtest_tested_method
		THIS.setResultFunction(true);
		assertEquals(true, THIS.isResultFunction()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetResultFunction1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetResultFunction1(
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
	 * Test for method: setResultTerm(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#setResultTerm(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetResultTerm1() throws Throwable {
		Formula THIS = new Formula("", "");
		// jtest_tested_method
		THIS.setResultTerm("");
		assertEquals("", THIS.getResultTerm()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Formula#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		Formula THIS = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
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
	 * Usage: java com.palladium.paf.rules.FormulaTest
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
			FormulaTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.rules.Formula",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Formula.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-1307664572.