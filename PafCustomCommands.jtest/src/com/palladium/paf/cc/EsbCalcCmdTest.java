/*
 * EsbCalcCmdTest.java
 * Created by Jtest on 11/9/06 3:36:34 AM.
 */

package com.palladium.paf.cc;

import com.palladium.paf.mdb.essbase.EsbCalculate;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.IPafConnectionProps;
import java.util.Map;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.state.IPafClientState;
import java.util.Properties;
import com.palladium.paf.CustomCommandResult;
import com.palladium.paf.cc.EsbCalcCmd;

/**
 * EsbCalcCmdTest is a unit test class for class EsbCalcCmd.
 * @see com.palladium.paf.cc.EsbCalcCmd
 * @author Parasoft Jtest 8.0
 */
public class EsbCalcCmdTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public EsbCalcCmdTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute1() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(
			(Properties) null,
			(IPafClientState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.cc.EsbCalcCmd.execute(Ljava/util/Properties;Lcom/palladium/paf/state/IPafClientState;)Lcom/palladium/paf/CustomCommandResult;>
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
		// jtest_unverified
	}
	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute2() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, (IPafClientState) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:63)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return null;
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute3() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, (IPafClientState) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
					case 2 :
						return null;
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute4() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, (IPafClientState) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.cc.EsbCalcCmd.execute(Ljava/util/Properties;Lcom/palladium/paf/state/IPafClientState;)Lcom/palladium/paf/CustomCommandResult;>
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return "";
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
				// 
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute6() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);
		// ClassCastException thrown
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return "";
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
				// 
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute7() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);
		// IllegalArgumentException thrown
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:79)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return "";
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
				// 
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute8() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				return "";
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
				// 
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProperties", argument_types)) {
				return null;
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute9() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerObject(EsbUtility.java:299)
		// at com.palladium.paf.mdb.essbase.EsbUtility.deleteServerCalcScript(EsbUtility.java:269)
		// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:196)
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
					// 
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 11 :
					case 12 :
					case 13 :
					case 14 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:103)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:104)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:105)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:86)
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:87)
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:88)
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnMgr.<init>(EsbConnMgr.java:89)
					// at com.palladium.paf.mdb.essbase.EsbCube.<init>(EsbCube.java:108)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.runTokenizedCalcScript(EsbCalculate.java:159)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProperties", argument_types)) {
				return Stubs.makeStubObject(Properties.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute13() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);

		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute13(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
					// 
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProperties", argument_types)) {
				return Stubs.makeStubObject(Properties.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
			}
		}
		if (Stubs.matches(method, EsbCalculate.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "runTokenizedCalcScript", argument_types)) {
				throw new PafException();
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see EsbCalcCmd#execute(java.util.Properties,com.palladium.paf.state.IPafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExecute15() throws Throwable {
		EsbCalcCmd THIS = new EsbCalcCmd();
		Properties var1 = (Properties) Stubs.makeStubObject(Properties.class);
		IPafClientState var2 = (IPafClientState) Stubs
			.makeStubObject(IPafClientState.class);
		// jtest_tested_method
		CustomCommandResult RETVAL = THIS.execute(var1, var2);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(null, RETVAL.getReturnMessage()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExecute15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExecute15(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Properties.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getProperty", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Properties.getProperty(java.lang.String)");
				switch (index) {
					case 1 :
					case 2 :
						return "";
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:59)
					// 
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:66)
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
						return null;
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:72)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:73)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:74)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:75)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					// 
					// at com.palladium.paf.mdb.essbase.EsbConnParms.<init>(EsbConnParms.java:76)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:71)
					// at com.palladium.paf.mdb.essbase.EsbCalculate.<init>(EsbCalculate.java:56)
					// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, IPafClientState.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSources", argument_types)) {
				return Stubs.makeStubObject(Map.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:74)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getProperties", argument_types)) {
				return Stubs.makeStubObject(Properties.class);
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:83)
			}
		}
		if (Stubs.matches(method, EsbCalculate.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "runTokenizedCalcScript", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.cc.EsbCalcCmd.execute(EsbCalcCmd.java:86)
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
	 * Usage: java com.palladium.paf.cc.EsbCalcCmdTest
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
			EsbCalcCmdTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.cc.EsbCalcCmd",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return EsbCalcCmd.class;
	}

	/**
	 * Used to keep track of how many times a stubbed method has been called.
	 * @author Parasoft Jtest 8.0
	 */
private jtest.StubIterationCounter _stubs_iteration;
}

// JTEST_CURRENT_ID=123921898.