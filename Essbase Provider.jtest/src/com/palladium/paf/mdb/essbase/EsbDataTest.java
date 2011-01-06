/*
 * EsbDataTest.java
 * Created by Jtest on 9/19/06 4:57:06 PM.
 * Updated by Jtest on 10/18/06 6:45:39 PM, 30 test cases added, 30 test cases removed.
 * Updated by Jtest on 11/9/06 2:23:13 AM, 30 test cases added, 30 test cases removed.
 */

package com.palladium.paf.mdb.essbase;

import com.essbase.api.dataquery.IEssOperation;
import com.essbase.api.dataquery.IEssOpMdxQuery.EEssMemberIdentifierType;
import com.essbase.api.dataquery.IEssOpMdxQuery;
import com.essbase.api.dataquery.IEssMdDataSet;
import com.palladium.utility.StringUtils;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.PafException;
import com.essbase.api.base.EssException;
import com.essbase.api.dataquery.IEssCubeView;
import com.essbase.api.session.Essbase;
import com.essbase.api.domain.IEssDomain;
import java.util.Set;
import com.palladium.paf.app.PafApplicationDef;
import java.util.Map;
import jtest.JT;
import java.lang.reflect.Member;
import com.palladium.paf.mdb.PafDataCache;
import jtest.Stubs;
import java.util.Properties;
import com.palladium.paf.mdb.essbase.EsbData;

/**
 * EsbDataTest is a unit test class for class EsbData.
 * @see com.palladium.paf.mdb.essbase.EsbData
 * @author Parasoft Jtest 8.0
 */
