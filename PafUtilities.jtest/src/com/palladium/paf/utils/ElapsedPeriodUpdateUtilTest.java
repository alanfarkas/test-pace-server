/*
 * ElapsedPeriodUpdateUtilTest.java
 * Created by Jtest on 9/19/06 4:50:49 PM.
 * Updated by Jtest on 10/18/06 9:05:49 AM, 15 test cases added, 15 test cases removed.
 * Updated by Jtest on 11/8/06 6:19:05 PM, 17 test cases added, 15 test cases removed.
 */

package com.palladium.paf.utils;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.utility.PafXStream;
import java.util.Map;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.SeasonList;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.ArrayList;
import jtest.Stubs;
import java.lang.reflect.Member;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.utils.model.ElapsedPeriod;
import com.palladium.paf.utils.ElapsedPeriodUpdateUtil;

/**
 * ElapsedPeriodUpdateUtilTest is a unit test class for class ElapsedPeriodUpdateUtil.
 * @see com.palladium.paf.utils.ElapsedPeriodUpdateUtil
 * @author Parasoft Jtest 8.0
 */
public class ElapsedPeriodUpdateUtilTest extends PackageTestCase {

	/**
	 * Constructs a test case for the test specified by the name argument.
	 * @param name the name of the test case
	 * @author Parasoft Jtest 8.0
	 */
	public ElapsedPeriodUpdateUtilTest(String name) {
		super(name);
		/*
		 * This constructor should not be modified.  Any initialization code
		 * should be placed in the setUp() method instead.
		 */
	}

