/*
 * HibernateSessionFactoryTest.java
 * Created by Jtest on 9/19/06 3:24:05 PM.
 * Updated by Jtest on 10/18/06 10:39:36 AM, 4 test cases added, 4 test cases removed.
 * Updated by Jtest on 11/8/06 8:59:54 PM, 4 test cases added, 4 test cases removed.
 */

package com.palladium.paf.server;

import java.sql.SQLException;
import java.sql.Connection;
import org.hibernate.connection.DriverManagerConnectionProvider;
import jtest.Stubs;
import java.lang.reflect.Member;
import org.hibernate.Session;
import com.palladium.paf.server.HibernateSessionFactory;

/**
 * HibernateSessionFactoryTest is a unit test class for class HibernateSessionFactory.
 * @see com.palladium.paf.server.HibernateSessionFactory
 * @author Parasoft Jtest 8.0
 */
public class HibernateSessionFactoryTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public HibernateSessionFactoryTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }
	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession1() throws Throwable {
		// jtest_tested_method
		HibernateSessionFactory.closeSession();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession3() throws Throwable {
		// jtest_tested_method
		HibernateSessionFactory.closeSession();
		// No exception thrown
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession3(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return Stubs.makeStubObject(Session.class);
			}
			argument_types = new Class[] { Object.class };
			if (Stubs.matches(method, "set", argument_types)) {
				return Stubs.VOID;
			}
		}
		if (Stubs.matches(method, Session.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "close", argument_types)) {
				return null;
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}
	/**
	 * Test for method: static closeSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#closeSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCloseSession4() throws Throwable {
		// jtest_tested_method
		HibernateSessionFactory.closeSession();
		// ClassCastException thrown
		// at com.palladium.paf.server.HibernateSessionFactory.closeSession(HibernateSessionFactory.java:69)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCloseSession4.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCloseSession4(Member method, Object _this, Object[] args)
		throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.HibernateSessionFactory.closeSession(HibernateSessionFactory.java:69)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static currentSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#currentSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCurrentSession1() throws Throwable {
		// jtest_tested_method
		Session RETVAL = HibernateSessionFactory.currentSession();
		// ExceptionInInitializerError thrown
		// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
		// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
		// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
		// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
		// at org.apache.xerces.parsers.AbstractSAXParser.startElement(Unknown Source)
		// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement(Unknown Source)
		// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement(Unknown Source)
		// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook(Unknown Source)
		// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch(Unknown Source)
		// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument(Unknown Source)
		// at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
		// at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
		// at org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
		// at org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
		// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
		// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
		// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
		// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:48)
		// Caused by: java.lang.NullPointerException
		// at org.dom4j.tree.ConcurrentReaderHashMap$HashIterator.<init>(ConcurrentReaderHashMap.java:1133)
		// at org.dom4j.tree.ConcurrentReaderHashMap$EntrySet.iterator(ConcurrentReaderHashMap.java:954)
		// at java.util.AbstractMap.hashCode(AbstractMap.java:555)
		// at java.util.HashMap.hash(HashMap.java:264)
		// at java.util.WeakHashMap.getEntry(WeakHashMap.java:370)
		// at java.util.WeakHashMap.containsKey(WeakHashMap.java:361)
		// at org.dom4j.tree.ConcurrentReaderHashMap.<init>(ConcurrentReaderHashMap.java:325)
		// at org.dom4j.tree.ConcurrentReaderHashMap.<init>(ConcurrentReaderHashMap.java:351)
		// at org.dom4j.tree.NamespaceCache.getURICache(NamespaceCache.java:157)
		// at org.dom4j.tree.NamespaceCache.get(NamespaceCache.java:80)
		// at org.dom4j.Namespace.<clinit>(Namespace.java:28)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCurrentSession1.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCurrentSession1(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return null;
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:49)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static currentSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#currentSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCurrentSession2() throws Throwable {
		// jtest_tested_method
		Session RETVAL = HibernateSessionFactory.currentSession();
		// NoClassDefFoundError thrown
		// at org.dom4j.DocumentFactory.createNamespace(DocumentFactory.java:185)
		// at org.dom4j.tree.NamespaceStack.createNamespace(NamespaceStack.java:407)
		// at org.dom4j.tree.NamespaceStack.getQName(NamespaceStack.java:211)
		// at org.dom4j.io.SAXContentHandler.startElement(SAXContentHandler.java:234)
		// at org.apache.xerces.parsers.AbstractSAXParser.startElement(Unknown Source)
		// at org.apache.xerces.impl.dtd.XMLDTDValidator.startElement(Unknown Source)
		// at org.apache.xerces.impl.XMLNSDocumentScannerImpl.scanStartElement(Unknown Source)
		// at org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher.scanRootElementHook(Unknown Source)
		// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher.dispatch(Unknown Source)
		// at org.apache.xerces.impl.XMLDocumentFragmentScannerImpl.scanDocument(Unknown Source)
		// at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
		// at org.apache.xerces.parsers.XML11Configuration.parse(Unknown Source)
		// at org.apache.xerces.parsers.XMLParser.parse(Unknown Source)
		// at org.apache.xerces.parsers.AbstractSAXParser.parse(Unknown Source)
		// at org.dom4j.io.SAXReader.read(SAXReader.java:465)
		// at org.hibernate.cfg.Configuration.doConfigure(Configuration.java:1206)
		// at org.hibernate.cfg.Configuration.configure(Configuration.java:1150)
		// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:48)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCurrentSession2.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCurrentSession2(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, DriverManagerConnectionProvider.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getConnection", argument_types)) {
				return Stubs.makeStubObject(Connection.class);
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:72)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:49)
			}
		}
		if (Stubs.matches(method, Connection.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "getMetaData", argument_types)) {
				throw new SQLException();
				// at org.hibernate.cfg.SettingsFactory.buildSettings(SettingsFactory.java:74)
				// at org.hibernate.cfg.Configuration.buildSettings(Configuration.java:1502)
				// at org.hibernate.cfg.Configuration.buildSessionFactory(Configuration.java:1031)
				// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:49)
			}
		}
		return Stubs.NO_STUB_GENERATED;
	}

	/**
	 * Test for method: static currentSession()
	 * @throws Throwable Tests may throw any Throwable
	 * @see HibernateSessionFactory#currentSession()
	 * @author Parasoft Jtest 8.0
	 */
	public void testCurrentSession3() throws Throwable {
		// jtest_tested_method
		Session RETVAL = HibernateSessionFactory.currentSession();
		// ClassCastException thrown
		// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:43)
		// jtest_unverified
	}

	/**
	 * Stubs method for testCurrentSession3.
	 * @param method The method or constructor to be called
	 * @param _this The instance object corresponding to the method or
	 *        <code>null</code> for static methods
	 * @param args The arguments passed to the method
	 * @return The new return value or <code>Stubs.NO_STUB_GENERATED</code>
	 * @throws Throwable Stubs may throw any Throwable
	 * @author Parasoft Jtest 8.0
	 */
	public Object stubsCurrentSession3(
		Member method,
		Object _this,
		Object[] args) throws Throwable {
		Class[] argument_types;
		if (Stubs.matches(method, ThreadLocal.class)) {
			argument_types = new Class[0];
			if (Stubs.matches(method, "get", argument_types)) {
				return "";
				// at com.palladium.paf.server.HibernateSessionFactory.currentSession(HibernateSessionFactory.java:43)
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
     * Usage: java com.palladium.paf.server.HibernateSessionFactoryTest
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
            HibernateSessionFactoryTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.HibernateSessionFactory",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return HibernateSessionFactory.class;
    }

    		}

// JTEST_CURRENT_ID=-455539955.