public class EsbDataTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbDataTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: buildMdxQuery(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#buildMdxQuery(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildMdxQuery1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		String RETVAL = THIS.buildMdxQuery(var2);
		// StringIndexOutOfBoundsException thrown
		// at java.lang.AbstractStringBuilder.deleteCharAt(AbstractStringBuilder.java:773)
		// at java.lang.StringBuilder.deleteCharAt(StringBuilder.java:264)
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:386)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildMdxQuery1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildMdxQuery1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildMdxQuery(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#buildMdxQuery(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildMdxQuery4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		// jtest_tested_method
		String RETVAL = THIS.buildMdxQuery((Map) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:376)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildMdxQuery4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildMdxQuery4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#EsbData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbData1() throws Throwable {
		// jtest_tested_method
		EsbData THIS = new EsbData((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbData.<init>(Ljava/util/Properties;)V>
		// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
		// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
		// jtest_unverified
	}

	/**
	 * Test for method: EsbData(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#EsbData(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbData2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbData THIS = new EsbData(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbData2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbData2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbData(java.util.Properties,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#EsbData(java.util.Properties,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbData3() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		EsbData THIS = new EsbData(var1, true);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testEsbData3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEsbData3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: EsbData(java.lang.String,boolean)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#EsbData(java.lang.String,boolean)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbData4() throws Throwable {
		// jtest_tested_method
		EsbData THIS = new EsbData("", true);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: EsbData(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#EsbData(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEsbData5() throws Throwable {
		// jtest_tested_method
		EsbData THIS = new EsbData((String) null);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[],java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[],java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null,
			(Set) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// Caused by: java.lang.IllegalArgumentException: buildMdxQuery() error - dimMembers can not be NULL
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:376)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[],java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[],java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache2() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var2,
			(PafApplicationDef) null,
			(String[]) null,
			(Set) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		// at java.lang.AbstractStringBuilder.deleteCharAt(AbstractStringBuilder.java:773)
		// at java.lang.StringBuilder.deleteCharAt(StringBuilder.java:264)
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:386)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache11() throws Throwable {
		EsbData THIS = new EsbData("0", false);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Java Exception: Essbase Exception: Cannot connect to enterprise serverConnection refused: connect. Make sure the sign on parameters are correct and the enterprise server is running
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:115)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Cannot connect to enterprise serverConnection refused: connect. Make sure the sign on parameters are correct and the enterprise server is running
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
		// Caused by: com.essbase.api.base.EssException: Cannot connect to enterprise serverConnection refused: connect. Make sure the sign on parameters are correct and the enterprise server is running
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:185)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.openConnection(EssOrbPluginTcpip.java:176)
		// at com.essbase.api.session.EssOrbPluginTcpip.invokeMethod(EssOrbPluginTcpip.java:85)
		// at com.essbase.api.session.EssOrbPluginTcpip.invokeMethod(EssOrbPluginTcpip.java:74)
		// at com.essbase.api.session.EssOrbPlugin.signOn(EssOrbPlugin.java:138)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:398)
		// at com.essbase.api.session.Essbase.signOn_internal(Essbase.java:363)
		// at com.essbase.api.session.Essbase.signOn(Essbase.java:307)
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache12() throws Throwable {
		EsbData THIS = new EsbData("TitanServer", false);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Java Exception: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:115)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:60)
		// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache12(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache13() throws Throwable {
		EsbData THIS = new EsbData("0");
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:109)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache14() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:150)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache14.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache14(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache15() throws Throwable {
		EsbData THIS = new EsbData((String) null, false);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache16() throws Throwable {
		EsbData THIS = new EsbData("TitanServer");
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			(Map) null,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.IllegalArgumentException: buildMdxQuery() error - dimMembers can not be NULL
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:376)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache16(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:68)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:99)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:103)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache17() throws Throwable {
		EsbData THIS = new EsbData((String) null);
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var1,
			(PafApplicationDef) null,
			(String[]) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEsbApp", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:178)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEsbDb", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:179)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache19() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var2,
			(PafApplicationDef) null,
			(String[]) null);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:261)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache19(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache21() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var2,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache21(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache22() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var3,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Java Exception: null
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:209)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache22(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache23() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] { null };
		_f0 = new ListMock(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var3,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:128)
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache23(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache24() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Object[] var2 = new Object[] { null, null };
		_f0 = new ListMock(var2);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var3,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.utility.StringUtils.arrayToString(StringUtils.java:126)
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache24(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache25() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var4,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache25.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache25(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					Boolean.TYPE };
			if (Stubs.matches(method, "runMdxQuery", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache27() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var5,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache27(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache29() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1, false);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var6,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:314)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:187)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache29.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache29(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					Boolean.TYPE };
			if (Stubs.matches(method, "runMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssMdDataSet.class);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssMdDataSet.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCellCount", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:187)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache31() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f4 = new ListMock(var6);
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var7,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Java Exception: null
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:209)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache31(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache32() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f4 = new ListMock(var6);
		Object[] var7 = new Object[] {};
		_f5 = new ListMock(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var8,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:314)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:188)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache32.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache32(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(6);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return _f5;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					Boolean.TYPE };
			if (Stubs.matches(method, "runMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssMdDataSet.class);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssMdDataSet.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCellCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:187)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllAxes", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:188)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache33() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f4 = new ListMock(var6);
		Object[] var7 = new Object[] {};
		_f5 = new ListMock(var7);
		Object[] var8 = new Object[] {};
		_f6 = new ListMock(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var9,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache33.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache33(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(6);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return new Integer(7);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return _f5;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return _f6;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache34() throws Throwable {
		EsbData THIS = new EsbData((String) null);
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f1 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f2 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f3 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f4 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f5 = new ListMock(var6);
		Object[] var7 = new Object[] {};
		_f6 = new ListMock(var7);
		Object[] var8 = new Object[] {};
		_f7 = new ListMock(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var9,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:187)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache34.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache34(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, String.class,
					Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(EsbCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:171)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEsbApp", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:178)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getEsbDb", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:179)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { String.class, Boolean.TYPE,
					Boolean.TYPE };
			if (Stubs.matches(method, "runMdxQuery", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(6);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return new Integer(7);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return new Integer(8);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 9 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return _f5;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return _f6;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return _f7;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache35() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f4 = new ListMock(var6);
		Object[] var7 = new Object[] {};
		_f5 = new ListMock(var7);
		Object[] var8 = new Object[] {};
		_f6 = new ListMock(var8);
		Object[] var9 = new Object[] {};
		_f7 = new ListMock(var9);
		Object[] var10 = new Object[] {};
		_f8 = new ListMock(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var11,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:189)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache35.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache35(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(6);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return new Integer(7);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return new Integer(8);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 9 :
						return new Integer(9);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 10 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return _f5;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return _f6;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return _f7;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 9 :
						return _f8;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, EsbCubeView.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					Boolean.TYPE };
			if (Stubs.matches(method, "runMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssMdDataSet.class);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "disconnect", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssMdDataSet.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCellCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:187)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllAxes", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:188)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache36() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Object[] var2 = new Object[] {};
		_f0 = new ListMock(var2);
		Object[] var3 = new Object[] {};
		_f1 = new ListMock(var3);
		Object[] var4 = new Object[] {};
		_f2 = new ListMock(var4);
		Object[] var5 = new Object[] {};
		_f3 = new ListMock(var5);
		Object[] var6 = new Object[] {};
		_f4 = new ListMock(var6);
		Object[] var7 = new Object[] {};
		_f5 = new ListMock(var7);
		Object[] var8 = new Object[] {};
		_f6 = new ListMock(var8);
		Object[] var9 = new Object[] {};
		_f7 = new ListMock(var9);
		Object[] var10 = new Object[] {};
		_f8 = new ListMock(var10);
		Object[] var11 = new Object[] {};
		_f9 = new ListMock(var11);
		Map var12 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var12,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: com.palladium.paf.PafException: Essbase Exception: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:203)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
		// Caused by: com.essbase.api.base.EssException: Error occured
		// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache36.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache36(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return Stubs.makeStubObject(IEssCubeView.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return new Integer(3);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return new Integer(4);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return new Integer(5);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return new Integer(6);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return new Integer(7);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return new Integer(8);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 9 :
						return new Integer(9);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 10 :
						return new Integer(10);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 11 :
						return new Integer(0);
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 2 :
						return _f1;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 3 :
						return _f2;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 4 :
						return _f3;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 5 :
						return _f4;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 6 :
						return _f5;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 7 :
						return _f6;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 8 :
						return _f7;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 9 :
						return _f8;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					case 10 :
						return _f9;
					// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:382)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
					// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, StringUtils.class)) {
			argument_types = new Class[] { Object[].class, String.class,
					String.class, String.class, String.class, String.class };
			if (Stubs.matches(method, "arrayToString", argument_types)) {
				return "";
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:383)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssCubeView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "createIEssOpMdxQuery", argument_types)) {
				return Stubs.makeStubObject(IEssOpMdxQuery.class);
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:192)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[] { IEssOperation.class };
			if (Stubs.matches(method, "performOperation", argument_types)) {
				throw new EssException();
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:197)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:255)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssOpMdxQuery.class)) {
			argument_types = new Class[] { Boolean.TYPE, String.class,
					Boolean.TYPE, EEssMemberIdentifierType.class };
			if (Stubs.matches(method, "setQuery", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.runMdxQuery(EsbCubeView.java:193)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:184)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#getDataCache(java.util.Map,com.palladium.paf.app.PafApplicationDef,java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache37() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		Map var2 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache(
			var2,
			(PafApplicationDef) null,
			(String[]) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:320)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
		// Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		// at java.lang.AbstractStringBuilder.deleteCharAt(AbstractStringBuilder.java:773)
		// at java.lang.StringBuilder.deleteCharAt(StringBuilder.java:264)
		// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:386)
		// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache37.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache37(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:135)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:136)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:137)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
				// 
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Essbase.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class };
			if (Stubs.matches(method, "signOn", argument_types)) {
				return Stubs.makeStubObject(IEssDomain.class);
				// at com.palladium.paf.mdb.essbase.EsbDomain.<init>(EsbDomain.java:55)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:92)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:140)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isSignedOn", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:71)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "signOff", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.essbase.EsbDomain.disconnect(EsbDomain.java:72)
				// at com.palladium.paf.mdb.essbase.EsbConnMgr.cleanup(EsbConnMgr.java:228)
				// at com.palladium.paf.mdb.essbase.EsbCubeView.disconnect(EsbCubeView.java:272)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:327)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, IEssDomain.class)) {
			argument_types = new Class[] { String.class, String.class,
					String.class, String.class, Boolean.TYPE, Boolean.TYPE,
					Boolean.TYPE, Boolean.TYPE };
			if (Stubs.matches(method, "openCubeView", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbCubeView.<init>(EsbCubeView.java:144)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:169)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.buildMdxQuery(EsbData.java:381)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:180)
				// at com.palladium.paf.mdb.essbase.EsbData.getDataCache(EsbData.java:129)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: sendData(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#sendData(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSendData1() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		// jtest_tested_method
		THIS.sendData((PafDataCache) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.mdb.essbase.EsbData.sendData(Lcom/palladium/paf/mdb/PafDataCache;)V>
		// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:409)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSendData1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSendData1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: sendData(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#sendData(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSendData4() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisCount",
			new Object[] { new Integer(0) },
			new Class[] { Integer.TYPE });
		int[] var2 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setAxisSizes",
			new Object[] { var2 },
			new Class[] { int[].class });
		int[] var3 = new int[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setDimCountByAxis",
			new Object[] { var3 },
			new Class[] { int[].class });
		boolean[] var4 = new boolean[] {};
		JT.invokeStatic(
			PafDataCache.class,
			"setIsSlicerAxis",
			new Object[] { var4 },
			new Class[] { boolean[].class });
		JT.invokeStatic(
			PafDataCache.class,
			"setMdxQuery",
			new Object[] { "" },
			new Class[] { String.class });
		PafDataCache var5 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		THIS.sendData(var5);
		// NullPointerException thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSendData4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSendData4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:409)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:410)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:411)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:411)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPlanTypeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:412)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:413)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSizes", argument_types)) {
				return new int[0];
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:414)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[1];
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:419)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: sendData(com.palladium.paf.mdb.PafDataCache)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbData#sendData(com.palladium.paf.mdb.PafDataCache)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSendData5() throws Throwable {
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		EsbData THIS = new EsbData(var1);
		PafDataCache var2 = (PafDataCache) Stubs
			.makeStubObject(PafDataCache.class);
		// jtest_tested_method
		THIS.sendData(var2);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:643)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSendData5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSendData5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:104)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:105)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
				// 
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:106)
				// at com.palladium.paf.mdb.essbase.EsbData.<init>(EsbData.java:95)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisCount", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:409)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMeasureAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:410)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getTimeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:411)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getVersionAxis", argument_types)) {
				return new Integer(-1);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:411)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPlanTypeAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:412)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYearAxis", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:413)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAxisSizes", argument_types)) {
				return new int[0];
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:414)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getActiveVersions", argument_types)) {
				return new String[2];
				// at com.palladium.paf.mdb.essbase.EsbData.sendData(EsbData.java:419)
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
	 * Usage: java com.palladium.paf.mdb.essbase.EsbDataTest
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
			EsbDataTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.mdb.essbase.EsbData",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbData.class;
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
private ListMock _f0;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f4;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f6;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f7;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f8;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f9;
}

// JTEST_CURRENT_ID=-332765419.