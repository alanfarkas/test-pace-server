/*
 * PafDataServiceTest.java
 * Created by Jtest on 9/19/06 2:57:25 PM.
 * Updated by Jtest on 10/18/06 6:17:22 PM, 32 test cases added, 18 test cases removed.
 * Updated by Jtest on 11/9/06 12:46:41 AM, 69 test cases added, 114 test cases removed.
 */

package com.palladium.paf.server;

import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import org.hibernate.connection.DriverManagerConnectionProvider;
import java.util.Properties;
import java.sql.DriverManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import java.net.URL;
import java.net.URLStreamHandler;
import com.palladium.paf.mdb.PafDataSliceParms;
import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.comm.EvaluateViewRequest;
import com.palladium.paf.view.PafAlignment;
import com.palladium.paf.view.PafStyle;
import com.palladium.paf.view.PafNumberFormat;
import com.palladium.paf.view.PafBorder;
import com.palladium.paf.view.LockedCell;
import com.palladium.paf.view.PageTuple;
import com.palladium.paf.view.ViewTuple;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.view.PafViewHeader;
import java.util.List;
import java.util.Iterator;
import com.palladium.paf.view.PafViewSection;
import com.palladium.paf.view.PafView;
import com.palladium.paf.data.PafDataSlice;
import com.palladium.paf.mdb.IMdbData;
import java.util.TreeMap;
import com.palladium.paf.mdb.IMdbMetaData;
import jtest.JT;
import com.palladium.paf.mdb.PafDataCache;
import org.springframework.context.support.AbstractApplicationContext;
import com.palladium.paf.mdb.PafMember;
import com.palladium.paf.mdb.PafMemberAttr;
import com.palladium.paf.mdb.PafMemberTree;
import jtest.mocks.java.util.ListMock;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.data.PafMemberList;
import java.util.Map;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.data.PafSimpleUow;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.state.PafClientState;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.concurrent.ConcurrentHashMap;
import com.palladium.paf.mdb.IPafConnectionProps;
import java.util.HashMap;
import jtest.Repository;
import com.palladium.paf.app.PafApplicationDef;
import jtest.Stubs;
import java.lang.reflect.Member;
import java.util.Set;
import com.palladium.paf.server.PafDataService;

/**
 * PafDataServiceTest is a unit test class for class PafDataService.
 * @see com.palladium.paf.server.PafDataService
 * @author Parasoft Jtest 8.0
 */
