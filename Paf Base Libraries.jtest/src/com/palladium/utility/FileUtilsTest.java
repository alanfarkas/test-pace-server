/*
 * FileUtilsTest.java
 * Created by Jtest on 9/19/06 5:45:58 PM.
 * Updated by Jtest on 10/18/06 8:10:30 PM, 7 test cases added, 7 test cases removed.
 */

package com.palladium.utility;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import jtest.Stubs;
import java.lang.reflect.Member;
import java.io.File;
import com.palladium.utility.FileUtils;

/**
 * FileUtilsTest is a unit test class for class FileUtils.
 * @see com.palladium.utility.FileUtils
 * @author Parasoft Jtest 8.0
 */
public class FileUtilsTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public FileUtilsTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy1() throws Throwable {
		// jtest_tested_method
		FileUtils.copy((File) null, (File) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.io.FileInputStream.<init>
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
		// jtest_unverified
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy2() throws Throwable {
		// jtest_tested_method
		FileUtils.copy((File) null, (File) null);

		// java.io.FileNotFoundException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy3() throws Throwable {
		// jtest_tested_method
		FileUtils.copy((File) null, (File) null);
		// NullPointerException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				throw new NullPointerException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy4() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		FileUtils.copy((File) null, var1);
		// java.io.FileNotFoundException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy5() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		FileUtils.copy((File) null, var1);
		// java.io.IOException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:65)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "read", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:65)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy7() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		FileUtils.copy((File) null, var1);
		// java.io.IOException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:68)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "read", argument_types)) {
				return new Integer(1);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:65)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "write", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy8() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		FileUtils.copy((File) null, var1);
		// IndexOutOfBoundsException thrown
		// at com.palladium.utility.FileUtils.copy(FileUtils.java:58)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "read", argument_types)) {
				return new Integer(1025);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:57)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:65)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "write", argument_types)) {
				throw new IndexOutOfBoundsException();
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:68)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copy(java.io.File,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see FileUtils#copy(java.io.File,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopy10() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		FileUtils.copy((File) null, var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopy10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopy10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:48)
			}
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.FileInputStream.read(byte[])");
				switch (index) {
					case 1 :
					case 2 :
						return new Integer(1);
					// at com.palladium.utility.FileUtils.copy(FileUtils.java:57)
					case 3 :
						return new Integer(0);
					// at com.palladium.utility.FileUtils.copy(FileUtils.java:57)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:65)
			}
		}
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:51)
			}
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:58)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.FileUtils.copy(FileUtils.java:68)
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
	 * Usage: java com.palladium.utility.FileUtilsTest
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
			FileUtilsTest.class,
			// fully qualified name of the tested class
			"com.palladium.utility.FileUtils",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return FileUtils.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=1278170785.