/*
 * PafClientStateTest.java
 * Created by Jtest on 9/19/06 6:03:37 PM.
 * Updated by Jtest on 10/18/06 8:06:39 PM, 12 test cases added, 12 test cases removed.
 * Updated by Jtest on 11/9/06 3:07:10 AM, 12 test cases added, 12 test cases removed.
 */

package com.palladium.paf.state;

import java.util.Properties;
import com.palladium.paf.view.PafMVS;
import com.palladium.paf.app.MdbDef;
import java.util.List;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.rules.RuleSet;
import java.util.Set;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import java.util.Map;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.view.PafView;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.state.PafClientState;

/**
 * PafClientStateTest is a unit test class for class PafClientState.
 * @see com.palladium.paf.state.PafClientState
 * @author Parasoft Jtest 8.0
 */
public class PafClientStateTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public PafClientStateTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}
	/**
	 * Test for method: addLockedForwardPlannableInterMap(java.lang.String,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#addLockedForwardPlannableInterMap(java.lang.String,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddLockedForwardPlannableInterMap1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		THIS.addLockedForwardPlannableInterMap((String) null, (Set) null);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddLockedForwardPlannableInterMap1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddLockedForwardPlannableInterMap1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addLockedNotPlannableInterMap(java.lang.String,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#addLockedNotPlannableInterMap(java.lang.String,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddLockedNotPlannableInterMap1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		THIS.addLockedNotPlannableInterMap((String) null, (Set) null);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddLockedNotPlannableInterMap1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddLockedNotPlannableInterMap1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addMVS(java.lang.String,com.palladium.paf.view.PafMVS)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#addMVS(java.lang.String,com.palladium.paf.view.PafMVS)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddMVS1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		THIS.addMVS((String) null, (PafMVS) null);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddMVS1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddMVS1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#addView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddView1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		THIS.addView((PafView) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.PafClientState.addView(Lcom/palladium/paf/view/PafView;)V>
		// at com.palladium.paf.state.PafClientState.addView(PafClientState.java:128)
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddView1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddView1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: addView(com.palladium.paf.view.PafView)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#addView(com.palladium.paf.view.PafView)
	 * @author Parasoft Jtest 8.0
	 */
	public void testAddView2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		PafView t2 = new PafView();
		// jtest_tested_method
		THIS.addView(t2);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testAddView2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsAddView2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateTokenCatalog(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#generateTokenCatalog(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateTokenCatalog1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Properties RETVAL = THIS.generateTokenCatalog((Properties) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.state.PafClientState.generateTokenCatalog(Ljava/util/Properties;)Ljava/util/Properties;>
		// at com.palladium.paf.state.PafClientState.generateTokenCatalog(PafClientState.java:359)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateTokenCatalog1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateTokenCatalog1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: generateTokenCatalog(java.util.Properties)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#generateTokenCatalog(java.util.Properties)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGenerateTokenCatalog2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		Properties RETVAL = THIS.generateTokenCatalog(var1);
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getPlanningVersion(PafClientState.java:300)
		// at com.palladium.paf.state.PafClientState.generateTokenCatalog(PafClientState.java:364)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGenerateTokenCatalog2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGenerateTokenCatalog2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.state.PafClientState.generateTokenCatalog(PafClientState.java:359)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getActiveVersions()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getActiveVersions()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetActiveVersions1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Set RETVAL = THIS.getActiveVersions();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetActiveVersions1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetActiveVersions1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getApp()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getApp()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetApp1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		PafApplicationDef RETVAL = THIS.getApp();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetApp1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetApp1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientId()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getClientId()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientId1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getClientId();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientId1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientId1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientIpAddress()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getClientIpAddress()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientIpAddress1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getClientIpAddress();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientIpAddress1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientIpAddress1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getIpAddress", argument_types)) {
				return null;
				// at com.palladium.paf.state.PafClientState.getClientIpAddress(PafClientState.java:122)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientLanguage()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getClientLanguage()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientLanguage1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getClientLanguage();
		assertEquals("En-us", RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientLanguage1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientLanguage1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientType()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getClientType()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientType1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getClientType();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientType1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientType1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientType", argument_types)) {
				return null;
				// at com.palladium.paf.state.PafClientState.getClientType(PafClientState.java:114)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getClientVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getClientVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetClientVersion1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getClientVersion();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetClientVersion1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetClientVersion1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientVersion", argument_types)) {
				return null;
				// at com.palladium.paf.state.PafClientState.getClientVersion(PafClientState.java:118)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getCurrentLockedIntersections(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getCurrentLockedIntersections(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetCurrentLockedIntersections1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Set RETVAL = THIS.getCurrentLockedIntersections((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getCurrentLockedIntersections(PafClientState.java:250)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetCurrentLockedIntersections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetCurrentLockedIntersections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataSources()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getDataSources()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSources1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Map RETVAL = THIS.getDataSources();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataSources1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataSources1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDefaultMsrRuleset()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getDefaultMsrRuleset()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDefaultMsrRuleset1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		RuleSet RETVAL = THIS.getDefaultMsrRuleset();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getDefaultMsrRuleset(PafClientState.java:476)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDefaultMsrRuleset1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDefaultMsrRuleset1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDefaultMsrRulesetName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getDefaultMsrRulesetName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDefaultMsrRulesetName1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getDefaultMsrRulesetName();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getDefaultMsrRulesetName(PafClientState.java:500)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDefaultMsrRulesetName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDefaultMsrRulesetName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getInitRequest()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getInitRequest()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInitRequest1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		ClientInitRequest RETVAL = THIS.getInitRequest();
		assertEquals(t0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetInitRequest1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetInitRequest1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedForwardPlannableInterMap()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getLockedForwardPlannableInterMap()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedForwardPlannableInterMap1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Map RETVAL = THIS.getLockedForwardPlannableInterMap();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedForwardPlannableInterMap1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedForwardPlannableInterMap1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedNotPlannableInterMap()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getLockedNotPlannableInterMap()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedNotPlannableInterMap1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Map RETVAL = THIS.getLockedNotPlannableInterMap();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedNotPlannableInterMap1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedNotPlannableInterMap1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getLockedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getLockedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetLockedPeriods1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Set RETVAL = THIS.getLockedPeriods();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetLockedPeriods1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetLockedPeriods1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMVS(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getMVS(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMVS1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		PafMVS RETVAL = THIS.getMVS((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMVS1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMVS1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMdbDef()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getMdbDef()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDef1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		MdbDef RETVAL = THIS.getMdbDef();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getMdbDef(PafClientState.java:288)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMdbDef1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMdbDef1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMsrRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getMsrRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRuleSets1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		List RETVAL = THIS.getMsrRuleSets();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getMsrRuleSets(PafClientState.java:505)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRuleSets1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRuleSets1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMsrRulsetByName(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getMsrRulsetByName(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRulsetByName1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		RuleSet RETVAL = THIS.getMsrRulsetByName((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getMsrRulsetByName(PafClientState.java:486)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRulsetByName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRulsetByName1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanSeason()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getPlanSeason()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanSeason1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Season RETVAL = THIS.getPlanSeason();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanSeason1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanSeason1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlannerConfig()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getPlannerConfig()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannerConfig1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		PafPlannerConfig RETVAL = THIS.getPlannerConfig();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlannerConfig1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlannerConfig1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlannerRole()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getPlannerRole()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlannerRole1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		PafPlannerRole RETVAL = THIS.getPlannerRole();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlannerRole1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlannerRole1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getPlanningVersion()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getPlanningVersion()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetPlanningVersion1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		VersionDef RETVAL = THIS.getPlanningVersion();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getPlanningVersion(PafClientState.java:300)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetPlanningVersion1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetPlanningVersion1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSetArray()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getRuleSetArray()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSetArray1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.getRuleSetArray();
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.getRuleSetArray(PafClientState.java:293)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSetArray1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSetArray1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSets()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getRuleSets()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSets1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Map RETVAL = THIS.getRuleSets();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSets1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSets1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSessionToken()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getSessionToken()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSessionToken1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getSessionToken();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSessionToken1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSessionToken1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUnitOfWork()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getUnitOfWork()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUnitOfWork1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		UnitOfWork RETVAL = THIS.getUnitOfWork();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUnitOfWork1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUnitOfWork1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUowTrees()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getUowTrees()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowTrees1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		MemberTreeSet RETVAL = THIS.getUowTrees();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUowTrees1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUowTrees1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUowTrees()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getUowTrees()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowTrees2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		MemberTreeSet t2 = new MemberTreeSet();
		PafSecurityToken t3 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t4 = new PafApplicationDef();
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t5 = new UnitOfWork(var1, var2);
		PafPlannerRole t6 = new PafPlannerRole();
		Season t7 = new Season();
		PafPlannerConfig t8 = new PafPlannerConfig();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		THIS.setUowTrees(t2);
		THIS.setSecurityToken(t3);
		THIS.setApp(t4);
		THIS.setUnitOfWork(t5);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		THIS.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setLockedNotPlannableInterMap(var6);
		THIS.setPlannerRole(t6);
		THIS.setPlanSeason(t7);
		THIS.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		THIS.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		THIS.setActiveVersions(var8);
		THIS.setPlannerConfig(t8);
		// jtest_tested_method
		MemberTreeSet RETVAL = THIS.getUowTrees();
		assertEquals(t2, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUowTrees2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUowTrees2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUserName()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getUserName()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserName1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		String RETVAL = THIS.getUserName();
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUserName1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUserName1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUserSelections()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getUserSelections()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUserSelections1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		Map RETVAL = THIS.getUserSelections();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUserSelections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUserSelections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getView(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#getView(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetView1() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState THIS = new PafClientState((String) null, t0);
		// jtest_tested_method
		PafView RETVAL = THIS.getView((String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetView1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetView1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafClientState2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		// jtest_tested_method
		PafClientState THIS = new PafClientState((String) null, t0);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafClientState5() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		// jtest_tested_method
		PafClientState THIS = new PafClientState((String) null, t0);
		assertEquals(null, THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals(null, THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafClientState5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafClientState5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.ClientInitRequest.getClientLanguage()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
					case 2 :
						return "0";
					// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
					case 3 :
						return null;
					// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:108)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafClientState6() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		// jtest_tested_method
		PafClientState THIS = new PafClientState("", t0);
		assertEquals("En-us", THIS.getClientLanguage()); // jtest_unverified
		assertEquals(null, THIS.getActiveVersions()); // jtest_unverified
		assertEquals(null, THIS.getApp()); // jtest_unverified
		assertEquals("", THIS.getClientId()); // jtest_unverified
		assertNotNull(THIS.getDataSources()); // jtest_unverified
		assertEquals("{}", THIS.getDataSources().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafClientState#PafClientState(java.lang.String,com.palladium.paf.comm.ClientInitRequest)
	 * @author Parasoft Jtest 8.0
	 */
	public void testPafClientState7() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		// jtest_tested_method
		PafClientState THIS = new PafClientState((String) null, t0);
		// NullPointerException thrown
		// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
		// jtest_unverified
	}

	/**
	 * Stubs method for testPafClientState7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPafClientState7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClientInitRequest.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClientLanguage", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.comm.ClientInitRequest.getClientLanguage()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
					case 2 :
						return null;
					// at com.palladium.paf.state.PafClientState.<init>(PafClientState.java:107)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
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
	 * Usage: java com.palladium.paf.state.PafClientStateTest
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
			PafClientStateTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.state.PafClientState",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return PafClientState.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=1634442222.