public class PafDataServiceTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafDataServiceTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms1() throws Throwable {
		PafViewSection t1 = new PafViewSection();
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
		// jtest_unverified
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:357)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:357)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms7() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		_f46 = new ViewTuple();
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// ArrayIndexOutOfBoundsException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[] { _f46 };
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms8() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		ViewTuple t5 = new ViewTuple((Integer) null, (String[]) null);
		Integer t6 = new Integer(0);
		PafBorder t7 = new PafBorder(0);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafNumberFormat t10 = new PafNumberFormat((String) null, (String) null);
		Short t11 = new Short((short) -32768);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean((String) null);
		Boolean t14 = new Boolean((String) null);
		PafStyle t15 = new PafStyle();
		PafStyle t16 = new PafStyle();
		Integer t17 = new Integer("0");
		PafAlignment t18 = new PafAlignment();
		Boolean t19 = new Boolean(false);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean((String) null);
		Boolean t22 = new Boolean((String) null);
		Boolean t23 = new Boolean(false);
		PafBorder t24 = new PafBorder();
		Integer t25 = new Integer("0");
		Integer t26 = new Integer(0);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] { t5 };
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		t5.setAxis(t6);
		t5.setBorder(t7);
		t5.setDrillable(t8);
		t5.setExpanded(t9);
		String[] var9 = new String[] { null };
		t5.setMemberDefs(var9);
		t5.setNumberFormat(t10);
		t5.setOrder(t11);
		t5.setOverrideLabel("");
		t5.setParentFirst(t12);
		t5.setPlannable(t13);
		t5.setVisible(t14);
		t5.setDataGlobalStyleName("");
		t5.setDataStyle(t15);
		t5.setHeaderGlobalStyleName("");
		t16.setSize(t17);
		t16.setAlignment(t18);
		t16.setBgFillColor("");
		t16.setFontColor("");
		t16.setFontName("");
		t16.setName("");
		t16.setBold(t19);
		t16.setDoubleUnderline(t20);
		t16.setItalics(t21);
		t16.setStrikeOut(t22);
		t16.setUnderline(t23);
		t5.setHeaderStyle(t16);
		t5.setNumberFormatOverrideLabel("");
		t5.setHeaderBorder(t24);
		t5.setColumnWidth(t25);
		t5.setRowHeight(t26);
		Integer[] var10 = new Integer[] {};
		t5.setSymetricGroupNo(var10);
		Integer[] var11 = new Integer[] {};
		t5.setDerivedHeaderGroupNo(var11);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms9() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		_f46 = new ViewTuple();
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t2.setColumnCount(0);
		double[] var3 = new double[] {};
		t2.setData(var3);
		t2.setCompressedData("");
		t2.setCompressed(false);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var4 = new String[] {};
		t1.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] {};
		t1.setPageTuples(var5);
		String[] var6 = new String[] {};
		t1.setRowAxisDims(var6);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var9);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:365)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[] { _f46 };
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:357)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:365)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.ViewTuple.getMemberDefs()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[] { "0" };
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
					case 3 :
						return null;
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:350)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms12() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice((double[]) null, 0);
		Integer t3 = new Integer(0);
		Integer t4 = new Integer("0");
		_f46 = new ViewTuple((Integer) null, (String[]) null);
		Integer t6 = new Integer("0");
		PafBorder t7 = new PafBorder(0);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean((String) null);
		PafNumberFormat t10 = new PafNumberFormat((String) null, (String) null);
		Short t11 = new Short((short) -32768);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean((String) null);
		Boolean t14 = new Boolean((String) null);
		PafStyle t15 = new PafStyle();
		PafStyle t16 = new PafStyle();
		Integer t17 = new Integer(0);
		PafAlignment t18 = new PafAlignment();
		Boolean t19 = new Boolean(false);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean((String) null);
		Boolean t22 = new Boolean((String) null);
		Boolean t23 = new Boolean(false);
		PafBorder t24 = new PafBorder();
		Integer t25 = new Integer(0);
		Integer t26 = new Integer("0");
		_f47 = new ViewTuple();
		Integer t28 = new Integer("0");
		PafBorder t29 = new PafBorder(0);
		Boolean t30 = new Boolean(false);
		Boolean t31 = new Boolean((String) null);
		PafNumberFormat t32 = new PafNumberFormat();
		Short t33 = new Short("0");
		Boolean t34 = new Boolean((String) null);
		Boolean t35 = new Boolean(false);
		Boolean t36 = new Boolean(false);
		PafStyle t37 = new PafStyle();
		PafStyle t38 = new PafStyle();
		Integer t39 = new Integer(0);
		PafAlignment t40 = new PafAlignment();
		Boolean t41 = new Boolean((String) null);
		Boolean t42 = new Boolean((String) null);
		Boolean t43 = new Boolean(false);
		Boolean t44 = new Boolean(false);
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(false);
		t1.setPrimaryFormattingAxis(0);
		t1.setReadOnly(false);
		String[] var3 = new String[] {};
		t1.setColAxisDims(var3);
		PageTuple[] var4 = new PageTuple[] {};
		t1.setPageTuples(var4);
		String[] var5 = new String[] {};
		t1.setRowAxisDims(var5);
		t1.setLeftOffset(0);
		t1.setTopOffset(0);
		PafViewHeader[] var6 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var6);
		LockedCell[] var7 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var8);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		_f46.setAxis(t6);
		t7.setBorder(0);
		_f46.setBorder(t7);
		_f46.setDrillable(t8);
		_f46.setExpanded(t9);
		String[] var9 = new String[] {};
		_f46.setMemberDefs(var9);
		t10.setName("");
		t10.setPattern("");
		t10.setDefaultFormat(false);
		_f46.setNumberFormat(t10);
		_f46.setOrder(t11);
		_f46.setOverrideLabel("");
		_f46.setParentFirst(t12);
		_f46.setPlannable(t13);
		_f46.setVisible(t14);
		_f46.setDataGlobalStyleName("");
		_f46.setDataStyle(t15);
		_f46.setHeaderGlobalStyleName("");
		t16.setSize(t17);
		t16.setAlignment(t18);
		t16.setBgFillColor("");
		t16.setFontColor("");
		t16.setFontName("");
		t16.setName("");
		t16.setBold(t19);
		t16.setDoubleUnderline(t20);
		t16.setItalics(t21);
		t16.setStrikeOut(t22);
		t16.setUnderline(t23);
		_f46.setHeaderStyle(t16);
		_f46.setNumberFormatOverrideLabel("");
		t24.setBorder(0);
		_f46.setHeaderBorder(t24);
		_f46.setColumnWidth(t25);
		_f46.setRowHeight(t26);
		Integer[] var10 = new Integer[] {};
		_f46.setSymetricGroupNo(var10);
		Integer[] var11 = new Integer[] {};
		_f46.setDerivedHeaderGroupNo(var11);
		_f47.setAxis(t28);
		_f47.setBorder(t29);
		_f47.setDrillable(t30);
		_f47.setExpanded(t31);
		String[] var12 = new String[] {};
		_f47.setMemberDefs(var12);
		_f47.setNumberFormat(t32);
		_f47.setOrder(t33);
		_f47.setOverrideLabel("");
		_f47.setParentFirst(t34);
		_f47.setPlannable(t35);
		_f47.setVisible(t36);
		_f47.setDataGlobalStyleName("");
		_f47.setDataStyle(t37);
		_f47.setHeaderGlobalStyleName("");
		t38.setSize(t39);
		t40.setValue("");
		t38.setAlignment(t40);
		t38.setBgFillColor("");
		t38.setFontColor("");
		t38.setFontName("");
		t38.setName("");
		t38.setBold(t41);
		t38.setDoubleUnderline(t42);
		t38.setItalics(t43);
		t38.setStrikeOut(t44);
		Boolean var13 = (Boolean) Stubs.makeStubObject(Boolean.class);
		t38.setUnderline(var13);
		_f47.setHeaderStyle(t38);
		_f47.setNumberFormatOverrideLabel("");
		PafBorder var14 = (PafBorder) Stubs.makeStubObject(PafBorder.class);
		_f47.setHeaderBorder(var14);
		Integer var15 = (Integer) Stubs.makeStubObject(Integer.class);
		_f47.setColumnWidth(var15);
		Integer var16 = (Integer) Stubs.makeStubObject(Integer.class);
		_f47.setRowHeight(var16);
		Integer[] var17 = new Integer[] {};
		_f47.setSymetricGroupNo(var17);
		Integer[] var18 = new Integer[] {};
		_f47.setDerivedHeaderGroupNo(var18);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:358)
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[] { _f46, _f47,
						(ViewTuple) Stubs.makeStubObject(ViewTuple.class) };
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[] { (ViewTuple) Stubs
					.makeStubObject(ViewTuple.class) };
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:357)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.ViewTuple.getMemberDefs()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[] { "PAFBLANK" };
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
					case 3 :
					case 4 :
					case 6 :
					case 7 :
						return new String[] { "0" };
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:349)
					case 5 :
					case 8 :
					case 9 :
						return null;
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:350)
					// 
					// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:358)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms23() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(7);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t2.setColumnCount(7);
		double[] var3 = new double[] {};
		t2.setData(var3);
		t2.setCompressedData("");
		t2.setCompressed(true);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(true);
		t1.setPrimaryFormattingAxis(7);
		t1.setReadOnly(true);
		String[] var4 = new String[] {};
		t1.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] {};
		t1.setPageTuples(var5);
		String[] var6 = new String[] {};
		t1.setRowAxisDims(var6);
		t1.setLeftOffset(7);
		t1.setTopOffset(7);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var9);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertNotNull(RETVAL.getRowTuples()); // jtest_unverified
		assertEquals(0, RETVAL.getRowTuples().length); // jtest_unverified
		assertNotNull(RETVAL.getColTuples()); // jtest_unverified
		assertEquals(0, RETVAL.getColTuples().length); // jtest_unverified
		assertNotNull(RETVAL.getPageDimensions()); // jtest_unverified
		assertEquals(0, RETVAL.getPageDimensions().length); // jtest_unverified
		assertNotNull(RETVAL.getPageMembers()); // jtest_unverified
		assertEquals(0, RETVAL.getPageMembers().length); // jtest_unverified
		assertEquals(var6, RETVAL.getRowDimensions()); // jtest_unverified
		assertEquals(var4, RETVAL.getColDimensions()); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[0];
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#buildDataSliceParms(com.palladium.paf.view.PafViewSection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testBuildDataSliceParms24() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafViewSection t1 = new PafViewSection();
		PafDataSlice t2 = new PafDataSlice();
		Integer t3 = new Integer(7);
		Integer t4 = new Integer("0");
		t1.setDescription("");
		t1.setName("");
		ViewTuple[] var1 = new ViewTuple[] {};
		t1.setColTuples(var1);
		ViewTuple[] var2 = new ViewTuple[] {};
		t1.setRowTuples(var2);
		t2.setColumnCount(7);
		double[] var3 = new double[] {};
		t2.setData(var3);
		t2.setCompressedData("");
		t2.setCompressed(true);
		t1.setPafDataSlice(t2);
		t1.setDataAlias("");
		t1.setManaged(true);
		t1.setPrimaryFormattingAxis(7);
		t1.setReadOnly(true);
		String[] var4 = new String[] {};
		t1.setColAxisDims(var4);
		PageTuple[] var5 = new PageTuple[] {};
		t1.setPageTuples(var5);
		String[] var6 = new String[] {};
		t1.setRowAxisDims(var6);
		t1.setLeftOffset(7);
		t1.setTopOffset(7);
		PafViewHeader[] var7 = new PafViewHeader[] {};
		t1.setPafViewHeaders(var7);
		LockedCell[] var8 = new LockedCell[] {};
		t1.setForwardPlannableLockedCell(var8);
		LockedCell[] var9 = new LockedCell[] {};
		t1.setNotPlannableLockedCells(var9);
		t1.setGenerationFormatName("");
		t1.setColumnWidth(t3);
		t1.setRowHeight(t4);
		// jtest_tested_method
		PafDataSliceParms RETVAL = THIS.buildDataSliceParms(t1);
		assertNotNull(RETVAL); // jtest_unverified
		assertNotNull(RETVAL.getRowTuples()); // jtest_unverified
		assertEquals(0, RETVAL.getRowTuples().length); // jtest_unverified
		assertNotNull(RETVAL.getColTuples()); // jtest_unverified
		assertEquals(0, RETVAL.getColTuples().length); // jtest_unverified
		assertNotNull(RETVAL.getPageDimensions()); // jtest_unverified
		assertEquals(0, RETVAL.getPageDimensions().length); // jtest_unverified
		assertNotNull(RETVAL.getPageMembers()); // jtest_unverified
		assertEquals(0, RETVAL.getPageMembers().length); // jtest_unverified
		assertEquals(var6, RETVAL.getRowDimensions()); // jtest_unverified
		assertEquals(var4, RETVAL.getColDimensions()); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testBuildDataSliceParms24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsBuildDataSliceParms24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:348)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getColTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:357)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPageTuples", argument_types)) {
				return new PageTuple[0];
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:365)
				// 
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:366)
				// 
				// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:367)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: clearMemberTreeCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#clearMemberTreeCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClearMemberTreeCache1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		THIS.clearMemberTreeCache();
		// ExceptionInInitializerError thrown
		// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:97)
		// jtest_unverified
	}

	/**
	 * Stubs method for testClearMemberTreeCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClearMemberTreeCache1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: clearMemberTreeCache()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#clearMemberTreeCache()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClearMemberTreeCache2() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(true);
		_f0.setEvaluationStepLogging(true);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(true);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.clearMemberTreeCache();
		// NoClassDefFoundError thrown
		// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
		// jtest_unverified
	}

	/**
	 * Stubs method for testClearMemberTreeCache2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsClearMemberTreeCache2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "clearDataCache", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at org.hibernate.cfg.Environment.verifyProperties(Environment.java:457)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:504)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.PafDataService.clearMemberTreeCache(PafDataService.java:381)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: clearMemberTreeStore()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#clearMemberTreeStore()
	 * @author Parasoft Jtest 8.0
	 */
	public void testClearMemberTreeStore1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.clearMemberTreeStore();
		// jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: evaluateDefaultRuleset(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#evaluateDefaultRuleset(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluateDefaultRuleset1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.evaluateDefaultRuleset((PafClientState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.evaluateDefaultRuleset(Lcom/palladium/paf/state/PafClientState;)V>
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:97)
		// at com.palladium.paf.server.PafDataService.evaluateDefaultRuleset(PafDataService.java:1079)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvaluateDefaultRuleset1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvaluateDefaultRuleset1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
				// at com.palladium.paf.server.PafDataService.evaluateDefaultRuleset(PafDataService.java:1077)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: evaluateDefaultRuleset(com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#evaluateDefaultRuleset(com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluateDefaultRuleset2() throws Throwable {
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.evaluateDefaultRuleset(t2);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:99)
		// at com.palladium.paf.server.PafDataService.evaluateDefaultRuleset(PafDataService.java:1079)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvaluateDefaultRuleset2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvaluateDefaultRuleset2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.eval.ES_EvalBase.<init>(ES_EvalBase.java:47)
				// at com.palladium.paf.eval.ES_EvalStdRulegroup.<init>(ES_EvalStdRulegroup.java:48)
				// at com.palladium.paf.eval.RuleBasedEvalStrategy.<init>(RuleBasedEvalStrategy.java:61)
				// at com.palladium.paf.server.PafDataService.evaluateDefaultRuleset(PafDataService.java:1077)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluateView1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.evaluateView(
			(EvaluateViewRequest) null,
			(PafClientState) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.evaluateView(Lcom/palladium/paf/comm/EvaluateViewRequest;Lcom/palladium/paf/state/PafClientState;)Lcom/palladium/paf/data/PafDataSlice;>
		// at com.palladium.paf.server.PafDataService.evaluateView(PafDataService.java:1096)
		// jtest_unverified
	}

	/**
	 * Test for method: evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluateView3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		EvaluateViewRequest t1 = new EvaluateViewRequest();
		ClientInitRequest t2 = new ClientInitRequest();
		PafClientState t3 = new PafClientState((String) null, t2);
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.evaluateView(t1, t3);
		// ClassCastException thrown
		// at com.palladium.paf.state.PafClientState.getView(PafClientState.java:133)
		// at com.palladium.paf.server.PafDataService.evaluateView(PafDataService.java:1096)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvaluateView3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvaluateView3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.state.PafClientState.getView(PafClientState.java:133)
				// at com.palladium.paf.server.PafDataService.evaluateView(PafDataService.java:1096)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#evaluateView(com.palladium.paf.comm.EvaluateViewRequest,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testEvaluateView4() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		EvaluateViewRequest t1 = new EvaluateViewRequest();
		SimpleCoordList t2 = new SimpleCoordList();
		PafDataSlice t3 = new PafDataSlice();
		SimpleCoordList t4 = new SimpleCoordList();
		SimpleCoordList t5 = new SimpleCoordList();
		ClientInitRequest t6 = new ClientInitRequest();
		PafClientState t7 = new PafClientState((String) null, t6);
		String[] var1 = new String[] {};
		t1.setProtectedFormulas(var1);
		t1.setChangedCells(t2);
		t1.setDataSlice(t3);
		String[] var2 = new String[] {};
		t4.setAxis(var2);
		String[] var3 = new String[] {};
		t4.setCoordinates(var3);
		t1.setLockedCells(t4);
		t1.setProtectedCells(t5);
		t1.setMeasureSetKey(0);
		t1.setViewName("");
		t1.setRuleSetName("");
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.evaluateView(t1, t7);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.evaluateView(PafDataService.java:1097)
		// jtest_unverified
	}

	/**
	 * Stubs method for testEvaluateView4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsEvaluateView4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.state.PafClientState.getView(PafClientState.java:133)
				// at com.palladium.paf.server.PafDataService.evaluateView(PafDataService.java:1096)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandTuples(com.palladium.paf.view.ViewTuple[],java.lang.String[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandTuples(com.palladium.paf.view.ViewTuple[],java.lang.String[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandTuples1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		ViewTuple[] var1 = new ViewTuple[] {};
		String[] var2 = new String[] {};
		// jtest_tested_method
		ViewTuple[] RETVAL = THIS.expandTuples(var1, var2, "");
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandTuples1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandTuples1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandTuples(com.palladium.paf.view.ViewTuple[],java.lang.String[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandTuples(com.palladium.paf.view.ViewTuple[],java.lang.String[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandTuples2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		ViewTuple[] var1 = new ViewTuple[] {};
		String[] var2 = new String[] {};
		// jtest_tested_method
		ViewTuple[] RETVAL = THIS.expandTuples(var1, var2, "");
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(0, RETVAL.length); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandTuples2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandTuples2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafView RETVAL = THIS.expandView((PafView) null, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.expandView(Lcom/palladium/paf/view/PafView;Ljava/lang/String;)Lcom/palladium/paf/view/PafView;>
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:627)
		// jtest_unverified
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView2() throws Throwable {
		PafView t1 = new PafView();
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:628)
		// jtest_unverified
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView3() throws Throwable {
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// jtest_unverified
		assertEquals(t1, RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				return new PafViewSection[0];
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView5() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		assertEquals(t1, RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				return new PafViewSection[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:628)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getName", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:636)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView6() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { null };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView7() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f45 = new PafViewSection();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:856)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				return new PafViewSection[] { _f45 };
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:628)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView8() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:862)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView9() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		_f45 = new PafViewSection();
		PafDataSlice t5 = new PafDataSlice((double[]) null, 0);
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] {};
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		_f45.setDescription("");
		_f45.setName("");
		ViewTuple[] var5 = new ViewTuple[] {};
		_f45.setColTuples(var5);
		ViewTuple[] var6 = new ViewTuple[] {};
		_f45.setRowTuples(var6);
		_f45.setPafDataSlice(t5);
		_f45.setDataAlias("");
		_f45.setManaged(false);
		_f45.setPrimaryFormattingAxis(0);
		_f45.setReadOnly(false);
		String[] var7 = new String[] {};
		_f45.setColAxisDims(var7);
		PageTuple[] var8 = new PageTuple[] {};
		_f45.setPageTuples(var8);
		String[] var9 = new String[] {};
		_f45.setRowAxisDims(var9);
		_f45.setLeftOffset(0);
		_f45.setTopOffset(0);
		PafViewHeader[] var10 = new PafViewHeader[] {};
		_f45.setPafViewHeaders(var10);
		LockedCell[] var11 = new LockedCell[] {};
		_f45.setForwardPlannableLockedCell(var11);
		LockedCell[] var12 = new LockedCell[] {};
		_f45.setNotPlannableLockedCells(var12);
		_f45.setGenerationFormatName("");
		_f45.setColumnWidth(t6);
		_f45.setRowHeight(t7);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.generateHeaderGroupNo(PafDataService.java:785)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:631)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView9(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafView.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getViewSections", argument_types)) {
				return new PafViewSection[] { _f45 };
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:628)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafViewSection.getRowTuples()");
				switch (index) {
					case 1 :
					case 2 :
						return new ViewTuple[0];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
						return null;
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafViewSection.getRowAxisDims()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[1];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
						return null;
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { ViewTuple[].class };
			if (Stubs.matches(method, "setRowTuples", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView10() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandTuple(PafDataService.java:921)
		// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:872)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView10(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[1];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[2];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:871)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:871)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView19() throws Throwable {
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		_f46 = new ViewTuple();
		Integer t6 = new Integer(0);
		PafBorder t7 = new PafBorder(0);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafNumberFormat t10 = new PafNumberFormat((String) null, (String) null);
		Short t11 = new Short((short) -32768);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean((String) null);
		Boolean t14 = new Boolean((String) null);
		PafStyle t15 = new PafStyle();
		PafStyle t16 = new PafStyle();
		Integer t17 = new Integer("0");
		PafAlignment t18 = new PafAlignment();
		Boolean t19 = new Boolean(false);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean((String) null);
		Boolean t22 = new Boolean((String) null);
		Boolean t23 = new Boolean(false);
		PafBorder t24 = new PafBorder(0);
		Integer t25 = new Integer("0");
		Integer t26 = new Integer(0);
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		_f46.setAxis(t6);
		_f46.setBorder(t7);
		_f46.setDrillable(t8);
		_f46.setExpanded(t9);
		String[] var5 = new String[] {};
		_f46.setMemberDefs(var5);
		_f46.setNumberFormat(t10);
		_f46.setOrder(t11);
		_f46.setOverrideLabel("");
		_f46.setParentFirst(t12);
		_f46.setPlannable(t13);
		_f46.setVisible(t14);
		_f46.setDataGlobalStyleName("");
		_f46.setDataStyle(t15);
		_f46.setHeaderGlobalStyleName("");
		t16.setSize(t17);
		t16.setAlignment(t18);
		t16.setBgFillColor("");
		t16.setFontColor("");
		t16.setFontName("");
		t16.setName("");
		t16.setBold(t19);
		t16.setDoubleUnderline(t20);
		t16.setItalics(t21);
		t16.setStrikeOut(t22);
		t16.setUnderline(t23);
		_f46.setHeaderStyle(t16);
		_f46.setNumberFormatOverrideLabel("");
		t24.setBorder(0);
		_f46.setHeaderBorder(t24);
		_f46.setColumnWidth(t25);
		_f46.setRowHeight(t26);
		Integer[] var6 = new Integer[] {};
		_f46.setSymetricGroupNo(var6);
		Integer[] var7 = new Integer[] {};
		_f46.setDerivedHeaderGroupNo(var7);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
		// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView19(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafViewSection.getRowTuples()");
				switch (index) {
					case 1 :
					case 2 :
						return new ViewTuple[10];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
						return null;
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
				// 
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
			}
			argument_types = new Class[] { ViewTuple[].class };
			if (Stubs.matches(method, "setRowTuples", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 2 :
						return Boolean.FALSE;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f46;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView20() throws Throwable {
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		_f46 = new ViewTuple();
		Integer t6 = new Integer(0);
		PafBorder t7 = new PafBorder(0);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafNumberFormat t10 = new PafNumberFormat((String) null, (String) null);
		Short t11 = new Short((short) -32768);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean((String) null);
		Boolean t14 = new Boolean((String) null);
		PafStyle t15 = new PafStyle();
		PafStyle t16 = new PafStyle();
		Integer t17 = new Integer("0");
		PafAlignment t18 = new PafAlignment();
		Boolean t19 = new Boolean(false);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean((String) null);
		Boolean t22 = new Boolean((String) null);
		Boolean t23 = new Boolean(false);
		PafBorder t24 = new PafBorder(0);
		Integer t25 = new Integer("0");
		Integer t26 = new Integer(0);
		_f47 = new ViewTuple();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		_f46.setAxis(t6);
		_f46.setBorder(t7);
		_f46.setDrillable(t8);
		_f46.setExpanded(t9);
		String[] var5 = new String[] {};
		_f46.setMemberDefs(var5);
		_f46.setNumberFormat(t10);
		_f46.setOrder(t11);
		_f46.setOverrideLabel("");
		_f46.setParentFirst(t12);
		_f46.setPlannable(t13);
		_f46.setVisible(t14);
		_f46.setDataGlobalStyleName("");
		_f46.setDataStyle(t15);
		_f46.setHeaderGlobalStyleName("");
		t16.setSize(t17);
		t16.setAlignment(t18);
		t16.setBgFillColor("");
		t16.setFontColor("");
		t16.setFontName("");
		t16.setName("");
		t16.setBold(t19);
		t16.setDoubleUnderline(t20);
		t16.setItalics(t21);
		t16.setStrikeOut(t22);
		t16.setUnderline(t23);
		_f46.setHeaderStyle(t16);
		_f46.setNumberFormatOverrideLabel("");
		t24.setBorder(0);
		_f46.setHeaderBorder(t24);
		_f46.setColumnWidth(t25);
		_f46.setRowHeight(t26);
		Integer[] var6 = new Integer[] {};
		_f46.setSymetricGroupNo(var6);
		Integer[] var7 = new Integer[] {};
		_f46.setDerivedHeaderGroupNo(var7);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:856)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:632)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView20(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				return new ViewTuple[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f46;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 2 :
						return _f47;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.ViewTuple.getMemberDefs()");
				switch (index) {
					case 1 :
					case 2 :
						return new String[0];
					// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
					case 4 :
						return new String[1];
					// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView23() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer(0);
		Integer t3 = new Integer("0");
		PafViewSection t4 = new PafViewSection();
		_f46 = new ViewTuple();
		Integer t6 = new Integer(0);
		PafBorder t7 = new PafBorder(0);
		Boolean t8 = new Boolean(false);
		Boolean t9 = new Boolean(false);
		PafNumberFormat t10 = new PafNumberFormat((String) null, (String) null);
		Short t11 = new Short((short) -32768);
		Boolean t12 = new Boolean(false);
		Boolean t13 = new Boolean(false);
		Boolean t14 = new Boolean((String) null);
		PafStyle t15 = new PafStyle();
		PafStyle t16 = new PafStyle();
		Integer t17 = new Integer("0");
		PafAlignment t18 = new PafAlignment();
		Boolean t19 = new Boolean(false);
		Boolean t20 = new Boolean(false);
		Boolean t21 = new Boolean(false);
		Boolean t22 = new Boolean(false);
		Boolean t23 = new Boolean((String) null);
		PafBorder t24 = new PafBorder(0);
		Integer t25 = new Integer("0");
		Integer t26 = new Integer(0);
		_f47 = new ViewTuple();
		_f48 = new ViewTuple();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		_f46.setAxis(t6);
		_f46.setBorder(t7);
		_f46.setDrillable(t8);
		_f46.setExpanded(t9);
		String[] var5 = new String[] {};
		_f46.setMemberDefs(var5);
		t10.setName("");
		t10.setPattern("");
		t10.setDefaultFormat(false);
		_f46.setNumberFormat(t10);
		_f46.setOrder(t11);
		_f46.setOverrideLabel("");
		_f46.setParentFirst(t12);
		_f46.setPlannable(t13);
		_f46.setVisible(t14);
		_f46.setDataGlobalStyleName("");
		_f46.setDataStyle(t15);
		_f46.setHeaderGlobalStyleName("");
		t16.setSize(t17);
		t18.setValue("");
		t16.setAlignment(t18);
		t16.setBgFillColor("");
		t16.setFontColor("");
		t16.setFontName("");
		t16.setName("");
		t16.setBold(t19);
		t16.setDoubleUnderline(t20);
		t16.setItalics(t21);
		t16.setStrikeOut(t22);
		t16.setUnderline(t23);
		_f46.setHeaderStyle(t16);
		_f46.setNumberFormatOverrideLabel("");
		t24.setBorder(0);
		_f46.setHeaderBorder(t24);
		_f46.setColumnWidth(t25);
		_f46.setRowHeight(t26);
		Integer[] var6 = new Integer[] {};
		_f46.setSymetricGroupNo(var6);
		Integer[] var7 = new Integer[] {};
		_f46.setDerivedHeaderGroupNo(var7);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.generateHeaderGroupNo(PafDataService.java:819)
		// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:631)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView23(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafViewSection.getRowTuples()");
				switch (index) {
					case 1 :
					case 2 :
						return new ViewTuple[0];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
					case 4 :
						return new ViewTuple[1];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
				// 
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
			}
			argument_types = new Class[] { ViewTuple[].class };
			if (Stubs.matches(method, "setRowTuples", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
					case 2 :
					case 3 :
						return Boolean.TRUE;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 4 :
						return Boolean.FALSE;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return _f46;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 2 :
						return _f47;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
						return _f48;
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:879)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.ViewTuple.getMemberDefs()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 2 :
					case 3 :
					case 6 :
					case 7 :
						return new String[] { "0", "PAFBLANK" };
					// at com.palladium.paf.server.PafDataService.isBlankViewTuple(PafDataService.java:902)
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:881)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 4 :
					case 5 :
					case 8 :
					case 9 :
						return new String[0];
					// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:883)
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String[].class };
			if (Stubs.matches(method, "setMemberDefs", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:889)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#expandView(com.palladium.paf.view.PafView,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testExpandView54() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		PafView t1 = new PafView();
		Integer t2 = new Integer("0");
		Integer t3 = new Integer(0);
		PafViewSection t4 = new PafViewSection();
		PafDataSlice t5 = new PafDataSlice((double[]) null, 0);
		Integer t6 = new Integer(0);
		Integer t7 = new Integer("0");
		_f46 = new ViewTuple();
		t1.setDesc("");
		PafViewHeader[] var1 = new PafViewHeader[] {};
		t1.setHeaders(var1);
		t1.setName("");
		PafViewSection[] var2 = new PafViewSection[] { t4 };
		t1.setViewSections(var2);
		t1.setBackGroundColor("");
		PafUserSelection[] var3 = new PafUserSelection[] {};
		t1.setUserSelections(var3);
		String[] var4 = new String[] {};
		t1.setViewSectionNames(var4);
		t1.setPageOrientation("");
		t1.setPagesTall(t2);
		t1.setPagesWide(t3);
		t4.setDescription("");
		t4.setName("");
		ViewTuple[] var5 = new ViewTuple[] {};
		t4.setColTuples(var5);
		ViewTuple[] var6 = new ViewTuple[] {};
		t4.setRowTuples(var6);
		t4.setPafDataSlice(t5);
		t4.setDataAlias("");
		t4.setManaged(false);
		t4.setPrimaryFormattingAxis(0);
		t4.setReadOnly(false);
		String[] var7 = new String[] {};
		t4.setColAxisDims(var7);
		PageTuple[] var8 = new PageTuple[] {};
		t4.setPageTuples(var8);
		String[] var9 = new String[] {};
		t4.setRowAxisDims(var9);
		t4.setLeftOffset(0);
		t4.setTopOffset(0);
		PafViewHeader[] var10 = new PafViewHeader[] {};
		t4.setPafViewHeaders(var10);
		LockedCell[] var11 = new LockedCell[] {};
		t4.setForwardPlannableLockedCell(var11);
		LockedCell[] var12 = new LockedCell[] {};
		t4.setNotPlannableLockedCells(var12);
		t4.setGenerationFormatName("");
		t4.setColumnWidth(t6);
		t4.setRowHeight(t7);
		// jtest_tested_method
		PafView RETVAL = THIS.expandView(t1, (String) null);
		assertEquals(t1, RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testExpandView54.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExpandView54(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, PafViewSection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowTuples", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.view.PafViewSection.getRowTuples()");
				switch (index) {
					case 1 :
					case 2 :
						return new ViewTuple[0];
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
					case 3 :
					case 4 :
						return new ViewTuple[] { _f46 };
					// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRowAxisDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
				// 
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
			}
			argument_types = new Class[] { ViewTuple[].class };
			if (Stubs.matches(method, "setRowTuples", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.PafDataService.expandTuples(PafDataService.java:871)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:629)
			}
		}
		if (Stubs.matches(method, ViewTuple.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getSymetricGroupNo", argument_types)) {
				return new Integer[0];
				// at com.palladium.paf.server.PafDataService.sortTuples(PafDataService.java:698)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMemberDefs", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.sortTuples(PafDataService.java:725)
				// at com.palladium.paf.server.PafDataService.expandView(PafDataService.java:630)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return "";
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis3() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis4() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.TRUE;
					case 2 :
						return Boolean.FALSE;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis5() throws Throwable {
		PafMember t2 = new PafMember((String) null);
		_f4 = new PafMemberTree(t2, (String[]) null);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.next()");
				switch (index) {
					case 1 :
						return Repository.getObject(
							PafMemberTree.class,
							"TimeTree");
					case 2 :
						return _f4;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
			}
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "hasMember", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis6() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis((String) null);
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: findMemberAxis(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#findMemberAxis(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindMemberAxis8() throws Throwable {
		_f0 = new ServerSettings();
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		String RETVAL = THIS.findMemberAxis("");
		// jtest_unverified
		assertEquals("", RETVAL); // jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindMemberAxis8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindMemberAxis8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getChildren(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		List RETVAL = THIS.getChildren((String) null, (String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getChildren(PafDataService.java:603)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getChildren(PafDataService.java:603)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getChildren(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren2() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		List RETVAL = THIS.getChildren((String) null, (String) null);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getChildren(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren3() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		_f4 = new PafMemberTree(t1, (String[]) null);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		List RETVAL = THIS.getChildren((String) null, (String) null);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
			}
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMember", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getChildren(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren4() throws Throwable {
		PafMember t1 = new PafMember((String) null);
		_f4 = new PafMemberTree(t1, (String[]) null);
		_f5 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t5 = new ListMock(var1);
		PafMember t6 = new PafMember((String) null);
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember();
		_f5.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f5.setChildren(t5);
		JT.invoke(
			PafMember.class,
			_f5,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		JT.invoke(
			PafMember.class,
			t6,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			t6,
			"setParent",
			new Object[] { t9 },
			new Class[] { PafMember.class });
		JT.invoke(
			PafMember.class,
			_f5,
			"setParent",
			new Object[] { t6 },
			new Class[] { PafMember.class });
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		List RETVAL = THIS.getChildren((String) null, (String) null);
		// jtest_unverified
		assertEquals(t5, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f4;
			}
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMember", argument_types)) {
				return _f5;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getChildren(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getChildren(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetChildren5() throws Throwable {
		PafMember t1 = new PafMember("");
		Object[] var1 = new Object[] {};
		_f1 = new ListMock(var1);
		Object[] var2 = new Object[] {};
		_f36 = new ListMock(var2);
		String[] var3 = new String[] {};
		_f4 = new PafMemberTree(t1, var3, 7);
		PafMember t7 = new PafMember();
		JT.invoke(
			PafMemberTree.class,
			_f4,
			"setRoot",
			new Object[] { t7 },
			new Class[] { PafMember.class });
		String[] var4 = new String[] {};
		_f4.setAliasTableNames(var4);
		_f4.setId("");
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		List RETVAL = THIS.getChildren("", "");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("[]", _f1.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetChildren5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetChildren5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f4;
					case 2 :
						return null;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
			}
		}
		if (Stubs.matches(method, PafMember.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getPafMemberAttr", argument_types)) {
				return Repository.getObject(
					PafMemberAttr.class,
					"PafMemberAttr");
			}
		}
		if (Stubs.matches(method, TreeMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f1;
					case 2 :
						return _f36;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getDataCache(PafDataService.java:232)
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
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getDataCache(PafDataService.java:232)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache2() throws Throwable {
		_f0 = new ServerSettings();
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache("");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
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
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache4() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache("");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCache5() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafDataCache RETVAL = THIS.getDataCache((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.getDataCache(Ljava/lang/String;)Lcom/palladium/paf/mdb/PafDataCache;>
		// at java.util.concurrent.ConcurrentHashMap.hash
		// at java.util.concurrent.ConcurrentHashMap.get
		// at com.palladium.paf.server.PafDataService.getDataCache(PafDataService.java:232)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCache5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCache5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheCnt()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheCnt()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheCnt1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		int RETVAL = THIS.getDataCacheCnt();
		// jtest_unverified
		assertEquals(0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheCnt1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheCnt1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheSubTree1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getDataCacheSubTree(
			(String) null,
			(String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheSubTree1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheSubTree1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheSubTree2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getDataCacheSubTree(
			(String) null,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheSubTree2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheSubTree2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheSubTree(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheSubTree4() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getDataCacheSubTree(
			(String) null,
			(String) null);
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheSubTree4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheSubTree4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
					case 2 :
						return null;
					// at com.palladium.paf.server.PafDataService.getDataCacheSubTree(PafDataService.java:191)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheTrees(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheTrees(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheTrees1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		MemberTreeSet RETVAL = THIS.getDataCacheTrees((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getDataCacheTrees(PafDataService.java:258)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheTrees1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheTrees1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getDataCacheTrees(PafDataService.java:258)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheTrees(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheTrees(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheTrees2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		MemberTreeSet RETVAL = THIS.getDataCacheTrees((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getDataCacheTrees(PafDataService.java:261)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheTrees2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheTrees2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getDataCacheTrees(PafDataService.java:258)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataCacheTrees(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataCacheTrees(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataCacheTrees3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		MemberTreeSet RETVAL = THIS.getDataCacheTrees((String) null);
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataCacheTrees3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataCacheTrees3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Map.class);
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSlice1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getDataSlice(
			(PafView) null,
			(PafViewSection) null,
			(PafClientState) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.server.PafDataService.getDataSlice(Lcom/palladium/paf/view/PafView;Lcom/palladium/paf/view/PafViewSection;Lcom/palladium/paf/state/PafClientState;)Lcom/palladium/paf/data/PafDataSlice;>
		// at com.palladium.paf.server.PafDataService.getDataSlice(PafDataService.java:283)
		// jtest_unverified
	}

	/**
	 * Test for method: getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSlice2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getDataSlice(
			(PafView) null,
			(PafViewSection) null,
			t2);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.server.PafDataService.getDataSlice(PafDataService.java:288)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataSlice2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataSlice2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getDataCache(PafDataService.java:232)
				// at com.palladium.paf.server.PafDataService.getDataSlice(PafDataService.java:284)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getDataSlice(com.palladium.paf.view.PafView,com.palladium.paf.view.PafViewSection,com.palladium.paf.state.PafClientState)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDataSlice3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		// jtest_tested_method
		PafDataSlice RETVAL = THIS.getDataSlice(
			(PafView) null,
			(PafViewSection) null,
			t2);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.PafDataService.getDataSlice(Lcom/palladium/paf/view/PafView;Lcom/palladium/paf/view/PafViewSection;Lcom/palladium/paf/state/PafClientState;)Lcom/palladium/paf/data/PafDataSlice;>
		// at com.palladium.paf.server.PafDataService.buildDataSliceParms(PafDataService.java:339)
		// at com.palladium.paf.server.PafDataService.getDataSlice(PafDataService.java:291)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDataSlice3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDataSlice3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getDataCache(PafDataService.java:232)
				// at com.palladium.paf.server.PafDataService.getDataSlice(PafDataService.java:284)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInstance()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getInstance()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInstance1() throws Throwable {
		// jtest_tested_method
		PafDataService RETVAL = PafDataService.getInstance();
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertNotNull(RETVAL.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", RETVAL.getMemberIndexLists().toString()); // jtest_unverified
		assertEquals(RETVAL.getMemberIndexLists(), RETVAL.getMemberTrees()); // jtest_unverified
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
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDataProvider1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		IMdbData RETVAL = THIS.getMdbDataProvider((IPafConnectionProps) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.getMdbDataProvider(Lcom/palladium/paf/mdb/IPafConnectionProps;)Lcom/palladium/paf/mdb/IMdbData;>
		// at com.palladium.paf.server.PafDataService.getMdbDataProvider(PafDataService.java:568)
		// jtest_unverified
	}

	/**
	 * Test for method: getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDataProvider2() throws Throwable {
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		IMdbData RETVAL = THIS.getMdbDataProvider(var1);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMdbDataProvider2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMdbDataProvider2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataServiceProvider", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				throw new ClassNotFoundException();
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDataProvider3() throws Throwable {
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		IMdbData RETVAL = THIS.getMdbDataProvider(var1);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMdbDataProvider3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMdbDataProvider3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataServiceProvider", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMdbDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMdbDataProvider4() throws Throwable {
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		IMdbData RETVAL = THIS.getMdbDataProvider(var1);
		// NullPointerException thrown, originator is possible setup problem
		// at java.lang.Class.forName0
		// at java.lang.Class.forName
		// at com.palladium.paf.server.PafDataService.getMdbDataProvider(PafDataService.java:568)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMdbDataProvider4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMdbDataProvider4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataServiceProvider", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMdbDataProvider(PafDataService.java:568)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndexList(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberIndexList(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndexList1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberIndexList((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.server.PafDataService.getMemberIndexList(PafDataService.java:1043)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberIndexList1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberIndexList1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndexList(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberIndexList(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndexList3() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberIndexList((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getMemberIndexList(PafDataService.java:1044)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberIndexList3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberIndexList3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.PafDataService.getMemberIndexList(PafDataService.java:1043)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getMemberIndexList(PafDataService.java:1044)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndexList(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberIndexList(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndexList4() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberIndexList((String) null);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberIndexList4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberIndexList4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndexList(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberIndexList(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndexList7() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberIndexList("");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberIndexList7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberIndexList7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberIndexLists()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberIndexLists()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberIndexLists1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberIndexLists();
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMemberTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberTree1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getMemberTree((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getMemberTree(PafDataService.java:1066)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberTree1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberTree1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getMemberTree(PafDataService.java:1066)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberTree2() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getMemberTree((String) null);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberTree2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberTree2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberTree(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberTree(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberTree3() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafMemberTree RETVAL = THIS.getMemberTree("");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMemberTree3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMemberTree3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMemberTrees()
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMemberTrees()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMemberTrees1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		HashMap RETVAL = THIS.getMemberTrees();
		// jtest_unverified
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen2() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen3() throws Throwable {
		_f2 = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f6 = new MdbDef();
		_f7 = new MdbDef();
		_f3 = new PafApplicationDef();
		_f8 = new MdbDef();
		_f9 = new MdbDef();
		_f10 = new PafApplicationDef();
		_f11 = new MdbDef();
		_f12 = new MdbDef();
		_f13 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f14 = new MdbDef();
		_f15 = new MdbDef();
		_f16 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f17 = new MdbDef();
		_f18 = new MdbDef();
		PafDataService THIS = PafDataService.getInstance();
		_f2.setSeasonList(t1);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t2.setYearDim("");
		String[] var2 = new String[] {};
		t2.setHierDims(var2);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var3 = new String[] {};
		t2.setAxisPriority(var3);
		_f2.setMdbDef(t2);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f6.setYearDim("");
		String[] var6 = new String[] {};
		_f6.setHierDims(var6);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var7 = new String[] {};
		_f6.setAxisPriority(var7);
		_f9.setYearDim("");
		String[] var8 = new String[] {};
		_f9.setHierDims(var8);
		_f9.setMeasureDim("");
		_f9.setPlanTypeDim("");
		_f9.setTimeDim("");
		_f9.setVersionDim("");
		_f9.setDataSourceId("");
		String[] var9 = new String[] {};
		_f9.setAxisPriority(var9);
		_f11.setYearDim("");
		String[] var10 = new String[] {};
		_f11.setHierDims(var10);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var11 = new String[] {};
		_f11.setAxisPriority(var11);
		_f13.setSeasonList(t12);
		_f13.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f13.setPlanCycles(var12);
		_f13.setLastPeriod("");
		_f13.setCurrentYear("");
		_f13.setMdbDef(t13);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setVersions(var14);
		_f14.setYearDim("");
		String[] var15 = new String[] {};
		_f14.setHierDims(var15);
		_f14.setMeasureDim("");
		_f14.setPlanTypeDim("");
		_f14.setTimeDim("");
		_f14.setVersionDim("");
		_f14.setDataSourceId("");
		String[] var16 = new String[] {};
		_f14.setAxisPriority(var16);
		_f15.setYearDim("");
		String[] var17 = new String[] {};
		_f15.setHierDims(var17);
		_f15.setMeasureDim("");
		_f15.setPlanTypeDim("");
		_f15.setTimeDim("");
		_f15.setVersionDim("");
		_f15.setDataSourceId("");
		String[] var18 = new String[] {};
		_f15.setAxisPriority(var18);
		_f16.setSeasonList(t17);
		_f16.setAppId("");
		PlanCycle[] var19 = new PlanCycle[] {};
		_f16.setPlanCycles(var19);
		_f16.setLastPeriod("");
		_f16.setCurrentYear("");
		_f16.setMdbDef(t18);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setVersions(var21);
		_f18.setYearDim("");
		String[] var22 = new String[] {};
		_f18.setHierDims(var22);
		_f18.setMeasureDim("");
		_f18.setPlanTypeDim("");
		_f18.setTimeDim("");
		_f18.setVersionDim("");
		_f18.setDataSourceId("");
		String[] var23 = new String[] {};
		_f18.setAxisPriority(var23);
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2, _f3, _f10, _f13, _f16 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f6;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
						return _f7;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 3 :
						return _f8;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 4 :
						return _f9;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 5 :
						return _f11;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 6 :
						return _f12;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 7 :
						return _f14;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 8 :
						return _f15;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 9 :
						return _f17;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 10 :
						return _f18;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSourceId", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MdbDef.getDataSourceId()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
						return "";
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppContext", argument_types)) {
				return Stubs.makeStubObject(ApplicationContext.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, BeanFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen7() throws Throwable {
		_f5 = new PafMember();
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:177)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen12() throws Throwable {
		_f2 = new PafApplicationDef();
		SeasonList t1 = new SeasonList();
		MdbDef t2 = new MdbDef();
		_f6 = new MdbDef();
		_f7 = new MdbDef();
		_f3 = new PafApplicationDef();
		_f8 = new MdbDef();
		_f9 = new MdbDef();
		_f10 = new PafApplicationDef();
		_f11 = new MdbDef();
		_f12 = new MdbDef();
		_f13 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f14 = new MdbDef();
		_f15 = new MdbDef();
		_f16 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f17 = new MdbDef();
		_f18 = new MdbDef();
		_f19 = new PafApplicationDef();
		SeasonList t22 = new SeasonList();
		MdbDef t23 = new MdbDef();
		_f20 = new MdbDef();
		_f21 = new MdbDef();
		_f22 = new PafApplicationDef();
		_f23 = new MdbDef();
		_f24 = new MdbDef();
		_f25 = new PafApplicationDef();
		SeasonList t30 = new SeasonList();
		MdbDef t31 = new MdbDef();
		_f26 = new MdbDef();
		_f27 = new MdbDef();
		_f28 = new PafApplicationDef();
		SeasonList t35 = new SeasonList();
		MdbDef t36 = new MdbDef();
		_f29 = new MdbDef();
		_f30 = new MdbDef();
		_f31 = new PafApplicationDef();
		SeasonList t40 = new SeasonList();
		MdbDef t41 = new MdbDef();
		_f32 = new MdbDef();
		_f33 = new MdbDef();
		PafDataService THIS = PafDataService.getInstance();
		_f2.setSeasonList(t1);
		_f2.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		_f2.setPlanCycles(var1);
		_f2.setLastPeriod("");
		_f2.setCurrentYear("");
		t2.setYearDim("");
		String[] var2 = new String[] {};
		t2.setHierDims(var2);
		t2.setMeasureDim("");
		t2.setPlanTypeDim("");
		t2.setTimeDim("");
		t2.setVersionDim("");
		t2.setDataSourceId("");
		String[] var3 = new String[] {};
		t2.setAxisPriority(var3);
		_f2.setMdbDef(t2);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f2.setVersions(var5);
		_f6.setYearDim("");
		String[] var6 = new String[] {};
		_f6.setHierDims(var6);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var7 = new String[] {};
		_f6.setAxisPriority(var7);
		_f9.setYearDim("");
		String[] var8 = new String[] {};
		_f9.setHierDims(var8);
		_f9.setMeasureDim("");
		_f9.setPlanTypeDim("");
		_f9.setTimeDim("");
		_f9.setVersionDim("");
		_f9.setDataSourceId("");
		String[] var9 = new String[] {};
		_f9.setAxisPriority(var9);
		_f11.setYearDim("");
		String[] var10 = new String[] {};
		_f11.setHierDims(var10);
		_f11.setMeasureDim("");
		_f11.setPlanTypeDim("");
		_f11.setTimeDim("");
		_f11.setVersionDim("");
		_f11.setDataSourceId("");
		String[] var11 = new String[] {};
		_f11.setAxisPriority(var11);
		_f13.setSeasonList(t12);
		_f13.setAppId("");
		PlanCycle[] var12 = new PlanCycle[] {};
		_f13.setPlanCycles(var12);
		_f13.setLastPeriod("");
		_f13.setCurrentYear("");
		t13.setYearDim("");
		String[] var13 = new String[] {};
		t13.setHierDims(var13);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var14 = new String[] {};
		t13.setAxisPriority(var14);
		_f13.setMdbDef(t13);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setMeasures(var15);
		Map var16 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setVersions(var16);
		_f16.setSeasonList(t17);
		_f16.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f16.setPlanCycles(var17);
		_f16.setLastPeriod("");
		_f16.setCurrentYear("");
		t18.setYearDim("");
		String[] var18 = new String[] {};
		t18.setHierDims(var18);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var19 = new String[] {};
		t18.setAxisPriority(var19);
		_f16.setMdbDef(t18);
		Map var20 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setMeasures(var20);
		Map var21 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setVersions(var21);
		_f17.setYearDim("");
		String[] var22 = new String[] {};
		_f17.setHierDims(var22);
		_f17.setMeasureDim("");
		_f17.setPlanTypeDim("");
		_f17.setTimeDim("");
		_f17.setVersionDim("");
		_f17.setDataSourceId("");
		String[] var23 = new String[] {};
		_f17.setAxisPriority(var23);
		_f18.setYearDim("");
		String[] var24 = new String[] {};
		_f18.setHierDims(var24);
		_f18.setMeasureDim("");
		_f18.setPlanTypeDim("");
		_f18.setTimeDim("");
		_f18.setVersionDim("");
		_f18.setDataSourceId("");
		String[] var25 = new String[] {};
		_f18.setAxisPriority(var25);
		_f19.setSeasonList(t22);
		_f19.setAppId("");
		PlanCycle[] var26 = new PlanCycle[] {};
		_f19.setPlanCycles(var26);
		_f19.setLastPeriod("");
		_f19.setCurrentYear("");
		t23.setYearDim("");
		String[] var27 = new String[] {};
		t23.setHierDims(var27);
		t23.setMeasureDim("");
		t23.setPlanTypeDim("");
		t23.setTimeDim("");
		t23.setVersionDim("");
		t23.setDataSourceId("");
		String[] var28 = new String[] {};
		t23.setAxisPriority(var28);
		_f19.setMdbDef(t23);
		Map var29 = (Map) Stubs.makeStubObject(Map.class);
		_f19.setMeasures(var29);
		Map var30 = (Map) Stubs.makeStubObject(Map.class);
		_f19.setVersions(var30);
		_f23.setYearDim("");
		String[] var31 = new String[] {};
		_f23.setHierDims(var31);
		_f23.setMeasureDim("");
		_f23.setPlanTypeDim("");
		_f23.setTimeDim("");
		_f23.setVersionDim("");
		_f23.setDataSourceId("");
		String[] var32 = new String[] {};
		_f23.setAxisPriority(var32);
		_f24.setYearDim("");
		String[] var33 = new String[] {};
		_f24.setHierDims(var33);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var34 = new String[] {};
		_f24.setAxisPriority(var34);
		_f25.setSeasonList(t30);
		_f25.setAppId("");
		PlanCycle[] var35 = new PlanCycle[] {};
		_f25.setPlanCycles(var35);
		_f25.setLastPeriod("");
		_f25.setCurrentYear("");
		_f25.setMdbDef(t31);
		Map var36 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setMeasures(var36);
		Map var37 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setVersions(var37);
		_f26.setYearDim("");
		String[] var38 = new String[] {};
		_f26.setHierDims(var38);
		_f26.setMeasureDim("");
		_f26.setPlanTypeDim("");
		_f26.setTimeDim("");
		_f26.setVersionDim("");
		_f26.setDataSourceId("");
		String[] var39 = new String[] {};
		_f26.setAxisPriority(var39);
		_f28.setSeasonList(t35);
		_f28.setAppId("");
		PlanCycle[] var40 = new PlanCycle[] {};
		_f28.setPlanCycles(var40);
		_f28.setLastPeriod("");
		_f28.setCurrentYear("");
		_f28.setMdbDef(t36);
		Map var41 = (Map) Stubs.makeStubObject(Map.class);
		_f28.setMeasures(var41);
		Map var42 = (Map) Stubs.makeStubObject(Map.class);
		_f28.setVersions(var42);
		_f29.setYearDim("");
		String[] var43 = new String[] {};
		_f29.setHierDims(var43);
		_f29.setMeasureDim("");
		_f29.setPlanTypeDim("");
		_f29.setTimeDim("");
		_f29.setVersionDim("");
		_f29.setDataSourceId("");
		String[] var44 = new String[] {};
		_f29.setAxisPriority(var44);
		_f30.setYearDim("");
		String[] var45 = new String[] {};
		_f30.setHierDims(var45);
		_f30.setMeasureDim("");
		_f30.setPlanTypeDim("");
		_f30.setTimeDim("");
		_f30.setVersionDim("");
		_f30.setDataSourceId("");
		String[] var46 = new String[] {};
		_f30.setAxisPriority(var46);
		_f31.setSeasonList(t40);
		_f31.setAppId("");
		PlanCycle[] var47 = new PlanCycle[] {};
		_f31.setPlanCycles(var47);
		_f31.setLastPeriod("");
		_f31.setCurrentYear("");
		_f31.setMdbDef(t41);
		Map var48 = (Map) Stubs.makeStubObject(Map.class);
		_f31.setMeasures(var48);
		Map var49 = (Map) Stubs.makeStubObject(Map.class);
		_f31.setVersions(var49);
		_f33.setYearDim("");
		String[] var50 = new String[] {};
		_f33.setHierDims(var50);
		_f33.setMeasureDim("");
		_f33.setPlanTypeDim("");
		_f33.setTimeDim("");
		_f33.setVersionDim("");
		_f33.setDataSourceId("");
		String[] var51 = new String[] {};
		_f33.setAxisPriority(var51);
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:206)
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:178)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2, _f3, _f10, _f13, _f16,
						_f19, _f22, _f25, _f28, _f31 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f6;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
						return _f7;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 3 :
						return _f8;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 4 :
						return _f9;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 5 :
						return _f11;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 6 :
						return _f12;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 7 :
						return _f14;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 8 :
						return _f15;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 9 :
						return _f17;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 10 :
						return _f18;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 11 :
						return _f20;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 12 :
						return _f21;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 13 :
						return _f23;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 14 :
						return _f24;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 15 :
						return _f26;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 16 :
						return _f27;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 17 :
						return _f29;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 18 :
						return _f30;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 19 :
						return _f32;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 20 :
						return _f33;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSourceId", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MdbDef.getDataSourceId()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
						return "";
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppContext", argument_types)) {
				return Stubs.makeStubObject(ApplicationContext.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, BeanFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[1];
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen13() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.getMembersByGen(Ljava/lang/String;Ljava/lang/String;)Ljava/util/TreeMap;>
		// at java.util.concurrent.ConcurrentHashMap.hash
		// at java.util.concurrent.ConcurrentHashMap.get
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen13.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen13(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen18() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		_f5 = new PafMember();
		PafMemberAttr t3 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		PafMember t5 = new PafMember("");
		_f34 = new PafMember();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t11 = new ListMock(var3);
		PafMember t12 = new PafMember();
		_f35 = new PafMember("");
		_f5.setPafMemberAttr(t3);
		_f5.setChildren(t4);
		JT.invoke(
			PafMember.class,
			_f5,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			_f5,
			"setParent",
			new Object[] { t5 },
			new Class[] { PafMember.class });
		_f34.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f34.setChildren(t8);
		JT.invoke(
			PafMember.class,
			_f34,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		JT.invoke(
			PafMember.class,
			t9,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			t9,
			"setParent",
			new Object[] { t12 },
			new Class[] { PafMember.class });
		JT.invoke(
			PafMember.class,
			_f34,
			"setParent",
			new Object[] { t9 },
			new Class[] { PafMember.class });
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen("", "");
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:179)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen18(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMember", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.mdb.PafMemberTree.getMember(java.lang.String)");
				switch (index) {
					case 1 :
						return _f34;
					// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:178)
					case 2 :
						return _f35;
					// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:178)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[2];
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen19() throws Throwable {
		_f2 = new PafApplicationDef();
		_f6 = new MdbDef();
		_f7 = new MdbDef();
		_f3 = new PafApplicationDef();
		_f8 = new MdbDef();
		_f9 = new MdbDef();
		_f10 = new PafApplicationDef();
		SeasonList t7 = new SeasonList();
		MdbDef t8 = new MdbDef();
		_f11 = new MdbDef();
		_f12 = new MdbDef();
		_f13 = new PafApplicationDef();
		SeasonList t12 = new SeasonList();
		MdbDef t13 = new MdbDef();
		_f14 = new MdbDef();
		_f15 = new MdbDef();
		_f16 = new PafApplicationDef();
		SeasonList t17 = new SeasonList();
		MdbDef t18 = new MdbDef();
		_f17 = new MdbDef();
		_f18 = new MdbDef();
		_f19 = new PafApplicationDef();
		SeasonList t22 = new SeasonList();
		MdbDef t23 = new MdbDef();
		_f20 = new MdbDef();
		_f21 = new MdbDef();
		_f22 = new PafApplicationDef();
		_f23 = new MdbDef();
		_f24 = new MdbDef();
		_f25 = new PafApplicationDef();
		SeasonList t30 = new SeasonList();
		MdbDef t31 = new MdbDef();
		_f26 = new MdbDef();
		_f27 = new MdbDef();
		PafDataService THIS = PafDataService.getInstance();
		_f5 = new PafMember();
		_f7.setYearDim("");
		String[] var1 = new String[] {};
		_f7.setHierDims(var1);
		_f7.setMeasureDim("");
		_f7.setPlanTypeDim("");
		_f7.setTimeDim("");
		_f7.setVersionDim("");
		_f7.setDataSourceId("");
		String[] var2 = new String[] {};
		_f7.setAxisPriority(var2);
		_f9.setYearDim("");
		String[] var3 = new String[] {};
		_f9.setHierDims(var3);
		_f9.setMeasureDim("");
		_f9.setPlanTypeDim("");
		_f9.setTimeDim("");
		_f9.setVersionDim("");
		_f9.setDataSourceId("");
		String[] var4 = new String[] {};
		_f9.setAxisPriority(var4);
		_f10.setSeasonList(t7);
		_f10.setAppId("");
		PlanCycle[] var5 = new PlanCycle[] {};
		_f10.setPlanCycles(var5);
		_f10.setLastPeriod("");
		_f10.setCurrentYear("");
		t8.setYearDim("");
		String[] var6 = new String[] {};
		t8.setHierDims(var6);
		t8.setMeasureDim("");
		t8.setPlanTypeDim("");
		t8.setTimeDim("");
		t8.setVersionDim("");
		t8.setDataSourceId("");
		String[] var7 = new String[] {};
		t8.setAxisPriority(var7);
		_f10.setMdbDef(t8);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		_f10.setVersions(var9);
		_f13.setSeasonList(t12);
		_f13.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f13.setPlanCycles(var10);
		_f13.setLastPeriod("");
		_f13.setCurrentYear("");
		t13.setYearDim("");
		String[] var11 = new String[] {};
		t13.setHierDims(var11);
		t13.setMeasureDim("");
		t13.setPlanTypeDim("");
		t13.setTimeDim("");
		t13.setVersionDim("");
		t13.setDataSourceId("");
		String[] var12 = new String[] {};
		t13.setAxisPriority(var12);
		_f13.setMdbDef(t13);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setVersions(var14);
		_f14.setYearDim("");
		String[] var15 = new String[] {};
		_f14.setHierDims(var15);
		_f14.setMeasureDim("");
		_f14.setPlanTypeDim("");
		_f14.setTimeDim("");
		_f14.setVersionDim("");
		_f14.setDataSourceId("");
		String[] var16 = new String[] {};
		_f14.setAxisPriority(var16);
		_f15.setYearDim("");
		String[] var17 = new String[] {};
		_f15.setHierDims(var17);
		_f15.setMeasureDim("");
		_f15.setPlanTypeDim("");
		_f15.setTimeDim("");
		_f15.setVersionDim("");
		_f15.setDataSourceId("");
		String[] var18 = new String[] {};
		_f15.setAxisPriority(var18);
		_f16.setSeasonList(t17);
		_f16.setAppId("");
		PlanCycle[] var19 = new PlanCycle[] {};
		_f16.setPlanCycles(var19);
		_f16.setLastPeriod("");
		_f16.setCurrentYear("");
		t18.setYearDim("");
		String[] var20 = new String[] {};
		t18.setHierDims(var20);
		t18.setMeasureDim("");
		t18.setPlanTypeDim("");
		t18.setTimeDim("");
		t18.setVersionDim("");
		t18.setDataSourceId("");
		String[] var21 = new String[] {};
		t18.setAxisPriority(var21);
		_f16.setMdbDef(t18);
		Map var22 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setMeasures(var22);
		Map var23 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setVersions(var23);
		_f19.setSeasonList(t22);
		_f19.setAppId("");
		PlanCycle[] var24 = new PlanCycle[] {};
		_f19.setPlanCycles(var24);
		_f19.setLastPeriod("");
		_f19.setCurrentYear("");
		t23.setYearDim("");
		String[] var25 = new String[] {};
		t23.setHierDims(var25);
		t23.setMeasureDim("");
		t23.setPlanTypeDim("");
		t23.setTimeDim("");
		t23.setVersionDim("");
		t23.setDataSourceId("");
		String[] var26 = new String[] {};
		t23.setAxisPriority(var26);
		_f19.setMdbDef(t23);
		Map var27 = (Map) Stubs.makeStubObject(Map.class);
		_f19.setMeasures(var27);
		Map var28 = (Map) Stubs.makeStubObject(Map.class);
		_f19.setVersions(var28);
		_f21.setYearDim("");
		String[] var29 = new String[] {};
		_f21.setHierDims(var29);
		_f21.setMeasureDim("");
		_f21.setPlanTypeDim("");
		_f21.setTimeDim("");
		_f21.setVersionDim("");
		_f21.setDataSourceId("");
		String[] var30 = new String[] {};
		_f21.setAxisPriority(var30);
		_f23.setYearDim("");
		String[] var31 = new String[] {};
		_f23.setHierDims(var31);
		_f23.setMeasureDim("");
		_f23.setPlanTypeDim("");
		_f23.setTimeDim("");
		_f23.setVersionDim("");
		_f23.setDataSourceId("");
		String[] var32 = new String[] {};
		_f23.setAxisPriority(var32);
		_f25.setSeasonList(t30);
		_f25.setAppId("");
		PlanCycle[] var33 = new PlanCycle[] {};
		_f25.setPlanCycles(var33);
		_f25.setLastPeriod("");
		_f25.setCurrentYear("");
		_f25.setMdbDef(t31);
		Map var34 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setMeasures(var34);
		Map var35 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setVersions(var35);
		_f26.setYearDim("");
		String[] var36 = new String[] {};
		_f26.setHierDims(var36);
		_f26.setMeasureDim("");
		_f26.setPlanTypeDim("");
		_f26.setTimeDim("");
		_f26.setVersionDim("");
		_f26.setDataSourceId("");
		String[] var37 = new String[] {};
		_f26.setAxisPriority(var37);
		_f27.setYearDim("");
		String[] var38 = new String[] {};
		_f27.setHierDims(var38);
		_f27.setMeasureDim("");
		_f27.setPlanTypeDim("");
		_f27.setTimeDim("");
		_f27.setVersionDim("");
		_f27.setDataSourceId("");
		String[] var39 = new String[] {};
		_f27.setAxisPriority(var39);
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		assertEquals(5, t18.getDimCount()); // jtest_unverified
		assertEquals(5, _f27.getDimCount()); // jtest_unverified
		assertEquals(5, t23.getDimCount()); // jtest_unverified
		assertEquals(5, _f15.getDimCount()); // jtest_unverified
		assertEquals(5, _f26.getDimCount()); // jtest_unverified
		assertEquals(5, _f23.getDimCount()); // jtest_unverified
		assertEquals(5, _f7.getDimCount()); // jtest_unverified
		assertEquals(5, t13.getDimCount()); // jtest_unverified
		assertEquals(5, t8.getDimCount()); // jtest_unverified
		assertEquals(5, _f9.getDimCount()); // jtest_unverified
		assertEquals(5, _f21.getDimCount()); // jtest_unverified
		assertEquals(5, _f14.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen19(
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
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2, _f3, _f10, _f13, _f16,
						_f19, _f22, _f25 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f6;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 2 :
						return _f7;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 3 :
						return _f8;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 4 :
						return _f9;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 5 :
						return _f11;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 6 :
						return _f12;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 7 :
						return _f14;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 8 :
						return _f15;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 9 :
						return _f17;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 10 :
						return _f18;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 11 :
						return _f20;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 12 :
						return _f21;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 13 :
						return _f23;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 14 :
						return _f24;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 15 :
						return _f26;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 16 :
						return _f27;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllDims", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataSourceId", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.MdbDef.getDataSourceId()");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
						return "";
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, PafMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAppContext", argument_types)) {
				return Stubs.makeStubObject(ApplicationContext.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, BeanFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return Stubs.makeStubObject(IPafConnectionProps.class);
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1191)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByGen(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByGen(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByGen21() throws Throwable {
		_f5 = new PafMember();
		_f34 = new PafMember();
		Object[] var1 = new Object[] {};
		ListMock t5 = new ListMock(var1);
		PafMember t6 = new PafMember();
		PafMemberAttr t7 = new PafMemberAttr();
		Object[] var2 = new Object[] {};
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember();
		Object[] var3 = new Object[] {};
		ListMock t11 = new ListMock(var3);
		PafMember t12 = new PafMember((String) null);
		_f34.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f34.setChildren(t5);
		JT.invoke(
			PafMember.class,
			_f34,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		t6.setPafMemberAttr(t7);
		t6.setChildren(t8);
		JT.invoke(
			PafMember.class,
			t6,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		t9.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t9.setChildren(t11);
		JT.invoke(
			PafMember.class,
			t9,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			t9,
			"setParent",
			new Object[] { t12 },
			new Class[] { PafMember.class });
		JT.invoke(
			PafMember.class,
			t6,
			"setParent",
			new Object[] { t9 },
			new Class[] { PafMember.class });
		JT.invoke(
			PafMember.class,
			_f34,
			"setParent",
			new Object[] { t6 },
			new Class[] { PafMember.class });
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByGen((String) null, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{0=[]}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByGen21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByGen21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:172)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:173)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMember", argument_types)) {
				return _f34;
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:178)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[1];
				// at com.palladium.paf.server.PafDataService.getMembersByGen(PafDataService.java:175)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByLevel(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByLevel(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByLevel1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByLevel("", (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
		// jtest_unverified
	}

	/**
	 * Test for method: getMembersByLevel(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByLevel(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByLevel10() throws Throwable {
		_f5 = new PafMember();
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByLevel((String) null, (String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("{}", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByLevel10.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByLevel10(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:143)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByLevel(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByLevel(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByLevel11() throws Throwable {
		_f5 = new PafMember();
		_f34 = new PafMember();
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByLevel((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:149)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByLevel11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByLevel11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:143)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRoot", argument_types)) {
				return _f5;
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getMember", argument_types)) {
				return _f34;
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:148)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[1];
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMembersByLevel(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMembersByLevel(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMembersByLevel12() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		TreeMap RETVAL = THIS.getMembersByLevel((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMember(PafMemberTree.java:206)
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:148)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMembersByLevel12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMembersByLevel12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(PafDataCache.class);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:143)
			}
		}
		if (Stubs.matches(method, PafDataCache.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getAxisIndex", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "getAxisMembers", argument_types)) {
				return new String[1];
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMetaDataProvider1() throws Throwable {
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		IMdbMetaData RETVAL = THIS.getMetaDataProvider(var1);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMetaDataProvider1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMetaDataProvider1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMetaDataProvider2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		IMdbMetaData RETVAL = THIS
			.getMetaDataProvider((IPafConnectionProps) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.getMetaDataProvider(Lcom/palladium/paf/mdb/IPafConnectionProps;)Lcom/palladium/paf/mdb/IMdbMetaData;>
		// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMetaDataProvider2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMetaDataProvider2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getMetaDataProvider(com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMetaDataProvider3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		// jtest_tested_method
		IMdbMetaData RETVAL = THIS.getMetaDataProvider(var1);
		// NullPointerException thrown, originator is possible setup problem
		// at java.lang.Class.forName0
		// at java.lang.Class.forName
		// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMetaDataProvider3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMetaDataProvider3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSystemLockedIntersections(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getSystemLockedIntersections(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSystemLockedIntersections1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		Set RETVAL = THIS.getSystemLockedIntersections((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getSystemLockedIntersections(PafDataService.java:195)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSystemLockedIntersections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSystemLockedIntersections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getSystemLockedIntersections(PafDataService.java:195)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSystemLockedIntersections(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getSystemLockedIntersections(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSystemLockedIntersections2() throws Throwable {
		_f0 = new ServerSettings();
		_f2 = new PafApplicationDef();
		_f6 = new MdbDef();
		_f7 = new MdbDef();
		_f3 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f8 = new MdbDef();
		_f9 = new MdbDef();
		_f10 = new PafApplicationDef();
		_f11 = new MdbDef();
		_f12 = new MdbDef();
		_f13 = new PafApplicationDef();
		SeasonList t13 = new SeasonList();
		MdbDef t14 = new MdbDef();
		_f14 = new MdbDef();
		_f15 = new MdbDef();
		_f16 = new PafApplicationDef();
		SeasonList t18 = new SeasonList();
		MdbDef t19 = new MdbDef();
		_f17 = new MdbDef();
		_f18 = new MdbDef();
		_f19 = new PafApplicationDef();
		_f20 = new MdbDef();
		_f21 = new MdbDef();
		_f22 = new PafApplicationDef();
		_f23 = new MdbDef();
		_f24 = new MdbDef();
		_f25 = new PafApplicationDef();
		SeasonList t29 = new SeasonList();
		MdbDef t30 = new MdbDef();
		_f26 = new MdbDef();
		_f27 = new MdbDef();
		_f28 = new PafApplicationDef();
		SeasonList t34 = new SeasonList();
		MdbDef t35 = new MdbDef();
		_f29 = new MdbDef();
		_f30 = new MdbDef();
		_f31 = new PafApplicationDef();
		_f32 = new MdbDef();
		_f33 = new MdbDef();
		PafDataService THIS = PafDataService.getInstance();
		_f7.setYearDim("");
		String[] var1 = new String[] {};
		_f7.setHierDims(var1);
		_f7.setMeasureDim("");
		_f7.setPlanTypeDim("");
		_f7.setTimeDim("");
		_f7.setVersionDim("");
		_f7.setDataSourceId("");
		String[] var2 = new String[] {};
		_f7.setAxisPriority(var2);
		_f3.setSeasonList(t5);
		_f3.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		_f3.setPlanCycles(var3);
		_f3.setLastPeriod("");
		_f3.setCurrentYear("");
		_f3.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		_f3.setVersions(var5);
		_f8.setYearDim("");
		String[] var6 = new String[] {};
		_f8.setHierDims(var6);
		_f8.setMeasureDim("");
		_f8.setPlanTypeDim("");
		_f8.setTimeDim("");
		_f8.setVersionDim("");
		_f8.setDataSourceId("");
		String[] var7 = new String[] {};
		_f8.setAxisPriority(var7);
		_f9.setYearDim("");
		String[] var8 = new String[] {};
		_f9.setHierDims(var8);
		_f9.setMeasureDim("");
		_f9.setPlanTypeDim("");
		_f9.setTimeDim("");
		_f9.setVersionDim("");
		_f9.setDataSourceId("");
		String[] var9 = new String[] {};
		_f9.setAxisPriority(var9);
		_f13.setSeasonList(t13);
		_f13.setAppId("");
		PlanCycle[] var10 = new PlanCycle[] {};
		_f13.setPlanCycles(var10);
		_f13.setLastPeriod("");
		_f13.setCurrentYear("");
		t14.setYearDim("");
		String[] var11 = new String[] {};
		t14.setHierDims(var11);
		t14.setMeasureDim("");
		t14.setPlanTypeDim("");
		t14.setTimeDim("");
		t14.setVersionDim("");
		t14.setDataSourceId("");
		String[] var12 = new String[] {};
		t14.setAxisPriority(var12);
		_f13.setMdbDef(t14);
		Map var13 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setMeasures(var13);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		_f13.setVersions(var14);
		_f14.setYearDim("");
		String[] var15 = new String[] {};
		_f14.setHierDims(var15);
		_f14.setMeasureDim("");
		_f14.setPlanTypeDim("");
		_f14.setTimeDim("");
		_f14.setVersionDim("");
		_f14.setDataSourceId("");
		String[] var16 = new String[] {};
		_f14.setAxisPriority(var16);
		_f16.setSeasonList(t18);
		_f16.setAppId("");
		PlanCycle[] var17 = new PlanCycle[] {};
		_f16.setPlanCycles(var17);
		_f16.setLastPeriod("");
		_f16.setCurrentYear("");
		_f16.setMdbDef(t19);
		Map var18 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setMeasures(var18);
		Map var19 = (Map) Stubs.makeStubObject(Map.class);
		_f16.setVersions(var19);
		_f17.setYearDim("");
		String[] var20 = new String[] {};
		_f17.setHierDims(var20);
		_f17.setMeasureDim("");
		_f17.setPlanTypeDim("");
		_f17.setTimeDim("");
		_f17.setVersionDim("");
		_f17.setDataSourceId("");
		String[] var21 = new String[] {};
		_f17.setAxisPriority(var21);
		_f18.setYearDim("");
		String[] var22 = new String[] {};
		_f18.setHierDims(var22);
		_f18.setMeasureDim("");
		_f18.setPlanTypeDim("");
		_f18.setTimeDim("");
		_f18.setVersionDim("");
		_f18.setDataSourceId("");
		String[] var23 = new String[] {};
		_f18.setAxisPriority(var23);
		_f23.setYearDim("");
		String[] var24 = new String[] {};
		_f23.setHierDims(var24);
		_f23.setMeasureDim("");
		_f23.setPlanTypeDim("");
		_f23.setTimeDim("");
		_f23.setVersionDim("");
		_f23.setDataSourceId("");
		String[] var25 = new String[] {};
		_f23.setAxisPriority(var25);
		_f24.setYearDim("");
		String[] var26 = new String[] {};
		_f24.setHierDims(var26);
		_f24.setMeasureDim("");
		_f24.setPlanTypeDim("");
		_f24.setTimeDim("");
		_f24.setVersionDim("");
		_f24.setDataSourceId("");
		String[] var27 = new String[] {};
		_f24.setAxisPriority(var27);
		_f25.setSeasonList(t29);
		_f25.setAppId("");
		PlanCycle[] var28 = new PlanCycle[] {};
		_f25.setPlanCycles(var28);
		_f25.setLastPeriod("");
		_f25.setCurrentYear("");
		_f25.setMdbDef(t30);
		Map var29 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setMeasures(var29);
		Map var30 = (Map) Stubs.makeStubObject(Map.class);
		_f25.setVersions(var30);
		_f27.setYearDim("");
		String[] var31 = new String[] {};
		_f27.setHierDims(var31);
		_f27.setMeasureDim("");
		_f27.setPlanTypeDim("");
		_f27.setTimeDim("");
		_f27.setVersionDim("");
		_f27.setDataSourceId("");
		String[] var32 = new String[] {};
		_f27.setAxisPriority(var32);
		_f28.setSeasonList(t34);
		_f28.setAppId("");
		PlanCycle[] var33 = new PlanCycle[] {};
		_f28.setPlanCycles(var33);
		_f28.setLastPeriod("");
		_f28.setCurrentYear("");
		t35.setYearDim("");
		String[] var34 = new String[] {};
		t35.setHierDims(var34);
		t35.setMeasureDim("");
		t35.setPlanTypeDim("");
		t35.setTimeDim("");
		t35.setVersionDim("");
		t35.setDataSourceId("");
		String[] var35 = new String[] {};
		t35.setAxisPriority(var35);
		_f28.setMdbDef(t35);
		Map var36 = (Map) Stubs.makeStubObject(Map.class);
		_f28.setMeasures(var36);
		Map var37 = (Map) Stubs.makeStubObject(Map.class);
		_f28.setVersions(var37);
		_f32.setYearDim("");
		String[] var38 = new String[] {};
		_f32.setHierDims(var38);
		_f32.setMeasureDim("");
		_f32.setPlanTypeDim("");
		_f32.setTimeDim("");
		_f32.setVersionDim("");
		_f32.setDataSourceId("");
		String[] var39 = new String[] {};
		_f32.setAxisPriority(var39);
		_f33.setYearDim("");
		String[] var40 = new String[] {};
		_f33.setHierDims(var40);
		_f33.setMeasureDim("");
		_f33.setPlanTypeDim("");
		_f33.setTimeDim("");
		_f33.setVersionDim("");
		_f33.setDataSourceId("");
		String[] var41 = new String[] {};
		_f33.setAxisPriority(var41);
		// jtest_tested_method
		Set RETVAL = THIS.getSystemLockedIntersections((String) null);
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals(5, _f24.getDimCount()); // jtest_unverified
		assertEquals(5, _f18.getDimCount()); // jtest_unverified
		assertEquals(5, _f23.getDimCount()); // jtest_unverified
		assertEquals(5, _f32.getDimCount()); // jtest_unverified
		assertEquals(5, _f7.getDimCount()); // jtest_unverified
		assertEquals(5, t35.getDimCount()); // jtest_unverified
		assertEquals(5, t14.getDimCount()); // jtest_unverified
		assertEquals(5, _f9.getDimCount()); // jtest_unverified
		assertEquals(5, _f33.getDimCount()); // jtest_unverified
		assertEquals(5, _f17.getDimCount()); // jtest_unverified
		assertEquals(5, _f8.getDimCount()); // jtest_unverified
		assertEquals(5, _f14.getDimCount()); // jtest_unverified
		assertEquals(5, _f27.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSystemLockedIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSystemLockedIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
			}
		}
		if ("org.springframework.context.support.AbstractApplicationContext"
			.equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("org.springframework.context.support.AbstractApplicationContext.getBean(java.lang.String)");
				switch (index) {
					case 1 :
						return _f0;
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
					case 11 :
						return Stubs.makeStubObject(IPafConnectionProps.class);
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2, _f3, _f10, _f13, _f16,
						_f19, _f22, _f25, _f28, _f31 };
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f6;
					case 2 :
						return _f7;
					case 3 :
						return _f8;
					case 4 :
						return _f9;
					case 5 :
						return _f11;
					case 6 :
						return _f12;
					case 7 :
						return _f14;
					case 8 :
						return _f15;
					case 9 :
						return _f17;
					case 10 :
						return _f18;
					case 11 :
						return _f20;
					case 12 :
						return _f21;
					case 13 :
						return _f23;
					case 14 :
						return _f24;
					case 15 :
						return _f26;
					case 16 :
						return _f27;
					case 17 :
						return _f29;
					case 18 :
						return _f30;
					case 19 :
						return _f32;
					case 20 :
						return _f33;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MdbDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getAllDims", argument_types)) {
				return new String[1];
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getSystemLockedIntersections(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getSystemLockedIntersections(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetSystemLockedIntersections3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		Set RETVAL = THIS.getSystemLockedIntersections("");
		// jtest_unverified
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetSystemLockedIntersections3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetSystemLockedIntersections3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowRoot1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafMember RETVAL = THIS.getUowRoot(
			(String) null,
			(String) null,
			(UnitOfWork) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.getUowRoot(Ljava/lang/String;Ljava/lang/String;Lcom/palladium/paf/app/UnitOfWork;)Lcom/palladium/paf/mdb/PafMember;>
		// at java.util.concurrent.ConcurrentHashMap.hash
		// at java.util.concurrent.ConcurrentHashMap.get
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
		// at com.palladium.paf.server.PafDataService.getUowRoot(PafDataService.java:124)
		// jtest_unverified
	}

	/**
	 * Test for method: getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowRoot2() throws Throwable {
		_f2 = new PafApplicationDef();
		_f6 = new MdbDef();
		_f7 = new MdbDef();
		_f0 = new ServerSettings();
		PafDataService THIS = PafDataService.getInstance();
		_f6.setYearDim("");
		String[] var1 = new String[] { null, null, null };
		_f6.setHierDims(var1);
		_f6.setMeasureDim("");
		_f6.setPlanTypeDim("");
		_f6.setTimeDim("");
		_f6.setVersionDim("");
		_f6.setDataSourceId("");
		String[] var2 = new String[] {};
		_f6.setAxisPriority(var2);
		_f7.setYearDim("");
		String[] var3 = new String[] {};
		_f7.setHierDims(var3);
		_f7.setMeasureDim("");
		_f7.setPlanTypeDim("");
		_f7.setTimeDim("");
		_f7.setVersionDim("");
		_f7.setDataSourceId("");
		String[] var4 = new String[] {};
		_f7.setAxisPriority(var4);
		// jtest_tested_method
		PafMember RETVAL = THIS
			.getUowRoot("", (String) null, (UnitOfWork) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:145)
		// at com.palladium.paf.server.PafDataService.getUowRoot(PafDataService.java:124)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUowRoot2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUowRoot2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[] { _f2 };
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f6;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
						return _f7;
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("org.springframework.context.support.AbstractApplicationContext.getBean(java.lang.String)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
					// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					case 2 :
						return Stubs.makeStubObject(IPafConnectionProps.class);
					// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				return Stubs.makeStubObject(DatabaseMetaData.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, DatabaseMetaData.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDatabaseProductName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:75)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getDatabaseProductVersion",
				argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:77)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverName", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDriverVersion", argument_types)) {
				return "";
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:78)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "supportsResultSetType", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:80)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "supportsBatchUpdates", argument_types)) {
				return Boolean.FALSE;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:81)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(
				method,
				"getMetaDataServiceProvider",
				argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMetaDataProvider(PafDataService.java:532)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:434)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1200)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowRoot7() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		PafMember RETVAL = THIS.getUowRoot(
			(String) null,
			(String) null,
			(UnitOfWork) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
		// at com.palladium.paf.server.PafDataService.getUowRoot(PafDataService.java:124)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUowRoot7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUowRoot7(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ConcurrentHashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafDataService.getMembersByLevel(PafDataService.java:142)
				// at com.palladium.paf.server.PafDataService.getUowRoot(PafDataService.java:124)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#getUowRoot(java.lang.String,java.lang.String,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetUowRoot17() throws Throwable {
		URLStreamHandler var1 = (URLStreamHandler) Stubs
			.makeStubObject(URLStreamHandler.class);
		// jtest_tested_method
		_f53 = new URL("", "", 7, "", var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetUowRoot17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetUowRoot17(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at org.springframework.context.support.AbstractApplicationContext.class$(AbstractApplicationContext.java:123)
				// at org.springframework.context.support.AbstractApplicationContext.<clinit>(AbstractApplicationContext.java:123)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// 
				// at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.class$(AbstractAutowireCapableBeanFactory.java:105)
				// at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.<init>(AbstractAutowireCapableBeanFactory.java:105)
				// at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.<init>(AbstractAutowireCapableBeanFactory.java:113)
				// at org.springframework.beans.factory.support.DefaultListableBeanFactory.<init>(DefaultListableBeanFactory.java:87)
				// at org.springframework.context.support.AbstractRefreshableApplicationContext.createBeanFactory(AbstractRefreshableApplicationContext.java:118)
				// at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:86)
				// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:267)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
				// 
				// at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.class$(XmlBeanDefinitionReader.java:67)
				// at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.<init>(XmlBeanDefinitionReader.java:67)
				// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:67)
				// at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:87)
				// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:267)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
						return null;
					// at sun.net.www.protocol.jar.JarFileFactory.getCachedJarFile
					// at sun.net.www.protocol.jar.JarFileFactory.get
					// at sun.net.www.protocol.jar.JarURLConnection.connect
					// at sun.net.www.protocol.jar.JarURLConnection.getInputStream
					// at java.net.URL.openStream
					// at java.lang.ClassLoader.getResourceAsStream
					// at java.lang.Class.getResourceAsStream
					// at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:154)
					// at org.springframework.beans.factory.xml.BeansDtdResolver.resolveEntity(BeansDtdResolver.java:60)
					// at org.springframework.beans.factory.xml.ResourceEntityResolver.resolveEntity(ResourceEntityResolver.java:66)
					// at org.apache.xerces.util.EntityResolverWrapper.resolveEntity
					// at org.apache.xerces.impl.XMLEntityManager.resolveEntity
					// at org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher.dispatch
					// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
					// at org.apache.xerces.parsers.XML11Configuration.parse
					// at org.apache.xerces.parsers.XML11Configuration.parse
					// at org.apache.xerces.parsers.XMLParser.parse
					// at org.apache.xerces.parsers.DOMParser.parse
					// at org.apache.xerces.jaxp.DocumentBuilderImpl.parse
					// at javax.xml.parsers.DocumentBuilder.parse
					// at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:153)
					// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:124)
					// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:140)
					// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:103)
					// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:71)
					// at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:87)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:267)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					case 3 :
						return _f53;
					// at sun.net.www.protocol.jar.JarFileFactory.getConnection
					// at sun.net.www.protocol.jar.JarURLConnection.connect
					// at sun.net.www.protocol.jar.JarURLConnection.getInputStream
					// at java.net.URL.openStream
					// at java.lang.ClassLoader.getResourceAsStream
					// at java.lang.Class.getResourceAsStream
					// at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:154)
					// at org.springframework.beans.factory.xml.BeansDtdResolver.resolveEntity(BeansDtdResolver.java:60)
					// at org.springframework.beans.factory.xml.ResourceEntityResolver.resolveEntity(ResourceEntityResolver.java:66)
					// at org.apache.xerces.util.EntityResolverWrapper.resolveEntity
					// at org.apache.xerces.impl.XMLEntityManager.resolveEntity
					// at org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher.dispatch
					// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
					// at org.apache.xerces.parsers.XML11Configuration.parse
					// at org.apache.xerces.parsers.XML11Configuration.parse
					// at org.apache.xerces.parsers.XMLParser.parse
					// at org.apache.xerces.parsers.DOMParser.parse
					// at org.apache.xerces.jaxp.DocumentBuilderImpl.parse
					// at javax.xml.parsers.DocumentBuilder.parse
					// at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:153)
					// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:124)
					// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:140)
					// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:103)
					// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:71)
					// at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:87)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:267)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at sun.net.www.protocol.jar.JarFileFactory.get
				// at sun.net.www.protocol.jar.JarURLConnection.connect
				// at sun.net.www.protocol.jar.JarURLConnection.getInputStream
				// at java.net.URL.openStream
				// at java.lang.ClassLoader.getResourceAsStream
				// at java.lang.Class.getResourceAsStream
				// at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:154)
				// at org.springframework.beans.factory.xml.BeansDtdResolver.resolveEntity(BeansDtdResolver.java:60)
				// at org.springframework.beans.factory.xml.ResourceEntityResolver.resolveEntity(ResourceEntityResolver.java:66)
				// at org.apache.xerces.util.EntityResolverWrapper.resolveEntity
				// at org.apache.xerces.impl.XMLEntityManager.resolveEntity
				// at org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher.dispatch
				// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XML11Configuration.parse
				// at org.apache.xerces.parsers.XMLParser.parse
				// at org.apache.xerces.parsers.DOMParser.parse
				// at org.apache.xerces.jaxp.DocumentBuilderImpl.parse
				// at javax.xml.parsers.DocumentBuilder.parse
				// at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:153)
				// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:124)
				// at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:140)
				// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:103)
				// at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:71)
				// at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:87)
				// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:267)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1189)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1164)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1047)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: initMemberTreeStore(java.lang.String[],java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#initMemberTreeStore(java.lang.String[],java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testInitMemberTreeStore1() throws Throwable {
		_f0 = new ServerSettings();
		_f0.setClearOutlineCache(true);
		_f0.setDebugMode(true);
		_f0.setEvaluationStepLogging(true);
		_f0.setPafSecurityBootupPassword("");
		_f0.setPafSecurityPassword("");
		_f0.setPafSecurityUser("");
		_f0.setCalcScriptTimeout("");
		_f0.setChangedCellLogging(true);
		String[] var1 = new String[] {};
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.initMemberTreeStore(var1, "");
		// NoClassDefFoundError thrown
		// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
		// jtest_unverified
	}

	/**
	 * Stubs method for testInitMemberTreeStore1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsInitMemberTreeStore1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, DriverManager.class)) {
			argument_types = new Class[] { String.class, Properties.class };
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:580)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "prepareStatement", argument_types)) {
				return Stubs.makeStubObject(PreparedStatement.class);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:597)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:599)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:601)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:603)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:605)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:607)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:609)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:630)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, PreparedStatement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "executeUpdate", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:598)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:600)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:602)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:604)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:606)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:608)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
				// 
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:610)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, Statement.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafMetaData.clearDataCache(PafMetaData.java:622)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:113)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at org.hibernate.cfg.Environment.verifyProperties(Environment.java:457)
				// at org.hibernate.cfg.Environment.<clinit>(Environment.java:504)
				// at org.hibernate.cfg.Configuration.reset(Configuration.java:151)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:162)
				// at org.hibernate.cfg.Configuration.<init>(Configuration.java:166)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.PafDataService.initMemberTreeStore(PafDataService.java:431)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadDataCache1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.loadDataCache(
			(PafClientState) null,
			(PafApplicationDef) null,
			(UnitOfWork) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.loadDataCache(Lcom/palladium/paf/state/PafClientState;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/app/UnitOfWork;)V>
		// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:68)
		// jtest_unverified
	}

	/**
	 * Test for method: loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadDataCache2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		// jtest_tested_method
		THIS.loadDataCache(t2, (PafApplicationDef) null, (UnitOfWork) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.server.PafDataService.loadDataCache(Lcom/palladium/paf/state/PafClientState;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/app/UnitOfWork;)V>
		// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:70)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLoadDataCache2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLoadDataCache2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadDataCache3() throws Throwable {
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		String[] var1 = new String[] {};
		String[][] var2 = new String[][] { {} };
		UnitOfWork t3 = new UnitOfWork(var1, var2);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.loadDataCache(t2, (PafApplicationDef) null, t3);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.PafDataService.loadDataCache(Lcom/palladium/paf/state/PafClientState;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/app/UnitOfWork;)V>
		// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:73)
		// jtest_unverified
	}

	/**
	 * Test for method: loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadDataCache4() throws Throwable {
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		MemberTreeSet t3 = new MemberTreeSet();
		PafSecurityToken t4 = new PafSecurityToken(
			(String) null,
			(String) null,
			false);
		PafApplicationDef t5 = new PafApplicationDef();
		SeasonList t6 = new SeasonList();
		MdbDef t7 = new MdbDef();
		String[] var1 = new String[] { null };
		String[][] var2 = new String[][] { { null } };
		UnitOfWork t8 = new UnitOfWork(var1, var2);
		PafPlannerRole t9 = new PafPlannerRole();
		Season t10 = new Season();
		PafPlannerConfig t11 = new PafPlannerConfig();
		PafSimpleUow t12 = new PafSimpleUow();
		UnitOfWork t13 = new UnitOfWork(t12);
		PafApplicationDef t14 = new PafApplicationDef();
		SeasonList t15 = new SeasonList();
		MdbDef t16 = new MdbDef();
		t1.setClientType("");
		t1.setClientVersion("");
		t1.setIpAddress("");
		t1.setClientLanguage("");
		t2.setUowTrees(t3);
		t2.setSecurityToken(t4);
		t5.setSeasonList(t6);
		t5.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		t5.setPlanCycles(var3);
		t5.setLastPeriod("");
		t5.setCurrentYear("");
		t5.setMdbDef(t7);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t5.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t5.setVersions(var5);
		t2.setApp(t5);
		t2.setUnitOfWork(t8);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t2.setRuleSets(var6);
		Set var7 = (Set) Stubs.makeStubObject(Set.class);
		t2.setLockedPeriods(var7);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedForwardPlannableInterMap(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t2.setLockedNotPlannableInterMap(var9);
		t2.setPlannerRole(t9);
		t2.setPlanSeason(t10);
		t2.setClientLanguage("");
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t2.setUserSelections(var10);
		Set var11 = (Set) Stubs.makeStubObject(Set.class);
		t2.setActiveVersions(var11);
		t2.setPlannerConfig(t11);
		PafMemberList[] var12 = new PafMemberList[] {};
		t12.setPafMemberEntries(var12);
		t14.setSeasonList(t15);
		t14.setAppId("");
		PlanCycle[] var13 = new PlanCycle[] {};
		t14.setPlanCycles(var13);
		t14.setLastPeriod("");
		t14.setCurrentYear("");
		t14.setMdbDef(t16);
		Map var14 = (Map) Stubs.makeStubObject(Map.class);
		t14.setMeasures(var14);
		Map var15 = (Map) Stubs.makeStubObject(Map.class);
		t14.setVersions(var15);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.loadDataCache(t2, t14, t13);
		// NullPointerException thrown
		// at com.palladium.paf.app.UnitOfWork.<init>(UnitOfWork.java:41)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLoadDataCache4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLoadDataCache4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#loadDataCache(com.palladium.paf.state.PafClientState,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.app.UnitOfWork)
	 * @author Parasoft Jtest 8.0
	 */
	public void testLoadDataCache5() throws Throwable {
		ClientInitRequest t1 = new ClientInitRequest();
		PafClientState t2 = new PafClientState((String) null, t1);
		String[] var1 = new String[] { "", null };
		String[][] var2 = new String[][] { { null, null }, null };
		UnitOfWork t3 = new UnitOfWork(var1, var2);
		PafApplicationDef t4 = new PafApplicationDef();
		SeasonList t5 = new SeasonList();
		MdbDef t6 = new MdbDef();
		_f6 = new MdbDef();
		t4.setSeasonList(t5);
		t4.setAppId("");
		PlanCycle[] var3 = new PlanCycle[] {};
		t4.setPlanCycles(var3);
		t4.setLastPeriod("");
		t4.setCurrentYear("");
		t4.setMdbDef(t6);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t4.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t4.setVersions(var5);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.loadDataCache(t2, t4, t3);
		// NoClassDefFoundError thrown
		// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:74)
		// jtest_unverified
	}

	/**
	 * Stubs method for testLoadDataCache5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsLoadDataCache5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f6;
				// at com.palladium.paf.server.PafDataService.loadDataCache(PafDataService.java:73)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#removeDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveDataCache1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		THIS.removeDataCache((String) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.PafDataService.removeDataCache(Ljava/lang/String;)V>
		// at java.util.concurrent.ConcurrentHashMap.hash
		// at java.util.concurrent.ConcurrentHashMap.remove
		// at com.palladium.paf.server.PafDataService.removeDataCache(PafDataService.java:1205)
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveDataCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveDataCache1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#removeDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveDataCache2() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		THIS.removeDataCache("");
		// jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveDataCache2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveDataCache2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: removeDataCache(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#removeDataCache(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testRemoveDataCache3() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		THIS.removeDataCache("");
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testRemoveDataCache3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsRemoveDataCache3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: saveDataCache(java.lang.String,com.palladium.paf.mdb.IPafConnectionProps)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#saveDataCache(java.lang.String,com.palladium.paf.mdb.IPafConnectionProps)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSaveDataCache1() throws Throwable {
		IPafConnectionProps var1 = (IPafConnectionProps) Stubs
			.makeStubObject(IPafConnectionProps.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.saveDataCache((String) null, var1);
		// NullPointerException thrown, originator is possible setup problem
		// at java.lang.Class.forName0
		// at java.lang.Class.forName
		// at com.palladium.paf.server.PafDataService.getMdbDataProvider(PafDataService.java:568)
		// at com.palladium.paf.server.PafDataService.saveDataCache(PafDataService.java:1150)
		// jtest_unverified
	}

	/**
	 * Stubs method for testSaveDataCache1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSaveDataCache1(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, IPafConnectionProps.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getDataServiceProvider", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.getMdbDataProvider(PafDataService.java:568)
				// at com.palladium.paf.server.PafDataService.saveDataCache(PafDataService.java:1150)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setMemberTrees(java.util.HashMap)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#setMemberTrees(java.util.HashMap)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberTrees1() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.setMemberTrees((HashMap) null);
		// jtest_unverified
		assertEquals(null, THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setMemberTrees(java.util.HashMap)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#setMemberTrees(java.util.HashMap)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetMemberTrees2() throws Throwable {
		HashMap var1 = (HashMap) Stubs.makeStubObject(HashMap.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.setMemberTrees(var1);
		// jtest_unverified
		assertSame(var1, THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSystemLockedIntersections1() throws Throwable {
		PafDataService THIS = PafDataService.getInstance();
		// jtest_tested_method
		THIS.setSystemLockedIntersections((String) null, (Set) null);
		// jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetSystemLockedIntersections1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetSystemLockedIntersections1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ServerSettings.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "isClearOutlineCache", argument_types)) {
				return Boolean.FALSE;
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return new PafApplicationDef[0];
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSystemLockedIntersections2() throws Throwable {
		Set var1 = (Set) Stubs.makeStubObject(Set.class);
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.setSystemLockedIntersections("", var1);
		// jtest_unverified
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testSetSystemLockedIntersections2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsSetSystemLockedIntersections2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @throws Throwable Tests may throw any Throwable
	 * @see PafDataService#setSystemLockedIntersections(java.lang.String,java.util.Set)
	 * @author Parasoft Jtest 8.0
	 */
	public void testSetSystemLockedIntersections3() throws Throwable {
		PafDataService THIS = (PafDataService) Repository.getObject(
			PafDataService.class,
			"PafDataService");
		// jtest_tested_method
		THIS.setSystemLockedIntersections((String) null, (Set) null);
		assertNotNull(THIS.getMemberIndexLists()); // jtest_unverified
		assertEquals("{}", THIS.getMemberIndexLists().toString()); // jtest_unverified
		assertSame(THIS.getMemberIndexLists(), THIS.getMemberTrees()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.PafDataServiceTest
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
            PafDataServiceTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.PafDataService",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafDataService.class;
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
private ServerSettings _f0;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ListMock _f1;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f2;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f3;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberTree _f4;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f5;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f6;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f7;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f8;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f9;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f10;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f11;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f12;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f13;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f14;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f15;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f16;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f17;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f18;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f19;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f20;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f21;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f22;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f23;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f24;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f25;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f26;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f27;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f28;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f29;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f30;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f31;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f32;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f33;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f34;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f35;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ListMock _f36;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberAttr _f37;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberAttr _f38;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f39;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberAttr _f40;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f41;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f42;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberTree _f43;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMemberTree _f44;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafViewSection _f45;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f46;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f47;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f48;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f49;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f50;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f51;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ViewTuple _f52;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private URL _f53;
}

// JTEST_CURRENT_ID=1245121613.