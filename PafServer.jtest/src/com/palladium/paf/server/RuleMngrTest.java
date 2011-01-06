/*
 * RuleMngrTest.java
 * Created by Jtest on 9/19/06 2:14:51 PM.
 * Updated by Jtest on 10/18/06 4:51:12 PM, 56 test cases added, 39 test cases removed.
 * Updated by Jtest on 11/8/06 10:41:30 PM, 55 test cases added, 55 test cases removed.
 */

package com.palladium.paf.server;

import java.util.Collection;
import org.hibernate.connection.UserSuppliedConnectionProvider;
import org.hibernate.cfg.Configuration;
import java.util.SortedMap;
import com.palladium.utility.TimeBalance;
import jtest.JT;
import com.palladium.paf.mdb.PafMemberAttr;
import com.palladium.paf.mdb.PafMember;
import com.palladium.paf.mdb.PafMemberTree;
import jtest.Repository;
import java.util.Set;
import com.palladium.paf.state.SliceState;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.UnitOfWork;
import com.palladium.paf.PafSecurityToken;
import com.palladium.paf.data.MemberTreeSet;
import com.palladium.paf.state.PafClientState;
import com.palladium.paf.comm.ClientInitRequest;
import com.palladium.paf.data.Intersection;
import com.palladium.paf.state.EvalState;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.MdbDef;
import java.util.Map;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.comm.PafPlannerConfig;
import jtest.mocks.java.util.ArrayListMock;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.rules.RuleGroup;
import java.util.ArrayList;
import java.util.Iterator;
import jtest.mocks.java.util.ListMock;
import java.util.HashMap;
import java.lang.reflect.Member;
import jtest.Stubs;
import com.palladium.paf.app.MeasureFunctionFactory;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.server.RuleMngr;

/**
 * RuleMngrTest is a unit test class for class RuleMngr.
 * @see com.palladium.paf.server.RuleMngr
 * @author Parasoft Jtest 8.0
 */
