/*
 * PafPlanSessionResponseTest.java
 * Created by Jtest on 9/19/06 6:17:32 PM.
 */

package com.palladium.paf.server.comm;

import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.mdb.PafSimpleTree;
import com.palladium.paf.comm.PafViewTreeItem;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.paf.server.comm.PafPlanSessionResponse;

/**
 * PafPlanSessionResponseTest is a unit test class for class PafPlanSessionResponse.
 * @see com.palladium.paf.server.comm.PafPlanSessionResponse
 * @author Parasoft Jtest 8.0
 */
public class PafPlanSessionResponseTest extends PackageTestCase {

    /**
     * Constructs a test case for the test specified by the name argument.
     * @param name the name of the test case
     * @author Parasoft Jtest 8.0
     */
    public PafPlanSessionResponseTest(String name) {
        super(name);
        /*
         * This constructor should not be modified.  Any initialization code
         * should be placed in the setUp() method instead.
         */
    }

    /**
     * Test for method: getClientCacheBlock()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getClientCacheBlock()
     * @author Parasoft Jtest 8.0
     */
    public void testGetClientCacheBlock1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        PafClientCacheBlock RETVAL = THIS.getClientCacheBlock();
        assertNotNull(RETVAL); // jtest_unverified
        assertEquals(null, RETVAL.getMdbDef()); // jtest_unverified
        assertEquals(null, RETVAL.getRuleSets()); // jtest_unverified
        assertEquals(null, RETVAL.getAxisSequence()); // jtest_unverified
        assertEquals(null, RETVAL.getGlobalStyles()); // jtest_unverified
        assertEquals(null, RETVAL.getMeasureDefs()); // jtest_unverified
        assertEquals(null, RETVAL.getVersionDefs()); // jtest_unverified
        assertEquals(null, RETVAL.getCurrentYear()); // jtest_unverified
        assertEquals(null, RETVAL.getLastPeriod()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getCustomMenuDefs()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getCustomMenuDefs()
     * @author Parasoft Jtest 8.0
     */
    public void testGetCustomMenuDefs1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        CustomMenuDef[] RETVAL = THIS.getCustomMenuDefs();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getDefaultRuleSetName()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getDefaultRuleSetName()
     * @author Parasoft Jtest 8.0
     */
    public void testGetDefaultRuleSetName1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        String RETVAL = THIS.getDefaultRuleSetName();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getDimTrees()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getDimTrees()
     * @author Parasoft Jtest 8.0
     */
    public void testGetDimTrees1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        PafSimpleTree[] RETVAL = THIS.getDimTrees();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getPlanningVersion()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getPlanningVersion()
     * @author Parasoft Jtest 8.0
     */
    public void testGetPlanningVersion1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        String RETVAL = THIS.getPlanningVersion();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getRuleSetList()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getRuleSetList()
     * @author Parasoft Jtest 8.0
     */
    public void testGetRuleSetList1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        String[] RETVAL = THIS.getRuleSetList();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getViewTreeItems()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getViewTreeItems()
     * @author Parasoft Jtest 8.0
     */
    public void testGetViewTreeItems1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        PafViewTreeItem[] RETVAL = THIS.getViewTreeItems();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getWorkSpec()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getWorkSpec()
     * @author Parasoft Jtest 8.0
     */
    public void testGetWorkSpec1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        PafWorkSpec[] RETVAL = THIS.getWorkSpec();
        assertEquals(null, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: getWorkSpec()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#getWorkSpec()
     * @author Parasoft Jtest 8.0
     */
    public void testGetWorkSpec2() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafClientCacheBlock t1 = new PafClientCacheBlock();
        PafWorkSpec[] var1 = new PafWorkSpec[] {};
        THIS.setWorkSpec(var1);
        PafSimpleTree[] var2 = new PafSimpleTree[] {};
        THIS.setDimTrees(var2);
        THIS.setClientCacheBlock(t1);
        THIS.setPlanningVersion("");
        CustomMenuDef[] var3 = new CustomMenuDef[] {};
        THIS.setCustomMenuDefs(var3);
        PafViewTreeItem[] var4 = new PafViewTreeItem[] {};
        THIS.setViewTreeItems(var4);
        THIS.setDefaultRuleSetName("");
        String[] var5 = new String[] {};
        THIS.setRuleSetList(var5);
        // jtest_tested_method
        PafWorkSpec[] RETVAL = THIS.getWorkSpec();
        assertEquals(var1, RETVAL); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: PafPlanSessionResponse()
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#PafPlanSessionResponse()
     * @author Parasoft Jtest 8.0
     */
    public void testPafPlanSessionResponse1() throws Throwable {
        // jtest_tested_method
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        assertNotNull(THIS.getClientCacheBlock()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getMdbDef()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getRuleSets()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getAxisSequence()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getGlobalStyles()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getMeasureDefs()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getVersionDefs()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getCurrentYear()); // jtest_unverified
        assertEquals(null, THIS.getClientCacheBlock().getLastPeriod()); // jtest_unverified
        assertEquals(null, THIS.getCustomMenuDefs()); // jtest_unverified
        assertEquals(null, THIS.getDefaultRuleSetName()); // jtest_unverified
        assertEquals(null, THIS.getDimTrees()); // jtest_unverified
        assertEquals(null, THIS.getPlanningVersion()); // jtest_unverified
        assertEquals(null, THIS.getRuleSetList()); // jtest_unverified
        assertEquals(null, THIS.getViewTreeItems()); // jtest_unverified
        assertEquals(null, THIS.getWorkSpec()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setClientCacheBlock(com.palladium.paf.server.comm.PafClientCacheBlock)
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setClientCacheBlock(com.palladium.paf.server.comm.PafClientCacheBlock)
     * @author Parasoft Jtest 8.0
     */
    public void testSetClientCacheBlock1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafClientCacheBlock t1 = new PafClientCacheBlock();
        // jtest_tested_method
        THIS.setClientCacheBlock(t1);
        assertEquals(t1, THIS.getClientCacheBlock()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setCustomMenuDefs(com.palladium.paf.comm.CustomMenuDef[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setCustomMenuDefs(com.palladium.paf.comm.CustomMenuDef[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetCustomMenuDefs1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        CustomMenuDef[] var1 = new CustomMenuDef[] {};
        // jtest_tested_method
        THIS.setCustomMenuDefs(var1);
        assertSame(var1, THIS.getCustomMenuDefs()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setDefaultRuleSetName(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setDefaultRuleSetName(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetDefaultRuleSetName1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        THIS.setDefaultRuleSetName("");
        assertEquals("", THIS.getDefaultRuleSetName()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setDimTrees(com.palladium.paf.mdb.PafSimpleTree[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setDimTrees(com.palladium.paf.mdb.PafSimpleTree[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetDimTrees1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafSimpleTree[] var1 = new PafSimpleTree[] {};
        // jtest_tested_method
        THIS.setDimTrees(var1);
        assertSame(var1, THIS.getDimTrees()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setPlanningVersion(java.lang.String)
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setPlanningVersion(java.lang.String)
     * @author Parasoft Jtest 8.0
     */
    public void testSetPlanningVersion1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        // jtest_tested_method
        THIS.setPlanningVersion("");
        assertEquals("", THIS.getPlanningVersion()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setRuleSetList(java.lang.String[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setRuleSetList(java.lang.String[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetRuleSetList1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafClientCacheBlock t1 = new PafClientCacheBlock();
        PafWorkSpec[] var1 = new PafWorkSpec[] {};
        THIS.setWorkSpec(var1);
        PafSimpleTree[] var2 = new PafSimpleTree[] {};
        THIS.setDimTrees(var2);
        THIS.setClientCacheBlock(t1);
        THIS.setPlanningVersion("");
        CustomMenuDef[] var3 = new CustomMenuDef[] {};
        THIS.setCustomMenuDefs(var3);
        PafViewTreeItem[] var4 = new PafViewTreeItem[] {};
        THIS.setViewTreeItems(var4);
        THIS.setDefaultRuleSetName("");
        String[] var5 = new String[] {};
        THIS.setRuleSetList(var5);
        String[] var6 = new String[] {};
        // jtest_tested_method
        THIS.setRuleSetList(var6);
        assertSame(var6, THIS.getRuleSetList()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setViewTreeItems(com.palladium.paf.comm.PafViewTreeItem[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setViewTreeItems(com.palladium.paf.comm.PafViewTreeItem[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetViewTreeItems1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafViewTreeItem[] var1 = new PafViewTreeItem[] {};
        // jtest_tested_method
        THIS.setViewTreeItems(var1);
        assertSame(var1, THIS.getViewTreeItems()); // jtest_unverified
        // No exception thrown
        // jtest_unverified
    }

    /**
     * Test for method: setWorkSpec(com.palladium.paf.app.PafWorkSpec[])
     * @throws Throwable Tests may throw any Throwable
     * @see PafPlanSessionResponse#setWorkSpec(com.palladium.paf.app.PafWorkSpec[])
     * @author Parasoft Jtest 8.0
     */
    public void testSetWorkSpec1() throws Throwable {
        PafPlanSessionResponse THIS = new PafPlanSessionResponse();
        PafWorkSpec[] var1 = new PafWorkSpec[] {};
        // jtest_tested_method
        THIS.setWorkSpec(var1);
        assertSame(var1, THIS.getWorkSpec()); // jtest_unverified
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
     * Usage: java com.palladium.paf.server.comm.PafPlanSessionResponseTest
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
            PafPlanSessionResponseTest.class,
            // fully qualified name of the tested class
            "com.palladium.paf.server.comm.PafPlanSessionResponse",
            // timeout for each test in milliseconds
            60000);
    }

    /**
     * Get the class object of the class which will be tested.
     * @return the class which will be tested
     * @author Parasoft Jtest 8.0
     */
    public Class getTestedClass() {
        return PafPlanSessionResponse.class;
    }

}

// JTEST_CURRENT_ID=-1284903094.