/*
 * PafViewServiceTest.java
 * Created by Jtest on 9/19/06 12:33:34 PM.
 * Updated by Jtest on 10/18/06 11:55:20 AM, 5 test cases added.
 * Updated by Jtest on 11/8/06 10:04:31 PM, 1 test case added, 3 test cases removed.
 */

package com.palladium.paf.server;

import com.palladium.paf.view.PafAxis;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.data.ExpOperation;
import org.hibernate.mapping.Table;
import com.palladium.paf.view.PafUserSelection;
import java.sql.Statement;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.palladium.paf.view.PafView;
import com.thoughtworks.xstream.XStream;
import jtest.JT;
import org.hibernate.cfg.SettingsFactory;
import org.springframework.context.support.AbstractApplicationContext;
import com.palladium.paf.view.PafViewSection;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.hibernate.SessionFactory;
import java.lang.reflect.Member;
import com.palladium.paf.view.ViewTuple;
import org.hibernate.cfg.Configuration;
import jtest.Stubs;
import java.util.Map;
import com.palladium.paf.server.PafViewService;

/**
 * PafViewServiceTest is a unit test class for class PafViewService.
 * @see com.palladium.paf.server.PafViewService
 * @author Parasoft Jtest 8.0
 */
public class PafViewServiceTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafViewServiceTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: applyNumericFormatsWithProvidedMeasure(com.palladium.paf.view.ViewTuple[],java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#applyNumericFormatsWithProvidedMeasure(com.palladium.paf.view.ViewTuple[],java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testApplyNumericFormatsWithProvidedMeasure3() throws Throwable {
		SettingsFactory t0 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f0 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t0 },
			new Class[] { SettingsFactory.class });
		_f1 = new ServerSettings();
		_f1.setClearOutlineCache(true);
		_f1.setDebugMode(true);
		_f1.setEvaluationStepLogging(true);
		_f1.setPafSecurityBootupPassword("");
		_f1.setPafSecurityPassword("");
		_f1.setPafSecurityUser("");
		_f1.setCalcScriptTimeout("");
		// jtest_tested_method
		_f1.setChangedCellLogging(true);
		assertNotNull(PafViewService.getInstance()); // jtest_unverified
		assertNotNull(PafViewService.getInvalidViewsMap()); // jtest_unverified
		assertEquals("{}", PafViewService.getInvalidViewsMap().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testApplyNumericFormatsWithProvidedMeasure3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsApplyNumericFormatsWithProvidedMeasure3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafDataService.class);
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f1;
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: applyNumericFormatsWithProvidedVersion(com.palladium.paf.view.ViewTuple[],java.lang.String,int)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#applyNumericFormatsWithProvidedVersion(com.palladium.paf.view.ViewTuple[],java.lang.String,int)
	 * @author Parasoft Jtest 8.0
	 */
	public void testApplyNumericFormatsWithProvidedVersion1() throws Throwable {
		SettingsFactory t0 = (SettingsFactory) JT.createObject(
			SettingsFactory.class,
			new Object[] {},
			new Class[] {});
		_f0 = (Configuration) JT.createObject(
			Configuration.class,
			new Object[] { t0 },
			new Class[] { SettingsFactory.class });
		// jtest_tested_method
		_f1 = new ServerSettings();
		assertNotNull(PafViewService.getInstance()); // jtest_unverified
		assertNotNull(PafViewService.getInvalidViewsMap()); // jtest_unverified
		assertEquals("{}", PafViewService.getInvalidViewsMap().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testApplyNumericFormatsWithProvidedVersion1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsApplyNumericFormatsWithProvidedVersion1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafDataService.class);
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f1;
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInstance()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#getInstance()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInstance1() throws Throwable {
		_f0 = new Configuration();
		// jtest_tested_method
		PafViewService RETVAL = PafViewService.getInstance();
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetInstance1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetInstance1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafDataService.class);
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f0;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return "";
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInstance()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#getInstance()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInstance3() throws Throwable {
		_f10 = new PafUserSelection();
		ExpOperation var1 = (ExpOperation) Stubs
			.makeStubObject(ExpOperation.class);
		_f12 = new PafUserSelection(var1);
		_f14 = new PafUserSelection();
		PafAxis t3 = new PafAxis();
		ExpOperation var2 = (ExpOperation) Stubs
			.makeStubObject(ExpOperation.class);
		_f15 = new PafUserSelection(var2);
		PafAxis t5 = new PafAxis(0);
		String[] var3 = new String[] {};
		_f14.setValues(var3);
		_f14.setDimension("");
		_f14.setId("");
		_f14.setMultiples(false);
		_f14.setPromptString("");
		_f14.setPafAxis(t3);
		String[] var4 = new String[] {};
		_f15.setValues(var4);
		_f15.setDimension("");
		_f15.setId("");
		_f15.setMultiples(false);
		_f15.setPromptString("");
		_f15.setPafAxis(t5);
		// jtest_tested_method
		PafViewService RETVAL = PafViewService.getInstance();
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetInstance3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetInstance3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViews", argument_types)) {
				return new PafView[1];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViewSections", argument_types)) {
				return new PafViewSection[0];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:138)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importUserSelections", argument_types)) {
				return new PafUserSelection[] { _f10, _f12, _f14, _f15 };
				// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:383)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, ExpOperation.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getParms", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.data.ExpOperation.getParms()");
				switch (index) {
					case 1 :
					case 2 :
					case 9 :
					case 10 :
						return new String[1];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:43)
					// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:394)
					// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
					// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
					// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
					// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
					case 3 :
					case 4 :
					case 11 :
					case 12 :
						return new String[2];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:44)
					// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:394)
					// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
					// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
					// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
					// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
					case 5 :
					case 6 :
						return new String[] { null, null, "0" };
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:45)
					// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:394)
					// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
					// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
					// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
					// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
					case 7 :
					case 8 :
					case 15 :
					case 16 :
						return new String[4];
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:46)
					// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:394)
					// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
					// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
					// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
					// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
					case 13 :
					case 14 :
						return new String[] { null, null, "true" };
					// at com.palladium.paf.view.PafUserSelection.<init>(PafUserSelection.java:45)
					// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:394)
					// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
					// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
					// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
					// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInvalidViewsMap()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#getInvalidViewsMap()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInvalidViewsMap1() throws Throwable {
		// jtest_tested_method
		Map RETVAL = PafViewService.getInvalidViewsMap();
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getViewMetaData()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#getViewMetaData()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetViewMetaData1() throws Throwable {
		Class.forName(PafViewService.class.getName());
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetViewMetaData1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetViewMetaData1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:70)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:70)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: populateVersionsMapCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#populateVersionsMapCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPopulateVersionsMapCache1() throws Throwable {
		Class.forName(PafViewService.class.getName());
		assertNotNull(PafViewService.getInstance()); // jtest_unverified
		assertNotNull(PafViewService.getInvalidViewsMap()); // jtest_unverified
		assertEquals("{}", PafViewService.getInvalidViewsMap().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPopulateVersionsMapCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPopulateVersionsMapCache1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViews", argument_types)) {
				return new PafView[0];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViewSections", argument_types)) {
				return new PafViewSection[0];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:138)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importUserSelections", argument_types)) {
				return new PafUserSelection[0];
				// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:383)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"importGlobalNumericFormats",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:119)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(XStream.class);
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[] { String.class, Class.class };
			if (Stubs.matches(method, "alias", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:40)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:41)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:42)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:43)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:44)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:45)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:46)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:47)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:48)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:50)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:51)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:52)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:54)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:55)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:57)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:58)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:60)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:61)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:62)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:63)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:65)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:67)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:68)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:69)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:71)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:72)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:74)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:75)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:76)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:78)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:79)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:80)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:82)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:83)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importGenerationFormats(PafMetaData.java:542)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:120)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: populateVersionsTypeCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#populateVersionsTypeCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testPopulateVersionsTypeCache1() throws Throwable {
		_f1 = new ServerSettings();
		_f0 = new Configuration();
		_f1.setClearOutlineCache(true);
		_f1.setDebugMode(true);
		_f1.setEvaluationStepLogging(true);
		_f1.setPafSecurityBootupPassword("");
		_f1.setPafSecurityPassword("");
		_f1.setPafSecurityUser("");
		_f1.setCalcScriptTimeout("");
		// jtest_tested_method
		_f1.setChangedCellLogging(true);
		assertNotNull(PafViewService.getInstance()); // jtest_unverified
		assertNotNull(PafViewService.getInvalidViewsMap()); // jtest_unverified
		assertEquals("{}", PafViewService.getInvalidViewsMap().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testPopulateVersionsTypeCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsPopulateVersionsTypeCache1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:70)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f1;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return Stubs.makeStubObject(SessionFactory.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importViews(PafMetaData.java:240)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: saveViewCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#saveViewCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveViewCache1() throws Throwable {
		Class.forName(PafViewService.class.getName());
		assertNotNull(PafViewService.getInstance()); // jtest_unverified
		assertNotNull(PafViewService.getInvalidViewsMap()); // jtest_unverified
		assertEquals("{}", PafViewService.getInvalidViewsMap().toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSaveViewCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSaveViewCache1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViews", argument_types)) {
				return new PafView[0];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:135)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "importViewSections", argument_types)) {
				return new PafViewSection[0];
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:138)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		if (Stubs.matches(method, XStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "fromXML", argument_types)) {
				return null;
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importUserSelections(PafMetaData.java:307)
				// at com.palladium.paf.server.PafViewService.getUserSelectionsMap(PafViewService.java:383)
				// at com.palladium.paf.server.PafViewService.assembleViews(PafViewService.java:219)
				// at com.palladium.paf.server.PafViewService.loadViewCache(PafViewService.java:118)
				// at com.palladium.paf.server.PafViewService.<init>(PafViewService.java:587)
				// at com.palladium.paf.server.PafViewService.getInstance(PafViewService.java:578)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static setInvalidViewsMap(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#setInvalidViewsMap(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetInvalidViewsMap1() throws Throwable {
		// jtest_tested_method
		PafViewService.setInvalidViewsMap((Map) null);
		assertEquals(null, PafViewService.getInvalidViewsMap()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static setInvalidViewsMap(java.util.Map)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafViewService#setInvalidViewsMap(java.util.Map)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetInvalidViewsMap2() throws Throwable {
		Map var1 = (Map) Stubs.makeStubObject(Map.class);
		// jtest_tested_method
		PafViewService.setInvalidViewsMap(var1);
		assertEquals(var1, PafViewService.getInvalidViewsMap()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.PafViewServiceTest
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
            PafViewServiceTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafViewService",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafViewService.class;
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
private Configuration _f0;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ServerSettings _f1;
                                                                                                                                                                                                                                                        									/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafUserSelection _f10;
		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafUserSelection _f12;
		/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafUserSelection _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafUserSelection _f15;
										}

// JTEST_CURRENT_ID=-1488137669.