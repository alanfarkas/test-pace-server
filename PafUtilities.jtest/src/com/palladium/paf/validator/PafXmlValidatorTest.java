/*
 * PafXmlValidatorTest.java
 * Created by Jtest on 9/19/06 4:50:27 PM.
 * Updated by Jtest on 10/18/06 9:05:13 AM, 2 test cases added, 2 test cases removed.
 */

package com.palladium.paf.validator;

import com.palladium.utility.PafXStream;
import java.io.File;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.validator.PafXmlValidator;

/**
 * PafXmlValidatorTest is a unit test class for class PafXmlValidator.
 * @see com.palladium.paf.validator.PafXmlValidator
 * @author Parasoft Jtest 8.0
 */
public class PafXmlValidatorTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafXmlValidatorTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

/**
 * Test for method: static main(java.lang.String[])
 * @throws Throwable Tests may throw any Throwable
 * @see PafXmlValidator#main(java.lang.String[])
 * @author Parasoft Jtest 8.0
 */public void testMain1() throws Throwable{String[] var1=new String[]{};
// jtest_tested_method
PafXmlValidator.main(var1);jtest.internal.recorder.OutcomeRecorder.setTestedNameAndSignature(this, "main","(java.lang.String[])");jtest.internal.recorder.OutcomeRecorder.recordOutcome(this, "var1", var1,String[].class,new String[]{});jtest.internal.recorder.OutcomeRecorder.recordStatic(this, PafXmlValidator.class);}

/**
 * Test for method: static main(java.lang.String[])
 * @throws Throwable Tests may throw any Throwable
 * @see PafXmlValidator#main(java.lang.String[])
 * @author Parasoft Jtest 8.0
 */public void testMain2() throws Throwable{String[] var1=new String[]{""};
// jtest_tested_method
PafXmlValidator.main(var1);jtest.internal.recorder.OutcomeRecorder.setTestedNameAndSignature(this, "main","(java.lang.String[])");jtest.internal.recorder.OutcomeRecorder.recordOutcome(this, "var1", var1,String[].class,new String[]{""});jtest.internal.recorder.OutcomeRecorder.recordStatic(this, PafXmlValidator.class);}

/**
 * Stubs method for testMain2.
 * @param method The method or constructor to be called
 * @param _this The instance object corresponding to the method or
 *        <code>null</code> for static methods
 * @param args The arguments passed to the method
 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
 * @throws Throwable Stubs may throw any Throwable
 * @author Parasoft Jtest 8.0
 */public Object stubsMain2(Member method, Object _this, Object [] args) throws Throwable{Class[] argument_types;if(Stubs.matches(method,File.class)) {argument_types=new Class[0];if(Stubs.matches(method,"exists", argument_types)) {return Boolean.FALSE;
// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:53)
}}return Stubs.NO_STUB_GENERATED;}

				/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafXmlValidator#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain3() throws Throwable {
		String[] var1 = new String[] { "" };
		// jtest_tested_method
		PafXmlValidator.main(var1);
		assertEquals("", var1[0]); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	jtest.internal.recorder.OutcomeRecorder.setTestedNameAndSignature(this, "main","(java.lang.String[])");jtest.internal.recorder.OutcomeRecorder.recordOutcome(this, "var1", var1,String[].class, new String[] { "" });jtest.internal.recorder.OutcomeRecorder.recordStatic(this, PafXmlValidator.class);}

	/**
	 * Stubs method for testMain3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
				// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:53)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "canRead", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:54)
				// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:53)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
/**
 * Test for method: static main(java.lang.String[])
 * @throws Throwable Tests may throw any Throwable
 * @see PafXmlValidator#main(java.lang.String[])
 * @author Parasoft Jtest 8.0
 */public void testMain5() throws Throwable{_f0=new Object();String[] var1=new String[]{""};
// jtest_tested_method
PafXmlValidator.main(var1);jtest.internal.recorder.OutcomeRecorder.setTestedNameAndSignature(this, "main","(java.lang.String[])");jtest.internal.recorder.OutcomeRecorder.recordVariable(this, "_f0", _f0);jtest.internal.recorder.OutcomeRecorder.recordOutcome(this, "var1", var1,String[].class,new String[]{""});jtest.internal.recorder.OutcomeRecorder.recordStatic(this, PafXmlValidator.class);}

/**
 * Stubs method for testMain5.
 * @param method The method or constructor to be called
 * @param _this The instance object corresponding to the method or
 *        <code>null</code> for static methods
 * @param args The arguments passed to the method
 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
 * @throws Throwable Stubs may throw any Throwable
 * @author Parasoft Jtest 8.0
 */public Object stubsMain5(Member method, Object _this, Object [] args) throws Throwable{Class[] argument_types;if(Stubs.matches(method,File.class)) {argument_types=new Class[0];if(Stubs.matches(method,"exists", argument_types)) {return Boolean.TRUE;
// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:46)
// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:53)
}argument_types=new Class[0];if(Stubs.matches(method,"canRead", argument_types)) {return Boolean.TRUE;
// at com.palladium.paf.utils.FileUtility.verifyFileStatus(FileUtility.java:54)
// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:53)
}}if(Stubs.matches(method,PafXStream.class)) {argument_types=new Class[]{String.class};if(Stubs.matches(method,"importObjectFromXml", argument_types)) {return _f0;
// at com.palladium.paf.validator.PafXmlValidator.main(PafXmlValidator.java:61)
}}return Stubs.NO_STUB_GENERATED;}

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
	 * Usage: java com.palladium.paf.validator.PafXmlValidatorTest
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
			PafXmlValidatorTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.validator.PafXmlValidator",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafXmlValidator.class;
	}

						/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Object _f0;
}

// JTEST_CURRENT_ID=1950311495.