	/**
	 * Test for method: ElapsedPeriodUpdateUtil(com.palladium.paf.utils.model.ElapsedPeriod,com.palladium.paf.app.PafApplicationDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#ElapsedPeriodUpdateUtil(com.palladium.paf.utils.model.ElapsedPeriod,com.palladium.paf.app.PafApplicationDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testElapsedPeriodUpdateUtil1() throws Throwable {
		// jtest_tested_method
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(
			(ElapsedPeriod) null,
			(PafApplicationDef[]) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.<init>(ElapsedPeriodUpdateUtil.java:69)
		// jtest_unverified
	}

	/**
	 * Test for method: ElapsedPeriodUpdateUtil(com.palladium.paf.utils.model.ElapsedPeriod,com.palladium.paf.app.PafApplicationDef[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#ElapsedPeriodUpdateUtil(com.palladium.paf.utils.model.ElapsedPeriod,com.palladium.paf.app.PafApplicationDef[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testElapsedPeriodUpdateUtil3() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		t0.setWeek("");
		t0.setYear("");
		PafApplicationDef[] var1 = new PafApplicationDef[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: exportUpdatedElapsedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#exportUpdatedElapsedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportUpdatedElapsedPeriods1() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef[] var1 = new PafApplicationDef[] {};
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		// jtest_tested_method
		THIS.exportUpdatedElapsedPeriods();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: exportUpdatedElapsedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#exportUpdatedElapsedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportUpdatedElapsedPeriods6() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		t0.setWeek("");
		t0.setYear("");
		// jtest_tested_method
		THIS.exportUpdatedElapsedPeriods();
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportUpdatedElapsedPeriods6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportUpdatedElapsedPeriods6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLastPeriod", argument_types)) {
				return null;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: exportUpdatedElapsedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#exportUpdatedElapsedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportUpdatedElapsedPeriods8() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef t5 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2, t5 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		t0.setWeek("");
		t0.setYear("");
		t2.setSeasonList(t3);
		t2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t2.setPlanCycles(var2);
		t2.setLastPeriod("");
		t2.setCurrentYear("");
		t2.setMdbDef(t4);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t2.setVersions(var4);
		// jtest_tested_method
		THIS.exportUpdatedElapsedPeriods();
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:348)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportUpdatedElapsedPeriods8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportUpdatedElapsedPeriods8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLastPeriod", argument_types)) {
				return "";
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
			}
		}
		if (Stubs.matches(method, ElapsedPeriod.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYear", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.utils.model.ElapsedPeriod.getYear()");
				switch (index) {
					case 1 :
					case 3 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:346)
					// 
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:348)
					case 2 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:346)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getWeek", argument_types)) {
				return null;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:329)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: exportUpdatedElapsedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#exportUpdatedElapsedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportUpdatedElapsedPeriods11() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef t3 = new PafApplicationDef();
		PafApplicationDef t6 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2, t3, null, t6 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t4 = new SeasonList();
		MdbDef t5 = new MdbDef();
		SeasonList t7 = new SeasonList();
		MdbDef t8 = new MdbDef();
		t0.setWeek("");
		t0.setYear("");
		t3.setSeasonList(t4);
		t3.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t3.setPlanCycles(var2);
		t3.setLastPeriod("");
		t3.setCurrentYear("");
		t5.setYearDim("");
		String[] var3 = new String[] {};
		t5.setHierDims(var3);
		t5.setMeasureDim("");
		t5.setPlanTypeDim("");
		t5.setTimeDim("");
		t5.setVersionDim("");
		t5.setDataSourceId("");
		String[] var4 = new String[] {};
		t5.setAxisPriority(var4);
		t3.setMdbDef(t5);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t3.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t3.setVersions(var6);
		t6.setSeasonList(t7);
		t6.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t6.setPlanCycles(var7);
		t6.setLastPeriod("");
		t6.setCurrentYear("");
		t6.setMdbDef(t8);
		Map var8 = (Map) Stubs.makeStubObject(Map.class);
		t6.setMeasures(var8);
		Map var9 = (Map) Stubs.makeStubObject(Map.class);
		t6.setVersions(var9);
		// jtest_tested_method
		THIS.exportUpdatedElapsedPeriods();
		// NullPointerException thrown, originator is possible setup problem
		// at com.thoughtworks.xstream.mapper.ArrayMapper.serializedClass(ArrayMapper.java:20)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.mapper.DefaultImplementationsMapper.serializedClass(DefaultImplementationsMapper.java:44)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem
		// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
		// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:140)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:364)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportUpdatedElapsedPeriods11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportUpdatedElapsedPeriods11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLastPeriod", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getLastPeriod()");
				switch (index) {
					case 1 :
					case 2 :
					case 5 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
					case 3 :
					case 4 :
					case 6 :
					case 7 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:334)
					// 
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:339)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setLastPeriod", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:337)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentYear", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getCurrentYear()");
				switch (index) {
					case 1 :
					case 4 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:348)
					case 2 :
					case 3 :
					case 5 :
					case 6 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:350)
					// 
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:355)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "setCurrentYear", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:353)
			}
		}
		if (Stubs.matches(method, ElapsedPeriod.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYear", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.utils.model.ElapsedPeriod.getYear()");
				switch (index) {
					case 1 :
					case 4 :
					case 5 :
					case 8 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:346)
					// 
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:353)
					case 2 :
					case 6 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:346)
					case 3 :
					case 7 :
						return "0";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:348)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getWeek", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.utils.model.ElapsedPeriod.getWeek()");
				switch (index) {
					case 1 :
					case 5 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:329)
					case 2 :
					case 6 :
						return "0";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
					case 3 :
					case 4 :
					case 7 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:337)
					// 
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:329)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
				// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
				// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:140)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:364)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: exportUpdatedElapsedPeriods()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#exportUpdatedElapsedPeriods()
	 * @author Parasoft Jtest 8.0
	 */
	public void testExportUpdatedElapsedPeriods12() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef t3 = new PafApplicationDef();
		PafApplicationDef t6 = new PafApplicationDef();
		PafApplicationDef t7 = new PafApplicationDef();
		PafApplicationDef t8 = new PafApplicationDef();
		PafApplicationDef t9 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2, t3, t6, t7,
				t8, t9 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t4 = new SeasonList();
		MdbDef t5 = new MdbDef();
		SeasonList t10 = new SeasonList();
		MdbDef t11 = new MdbDef();
		t0.setWeek("");
		t0.setYear("");
		t3.setSeasonList(t4);
		t3.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t3.setPlanCycles(var2);
		t3.setLastPeriod("");
		t3.setCurrentYear("");
		t5.setYearDim("");
		String[] var3 = new String[] {};
		t5.setHierDims(var3);
		t5.setMeasureDim("");
		t5.setPlanTypeDim("");
		t5.setTimeDim("");
		t5.setVersionDim("");
		t5.setDataSourceId("");
		String[] var4 = new String[] {};
		t5.setAxisPriority(var4);
		t3.setMdbDef(t5);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t3.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t3.setVersions(var6);
		t9.setSeasonList(t10);
		t9.setAppId("");
		PlanCycle[] var7 = new PlanCycle[] {};
		t9.setPlanCycles(var7);
		t9.setLastPeriod("");
		t9.setCurrentYear("");
		t11.setYearDim("");
		String[] var8 = new String[] {};
		t11.setHierDims(var8);
		t11.setMeasureDim("");
		t11.setPlanTypeDim("");
		t11.setTimeDim("");
		t11.setVersionDim("");
		t11.setDataSourceId("");
		String[] var9 = new String[] {};
		t11.setAxisPriority(var9);
		t9.setMdbDef(t11);
		Map var10 = (Map) Stubs.makeStubObject(Map.class);
		t9.setMeasures(var10);
		Map var11 = (Map) Stubs.makeStubObject(Map.class);
		t9.setVersions(var11);
		// jtest_tested_method
		THIS.exportUpdatedElapsedPeriods();
		// NullPointerException thrown, originator is possible setup problem
		// at com.thoughtworks.xstream.mapper.ArrayMapper.serializedClass(ArrayMapper.java:20)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.mapper.DefaultImplementationsMapper.serializedClass(DefaultImplementationsMapper.java:44)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.mapper.MapperWrapper.serializedClass(MapperWrapper.java:14)
		// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem
		// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
		// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
		// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
		// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
		// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
		// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:140)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:364)
		// jtest_unverified
	}

	/**
	 * Stubs method for testExportUpdatedElapsedPeriods12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsExportUpdatedElapsedPeriods12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLastPeriod", argument_types)) {
				return "";
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:332)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentYear", argument_types)) {
				return "";
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:348)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.writeItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.marshal(ArrayConverter.java:42)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshaller.convertAnother(ReferenceByXPathMarshaller.java:36)
				// at com.thoughtworks.xstream.core.TreeMarshaller.start(TreeMarshaller.java:46)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.marshal(ReferenceByXPathMarshallingStrategy.java:17)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:461)
				// at com.thoughtworks.xstream.XStream.marshal(XStream.java:451)
				// at com.thoughtworks.xstream.XStream.toXML(XStream.java:432)
				// at com.palladium.utility.PafXStream.exportObjectToXml(PafXStream.java:140)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.exportUpdatedElapsedPeriods(ElapsedPeriodUpdateUtil.java:364)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod1() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:142)
		// jtest_unverified
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod2() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod("");
		// java.io.FileNotFoundException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:158)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportNewElapsedPeriod2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportNewElapsedPeriod2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod3() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod("");
		// java.io.FileNotFoundException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:158)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportNewElapsedPeriod3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportNewElapsedPeriod3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isFile", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod5() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod("");
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportNewElapsedPeriod5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportNewElapsedPeriod5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isFile", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
		}
		if (Stubs.matches(method, FileReader.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileReader.class);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return null;
				// at jtest.wbstubs.java.io.BasicReaderWBS.<init>(BasicReaderWBS.java:31)
				// at jtest.wbstubs.java.io.BufferedReaderWBS.<init>(BufferedReaderWBS.java:25)
				// at java.io.BufferedReader.<init>
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, BufferedReader.class)) {
			argument_types = new Class[] { Reader.class };
			if (Stubs.matches(method, argument_types)) {
				throw new NullPointerException();
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod6() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportNewElapsedPeriod6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportNewElapsedPeriod6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isFile", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
		}
		if (Stubs.matches(method, FileReader.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileReader.class);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.BasicReaderWBS.<init>(BasicReaderWBS.java:31)
				// at jtest.wbstubs.java.io.BufferedReaderWBS.<init>(BufferedReaderWBS.java:25)
				// at java.io.BufferedReader.<init>
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, BufferedReader.class)) {
			argument_types = new Class[] { Reader.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedReader.class);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "readLine", argument_types)) {
				throw new IOException();
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:174)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				throw new IOException();
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:224)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importNewElapsedPeriod(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importNewElapsedPeriod(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportNewElapsedPeriod7() throws Throwable {
		// jtest_tested_method
		ElapsedPeriod RETVAL = ElapsedPeriodUpdateUtil
			.importNewElapsedPeriod("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportNewElapsedPeriod7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportNewElapsedPeriod7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, File.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "exists", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "isFile", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:156)
			}
		}
		if (Stubs.matches(method, FileReader.class)) {
			argument_types = new Class[] { File.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(FileReader.class);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, Object.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getClass", argument_types)) {
				return java.lang.Object.class;
				// at jtest.wbstubs.java.io.BasicReaderWBS.<init>(BasicReaderWBS.java:31)
				// at jtest.wbstubs.java.io.BufferedReaderWBS.<init>(BufferedReaderWBS.java:25)
				// at java.io.BufferedReader.<init>
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
		}
		if (Stubs.matches(method, BufferedReader.class)) {
			argument_types = new Class[] { Reader.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(BufferedReader.class);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:165)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "readLine", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.io.BufferedReader.readLine()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:174)
					case 2 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:174)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:224)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static importPafApplicationDefAr(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importPafApplicationDefAr(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportPafApplicationDefAr1() throws Throwable {
		// jtest_tested_method
		PafApplicationDef[] RETVAL = ElapsedPeriodUpdateUtil
			.importPafApplicationDefAr((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:252)
		// jtest_unverified
	}

	/**
	 * Test for method: static importPafApplicationDefAr(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#importPafApplicationDefAr(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testImportPafApplicationDefAr2() throws Throwable {
		// jtest_tested_method
		PafApplicationDef[] RETVAL = ElapsedPeriodUpdateUtil
			.importPafApplicationDefAr("");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testImportPafApplicationDefAr2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsImportPafApplicationDefAr2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				throw new PafConfigFileNotFoundException();
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isElapsedPeriodInfoNewerThanCurrent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#isElapsedPeriodInfoNewerThanCurrent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsElapsedPeriodInfoNewerThanCurrent2() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		t0.setWeek("");
		t0.setYear("");
		// jtest_tested_method
		boolean RETVAL = THIS.isElapsedPeriodInfoNewerThanCurrent();
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:294)
		// jtest_unverified
	}

	/**
	 * Test for method: isElapsedPeriodInfoNewerThanCurrent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#isElapsedPeriodInfoNewerThanCurrent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsElapsedPeriodInfoNewerThanCurrent3() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		t2.setSeasonList(t3);
		t2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t2.setPlanCycles(var2);
		t2.setLastPeriod("");
		t2.setCurrentYear("");
		t2.setMdbDef(t4);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t2.setVersions(var4);
		// jtest_tested_method
		boolean RETVAL = THIS.isElapsedPeriodInfoNewerThanCurrent();
		assertEquals(true, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsElapsedPeriodInfoNewerThanCurrent3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsElapsedPeriodInfoNewerThanCurrent3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ElapsedPeriod.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getWeek", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.utils.model.ElapsedPeriod.getWeek()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:291)
					case 2 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:294)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isElapsedPeriodInfoNewerThanCurrent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#isElapsedPeriodInfoNewerThanCurrent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsElapsedPeriodInfoNewerThanCurrent4() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		t0.setWeek("");
		t0.setYear("");
		t2.setSeasonList(t3);
		t2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t2.setPlanCycles(var2);
		t2.setLastPeriod("");
		t2.setCurrentYear("");
		t2.setMdbDef(t4);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t2.setVersions(var4);
		// jtest_tested_method
		boolean RETVAL = THIS.isElapsedPeriodInfoNewerThanCurrent();
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:305)
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsElapsedPeriodInfoNewerThanCurrent4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsElapsedPeriodInfoNewerThanCurrent4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getLastPeriod", argument_types)) {
				return "";
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:294)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getCurrentYear", argument_types)) {
				return null;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:305)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: isElapsedPeriodInfoNewerThanCurrent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#isElapsedPeriodInfoNewerThanCurrent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsElapsedPeriodInfoNewerThanCurrent5() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		t0.setWeek("");
		t0.setYear("");
		t2.setSeasonList(t3);
		t2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t2.setPlanCycles(var2);
		t2.setLastPeriod("");
		t2.setCurrentYear("");
		t2.setMdbDef(t4);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t2.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t2.setVersions(var4);
		// jtest_tested_method
		boolean RETVAL = THIS.isElapsedPeriodInfoNewerThanCurrent();
		assertEquals(false, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: isElapsedPeriodInfoNewerThanCurrent()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#isElapsedPeriodInfoNewerThanCurrent()
	 * @author Parasoft Jtest 8.0
	 */
	public void testIsElapsedPeriodInfoNewerThanCurrent6() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef t2 = new PafApplicationDef();
		PafApplicationDef[] var1 = new PafApplicationDef[] { t2 };
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		SeasonList t3 = new SeasonList();
		MdbDef t4 = new MdbDef();
		t2.setSeasonList(t3);
		t2.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t2.setPlanCycles(var2);
		t2.setLastPeriod("");
		t2.setCurrentYear("");
		t4.setYearDim("");
		String[] var3 = new String[] {};
		t4.setHierDims(var3);
		t4.setMeasureDim("");
		t4.setPlanTypeDim("");
		t4.setTimeDim("");
		t4.setVersionDim("");
		t4.setDataSourceId("");
		String[] var4 = new String[] {};
		t4.setAxisPriority(var4);
		t2.setMdbDef(t4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t2.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t2.setVersions(var6);
		// jtest_tested_method
		boolean RETVAL = THIS.isElapsedPeriodInfoNewerThanCurrent();
		assertEquals(true, RETVAL); // jtest_unverified
		assertEquals(5, t4.getDimCount()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testIsElapsedPeriodInfoNewerThanCurrent6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsIsElapsedPeriodInfoNewerThanCurrent6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ElapsedPeriod.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getYear", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.utils.model.ElapsedPeriod.getYear()");
				switch (index) {
					case 1 :
						return "";
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:303)
					case 2 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:305)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain1() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// NullPointerException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.isElapsedPeriodInfoNewerThanCurrent(ElapsedPeriodUpdateUtil.java:294)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:100)
		// jtest_unverified
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain2() throws Throwable {
		_f0 = new Object();
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// ClassCastException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:192)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain2(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:192)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain3() throws Throwable {
		_f0 = new Object();
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// No exception thrown
		// jtest_unverified
	}

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
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					case 2 :
					case 3 :
					case 4 :
						return new Integer(0);
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:195)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					// 
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:58)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
					// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
					// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:192)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
					// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
					// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
					case 2 :
						return Boolean.TRUE;
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
					// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
					// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:61)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain4() throws Throwable {
		_f0 = new Object();
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// ClassCastException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:198)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					case 2 :
						return new Integer(2);
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:195)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.get(int)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:192)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					case 2 :
						return _f0;
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:198)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain5() throws Throwable {
		_f0 = new Object();
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
				// 
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:58)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		if (Stubs.matches(method, AbstractList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Iterator.hasNext()");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
					// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
					// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
					case 2 :
						return Boolean.TRUE;
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:60)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
					// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
					// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
					// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
					// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
					// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
					// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
					// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
					// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f0;
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:61)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.reflection.ReflectionConverter.unmarshal(ReflectionConverter.java:100)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter.readItem
				// at com.thoughtworks.xstream.converters.collections.ArrayConverter.unmarshal(ArrayConverter.java:51)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:38)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.convertAnother(ReferenceByXPathUnmarshaller.java:39)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:99)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:109)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static main(java.lang.String[])
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#main(java.lang.String[])
	 * @author Parasoft Jtest 8.0
	 */
	public void testMain8() throws Throwable {
		String[] var1 = new String[] {};
		// jtest_tested_method
		ElapsedPeriodUpdateUtil.main(var1);
		// ClassCastException thrown
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:260)
		// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
		// jtest_unverified
	}

	/**
	 * Stubs method for testMain8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsMain8(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importNewElapsedPeriod(ElapsedPeriodUpdateUtil.java:186)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:87)
			}
		}
		if (Stubs.matches(method, PafXStream.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "importObjectFromXml", argument_types)) {
				return "";
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.importPafApplicationDefAr(ElapsedPeriodUpdateUtil.java:261)
				// at com.palladium.paf.utils.ElapsedPeriodUpdateUtil.main(ElapsedPeriodUpdateUtil.java:92)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: toString()
	 * @throws Throwable Tests may throw any Throwable
	 * @see ElapsedPeriodUpdateUtil#toString()
	 * @author Parasoft Jtest 8.0
	 */
	public void testToString1() throws Throwable {
		ElapsedPeriod t0 = new ElapsedPeriod();
		PafApplicationDef[] var1 = new PafApplicationDef[] {};
		ElapsedPeriodUpdateUtil THIS = new ElapsedPeriodUpdateUtil(t0, var1);
		// jtest_tested_method
		String RETVAL = THIS.toString();
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
	 * Usage: java com.palladium.paf.utils.ElapsedPeriodUpdateUtilTest
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
			ElapsedPeriodUpdateUtilTest.class,
			// fully qualified name of the tested class
			"com.palladium.paf.utils.ElapsedPeriodUpdateUtil",
			// timeout for each test in milliseconds
			60000);
	}

	/**
	 * Get the class object of the class which will be tested.
	 * @return the class which will be tested
	 * @author Parasoft Jtest 8.0
	 */
	public Class getTestedClass() {
		return ElapsedPeriodUpdateUtil.class;
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
private Object _f0;
}

// JTEST_CURRENT_ID=1944234226.