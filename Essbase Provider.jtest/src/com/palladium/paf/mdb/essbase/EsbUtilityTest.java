/*
 * EsbUtilityTest.java
 * Created by Jtest on 9/19/06 4:58:34 PM.
 * Updated by Jtest on 10/18/06 7:14:47 PM, 11 test cases added, 11 test cases removed.
 * Updated by Jtest on 11/9/06 2:23:35 AM, 11 test cases added, 11 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import com.essbase.api.base.EssException;
import com.essbase.api.datasource.IEssCube;
import java.util.Hashtable;
import java.lang.reflect.Member;
import jtest.Stubs;
import java.util.Properties;
import java.io.File;
import com.palladium.paf.mdb.essbase.EsbUtility;

/**
 * EsbUtilityTest is a unit test class for class EsbUtility.
 * @see com.palladium.paf.mdb.essbase.EsbUtility
 * @author Parasoft Jtest 8.0
 */
public class EsbUtilityTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbUtilityTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: static copyCalcScriptToFile(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToFile(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToFile1() throws Throwable {
		// jtest_tested_method
		File RETVAL = EsbUtility.copyCalcScriptToFile(
			(IEssCube) null,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToFile(EsbUtility.java:64)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyCalcScriptToFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyCalcScriptToFile1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "deleteOnExit", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToFile(EsbUtility.java:64)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToServer1() throws Throwable {
		// jtest_tested_method
		String RETVAL = EsbUtility.copyCalcScriptToServer(
			(IEssCube) null,
			(File) null,
			"");
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(Lcom/essbase/api/datasource/IEssCube;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;>
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
		// jtest_unverified
	}

	/**
	 * Test for method: static copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToServer3() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		File var2 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility.copyCalcScriptToServer(var1, var2, "");

		// com.essbase.api.base.EssException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyCalcScriptToServer3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyCalcScriptToServer3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPath", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class,
					String.class, Boolean.TYPE };
			if (Stubs.matches(
				method,
				"copyOlapFileObjectToServer",
				argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToServer4() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		File var2 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility.copyCalcScriptToServer(var1, var2, "");
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyCalcScriptToServer4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyCalcScriptToServer4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPath", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class,
					String.class, Boolean.TYPE };
			if (Stubs.matches(
				method,
				"copyOlapFileObjectToServer",
				argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToServer7() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility
			.copyCalcScriptToServer((IEssCube) null, var1);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:109)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyCalcScriptToServer7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyCalcScriptToServer7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:109)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyCalcScriptToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyCalcScriptToServer9() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility
			.copyCalcScriptToServer((IEssCube) null, var1);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:109)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyCalcScriptToServer9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyCalcScriptToServer9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:123)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyCalcScriptToServer(EsbUtility.java:109)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyFileObjectToServer(com.essbase.api.datasource.IEssCube,java.io.File,int,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyFileObjectToServer(com.essbase.api.datasource.IEssCube,java.io.File,int,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyFileObjectToServer1() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		File var2 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility.copyFileObjectToServer(
			var1,
			var2,
			0,
			(String) null,
			0);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyFileObjectToServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyFileObjectToServer1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPath", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class,
					String.class, Boolean.TYPE };
			if (Stubs.matches(
				method,
				"copyOlapFileObjectToServer",
				argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyServerObjectToFile(com.essbase.api.datasource.IEssCube,java.lang.String,int,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyServerObjectToFile(com.essbase.api.datasource.IEssCube,java.lang.String,int,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyServerObjectToFile1() throws Throwable {
		// jtest_tested_method
		File RETVAL = EsbUtility.copyServerObjectToFile(
			(IEssCube) null,
			(String) null,
			0,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyServerObjectToFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyServerObjectToFile1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "deleteOnExit", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyServerObjectToFile(EsbUtility.java:85)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyTextFileToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyTextFileToServer(com.essbase.api.datasource.IEssCube,java.io.File,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyTextFileToServer1() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		File var2 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility.copyTextFileToServer(var1, var2, "");
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyTextFileToServer1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyTextFileToServer1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPath", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:150)
			}
		}
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class,
					String.class, Boolean.TYPE };
			if (Stubs.matches(
				method,
				"copyOlapFileObjectToServer",
				argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:178)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:150)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static copyTextFileToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#copyTextFileToServer(com.essbase.api.datasource.IEssCube,java.io.File)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCopyTextFileToServer3() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		// jtest_tested_method
		String RETVAL = EsbUtility.copyTextFileToServer((IEssCube) null, var1);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.substring(String.java:1768)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:150)
		// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:136)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCopyTextFileToServer3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCopyTextFileToServer3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyFileObjectToServer(EsbUtility.java:170)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:150)
				// at com.palladium.paf.mdb.essbase.EsbUtility.copyTextFileToServer(EsbUtility.java:136)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static deleteServerCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#deleteServerCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteServerCalcScript1() throws Throwable {
		// jtest_tested_method
		EsbUtility.deleteServerCalcScript((IEssCube) null, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(Lcom/essbase/api/datasource/IEssCube;Ljava/lang/String;)V>
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
		// jtest_unverified
	}

	/**
	 * Test for method: static deleteServerCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#deleteServerCalcScript(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteServerCalcScript2() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		EsbUtility.deleteServerCalcScript(var1, (String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDeleteServerCalcScript2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDeleteServerCalcScript2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "unlockOlapFileObject", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:292)
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
			}
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "deleteOlapFileObject", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static deleteServerObject(com.essbase.api.datasource.IEssCube,java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#deleteServerObject(com.essbase.api.datasource.IEssCube,java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteServerObject1() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		EsbUtility.deleteServerObject(var1, "", 7);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDeleteServerObject1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDeleteServerObject1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "unlockOlapFileObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:292)
			}
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "deleteOlapFileObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static deleteServerTextFile(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#deleteServerTextFile(com.essbase.api.datasource.IEssCube,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDeleteServerTextFile1() throws Throwable {
		IEssCube var1 = (IEssCube) Stubs.makeStubObject(IEssCube.class);
		// jtest_tested_method
		EsbUtility.deleteServerTextFile(var1, (String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDeleteServerTextFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDeleteServerTextFile1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IEssCube.class)) {
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "unlockOlapFileObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:292)
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerTextFile(EsbUtility.java:279)
			}
			argument_types = new Class[] { Integer.TYPE, String.class };
			if (Stubs.matches(method, "deleteOlapFileObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
				// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerTextFile(EsbUtility.java:279)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testResolveCalcScriptTokens1() throws Throwable {
		// jtest_tested_method
		File RETVAL = EsbUtility.resolveCalcScriptTokens(
			(File) null,
			(Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(Ljava/io/File;Ljava/util/Properties;)Ljava/io/File;>
		// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:201)
		// jtest_unverified
	}
	/**
	 * Test for method: static resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testResolveCalcScriptTokens3() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		File RETVAL = EsbUtility.resolveCalcScriptTokens(var1, var2);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:217)
		// jtest_unverified
	}

	/**
	 * Stubs method for testResolveCalcScriptTokens3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsResolveCalcScriptTokens3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:201)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "deleteOnExit", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:217)
			}
		}
		if (Stubs.matches(method, Hashtable.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isEmpty", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:208)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbUtility#resolveCalcScriptTokens(java.io.File,java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testResolveCalcScriptTokens4() throws Throwable {
		File var1 = (File) Stubs.makeStubObject(File.class);
		Properties var2 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		File RETVAL = EsbUtility.resolveCalcScriptTokens(var1, var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:211)
		// jtest_unverified
	}

	/**
	 * Stubs method for testResolveCalcScriptTokens4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsResolveCalcScriptTokens4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:201)
			}
		}
		if (Stubs.matches(method, Hashtable.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isEmpty", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbUtility.resolveCalcScriptTokens(EsbUtility.java:208)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbUtilityTest
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
			EsbUtilityTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbUtility",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbUtility.class;
	}

			}

// JTEST_CURRENT_ID=-1934966761.