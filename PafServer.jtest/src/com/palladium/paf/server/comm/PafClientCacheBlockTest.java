/*
 * PafClientCacheBlockTest.java
 * Created by Jtest on 9/19/06 6:23:10 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.view.PafStyle;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.server.comm.PafClientCacheBlock;

/**
 * PafClientCacheBlockTest is a unit test class for class PafClientCacheBlock.
 * @see com.palladium.paf.server.comm.PafClientCacheBlock
 * @author Parasoft Jtest 8.0
 */
public class PafClientCacheBlockTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafClientCacheBlockTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getAxisSequence()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getAxisSequence()
     * @author Parasoft Jtest 8.0
     */
    public void testGetAxisSequence1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        String[] RETVAL = THIS.getAxisSequence();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getCurrentYear()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getCurrentYear()
     * @author Parasoft Jtest 8.0
     */
    public void testGetCurrentYear1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        String RETVAL = THIS.getCurrentYear();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getGlobalStyles()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getGlobalStyles()
     * @author Parasoft Jtest 8.0
     */
    public void testGetGlobalStyles1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        PafStyle[] RETVAL = THIS.getGlobalStyles();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getLastPeriod()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getLastPeriod()
     * @author Parasoft Jtest 8.0
     */
    public void testGetLastPeriod1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        String RETVAL = THIS.getLastPeriod();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMdbDef()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getMdbDef()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMdbDef1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        MdbDef RETVAL = THIS.getMdbDef();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMdbDef()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getMdbDef()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMdbDef2() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        MdbDef t1 = new MdbDef();
        THIS.setMdbDef(t1);
        RuleSet[] var1 = new RuleSet[] {};
        THIS.setRuleSets(var1);
        String[] var2 = new String[] {};
        THIS.setAxisSequence(var2);
        PafStyle[] var3 = new PafStyle[] {};
        THIS.setGlobalStyles(var3);
        SimpleMeasureDef[] var4 = new SimpleMeasureDef[] {};
        THIS.setMeasureDefs(var4);
        SimpleVersionDef[] var5 = new SimpleVersionDef[] {};
        THIS.setVersionDefs(var5);
        THIS.setCurrentYear("");
        THIS.setLastPeriod("");
        // jtest_tested_method
        MdbDef RETVAL = THIS.getMdbDef();
        assertEquals(t1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMdbDef()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getMdbDef()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMdbDef3() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        MdbDef t1 = new MdbDef();
        t1.setYearDim("");
        String[] var1 = new String[] {};
        t1.setHierDims(var1);
        t1.setMeasureDim("");
        t1.setPlanTypeDim("");
        t1.setTimeDim("");
        t1.setVersionDim("");
        t1.setDataSourceId("");
        String[] var2 = new String[] {};
        t1.setAxisPriority(var2);
        THIS.setMdbDef(t1);
        RuleSet[] var3 = new RuleSet[] {};
        THIS.setRuleSets(var3);
        String[] var4 = new String[] {};
        THIS.setAxisSequence(var4);
        PafStyle[] var5 = new PafStyle[] {};
        THIS.setGlobalStyles(var5);
        SimpleMeasureDef[] var6 = new SimpleMeasureDef[] {};
        THIS.setMeasureDefs(var6);
        SimpleVersionDef[] var7 = new SimpleVersionDef[] {};
        THIS.setVersionDefs(var7);
        THIS.setCurrentYear("");
        THIS.setLastPeriod("");
        // jtest_tested_method
        MdbDef RETVAL = THIS.getMdbDef();
        assertEquals(t1, RETVAL); // jtest_unverified
        assertEquals(5, t1.getDimCount()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getMeasureDefs()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getMeasureDefs()
     * @author Parasoft Jtest 8.0
     */
    public void testGetMeasureDefs1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        SimpleMeasureDef[] RETVAL = THIS.getMeasureDefs();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getRuleSets()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getRuleSets()
     * @author Parasoft Jtest 8.0
     */
    public void testGetRuleSets1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        RuleSet[] RETVAL = THIS.getRuleSets();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getVersionDefs()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#getVersionDefs()
     * @author Parasoft Jtest 8.0
     */
    public void testGetVersionDefs1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        SimpleVersionDef[] RETVAL = THIS.getVersionDefs();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: PafClientCacheBlock()
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#PafClientCacheBlock()
     * @author Parasoft Jtest 8.0
     */
    public void testPafClientCacheBlock1() throws Throwable {
        // jtest_tested_method
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        assertEquals(null, THIS.getAxisSequence()); // jtest_unverified
        assertEquals(null, THIS.getCurrentYear()); // jtest_unverified
        assertEquals(null, THIS.getGlobalStyles()); // jtest_unverified
        assertEquals(null, THIS.getLastPeriod()); // jtest_unverified
        assertEquals(null, THIS.getMdbDef()); // jtest_unverified
        assertEquals(null, THIS.getMeasureDefs()); // jtest_unverified
        assertEquals(null, THIS.getRuleSets()); // jtest_unverified
        assertEquals(null, THIS.getVersionDefs()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setAxisSequence(java.lang.String[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setAxisSequence(java.lang.String[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetAxisSequence1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        String[] var1 = new String[] {};
        // jtest_tested_method
        THIS.setAxisSequence(var1);
        assertSame(var1, THIS.getAxisSequence()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setCurrentYear(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setCurrentYear(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetCurrentYear1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        THIS.setCurrentYear("");
        assertEquals("", THIS.getCurrentYear()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setGlobalStyles(com.palladium.paf.view.PafStyle[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setGlobalStyles(com.palladium.paf.view.PafStyle[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetGlobalStyles1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        PafStyle[] var1 = new PafStyle[] {};
        // jtest_tested_method
        THIS.setGlobalStyles(var1);
        assertSame(var1, THIS.getGlobalStyles()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setLastPeriod(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setLastPeriod(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetLastPeriod1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        // jtest_tested_method
        THIS.setLastPeriod("");
        assertEquals("", THIS.getLastPeriod()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setMdbDef(com.palladium.paf.app.MdbDef)
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setMdbDef(com.palladium.paf.app.MdbDef)
     * @author Parasoft Jtest 8.0
     */
    public void testSetMdbDef1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        MdbDef t1 = new MdbDef();
        // jtest_tested_method
        THIS.setMdbDef(t1);
        assertEquals(t1, THIS.getMdbDef()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setMeasureDefs(com.palladium.paf.server.comm.SimpleMeasureDef[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setMeasureDefs(com.palladium.paf.server.comm.SimpleMeasureDef[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetMeasureDefs1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        SimpleMeasureDef[] var1 = new SimpleMeasureDef[] {};
        // jtest_tested_method
        THIS.setMeasureDefs(var1);
        assertSame(var1, THIS.getMeasureDefs()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setRuleSets(com.palladium.paf.rules.RuleSet[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setRuleSets(com.palladium.paf.rules.RuleSet[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetRuleSets1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        RuleSet[] var1 = new RuleSet[] {};
        // jtest_tested_method
        THIS.setRuleSets(var1);
        assertSame(var1, THIS.getRuleSets()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setVersionDefs(com.palladium.paf.server.comm.SimpleVersionDef[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafClientCacheBlock#setVersionDefs(com.palladium.paf.server.comm.SimpleVersionDef[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetVersionDefs1() throws Throwable {
        PafClientCacheBlock THIS = new PafClientCacheBlock();
        SimpleVersionDef[] var1 = new SimpleVersionDef[] {};
        // jtest_tested_method
        THIS.setVersionDefs(var1);
        assertSame(var1, THIS.getVersionDefs()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafClientCacheBlockTest
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
            PafClientCacheBlockTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafClientCacheBlock",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafClientCacheBlock.class;
    }

}

// JTEST_CURRENT_ID=566610744.