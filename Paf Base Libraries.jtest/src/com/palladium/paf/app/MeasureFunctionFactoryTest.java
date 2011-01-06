/*
 * MeasureFunctionFactoryTest.java
 * Created by Jtest on 9/19/06 5:34:37 PM.
 * Updated by Jtest on 10/18/06 7:16:52 PM, 17 test cases added, 10 test cases removed.
 * Updated by Jtest on 11/9/06 2:48:53 AM, 15 test cases added, 15 test cases removed.
 */

package com.palladium.paf.app;

import com.palladium.paf.funcs.AbstractFunction;
import com.palladium.paf.funcs.IPafFunction;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.app.MeasureFunctionFactory;

/**
 * MeasureFunctionFactoryTest is a unit test class for class MeasureFunctionFactory.
 * @see com.palladium.paf.app.MeasureFunctionFactory
 * @author Parasoft Jtest 8.0
 */
public class MeasureFunctionFactoryTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public MeasureFunctionFactoryTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: static getFunctionShell(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#getFunctionShell(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionShell1() throws Throwable {
		// jtest_tested_method
		IPafFunction RETVAL = MeasureFunctionFactory
			.getFunctionShell((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.MeasureFunctionFactory.getFunctionShell(Ljava/lang/String;)Lcom/palladium/paf/funcs/IPafFunction;>
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:38)
		// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
		// at com.palladium.paf.app.MeasureFunctionFactory.getFunctionShell(MeasureFunctionFactory.java:49)
		// jtest_unverified
	}

	/**
	 * Test for method: static getFunctionShell(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#getFunctionShell(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionShell2() throws Throwable {
		// jtest_tested_method
		IPafFunction RETVAL = MeasureFunctionFactory.getFunctionShell("");

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.funcs.AbstractFunction.parseParameters(AbstractFunction.java:44)
		// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
		// at com.palladium.paf.app.MeasureFunctionFactory.getFunctionShell(MeasureFunctionFactory.java:49)
		// jtest_unverified
	}

	/**
	 * Test for method: static getFunctionShell(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#getFunctionShell(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetFunctionShell3() throws Throwable {
		// jtest_tested_method
		IPafFunction RETVAL = MeasureFunctionFactory
			.getFunctionShell((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(null, RETVAL.getOpCode()); // jtest_unverified
		assertEquals(null, RETVAL.getMeasureName()); // jtest_unverified
		assertEquals(null, RETVAL.getParms()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetFunctionShell3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetFunctionShell3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, AbstractFunction.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "parseParameters", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.funcs.ParsedFunction.<init>(ParsedFunction.java:39)
				// at com.palladium.paf.app.MeasureFunctionFactory.getFunctionShell(MeasureFunctionFactory.java:27)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#isFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFunction1() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef t1 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0, t1 };
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		t0.setClassName("");
		t0.setFunctionName("");
		// jtest_tested_method
		boolean RETVAL = THIS.isFunction((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.MeasureFunctionFactory.isFunction(Ljava/lang/String;)Z>
		// at com.palladium.paf.app.MeasureFunctionFactory.isFunction(MeasureFunctionFactory.java:89)
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsFunction1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsFunction1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.lang.Class.newInstance()");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(IPafFunction.class);
					// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
					case 2 :
						return null;
					// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, CustomFunctionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFunctionName", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.funcs.CustomFunctionDef.getFunctionName()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:40)
					case 2 :
						return "";
					// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:40)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isFunction(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#isFunction(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsFunction2() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef t1 = new CustomFunctionDef();
		CustomFunctionDef t2 = new CustomFunctionDef();
		CustomFunctionDef t3 = new CustomFunctionDef();
		CustomFunctionDef t4 = new CustomFunctionDef();
		CustomFunctionDef t5 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0, t1, t2, t3,
				t4, t5 };
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		t0.setClassName("");
		t0.setFunctionName("");
		t1.setClassName("");
		t1.setFunctionName("");
		t2.setClassName("");
		t2.setFunctionName("");
		t5.setClassName("");
		t5.setFunctionName("");
		// jtest_tested_method
		boolean RETVAL = THIS.isFunction("0");
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsFunction2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsFunction2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				return null;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory1() throws Throwable {
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			(CustomFunctionDef[]) null,
			(ClassLoader) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.MeasureFunctionFactory.<init>([Lcom/palladium/paf/funcs/CustomFunctionDef;Ljava/lang/ClassLoader;)V>
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:35)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory2() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory3() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] {};
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory5() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { null };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// NullPointerException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:43)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory6() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:43)
		// Caused by: java.lang.NullPointerException
		// at java.lang.Class.forName0(Native Method)
		// at java.lang.Class.forName(Class.java:242)
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory7() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:43)
		// Caused by: java.lang.ClassNotFoundException
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory9() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		t0.setClassName("");
		t0.setFunctionName("");
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		assertEquals(t0, var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				return Stubs.makeStubObject(IPafFunction.class);
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory10() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:43)
		// Caused by: java.lang.InstantiationException
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				throw new InstantiationException();
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory11() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:43)
		// Caused by: java.lang.IllegalAccessException
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				throw new IllegalAccessException();
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[],java.lang.ClassLoader)
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory12() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			var1,
			(ClassLoader) null);
		assertEquals(t0, var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "newInstance", argument_types)) {
				return null;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:39)
			}
		}
		if (Stubs.matches(method, CustomFunctionDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFunctionName", argument_types)) {
				return null;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:40)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory15() throws Throwable {
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(
			(CustomFunctionDef[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.app.MeasureFunctionFactory.<init>([Lcom/palladium/paf/funcs/CustomFunctionDef;)V>
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:17)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory17() throws Throwable {
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { null };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// NullPointerException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory18() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// Caused by: java.lang.NullPointerException
		// at java.lang.Class.forName0(Native Method)
		// at java.lang.Class.forName(Class.java:164)
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory19() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		t0.setClassName("");
		t0.setFunctionName("");
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// Caused by: java.lang.ClassNotFoundException
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory20() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		t0.setClassName("");
		t0.setFunctionName("");
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// Caused by: java.lang.ClassNotFoundException:
		// at java.lang.Class.forName0(Native Method)
		// at java.lang.Class.forName(Class.java:164)
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Test for method: MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see MeasureFunctionFactory#MeasureFunctionFactory(com.palladium.paf.funcs.CustomFunctionDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMeasureFunctionFactory21() throws Throwable {
		CustomFunctionDef t0 = new CustomFunctionDef();
		CustomFunctionDef[] var1 = new CustomFunctionDef[] { t0 };
		// jtest_tested_method
		MeasureFunctionFactory THIS = new MeasureFunctionFactory(var1);
		// IllegalArgumentException thrown
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:24)
		// Caused by: java.lang.ClassCastException: java.lang.Object
		// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMeasureFunctionFactory21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMeasureFunctionFactory21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.palladium.paf.app.MeasureFunctionFactory.<init>(MeasureFunctionFactory.java:20)
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
	 * Usage: java com.palladium.paf.app.MeasureFunctionFactoryTest
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
			MeasureFunctionFactoryTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.app.MeasureFunctionFactory",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return MeasureFunctionFactory.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=-1542062815.