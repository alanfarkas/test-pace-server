/*
 * Base64Test.java
 * Created by Jtest on 9/19/06 5:48:11 PM.
 * Updated by Jtest on 10/18/06 8:12:00 PM, 27 test cases added, 27 test cases removed.
 * Updated by Jtest on 11/9/06 3:18:26 AM, 27 test cases added, 27 test cases removed.
 */

package com.palladium.utility;

import java.io.ObjectInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import com.palladium.paf.view.ViewTuple;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.FilterOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.utility.Base64;

/**
 * Base64Test is a unit test class for class Base64.
 * @see com.palladium.utility.Base64
 * @author Parasoft Jtest 8.0
 */
public class Base64Test extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public Base64Test(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: OutputStream(java.io.OutputStream,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#OutputStream(java.io.OutputStream,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBase641() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		// jtest_tested_method
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: OutputStream(java.io.OutputStream)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#OutputStream(java.io.OutputStream)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBase643() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		// jtest_tested_method
		Base64.OutputStream THIS = new Base64.OutputStream(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InputStream(java.io.InputStream)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#InputStream(java.io.InputStream)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBase644() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		// jtest_tested_method
		Base64.InputStream THIS = new Base64.InputStream(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: InputStream(java.io.InputStream,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#InputStream(java.io.InputStream,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBase645() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		// jtest_tested_method
		Base64.InputStream THIS = new Base64.InputStream(var1, 7);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: close()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#close()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClose1() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.close();
		// java.io.IOException thrown
		// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
		// jtest_unverified
	}

	/**
	 * Stubs method for testClose1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClose1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: close()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#close()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClose2() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.close();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testClose2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClose2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decode(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decode(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecode1() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decode((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64.decode(Ljava/lang/String;)[B>
		// at com.palladium.utility.Base64.decode(Base64.java:706)
		// jtest_unverified
	}

	/**
	 * Test for method: static decode(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decode(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecode3() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decode("0");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static decode(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decode(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecode4() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decode((byte[]) null, 0, 0);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static decode(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decode(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecode6() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		byte[] RETVAL = Base64.decode(var1, 7, 7);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[7]); // jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static decode(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decode(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecode8() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		byte[] RETVAL = Base64.decode(var1, 7, 7);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64.decode(Base64.java:657)
		// jtest_unverified
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile1() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.io.File.<init>
		// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
		// jtest_unverified
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile2() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		// NegativeArraySizeException thrown
		// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483646L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(-1L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile3() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483648L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(0L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:905)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile5() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483646L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(0L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:913)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile6() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.io.FileInputStream.<init>
		// at com.palladium.utility.Base64.decodeFromFile(Base64.java:913)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483647L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(0L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile9() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		// NullPointerException thrown
		// at com.palladium.utility.Base64.decodeFromFile(Base64.java:912)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483647L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(0L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:913)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:912)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				throw new NullPointerException();
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:912)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeFromFile11() throws Throwable {
		// jtest_tested_method
		byte[] RETVAL = Base64.decodeFromFile((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeFromFile11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeFromFile11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:897)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.File.length()");
				switch (index) {
					case 1 :
						return new Long(2147483647L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:903)
					case 2 :
						return new Long(0L);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:908)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:913)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:912)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedInputStream.class);
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:912)
			}
		}
		if (Stubs.matches(method, Base64.InputStream.class)) {
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.utility.Base64$InputStream.read(byte[],int,int)");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:916)
					case 2 :
						return new Integer(-1);
					// at com.palladium.utility.Base64.decodeFromFile(Base64.java:916)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FilterInputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.decodeFromFile(Base64.java:930)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeToFile(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToFile(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToFile1() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.decodeToFile((String) null, "");
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeToFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeToFile1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:862)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeToFile(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToFile(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToFile3() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.decodeToFile((String) null, "");
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64.decodeToFile(Ljava/lang/String;Ljava/lang/String;)Z>
		// at com.palladium.utility.Base64.decodeToFile(Base64.java:863)
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeToFile3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeToFile3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:862)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:872)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeToFile(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToFile(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToFile4() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.decodeToFile("", "");
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeToFile4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeToFile4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:862)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:863)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.decodeToFile(Base64.java:872)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeToObject(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToObject(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToObject1() throws Throwable {
		// jtest_tested_method
		Object RETVAL = Base64.decodeToObject("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static decodeToObject(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToObject(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToObject3() throws Throwable {
		// jtest_tested_method
		Object RETVAL = Base64.decodeToObject("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeToObject3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeToObject3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ObjectInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectInputStream.class);
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:787)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "readObject", argument_types)) {
				throw new ClassNotFoundException();
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:789)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:804)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static decodeToObject(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#decodeToObject(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testDecodeToObject4() throws Throwable {
		// jtest_tested_method
		Object RETVAL = Base64.decodeToObject("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testDecodeToObject4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsDecodeToObject4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ObjectInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectInputStream.class);
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:787)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "readObject", argument_types)) {
				return null;
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:789)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.decodeToObject(Base64.java:804)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes1() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, -1, 1, 0);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64.encode3to4(Base64.java:236)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:521)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes2() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7, 7, 7);

		// IndexOutOfBoundsException thrown
		// at java.util.zip.DeflaterOutputStream.write(DeflaterOutputStream.java:107)
		// at java.util.zip.GZIPOutputStream.write(GZIPOutputStream.java:72)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:466)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeBytes2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeBytes2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:464)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
			}
		}
		if (Stubs.matches(method, DeflaterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:476)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes3() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7, 7, 7);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeBytes3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeBytes3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:464)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
			}
		}
		if (Stubs.matches(method, GZIPOutputStream.class)) {
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:466)
			}
		}
		if (Stubs.matches(method, DeflaterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:467)
				// 
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:476)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes6() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes((byte[]) null, 0, 1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64.encodeBytes([BII)Ljava/lang/String;>
		// at com.palladium.utility.Base64.encode3to4(Base64.java:236)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:521)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:418)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes7() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 0, 1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64.encode3to4(Base64.java:236)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:521)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:418)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes8() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes((byte[]) null, 0, 0);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes11() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 0);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals("gA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes12() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 0);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes13() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7, 7);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64.encode3to4(Base64.java:237)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:508)
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:418)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes14() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes((byte[]) null, 0);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64.encodeBytes([BI)Ljava/lang/String;>
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes16() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeBytes16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeBytes16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:464)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		if (Stubs.matches(method, DeflaterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.zip.DeflaterOutputStream.close()");
				switch (index) {
					case 1 :
						throw new IOException();
					// at com.palladium.utility.Base64.encodeBytes(Base64.java:467)
					// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
					case 2 :
						return Stubs.VOID;
					// at com.palladium.utility.Base64.encodeBytes(Base64.java:476)
					// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes18() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[511]); // jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeBytes18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeBytes18(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:464)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
				// 
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.util.zip.GZIPOutputStream.finish
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:467)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:467)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:467)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
				// 
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[],int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[],int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes21() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1, 7);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeBytes21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeBytes21(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:464)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		if (Stubs.matches(method, DeflaterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:476)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:477)
				// at com.palladium.utility.Base64.encodeBytes(Base64.java:403)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes23() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes24() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[3]); // jtest_unverified
		assertEquals("gICAgA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes25() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[9]); // jtest_unverified
		assertEquals("gICAgICAgICAgA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes26() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[15]); // jtest_unverified
		assertEquals("gICAgICAgICAgICAgICAgA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes27() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[21]); // jtest_unverified
		assertEquals("gICAgICAgICAgICAgICAgICAgICAgA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes28() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals((byte) -128, var1[1]); // jtest_unverified
		assertEquals((byte) -128, var1[2]); // jtest_unverified
		assertEquals((byte) -128, var1[27]); // jtest_unverified
		assertEquals("gICAgICAgICAgICAgICAgICAgICAgICAgICAgA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes29() throws Throwable {
		byte[] var1 = new byte[] { (byte) -128 };
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes(var1);
		assertEquals((byte) -128, var1[0]); // jtest_unverified
		assertEquals("gA==", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeBytes(byte[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeBytes(byte[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeBytes36() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeBytes((byte[]) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64.encodeBytes([B)Ljava/lang/String;>
		// at com.palladium.utility.Base64.encodeBytes(Base64.java:376)
		// jtest_unverified
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile1() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at java.io.FileInputStream.<init>
		// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile2() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile4() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);
		// NullPointerException thrown
		// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				throw new NullPointerException();
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile6() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);

		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64$InputStream.read(Base64.java:1201)
		// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.BufferedInputStream.read()");
				switch (index) {
					case 1 :
					case 3 :
						return new Integer(-1);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1074)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
					case 2 :
						return new Integer(0);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1074)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FilterInputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:978)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile7() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, Base64.InputStream.class)) {
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "read", argument_types)) {
				return new Integer(-1);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
			}
		}
		if (Stubs.matches(method, FilterInputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:978)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeFromFile(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeFromFile(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeFromFile11() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeFromFile((String) null);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.String.checkBounds(String.java:372)
		// at java.lang.String.<init>(String.java:404)
		// at com.palladium.utility.Base64.encodeFromFile(Base64.java:969)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeFromFile11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeFromFile11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(File.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:954)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "length", argument_types)) {
				return new Long(0L);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:955)
			}
		}
		if (Stubs.matches(method, FileInputStream.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:962)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.InputWBS.<init>(InputWBS.java:34)
				// at jtest.wbstubs.java.io.BufferedInputStreamWBS.<init>(BufferedInputStreamWBS.java:27)
				// at java.io.BufferedInputStream.<init>
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, BufferedInputStream.class)) {
			argument_types = new Class[] { InputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedInputStream.class);
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:961)
			}
		}
		if (Stubs.matches(method, Base64.InputStream.class)) {
			argument_types = new Class[] { byte[].class, Integer.TYPE,
					Integer.TYPE };
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.utility.Base64$InputStream.read(byte[],int,int)");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
					case 2 :
						return new Integer(0);
					// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
					case 3 :
						return new Integer(-1);
					// at com.palladium.utility.Base64.encodeFromFile(Base64.java:965)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, FilterInputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeFromFile(Base64.java:978)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeObject(java.io.Serializable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeObject(java.io.Serializable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeObject1() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeObject((Serializable) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeObject1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeObject1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ObjectOutputStream.class)) {
			argument_types = new Class[] { OutputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectOutputStream.class);
				// at com.palladium.utility.Base64.encodeObject(Base64.java:336)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "writeObject", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64.encodeObject(Base64.java:338)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64.encodeObject(Base64.java:347)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:349)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeObject(java.io.Serializable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeObject(java.io.Serializable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeObject2() throws Throwable {
		// jtest_tested_method
		String RETVAL = Base64.encodeObject((Serializable) null);
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeObject2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeObject2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ObjectOutputStream.class)) {
			argument_types = new Class[] { OutputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectOutputStream.class);
				// at com.palladium.utility.Base64.encodeObject(Base64.java:336)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "writeObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeObject(Base64.java:338)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64.encodeObject(Base64.java:347)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:349)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeObject(java.io.Serializable)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeObject(java.io.Serializable)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeObject4() throws Throwable {
		ViewTuple[] var1 = new ViewTuple[] {
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class) };
		// jtest_tested_method
		String RETVAL = Base64.encodeObject(var1);
		assertNotNull(var1[0]); // jtest_unverified
		assertEquals(null, var1[0].getAxis()); // jtest_unverified
		assertEquals(null, var1[0].getBorder()); // jtest_unverified
		assertEquals(null, var1[0].getDrillable()); // jtest_unverified
		assertEquals(null, var1[0].getExpanded()); // jtest_unverified
		assertEquals(null, var1[0].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[0].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[0].getOrder()); // jtest_unverified
		assertEquals(null, var1[0].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[1]); // jtest_unverified
		assertEquals(null, var1[1].getAxis()); // jtest_unverified
		assertEquals(null, var1[1].getBorder()); // jtest_unverified
		assertEquals(null, var1[1].getDrillable()); // jtest_unverified
		assertEquals(null, var1[1].getExpanded()); // jtest_unverified
		assertEquals(null, var1[1].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[1].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[1].getOrder()); // jtest_unverified
		assertEquals(null, var1[1].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[2]); // jtest_unverified
		assertEquals(null, var1[2].getAxis()); // jtest_unverified
		assertEquals(null, var1[2].getBorder()); // jtest_unverified
		assertEquals(null, var1[2].getDrillable()); // jtest_unverified
		assertEquals(null, var1[2].getExpanded()); // jtest_unverified
		assertEquals(null, var1[2].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[2].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[2].getOrder()); // jtest_unverified
		assertEquals(null, var1[2].getOverrideLabel()); // jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeObject4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeObject4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ObjectOutputStream.class)) {
			argument_types = new Class[] { OutputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectOutputStream.class);
				// at com.palladium.utility.Base64.encodeObject(Base64.java:336)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "writeObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeObject(Base64.java:338)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeObject(Base64.java:347)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:349)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:283)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeObject(java.io.Serializable,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeObject(java.io.Serializable,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeObject5() throws Throwable {
		ViewTuple[] var1 = new ViewTuple[] {
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class) };
		// jtest_tested_method
		String RETVAL = Base64.encodeObject(var1, 7);
		assertNotNull(var1[0]); // jtest_unverified
		assertEquals(null, var1[0].getAxis()); // jtest_unverified
		assertEquals(null, var1[0].getBorder()); // jtest_unverified
		assertEquals(null, var1[0].getDrillable()); // jtest_unverified
		assertEquals(null, var1[0].getExpanded()); // jtest_unverified
		assertEquals(null, var1[0].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[0].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[0].getOrder()); // jtest_unverified
		assertEquals(null, var1[0].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[1]); // jtest_unverified
		assertEquals(null, var1[1].getAxis()); // jtest_unverified
		assertEquals(null, var1[1].getBorder()); // jtest_unverified
		assertEquals(null, var1[1].getDrillable()); // jtest_unverified
		assertEquals(null, var1[1].getExpanded()); // jtest_unverified
		assertEquals(null, var1[1].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[1].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[1].getOrder()); // jtest_unverified
		assertEquals(null, var1[1].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[2]); // jtest_unverified
		assertEquals(null, var1[2].getAxis()); // jtest_unverified
		assertEquals(null, var1[2].getBorder()); // jtest_unverified
		assertEquals(null, var1[2].getDrillable()); // jtest_unverified
		assertEquals(null, var1[2].getExpanded()); // jtest_unverified
		assertEquals(null, var1[2].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[2].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[2].getOrder()); // jtest_unverified
		assertEquals(null, var1[2].getOverrideLabel()); // jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeObject5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeObject5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeObject(Base64.java:332)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeObject(java.io.Serializable,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeObject(java.io.Serializable,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeObject6() throws Throwable {
		ViewTuple[] var1 = new ViewTuple[] {
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class),
				(com.palladium.paf.view.ViewTuple) jtest.Stubs
					.makeStubObject(com.palladium.paf.view.ViewTuple.class) };
		// jtest_tested_method
		String RETVAL = Base64.encodeObject(var1, 7);
		assertNotNull(var1[0]); // jtest_unverified
		assertEquals(null, var1[0].getAxis()); // jtest_unverified
		assertEquals(null, var1[0].getBorder()); // jtest_unverified
		assertEquals(null, var1[0].getDrillable()); // jtest_unverified
		assertEquals(null, var1[0].getExpanded()); // jtest_unverified
		assertEquals(null, var1[0].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[0].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[0].getOrder()); // jtest_unverified
		assertEquals(null, var1[0].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[1]); // jtest_unverified
		assertEquals(null, var1[1].getAxis()); // jtest_unverified
		assertEquals(null, var1[1].getBorder()); // jtest_unverified
		assertEquals(null, var1[1].getDrillable()); // jtest_unverified
		assertEquals(null, var1[1].getExpanded()); // jtest_unverified
		assertEquals(null, var1[1].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[1].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[1].getOrder()); // jtest_unverified
		assertEquals(null, var1[1].getOverrideLabel()); // jtest_unverified
		assertNotNull(var1[2]); // jtest_unverified
		assertEquals(null, var1[2].getAxis()); // jtest_unverified
		assertEquals(null, var1[2].getBorder()); // jtest_unverified
		assertEquals(null, var1[2].getDrillable()); // jtest_unverified
		assertEquals(null, var1[2].getExpanded()); // jtest_unverified
		assertEquals(null, var1[2].getMemberDefs()); // jtest_unverified
		assertEquals(null, var1[2].getNumberFormat()); // jtest_unverified
		assertEquals(null, var1[2].getOrder()); // jtest_unverified
		assertEquals(null, var1[2].getOverrideLabel()); // jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeObject6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeObject6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, OutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.io.FilterOutputStream.write
				// at java.util.zip.GZIPOutputStream.writeHeader
				// at java.util.zip.GZIPOutputStream.<init>
				// at java.util.zip.GZIPOutputStream.<init>
				// at com.palladium.utility.Base64.encodeObject(Base64.java:332)
				// 
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1313)
				// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
				// at java.util.zip.GZIPOutputStream.finish
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeObject(Base64.java:348)
				// 
				// at com.palladium.utility.Base64$OutputStream.flushBase64(Base64.java:1387)
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1407)
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeObject(Base64.java:348)
			}
		}
		if (Stubs.matches(method, ObjectOutputStream.class)) {
			argument_types = new Class[] { OutputStream.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(ObjectOutputStream.class);
				// at com.palladium.utility.Base64.encodeObject(Base64.java:333)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "writeObject", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeObject(Base64.java:338)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeObject(Base64.java:347)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at java.util.zip.DeflaterOutputStream.close
				// at com.palladium.utility.Base64.encodeObject(Base64.java:348)
				// 
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeObject(Base64.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeToFile(byte[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeToFile(byte[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeToFile1() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.encodeToFile((byte[]) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.utility.Base64.encodeToFile(Base64.java:828)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeToFile1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeToFile1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				throw new NullPointerException();
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:828)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeToFile(byte[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeToFile(byte[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeToFile2() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.encodeToFile((byte[]) null, "");
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeToFile2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeToFile2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				throw new FileNotFoundException();
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:828)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeToFile(byte[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeToFile(byte[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeToFile4() throws Throwable {
		// jtest_tested_method
		boolean RETVAL = Base64.encodeToFile((byte[]) null, "");
		// NullPointerException thrown
		// at com.palladium.utility.Base64.encodeToFile(Base64.java:829)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeToFile4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeToFile4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:828)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				throw new NullPointerException();
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:829)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:839)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static encodeToFile(byte[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64#encodeToFile(byte[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEncodeToFile5() throws Throwable {
		byte[] var1 = new byte[] {};
		// jtest_tested_method
		boolean RETVAL = Base64.encodeToFile(var1, "");
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEncodeToFile5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEncodeToFile5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, FileOutputStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileOutputStream.class);
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:828)
			}
		}
		if (Stubs.matches(method, FilterOutputStream.class)) {
			argument_types = new Class[] { byte[].class };
			if (Stubs.matches(method, "write", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:829)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.Base64$OutputStream.close(Base64.java:1411)
				// at com.palladium.utility.Base64.encodeToFile(Base64.java:839)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: flushBase64()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#flushBase64()
	 * @author Parasoft Jtest 8.0
	 */
	public void testFlushBase641() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.flushBase64();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: read(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead1() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 0);
		// jtest_tested_method
		int RETVAL = THIS.read((byte[]) null, 0, 0);
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: read(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead2() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 0);
		// jtest_tested_method
		int RETVAL = THIS.read((byte[]) null, 0, 1);
		assertEquals(-1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				return new Integer(-1);
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: read(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead5() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 7);
		byte[] var2 = new byte[] { (byte) -128, (byte) -128, (byte) -128,
				(byte) -128, (byte) -128, (byte) -128, (byte) -128, (byte) 65 };
		// jtest_tested_method
		int RETVAL = THIS.read(var2, 7, 7);
		assertEquals((byte) 0, var2[7]); // jtest_unverified
		assertEquals(1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.InputStream.read()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1074)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					case 2 :
					case 3 :
						return new Integer(-1);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1074)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: read(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead6() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 7);
		byte[] var2 = new byte[] {};
		// jtest_tested_method
		int RETVAL = THIS.read(var2, 7, 7);
		// java.io.IOException thrown
		// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1074)
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: read()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead9() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 0);
		// jtest_tested_method
		int RETVAL = THIS.read();
		assertEquals(-1, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				return new Integer(-1);
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: read(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead10() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1);
		byte[] var2 = new byte[] {};
		// jtest_tested_method
		int RETVAL = THIS.read(var2, 7, 7);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64$InputStream.read(Base64.java:1201)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.InputStream.read()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					case 2 :
						return new Integer(-1);
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
					// at com.palladium.utility.Base64$InputStream.read(Base64.java:1195)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: read()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$InputStream#read()
	 * @author Parasoft Jtest 8.0
	 */
	public void testRead12() throws Throwable {
		InputStream var1 = (InputStream) Stubs
			.makeStubObject(InputStream.class);
		Base64.InputStream THIS = new Base64.InputStream(var1, 0);
		// jtest_tested_method
		int RETVAL = THIS.read();
		// java.io.IOException thrown
		// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRead12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRead12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, InputStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "read", argument_types)) {
				throw new IOException();
				// at com.palladium.utility.Base64$InputStream.read(Base64.java:1114)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: resumeEncoding()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#resumeEncoding()
	 * @author Parasoft Jtest 8.0
	 */
	public void testResumeEncoding1() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.resumeEncoding();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: suspendEncoding()
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#suspendEncoding()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSuspendEncoding1() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.suspendEncoding();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: write(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#write(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testWrite1() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.write(0);
		// java.io.IOException thrown
		// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1343)
		// jtest_unverified
	}

	/**
	 * Test for method: write(int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#write(int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testWrite2() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1);
		// jtest_tested_method
		THIS.write(0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: write(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#write(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testWrite4() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.write((byte[]) null, 0, 0);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: write(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#write(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testWrite7() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		// jtest_tested_method
		THIS.write((byte[]) null, 0, 1);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.utility.Base64$OutputStream.write([BII)V>
		// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
		// jtest_unverified
	}

	/**
	 * Test for method: write(byte[],int,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see Base64$OutputStream#write(byte[],int,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testWrite8() throws Throwable {
		OutputStream var1 = (OutputStream) Stubs
			.makeStubObject(OutputStream.class);
		Base64.OutputStream THIS = new Base64.OutputStream(var1, 0);
		byte[] var2 = new byte[] {};
		// jtest_tested_method
		THIS.write(var2, 0, 1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.utility.Base64$OutputStream.write(Base64.java:1370)
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
	 * Usage: java com.palladium.utility.Base64Test
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
			Base64Test.class,
			// fully qualified name of the tested class
			"com.palladium.utility.Base64",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return Base64.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=2062795193.