public class RuleMngrTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public RuleMngrTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			(PafApplicationDef) null,
			(PafPlannerConfig) null);
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
		// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
		// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets1(
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
					case 2 :
					case 3 :
					case 4 :
						return Boolean.FALSE;
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:284)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					// 
					// at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:136)
					// at org.springframework.context.support.AbstractApplicationContext.getBeanNamesForType(AbstractApplicationContext.java:597)
					// at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:358)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:299)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					// 
					// at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:375)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:299)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					// 
					// at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:380)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:299)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					case 5 :
						return Boolean.TRUE;
					// at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:136)
					// at org.springframework.context.support.AbstractApplicationContext.getBeanNamesForType(AbstractApplicationContext.java:597)
					// at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:395)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:302)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return null;
				// at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:137)
				// at org.springframework.context.support.AbstractApplicationContext.getBeanNamesForType(AbstractApplicationContext.java:597)
				// at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:395)
				// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:302)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets2() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			(PafApplicationDef) null,
			(PafPlannerConfig) null);
		// ExceptionInInitializerError thrown, originator is possible setup problem
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
		// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
		// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
					case 2 :
						return Boolean.FALSE;
					// at org.springframework.beans.factory.support.DefaultListableBeanFactory.containsBeanDefinition(DefaultListableBeanFactory.java:105)
					// at org.springframework.context.support.AbstractApplicationContext.containsBeanDefinition(AbstractApplicationContext.java:577)
					// at org.springframework.context.support.AbstractApplicationContext.containsLocalBean(AbstractApplicationContext.java:469)
					// at org.springframework.context.support.AbstractApplicationContext.initMessageSource(AbstractApplicationContext.java:415)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:305)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					// 
					// at org.springframework.beans.factory.support.AbstractBeanFactory.containsSingleton(AbstractBeanFactory.java:544)
					// at org.springframework.context.support.AbstractApplicationContext.containsLocalBean(AbstractApplicationContext.java:469)
					// at org.springframework.context.support.AbstractApplicationContext.initMessageSource(AbstractApplicationContext.java:415)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:305)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					case 3 :
						return Boolean.TRUE;
					// at org.springframework.beans.factory.support.DefaultListableBeanFactory.containsBeanDefinition(DefaultListableBeanFactory.java:105)
					// at org.springframework.context.support.AbstractApplicationContext.containsBeanDefinition(AbstractApplicationContext.java:577)
					// at org.springframework.context.support.AbstractApplicationContext.containsLocalBean(AbstractApplicationContext.java:469)
					// at org.springframework.context.support.AbstractApplicationContext.initApplicationEventMulticaster(AbstractApplicationContext.java:444)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:308)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:182)
					// at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:147)
					// at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:548)
					// at org.springframework.context.support.AbstractApplicationContext.initApplicationEventMulticaster(AbstractApplicationContext.java:445)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:308)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					case 2 :
						return "";
					// at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:347)
					// at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedBeanDefinition(AbstractBeanFactory.java:671)
					// at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
					// at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:147)
					// at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:548)
					// at org.springframework.context.support.AbstractApplicationContext.initApplicationEventMulticaster(AbstractApplicationContext.java:445)
					// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:308)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
					// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
					// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
					// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
					// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets3() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			(PafApplicationDef) null,
			(PafPlannerConfig) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1199)
		// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
		// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets3(
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
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getApplications", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafDataService.loadApplications(PafDataService.java:1198)
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets4() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			(PafApplicationDef) null,
			(PafPlannerConfig) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.RuleMngr.calculateRuleSets(Lcom/palladium/paf/data/MemberTreeSet;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/comm/PafPlannerConfig;)[Lcom/palladium/paf/rules/RuleSet;>
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:137)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets4(
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
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets5() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			t1,
			(PafPlannerConfig) null);
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return null;
				// at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:137)
				// at org.springframework.context.support.AbstractApplicationContext.getBeanNamesForType(AbstractApplicationContext.java:597)
				// at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:358)
				// at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:299)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:80)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:65)
				// at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:56)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets9() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(
			(MemberTreeSet) null,
			t1,
			(PafPlannerConfig) null);
		// NullPointerException thrown, originator is arg 3 to <Method com.palladium.paf.server.RuleMngr.calculateRuleSets(Lcom/palladium/paf/data/MemberTreeSet;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/comm/PafPlannerConfig;)[Lcom/palladium/paf/rules/RuleSet;>
		// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:109)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets9.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets9(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.thoughtworks.xstream.io.path.PathTracker.pushElement(PathTracker.java:75)
				// at com.thoughtworks.xstream.io.path.PathTrackingReader.<init>(PathTrackingReader.java:22)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.<init>(ReferenceByXPathUnmarshaller.java:23)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.thoughtworks.xstream.io.path.PathTracker.pushElement(PathTracker.java:76)
				// at com.thoughtworks.xstream.io.path.PathTrackingReader.<init>(PathTrackingReader.java:22)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.<init>(ReferenceByXPathUnmarshaller.java:23)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets11() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		_f7 = new ServerSettings();
		PafPlannerConfig t3 = new PafPlannerConfig();
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t3);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:405)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets11.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets11(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.thoughtworks.xstream.io.path.PathTracker.pushElement(PathTracker.java:75)
				// at com.thoughtworks.xstream.io.path.PathTrackingReader.<init>(PathTrackingReader.java:22)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.<init>(ReferenceByXPathUnmarshaller.java:23)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.thoughtworks.xstream.io.path.PathTracker.pushElement(PathTracker.java:78)
				// at com.thoughtworks.xstream.io.path.PathTrackingReader.<init>(PathTrackingReader.java:22)
				// at com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller.<init>(ReferenceByXPathUnmarshaller.java:23)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return Stubs.makeStubObject(ClassLoader.class);
				// at com.thoughtworks.xstream.core.util.CompositeClassLoader.loadClass(CompositeClassLoader.java:56)
				// at com.thoughtworks.xstream.core.util.ClassLoaderReference.loadClass(ClassLoaderReference.java:19)
				// at com.thoughtworks.xstream.mapper.DefaultMapper.realClass(DefaultMapper.java:33)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.XmlFriendlyMapper.realClass(XmlFriendlyMapper.java:44)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.ClassAliasingMapper.realClass(ClassAliasingMapper.java:49)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.DynamicProxyMapper.realClass(DynamicProxyMapper.java:46)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.ArrayMapper.realClass(ArrayMapper.java:44)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.MapperWrapper.realClass(MapperWrapper.java:18)
				// at com.thoughtworks.xstream.mapper.CachingMapper.realClass(CachingMapper.java:28)
				// at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:95)
				// at com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy.unmarshal(ReferenceByXPathMarshallingStrategy.java:12)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:521)
				// at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:509)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:475)
				// at com.thoughtworks.xstream.XStream.fromXML(XStream.java:468)
				// at com.palladium.utility.PafXStream.importObjectFromXml(PafXStream.java:110)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets15() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t4);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.RuleMngr.calculateRuleSets(Lcom/palladium/paf/data/MemberTreeSet;Lcom/palladium/paf/app/PafApplicationDef;Lcom/palladium/paf/comm/PafPlannerConfig;)[Lcom/palladium/paf/rules/RuleSet;>
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets17() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var1 = new PlanCycle[] {};
		t1.setPlanCycles(var1);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var2 = new String[] {};
		t3.setHierDims(var2);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var3 = new String[] {};
		t3.setAxisPriority(var3);
		t1.setMdbDef(t3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var5);
		t4.setCycle("");
		String[] var6 = new String[] {};
		t4.setMenuItemNames(var6);
		t4.setRole("");
		String[] var7 = new String[] {};
		t4.setViewTreeItemNames(var7);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var8 = new String[] { null };
		t4.setRuleSetNames(var8);
		String[] var9 = new String[] {};
		t4.setVersionFilter(var9);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:116)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets19() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:406)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets20() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		_f7 = new ServerSettings();
		_f35 = new Configuration();
		PafPlannerConfig t6 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t6.setCycle("");
		String[] var7 = new String[] {};
		t6.setMenuItemNames(var7);
		t6.setRole("");
		String[] var8 = new String[] {};
		t6.setViewTreeItemNames(var8);
		t6.setDefaultEvalEnabled(false);
		t6.setDefaultRulesetName("");
		String[] var9 = new String[] { null };
		t6.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t6.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t6);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:125)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets20.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets20(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafDataService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "loadApplications", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.server.PafDataService.<init>(PafDataService.java:1173)
				// at com.palladium.paf.server.PafDataService.getInstance(PafDataService.java:1056)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:135)
			}
		}
		if (Stubs.matches(method, ClassPathXmlApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs
					.makeStubObject(ClassPathXmlApplicationContext.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:73)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return _f35;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, UserSuppliedConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return null;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets22() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t1.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var4);
		t4.setCycle("");
		String[] var5 = new String[] {};
		t4.setMenuItemNames(var5);
		t4.setRole("");
		String[] var6 = new String[] {};
		t4.setViewTreeItemNames(var6);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var7 = new String[] {};
		t4.setRuleSetNames(var7);
		String[] var8 = new String[] {};
		t4.setVersionFilter(var8);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets22.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets22(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets23() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals(1, RETVAL.length); // jtest_unverified
		assertNotNull(RETVAL[0]); // jtest_unverified
		assertEquals("", RETVAL[0].toString()); // jtest_unverified
		assertEquals(5, t3.getDimCount()); // jtest_unverified
		assertEquals("[]", _f0.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets23.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets23(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "values", argument_types)) {
				return Stubs.makeStubObject(Collection.class);
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:170)
			}
		}
		if (Stubs.matches(method, Collection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.RuleMngr.createVersionRuleGroups(RuleMngr.java:182)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:170)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "iterator", argument_types)) {
				return Stubs.makeStubObject(Iterator.class);
				// at com.palladium.paf.server.RuleMngr.createVersionRuleGroups(RuleMngr.java:184)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:170)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "hasNext", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.createVersionRuleGroups(RuleMngr.java:184)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:170)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets28() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t1.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var4);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:160)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets28.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets28(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if ("java.util.TreeMap$1".equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.TreeMap$1.size()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
					case 2 :
					case 3 :
						return new Integer(2);
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:151)
					// 
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:155)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets31() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		_f24 = new PafMemberTree();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.mdb.PafMemberTree.getMembersByGen(PafMemberTree.java:1497)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets31.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets31(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, PafPlannerConfig.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleSetNames", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:109)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return _f24;
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets32() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:373)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets32.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets32(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, PafPlannerConfig.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleSetNames", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:109)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(0);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
					case 2 :
						return new Integer(1);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:373)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets33() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		PafMember t7 = new PafMember((String) null);
		_f24 = new PafMemberTree(t7, (String[]) null, 0, 1.000000f);
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets33.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets33(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return _f24;
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets36() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.createVersionRuleGroups(RuleMngr.java:182)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:170)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets36.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets36(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:346)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets37() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		PafPlannerConfig t2 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		t2.setCycle("");
		String[] var2 = new String[] {};
		t2.setMenuItemNames(var2);
		t2.setRole("");
		String[] var3 = new String[] {};
		t2.setViewTreeItemNames(var3);
		t2.setDefaultEvalEnabled(false);
		t2.setDefaultRulesetName("");
		String[] var4 = new String[] {};
		t2.setRuleSetNames(var4);
		String[] var5 = new String[] {};
		t2.setVersionFilter(var5);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets((MemberTreeSet) null, t1, t2);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:144)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets37.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets37(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, PafPlannerConfig.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleSetNames", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:109)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#calculateRuleSets(com.palladium.paf.data.MemberTreeSet,com.palladium.paf.app.PafApplicationDef,com.palladium.paf.comm.PafPlannerConfig)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCalculateRuleSets42() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafApplicationDef t1 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		PafPlannerConfig t4 = new PafPlannerConfig();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		MemberTreeSet t6 = new MemberTreeSet();
		t1.setSeasonList(t2);
		t1.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		t1.setPlanCycles(var2);
		t1.setLastPeriod("");
		t1.setCurrentYear("");
		t3.setYearDim("");
		String[] var3 = new String[] {};
		t3.setHierDims(var3);
		t3.setMeasureDim("");
		t3.setPlanTypeDim("");
		t3.setTimeDim("");
		t3.setVersionDim("");
		t3.setDataSourceId("");
		String[] var4 = new String[] {};
		t3.setAxisPriority(var4);
		t1.setMdbDef(t3);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setMeasures(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setVersions(var6);
		t4.setCycle("");
		String[] var7 = new String[] {};
		t4.setMenuItemNames(var7);
		t4.setRole("");
		String[] var8 = new String[] {};
		t4.setViewTreeItemNames(var8);
		t4.setDefaultEvalEnabled(false);
		t4.setDefaultRulesetName("");
		String[] var9 = new String[] {};
		t4.setRuleSetNames(var9);
		String[] var10 = new String[] {};
		t4.setVersionFilter(var10);
		// jtest_tested_method
		RuleSet[] RETVAL = THIS.calculateRuleSets(t6, t1, t4);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
		// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCalculateRuleSets42.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCalculateRuleSets42(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, PafPlannerConfig.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleSetNames", argument_types)) {
				return new String[0];
				// at com.palladium.paf.server.RuleMngr.filterUserRuleSets(RuleMngr.java:109)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:140)
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:145)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return Stubs.makeStubObject(SortedMap.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		if (Stubs.matches(method, SortedMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
				// at com.palladium.paf.server.RuleMngr.calculateRuleSets(RuleMngr.java:147)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet1() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberTree t1 = new PafMemberTree(t0, (String[]) null, 0);
		_f25 = new Integer(0);
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			t1,
			(TimeBalance) null,
			(String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:80)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return Stubs.makeStubObject(SortedMap.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, SortedMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return _f25;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet2() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberAttr t1 = new PafMemberAttr();
		Object[] var1 = new Object[] {};
		ListMock t2 = new ListMock(var1);
		PafMember t3 = new PafMember();
		PafMemberTree t4 = new PafMemberTree(t0, (String[]) null);
		_f25 = new Integer(0);
		t0.setPafMemberAttr(t1);
		t0.setChildren(t2);
		JT.invoke(
			PafMember.class,
			t0,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			t0,
			"setParent",
			new Object[] { t3 },
			new Class[] { PafMember.class });
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			t4,
			(TimeBalance) null,
			(String) null);
		// com.palladium.paf.PafException thrown
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:110)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
		// Caused by: java.lang.NullPointerException
		// at com.palladium.paf.mdb.PafMemberTree.addToLvlTree(PafMemberTree.java:1453)
		// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:68)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return Stubs.makeStubObject(SortedMap.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, SortedMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return _f25;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet5() throws Throwable {
		PafMemberTree t0 = new PafMemberTree();
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			t0,
			(TimeBalance) null,
			(String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.PafMemberTree.getMembersByGen(PafMemberTree.java:1497)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
		// jtest_unverified
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet6() throws Throwable {
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			(TimeBalance) null,
			(String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(Lcom/palladium/paf/mdb/PafMemberTree;Lcom/palladium/utility/TimeBalance;Ljava/lang/String;)Lcom/palladium/paf/rules/RuleSet;>
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:351)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("java.util.TreeMap$1".equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet7() throws Throwable {
		PafMember t0 = new PafMember((String) null);
		PafMemberTree t1 = new PafMemberTree(t0, (String[]) null, 0, 0.000000f);
		PafMember t2 = new PafMember((String) null);
		_f25 = new Integer("0");
		_f26 = new Integer("1");
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		_f27 = new PafMember();
		Object[] var2 = new Object[] { "" };
		ListMock t8 = new ListMock(var2);
		PafMember t9 = new PafMember((String) null);
		TimeBalance t10 = TimeBalance.valueOf("Last");
		JT.invoke(
			PafMemberTree.class,
			t1,
			"setRoot",
			new Object[] { t2 },
			new Class[] { PafMember.class });
		String[] var3 = new String[] {};
		t1.setAliasTableNames(var3);
		t1.setId("");
		_f27.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f27.setChildren(t8);
		JT.invoke(
			PafMember.class,
			_f27,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			_f27,
			"setParent",
			new Object[] { t9 },
			new Class[] { PafMember.class });
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr
			.createHierarchyRuleSet(t1, t10, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet7(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Integer.TYPE, Float.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:95)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:96)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToLvlTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:103)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[] { PafMember.class };
			if (Stubs.matches(method, "addToGenTree", argument_types)) {
				return Stubs.VOID;
				// at com.palladium.paf.mdb.PafMemberTree.<init>(PafMemberTree.java:104)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return Stubs.makeStubObject(SortedMap.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, SortedMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return _f25;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				return _f26;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
		}
		if (Stubs.matches(method, Iterator.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "next", argument_types)) {
				return _f27;
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:346)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet8() throws Throwable {
		TimeBalance t1 = TimeBalance.valueOf("Last");
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			t1,
			"");
		assertEquals(null, RETVAL); // jtest_unverified
		assertNotNull(RuleMngr.getInstance()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("java.util.TreeMap$1".equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet10() throws Throwable {
		PafMemberTree t0 = new PafMemberTree();
		PafMember t1 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t3 = new ListMock(var1);
		PafMember t4 = new PafMember((String) null);
		t1.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		t1.setChildren(t3);
		JT.invoke(
			PafMember.class,
			t1,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			t1,
			"setParent",
			new Object[] { t4 },
			new Class[] { PafMember.class });
		JT.invoke(
			PafMemberTree.class,
			t0,
			"setRoot",
			new Object[] { t1 },
			new Class[] { PafMember.class });
		String[] var2 = new String[] {};
		t0.setAliasTableNames(var2);
		t0.setId("");
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			t0,
			(TimeBalance) null,
			(String) null);
		// NullPointerException thrown, originator is possible setup problem
		// at com.palladium.paf.mdb.PafMemberTree.getMembersByGen(PafMemberTree.java:1501)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
		// jtest_unverified
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet12() throws Throwable {
		TimeBalance t1 = TimeBalance.valueOf("Last");
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			t1,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:383)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet12.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet12(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("java.util.TreeMap$1".equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:382)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:383)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet15() throws Throwable {
		TimeBalance t1 = TimeBalance.valueOf("Last");
		_f27 = new PafMember((String) null);
		Object[] var1 = new Object[] {};
		ListMock t4 = new ListMock(var1);
		PafMember t5 = new PafMember((String) null);
		_f27.setPafMemberAttr((PafMemberAttr) Repository.getObject(
			PafMemberAttr.class,
			"PafMemberAttr"));
		_f27.setChildren(t4);
		JT.invoke(
			PafMember.class,
			_f27,
			"setKey",
			new Object[] { "" },
			new Class[] { String.class });
		JT.invoke(
			PafMember.class,
			_f27,
			"setParent",
			new Object[] { t5 },
			new Class[] { PafMember.class });
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			t1,
			(String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:386)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:382)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
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
						return _f27;
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:383)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return "";
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:386)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet24() throws Throwable {
		TimeBalance t1 = TimeBalance.valueOf("Last");
		_f27 = new PafMember((String) null);
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			t1,
			(String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:386)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("java.util.TreeMap$1".equals(method.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.ArrayList.size()");
				switch (index) {
					case 1 :
						return new Integer(1);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:347)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return new Integer(0);
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:382)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
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
						return _f27;
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:383)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return null;
					// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:386)
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Rule.class);
				// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:384)
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#createHierarchyRuleSet(com.palladium.paf.mdb.PafMemberTree,com.palladium.utility.TimeBalance,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testCreateHierarchyRuleSet26() throws Throwable {
		TimeBalance t1 = TimeBalance.valueOf("Last");
		_f25 = new Integer("0");
		_f26 = new Integer(7);
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		_f28 = new Integer(7);
		Object[] var2 = new Object[] { null };
		_f29 = new ListMock(var2);
		// jtest_tested_method
		RuleSet RETVAL = RuleMngr.createHierarchyRuleSet(
			(PafMemberTree) Repository.getObject(
				PafMemberTree.class,
				"TimeTree"),
			t1,
			"");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculateHierarchicalRuleGroups(RuleMngr.java:346)
		// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCreateHierarchyRuleSet26.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCreateHierarchyRuleSet26(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafMemberTree.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMembersByGen", argument_types)) {
				return Stubs.makeStubObject(SortedMap.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:311)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "keySet", argument_types)) {
				return Stubs.makeStubObject(Set.class);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.Map.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f0;
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					case 2 :
						return _f29;
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:329)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Set.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(2);
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:312)
			}
		}
		if (Stubs.matches(method, SortedMap.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "firstKey", argument_types)) {
				return _f25;
				// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "lastKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.SortedMap.lastKey()");
				switch (index) {
					case 1 :
						return _f26;
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
					case 2 :
						return _f28;
					// at com.palladium.paf.server.RuleMngr.createHierarchyRuleSet(RuleMngr.java:328)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static findLeadingRule(com.palladium.paf.rules.RuleGroup,com.palladium.paf.state.EvalState,com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#findLeadingRule(com.palladium.paf.rules.RuleGroup,com.palladium.paf.state.EvalState,com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindLeadingRule1() throws Throwable {
		// jtest_tested_method
		Rule RETVAL = RuleMngr.findLeadingRule(
			(RuleGroup) null,
			(EvalState) null,
			(Intersection) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.RuleMngr.findLeadingRule(Lcom/palladium/paf/rules/RuleGroup;Lcom/palladium/paf/state/EvalState;Lcom/palladium/paf/data/Intersection;)Lcom/palladium/paf/rules/Rule;>
		// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
		// jtest_unverified
	}

	/**
	 * Test for method: static findLeadingRule(com.palladium.paf.rules.RuleGroup,com.palladium.paf.state.EvalState,com.palladium.paf.data.Intersection)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#findLeadingRule(com.palladium.paf.rules.RuleGroup,com.palladium.paf.state.EvalState,com.palladium.paf.data.Intersection)
	 * @author Parasoft Jtest 8.0
	 */
	public void testFindLeadingRule2() throws Throwable {
		ClientInitRequest t0 = new ClientInitRequest();
		PafClientState t1 = new PafClientState((String) null, t0);
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
		_f9 = new MdbDef();
		_f16 = new MdbDef();
		EvalState t12 = new EvalState((SliceState) null, t1);
		t0.setClientType("");
		t0.setClientVersion("");
		t0.setIpAddress("");
		t0.setClientLanguage("");
		t1.setUowTrees(t2);
		t1.setSecurityToken(t3);
		t1.setApp(t4);
		t1.setUnitOfWork(t5);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		t1.setRuleSets(var3);
		Set var4 = (Set) Stubs.makeStubObject(Set.class);
		t1.setLockedPeriods(var4);
		Map var5 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedForwardPlannableInterMap(var5);
		Map var6 = (Map) Stubs.makeStubObject(Map.class);
		t1.setLockedNotPlannableInterMap(var6);
		t1.setPlannerRole(t6);
		t1.setPlanSeason(t7);
		t1.setClientLanguage("");
		Map var7 = (Map) Stubs.makeStubObject(Map.class);
		t1.setUserSelections(var7);
		Set var8 = (Set) Stubs.makeStubObject(Set.class);
		t1.setActiveVersions(var8);
		t1.setPlannerConfig(t8);
		_f16.setYearDim("");
		String[] var9 = new String[] {};
		_f16.setHierDims(var9);
		_f16.setMeasureDim("");
		_f16.setPlanTypeDim("");
		_f16.setTimeDim("");
		_f16.setVersionDim("");
		_f16.setDataSourceId("");
		String[] var10 = new String[] {};
		_f16.setAxisPriority(var10);
		// jtest_tested_method
		Rule RETVAL = RuleMngr.findLeadingRule(
			(RuleGroup) null,
			t12,
			(Intersection) null);
		// NullPointerException thrown
		// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
		// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
		// jtest_unverified
	}

	/**
	 * Stubs method for testFindLeadingRule2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsFindLeadingRule2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.app.PafApplicationDef.getMdbDef()");
				switch (index) {
					case 1 :
						return _f9;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:103)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					case 2 :
						return _f16;
					// at com.palladium.paf.state.EvalState.init(EvalState.java:104)
					// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					case 3 :
						return null;
					// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, MemberTreeSet.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getTree", argument_types)) {
				return Repository.getObject(PafMemberTree.class, "TimeTree");
				// at com.palladium.paf.state.EvalState.init(EvalState.java:153)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
			}
		}
		if (Stubs.matches(method, ArrayList.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.mdb.PafMemberTree.memberTraversal(PafMemberTree.java:379)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:268)
				// at com.palladium.paf.mdb.PafMemberTree.getMemberNames(PafMemberTree.java:252)
				// at com.palladium.paf.state.EvalState.init(EvalState.java:154)
				// at com.palladium.paf.state.EvalState.<init>(EvalState.java:91)
				// at com.palladium.paf.server.RuleMngr.findLeadingRule(RuleMngr.java:282)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		_f7 = new ServerSettings();
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap((String) null);
		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
		// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
		// at com.palladium.paf.server.PafAppService.getApplication(PafAppService.java:82)
		// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap1(
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
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, AbstractApplicationContext.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getBean", argument_types)) {
				return _f7;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:85)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, Configuration.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "configure", argument_types)) {
				return Stubs.makeStubObject(Configuration.class);
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:130)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
			argument_types = new Class[] { String.class, String.class };
			if (Stubs.matches(method, "setProperty", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:131)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "buildSessionFactory", argument_types)) {
				return null;
				// at com.palladium.paf.server.PafMetaData.<clinit>(PafMetaData.java:133)
				// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
				// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.lang.Class.forName(java.lang.String,boolean,java.lang.ClassLoader)");
				switch (index) {
					case 1 :
						throw new ClassNotFoundException();
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.mapper.EnumMapper.<clinit>(EnumMapper.java:16)
					// at com.thoughtworks.xstream.XStream.buildMapper(XStream.java:221)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:192)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					case 2 :
					case 3 :
					case 4 :
					case 5 :
					case 6 :
					case 7 :
					case 8 :
					case 9 :
					case 10 :
						return java.lang.Object.class;
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:276)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:277)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:287)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:288)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:289)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:290)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:294)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
					// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:295)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					// 
					// at com.thoughtworks.xstream.XStream.dynamicallyRegisterConverter(XStream.java:384)
					// at com.thoughtworks.xstream.XStream.setupConverters(XStream.java:353)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:196)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
					// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
					// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
					// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
					// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
					// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
					// at com.palladium.paf.server.PafMetaData.importApplications(PafMetaData.java:503)
					// at com.palladium.paf.server.PafAppService.loadApplications(PafAppService.java:63)
					// at com.palladium.paf.server.PafAppService.<init>(PafAppService.java:51)
					// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap2() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap("");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap4() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap((String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:239)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap4(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:239)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap6() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		_f8 = new PafApplicationDef();
		SeasonList t2 = new SeasonList();
		MdbDef t3 = new MdbDef();
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		_f8.setSeasonList(t2);
		_f8.setAppId("");
		PlanCycle[] var2 = new PlanCycle[] {};
		_f8.setPlanCycles(var2);
		_f8.setLastPeriod("");
		_f8.setCurrentYear("");
		_f8.setMdbDef(t3);
		Map var3 = (Map) Stubs.makeStubObject(Map.class);
		_f8.setMeasures(var3);
		Map var4 = (Map) Stubs.makeStubObject(Map.class);
		_f8.setVersions(var4);
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap((String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:102)
		// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap6(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(Map.class);
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:239)
					case 2 :
						return _f0;
					// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(0);
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:241)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap8() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap((String) null);
		assertNotNull(RETVAL); // jtest_unverified
		assertEquals("0", RETVAL.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap8.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap8(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Map.class);
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, Map.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "size", argument_types)) {
				return new Integer(1);
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getDependencyMap(java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getDependencyMap(java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetDependencyMap15() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		_f8 = new PafApplicationDef();
		_f9 = new MdbDef();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		_f9.setYearDim("");
		String[] var2 = new String[] {};
		_f9.setHierDims(var2);
		_f9.setMeasureDim("");
		_f9.setPlanTypeDim("");
		_f9.setTimeDim("");
		_f9.setVersionDim("");
		_f9.setDataSourceId("");
		String[] var3 = new String[] {};
		_f9.setAxisPriority(var3);
		// jtest_tested_method
		Map RETVAL = THIS.getDependencyMap((String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:104)
		// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetDependencyMap15.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetDependencyMap15(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return null;
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:239)
					case 2 :
						return _f0;
					// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
					// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, PafAppService.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(PafAppService.class);
				// at com.palladium.paf.server.PafAppService.getInstance(PafAppService.java:56)
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getApplication", argument_types)) {
				return _f8;
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		if (Stubs.matches(method, PafApplicationDef.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMdbDef", argument_types)) {
				return _f9;
				// at com.palladium.paf.server.RuleMngr.getDependencyMap(RuleMngr.java:244)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static getInstance()
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getInstance()
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetInstance1() throws Throwable {
		// jtest_tested_method
		RuleMngr RETVAL = RuleMngr.getInstance();
		assertNotNull(RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRuleSetsForConfig1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafPlannerConfig t1 = new PafPlannerConfig();
		PafApplicationDef t2 = new PafApplicationDef();
		_f7 = new ServerSettings();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		// jtest_tested_method
		List RETVAL = THIS.getMsrRuleSetsForConfig(t1, t2);
		assertEquals(_f0, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRuleSetsForConfig1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRuleSetsForConfig1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
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
				return _f7;
			}
		}
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
			}
		}
		if (Stubs.matches(method, PafPlannerConfig.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRuleSetNames", argument_types)) {
				return new String[0];
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
	 * Test for method: getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRuleSetsForConfig2() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		List RETVAL = THIS.getMsrRuleSetsForConfig(
			(PafPlannerConfig) null,
			(PafApplicationDef) null);

		// ClassCastException thrown
		// at java.lang.Class.cast(Class.java:2920)
		// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
		// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRuleSetsForConfig2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRuleSetsForConfig2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, Class.class)) {
			argument_types = new Class[] { String.class, Boolean.TYPE,
					ClassLoader.class };
			if (Stubs.matches(method, "forName", argument_types)) {
				return java.lang.Object.class;
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.mapper.EnumMapper.<clinit>(EnumMapper.java:16)
				// at com.thoughtworks.xstream.XStream.buildMapper(XStream.java:221)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:192)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.mapper.EnumMapper.<clinit>(EnumMapper.java:20)
				// at com.thoughtworks.xstream.XStream.buildMapper(XStream.java:221)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:192)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:276)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:277)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:287)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:288)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:289)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:290)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:294)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.core.JVM.loadClass(JVM.java:44)
				// at com.thoughtworks.xstream.XStream.setupAliases(XStream.java:295)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:194)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
				// 
				// at com.thoughtworks.xstream.XStream.dynamicallyRegisterConverter(XStream.java:384)
				// at com.thoughtworks.xstream.XStream.setupConverters(XStream.java:353)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:196)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:181)
				// at com.thoughtworks.xstream.XStream.<init>(XStream.java:156)
				// at com.palladium.utility.PafXStream.initXStream(PafXStream.java:38)
				// at com.palladium.utility.PafXStream.getXStream(PafXStream.java:30)
				// at com.palladium.utility.PafXStream.<clinit>(PafXStream.java:22)
				// at com.palladium.paf.server.PafMetaData.importObject(PafMetaData.java:519)
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRuleSetsForConfig3() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		PafPlannerConfig t1 = new PafPlannerConfig();
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		t1.setCycle("");
		String[] var2 = new String[] {};
		t1.setMenuItemNames(var2);
		t1.setRole("");
		String[] var3 = new String[] {};
		t1.setViewTreeItemNames(var3);
		t1.setDefaultEvalEnabled(false);
		t1.setDefaultRulesetName("");
		String[] var4 = new String[] {};
		t1.setRuleSetNames(var4);
		String[] var5 = new String[] {};
		t1.setVersionFilter(var5);
		// jtest_tested_method
		List RETVAL = THIS
			.getMsrRuleSetsForConfig(t1, (PafApplicationDef) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(Lcom/palladium/paf/comm/PafPlannerConfig;Lcom/palladium/paf/app/PafApplicationDef;)Ljava/util/List;>
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:406)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRuleSetsForConfig3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRuleSetsForConfig3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "importRuleSets", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getMsrRuleSetsForConfig(com.palladium.paf.comm.PafPlannerConfig,com.palladium.paf.app.PafApplicationDef)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetMsrRuleSetsForConfig17() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		List RETVAL = THIS.getMsrRuleSetsForConfig(
			(PafPlannerConfig) null,
			(PafApplicationDef) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
		// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetMsrRuleSetsForConfig17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetMsrRuleSetsForConfig17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if ("com.palladium.paf.server.PafMetaData".equals(method
			.getDeclaringClass().getName())) {
			argument_types = new Class[] { Class.class, String.class };
			if (Stubs.matches(method, "importObject", argument_types)) {
				return "";
				// at com.palladium.paf.server.PafMetaData.importRuleSets(PafMetaData.java:277)
				// at com.palladium.paf.server.RuleMngr.getMsrRuleSetsForConfig(RuleMngr.java:400)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(
			(RuleGroup) null,
			(String) null);
		// NullPointerException thrown, originator is arg 2 to <Method com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(Lcom/palladium/paf/rules/RuleGroup;Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:200)
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority2() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority((RuleGroup) null, "");
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(Lcom/palladium/paf/rules/RuleGroup;Ljava/lang/String;)Ljava/util/ArrayList;>
		// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:218)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority3() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority((RuleGroup) null, "");
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:205)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:205)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority5() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority((RuleGroup) null, "");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:205)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority5(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:205)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority7() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority((RuleGroup) null, "");
		assertEquals(null, RETVAL); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority7.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority7(
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
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return Stubs.makeStubObject(HashMap.class);
					case 2 :
						return null;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority16() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule();
		Formula t4 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t5 = new Boolean(false);
		_f4 = new Formula();
		Rule[] var1 = new Rule[] { t3 };
		t1.setRules(var1);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		t3.setKey(0);
		t3.setFormula(t4);
		String[] var2 = new String[] {};
		t3.setTriggerMeasures(var2);
		t3.setSkipAggregation(false);
		t3.setSkipAllocation(false);
		t3.setBaseAllocateMeasure("");
		t3.setLockAllocation(false);
		t3.setEvalLockedIntersections(false);
		t3.setCalcAllPeriods(false);
		t3.setLockSystemEvaluationResult(false);
		t3.setLockUserEvaluationResult(t5);
		t3.setLockAllPriorTime(false);
		t3.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority16.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority16(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:218)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f4;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority17() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t4 = new Formula((String) null, " ", var1);
		Boolean t5 = new Boolean(false);
		Rule[] var2 = new Rule[] { t3 };
		t1.setRules(var2);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		t3.setKey(0);
		t3.setFormula(t4);
		String[] var3 = new String[] {};
		t3.setTriggerMeasures(var3);
		t3.setSkipAggregation(false);
		t3.setSkipAllocation(false);
		t3.setBaseAllocateMeasure("");
		t3.setLockAllocation(false);
		t3.setEvalLockedIntersections(false);
		t3.setCalcAllPeriods(false);
		t3.setLockSystemEvaluationResult(false);
		t3.setLockUserEvaluationResult(t5);
		t3.setLockAllPriorTime(false);
		t3.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:228)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority17.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority17(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
				// 
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:224)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority18() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule("=0");
		_f4 = new Formula((String) null, "()", (MeasureFunctionFactory) null);
		Rule[] var1 = new Rule[] { t3 };
		t1.setRules(var1);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		_f4.setExpression("*+,");
		String[] var2 = new String[] {};
		_f4.setExpressionTerms(var2);
		_f4.setResultTerm("");
		_f4.setResultFunction(false);
		_f4.setParsed(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:225)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority18.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority18(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:224)
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:218)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:225)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, Rule.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getFormula", argument_types)) {
				return _f4;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority19() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule("=\uFFFF");
		Rule[] var1 = new Rule[] { t3 };
		t1.setRules(var1);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:209)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority19.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority19(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
				// 
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:224)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:229)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
				// 
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:208)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:209)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority21() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule();
		MeasureFunctionFactory var1 = (MeasureFunctionFactory) Stubs
			.makeStubObject(MeasureFunctionFactory.class);
		Formula t4 = new Formula((String) null, "-./0", var1);
		Boolean t5 = new Boolean(false);
		Rule[] var2 = new Rule[] { t3 };
		t1.setRules(var2);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		t3.setKey(0);
		t3.setFormula(t4);
		String[] var3 = new String[] {};
		t3.setTriggerMeasures(var3);
		t3.setSkipAggregation(false);
		t3.setSkipAllocation(false);
		t3.setBaseAllocateMeasure("");
		t3.setLockAllocation(false);
		t3.setEvalLockedIntersections(false);
		t3.setCalcAllPeriods(false);
		t3.setLockSystemEvaluationResult(false);
		t3.setLockUserEvaluationResult(t5);
		t3.setLockAllPriorTime(false);
		t3.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:225)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority21.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority21(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
					case 2 :
						return Boolean.TRUE;
					// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:224)
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:225)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, MeasureFunctionFactory.class)) {
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "isFunction", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:268)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[] { String.class };
			if (Stubs.matches(method, "getFunction", argument_types)) {
				return null;
				// at com.palladium.paf.rules.Formula.setResultTerm(Formula.java:270)
				// at com.palladium.paf.rules.Formula.init(Formula.java:87)
				// at com.palladium.paf.rules.Formula.<init>(Formula.java:81)
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpression", argument_types)) {
				return "\357\277\277";
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:225)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority24() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		Rule t3 = new Rule();
		Formula t4 = new Formula(
			(String) null,
			"",
			(MeasureFunctionFactory) null);
		Boolean t5 = new Boolean(false);
		Object[] var1 = new Object[] {};
		_f6 = new ArrayListMock(var1);
		Rule[] var2 = new Rule[] { t3 };
		t1.setRules(var2);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		t3.setKey(0);
		t4.setExpression("");
		String[] var3 = new String[] {};
		t4.setExpressionTerms(var3);
		t4.setResultTerm("");
		t4.setResultFunction(false);
		t4.setParsed(false);
		t3.setFormula(t4);
		String[] var4 = new String[] {};
		t3.setTriggerMeasures(var4);
		t3.setSkipAggregation(false);
		t3.setSkipAllocation(false);
		t3.setBaseAllocateMeasure("");
		t3.setLockAllocation(false);
		t3.setEvalLockedIntersections(false);
		t3.setCalcAllPeriods(false);
		t3.setLockSystemEvaluationResult(false);
		t3.setLockUserEvaluationResult(t5);
		t3.setLockAllPriorTime(false);
		t3.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		assertEquals(null, RETVAL); // jtest_unverified
		assertEquals("[]", _f6.toString()); // jtest_unverified
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority24.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority24(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.containsKey(java.lang.Object)");
				switch (index) {
					case 1 :
						return Boolean.FALSE;
					case 2 :
						return Boolean.TRUE;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("java.util.HashMap.get(java.lang.Object)");
				switch (index) {
					case 1 :
						return _f6;
					case 2 :
						return null;
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpression", argument_types)) {
				return "\357\277\277";
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleGroupChngPriority(com.palladium.paf.rules.RuleGroup,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleGroupChngPriority27() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleGroup t1 = new RuleGroup((Rule[]) null);
		Boolean t2 = new Boolean(false);
		_f3 = new Rule();
		Formula t4 = new Formula();
		Boolean t5 = new Boolean(false);
		_f10 = new Rule();
		Rule[] var1 = new Rule[] {};
		t1.setRules(var1);
		t1.setRuleGroupId("");
		t1.setBalanceSetKey("");
		t1.setPerpetual(false);
		t1.setDelayedPerpetual(false);
		t1.setSkipProtProc(false);
		t1.setPerpetualAllocation(false);
		t1.setPerformInitialAllocation(t2);
		_f3.setKey(0);
		t4.setExpression("");
		String[] var2 = new String[] {};
		t4.setExpressionTerms(var2);
		t4.setResultTerm("");
		t4.setResultFunction(false);
		t4.setParsed(false);
		_f3.setFormula(t4);
		String[] var3 = new String[] {};
		_f3.setTriggerMeasures(var3);
		_f3.setSkipAggregation(false);
		_f3.setSkipAllocation(false);
		_f3.setBaseAllocateMeasure("");
		_f3.setLockAllocation(false);
		_f3.setEvalLockedIntersections(false);
		_f3.setCalcAllPeriods(false);
		_f3.setLockSystemEvaluationResult(false);
		_f3.setLockUserEvaluationResult(t5);
		_f3.setLockAllPriorTime(false);
		_f3.setInitialTBFirstAllocation(false);
		// jtest_tested_method
		ArrayList RETVAL = THIS.getRuleGroupChngPriority(t1, "");
		// NullPointerException thrown
		// at java.util.HashMap$HashIterator.<init>(HashMap.java:771)
		// at java.util.HashMap$EntryIterator.<init>(HashMap.java:827)
		// at java.util.HashMap$EntryIterator.<init>(HashMap.java:827)
		// at java.util.HashMap.newEntryIterator(HashMap.java:841)
		// at java.util.HashMap$EntrySet.iterator(HashMap.java:934)
		// at java.util.AbstractMap.hashCode(AbstractMap.java:555)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:209)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleGroupChngPriority27.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleGroupChngPriority27(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.FALSE;
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:204)
				// 
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:224)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[] { Integer.TYPE };
			if (Stubs.matches(method, argument_types)) {
				return Stubs.makeStubObject(HashMap.class);
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:218)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[] { Object.class, Object.class };
			if (Stubs.matches(method, "put", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:229)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		if (Stubs.matches(method, RuleGroup.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getRules", argument_types)) {
				int index = _stubs_iteration
					.getIterationCount("com.palladium.paf.rules.RuleGroup.getRules()");
				switch (index) {
					case 1 :
					case 2 :
						return new Rule[0];
					// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:218)
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
					case 3 :
					case 4 :
						return new Rule[] { _f3, _f10 };
					// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:220)
					// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
					default :
						return Stubs.NO_STUB_GENERATED;
				}
			}
		}
		if (Stubs.matches(method, Formula.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getExpression", argument_types)) {
				return "\357\277\2770";
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:221)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
			argument_types = new Class[0];
			if (Stubs.matches(method, "getResultTerm", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.calculatePriorityMap(RuleMngr.java:228)
				// at com.palladium.paf.server.RuleMngr.getRuleGroupChngPriority(RuleMngr.java:207)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSet(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleSet(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSet1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet RETVAL = THIS.getRuleSet((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
		// jtest_unverified
	}

	/**
	 * Test for method: getRuleSet(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleSet(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSet3() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet RETVAL = THIS.getRuleSet((String) null, (String) null);
		// ClassCastException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSet3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSet3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSet(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleSet(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSet4() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet RETVAL = THIS.getRuleSet((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:101)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSet4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSet4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return null;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSet(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleSet(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSet5() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		Object[] var1 = new Object[] {};
		_f0 = new ListMock(var1);
		// jtest_tested_method
		RuleSet RETVAL = THIS.getRuleSet((String) null, (String) null);
		// IllegalArgumentException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:104)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSet5.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSet5(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: getRuleSet(java.lang.String,java.lang.String)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#getRuleSet(java.lang.String,java.lang.String)
	 * @author Parasoft Jtest 8.0
	 */
	public void testGetRuleSet6() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		Object[] var1 = new Object[] { null };
		_f0 = new ListMock(var1);
		// jtest_tested_method
		RuleSet RETVAL = THIS.getRuleSet((String) null, (String) null);
		// NullPointerException thrown
		// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:102)
		// jtest_unverified
	}

	/**
	 * Stubs method for testGetRuleSet6.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsGetRuleSet6(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, HashMap.class)) {
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "containsKey", argument_types)) {
				return Boolean.TRUE;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:99)
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "get", argument_types)) {
				return _f0;
				// at com.palladium.paf.server.RuleMngr.getRuleSet(RuleMngr.java:100)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: parseRuleSet(com.palladium.paf.rules.RuleSet,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#parseRuleSet(com.palladium.paf.rules.RuleSet,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParseRuleSet1() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		// jtest_tested_method
		RuleSet RETVAL = THIS.parseRuleSet(
			(RuleSet) null,
			(MeasureFunctionFactory) null);
		// NullPointerException thrown, originator is arg 1 to <Method com.palladium.paf.server.RuleMngr.parseRuleSet(Lcom/palladium/paf/rules/RuleSet;Lcom/palladium/paf/app/MeasureFunctionFactory;)Lcom/palladium/paf/rules/RuleSet;>
		// at com.palladium.paf.server.RuleMngr.parseRuleSet(RuleMngr.java:87)
		// jtest_unverified
	}

	/**
	 * Test for method: parseRuleSet(com.palladium.paf.rules.RuleSet,com.palladium.paf.app.MeasureFunctionFactory)
	 * @throws Throwable Tests may throw any Throwable
	 * @see RuleMngr#parseRuleSet(com.palladium.paf.rules.RuleSet,com.palladium.paf.app.MeasureFunctionFactory)
	 * @author Parasoft Jtest 8.0
	 */
	public void testParseRuleSet2() throws Throwable {
		RuleMngr THIS = RuleMngr.getInstance();
		RuleSet t1 = new RuleSet();
		// jtest_tested_method
		RuleSet RETVAL = THIS.parseRuleSet(t1, (MeasureFunctionFactory) null);
		assertEquals(t1, RETVAL); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.RuleMngrTest
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
            RuleMngrTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.RuleMngr",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return RuleMngr.class;
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
private Formula _f4;
        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ArrayListMock _f6;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private ServerSettings _f7;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafApplicationDef _f8;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f9;
                                                                                                                                                                        /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f51;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f52;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f53;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f54;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private PafMember _f55;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Integer _f56;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private Integer _f57;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f58;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f59;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f60;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f61;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f62;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f63;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f64;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f65;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f66;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f67;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f68;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f69;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f70;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private RuleSet _f71;
    /**
     * Used to pass information between test method and stubs methods.
     * @author Parasoft Jtest 8.0
     */
private MdbDef _f72;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f3;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Formula _f5;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f11;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f12;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f13;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f14;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f15;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f16;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f17;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f18;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f19;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f20;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f21;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private MdbDef _f22;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f23;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMemberTree _f24;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f25;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f26;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f27;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Integer _f28;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private ListMock _f29;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f30;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f31;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f32;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f33;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private PafMember _f34;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Configuration _f35;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f1;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f2;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private Rule _f10;
	/**
	 * Used to pass information between test method and stubs methods.
	 * @author Parasoft Jtest 8.0
	 */
private RuleSet _f36;
}

// JTEST_CURRENT_ID=1264223616.