/*
 *	File: @(#)UtilityStubs.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Sep 2, 2005  		By: jim
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.palladium.paf.server;

import java.util.ArrayList;

import org.hibernate.Session;

import com.pace.base.app.*;
import com.pace.base.data.Intersection;
import com.pace.base.mdb.PafDimMember;
import com.pace.base.rules.Rule;
import com.pace.base.rules.RuleGroup;
import com.pace.base.rules.RuleSet;
import com.pace.base.state.SliceState;
import com.pace.base.utility.PafXStream;
import com.pace.base.view.*;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jim
 *
 */
public class UtilityStubs {
	
    public static void main(String[] args) {
        System.out.println("Running utility stub...");
//        saveTestView();
//        int rowCount = clearTreeCache();
//        System.out.println(rowCount + " rows deleted.");         
//        testParse();
        System.out.println("Complete");        
    }
    
    
    @SuppressWarnings("unused")
	private static void testParse() {

    	
        parseTest("@PREV(EOPRTL, Time, 1)");
        parseTest("1 + 7");
        parseTest("SLS_U * SLS_AUR");
        parseTest("MDPERM_DLR + MDPROMO_DLR + MDCLEAR_DLR");
        parseTest("( 2 * SLS_DLR ) / ( BOPRTL_DLR + EOPRTL_DLR )");
        parseTest("( 2 * @PREV(EOPRTL, Time, 1)) / ( BOPRTL_DLR + EOPRTL_DLR )");
        parseTest("1+@PREV(EOPRTL, Time, 1)");
    }
    
    
    
	public static void saveVersionDef() {
		
		VersionDef versionDef = new VersionDef("WP", VersionType.Variance);
		versionDef.addAlias("Default", "Working Plan");
		VersionFormula versionFormula = new VersionFormula("WP", "LY", VersionVarianceType.SimpleVariance);
		versionDef.setVersionFormula(versionFormula);
		versionDef.setNumericFormatName("Format 123");
		PafXStream.exportObjectToXml(versionDef, "c:\\versiondef.xml");
	}

//	public static int clearTreeCache(){
//        int rowCount = 0;
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//
//        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//
//            Properties connectionProperties = new Properties();
//            connectionProperties.put("user", "pafsys");
//            connectionProperties.put("password", "pafsys");
//
//            String pafServerHome = System.getenv("PafServerHome");
//            if (pafServerHome == null || pafServerHome.equals(""))
//                throw new Exception("Cannot find environmental variable: PafServerHome");
//
//            String dbPath = pafServerHome + File.separator + PafBaseConstants.PAF_CACHE_DB;
//
//            conn = DriverManager.getConnection("jdbc:derby:" + dbPath, connectionProperties);
//
//            /*
//             * delete from aliases; delete from aliastablenames; delete from
//             * associatedattributes; delete from uda; delete from
//             * pafmemberchildren; delete from pafmember; delete from
//             * pafmembertree
//             */
//
//            pstmt = conn.prepareStatement("delete from aliases");
//            rowCount = pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from aliastablenames");
//            rowCount += pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from associatedattributes");
//            rowCount += pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from uda");
//            rowCount += pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from pafmemberchildren");
//            rowCount += pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from pafmember");
//            rowCount += pstmt.executeUpdate();
//            pstmt = conn.prepareStatement("delete from pafmembertree");
//            rowCount += pstmt.executeUpdate();
//
//        } catch (Exception e) {
//            System.err.println("\n!! -- " + e.getLocalizedMessage() + "\n");
//
//        } finally {
//
//            if (pstmt != null) {
//                try {
//                    pstmt.close();
//                } catch (SQLException e) {
//                    // do nothing
//                }
//            }
//
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    // do nothing
//                }
//            }
//
//        }
//        return rowCount;
//    }

    @SuppressWarnings("unused")
	private static void delChildFromCache(PafDimMember member, Session session) {
        for (PafDimMember child: member.getChildren() ) {
            delChildFromCache(child, session);
        }
        session.delete(member);
    }    
    
    
    
    public static void saveSeason() {
        Season s = new Season();
        s.setId("Forecast2005");
        s.setPlanCycle("Forecast");
        s.setOpen(true);
        s.setYear("2005"); 
        s.setTimePeriod("S01");
        SeasonList sl = new SeasonList();
        sl.addSeason(s);
        PafXStream.exportObjectToXml(sl, "C:\\", "paf_seasons.xml");         
    }
    
    public static void saveRole() {
        PafPlannerRole role = new PafPlannerRole();
        
        role.setRoleName("Class Planner");
        role.setRoleDesc("The very 1st class planner role");
        role.setPlanType("ClassChn");
        role.setPlanVersion("WP");
        
        role.setSeasonIds(new String[]{"PlanFall2005", "ForecastSpring2005"}); 
        

        PafXStream.exportObjectToXml(new PafPlannerRole[] {role}, "C:\\", "paf_roles.xml"); 
        
    }
    
    public static void saveRuleSet() {
        RuleSet rs = new RuleSet();
        rs.setDimension("Time");
        ArrayList<RuleSet> myList = new ArrayList<RuleSet>();
        myList.add(rs);
        PafXStream.exportObjectToXml(myList, "C:\\paf_rules.xml");
    }

    
    public static void saveUser() {
    	PafUserSecurity[] users = new PafUserSecurity[1];
        
    	PafUserSecurity user = new PafUserSecurity();
        user.setUserName("jim");
        
        PafWorkSpec workFilter = new PafWorkSpec();
        PafDimSpec locSpec = new PafDimSpec();
//        locSpec.setSelectable(true);
        locSpec.setDimension("Location");
        locSpec.setExpressionList(new String[] {"Store1", "Store2"});
        
        PafDimSpec prodSpec = new PafDimSpec();
//        prodSpec.setSelectable(true);
        prodSpec.setDimension("Product");
        prodSpec.setExpressionList(new String[] {"@CHILDREN(DIV01)"});        
        
        workFilter.setDimSpec(new PafDimSpec[] { locSpec, prodSpec } );
        
        user.getRoleFilters().put("Class Planner", new PafWorkSpec[] {workFilter} );
        users[0] = user;
        
        PafXStream.exportObjectToXml(users, "C:\\", "paf_security.xml");        
    }
    
    public static void saveApp() {
        PafApplicationDef[] appDefs = new PafApplicationDef[1];
        
        PafApplicationDef app = new PafApplicationDef();
        MdbDef mdbDef = new MdbDef();
        
        app.setAppId("Titan Test");
        mdbDef.setDataSourceId("Titan");
        mdbDef.setHierDims(new String[] {"Product", "Location", "Years" } );
        mdbDef.setMeasureDim("Measures");
        mdbDef.setPlanTypeDim("PlanType");
        mdbDef.setTimeDim("Time");
        mdbDef.setVersionDim("Version");

        Season s = new Season();
        s.setId("Forecast2005");
        s.setPlanCycle("Forecast");
        s.setOpen(true);
        s.setYear("2005"); 
        s.setTimePeriod("S01");
        SeasonList sl = new SeasonList();
        sl.addSeason(s);
        app.setSeasonList(sl);
        
        PlanCycle pc1 = new PlanCycle("Forecast", "WP");
        PlanCycle pc2 = new PlanCycle("Plan", "WP");        
        
        app.setPlanCycles(new PlanCycle[] {pc1, pc2});
        
        app.setMdbDef(mdbDef);
        
        appDefs[0] = app;
        PafXStream.exportObjectToXml(appDefs, "C:\\paf_apps.xml");
        
    }
    
    public static void saveTestView() {
        PafView[] pv = getSampleView();
        PafXStream.exportObjectToXml(pv, "C:\\test_view.xml");
    }
    

    public static void saveMeasures() {
        MeasureDef[] measures = new MeasureDef[5];
        measures[0] = new MeasureDef("SLS_AUR", MeasureType.Recalc );
        measures[0].addAlias("Default", "Sales AUR");
        measures[0].setNumericFormatName("Format 1");
        measures[0].setVarRptgFlag(VarRptgFlag.RevenueReporting);
        measures[1] = new MeasureDef("SLS_DLR", MeasureType.Aggregate );
        measures[2] = new MeasureDef("SLS_U", MeasureType.Aggregate );
        measures[3] = new MeasureDef("MD_DLR", MeasureType.Aggregate );
        measures[4] = new MeasureDef("MD_%", MeasureType.Recalc );
        
        PafXStream.exportObjectToXml(measures, "c:\\", "paf_measures.xml");
    }
    
    
    
    
    public static PafView[] getSampleView() {
        PafView view = new PafView();
        view.setName("System.Default");
        view.setDesc("Default Sample View");
        
        PafViewHeader viewhdr = new PafViewHeader("Default Sample View");
        view.setHeaders(new PafViewHeader[] { viewhdr } );
        
        PafViewSection viewSection = new PafViewSection();      
        viewSection.setRowAxisDims(new String[] {"Measures", "Product"});
        viewSection.setColAxisDims(new String[] {"Time" });
        
        ViewTuple[] rowTuples = new ViewTuple[] {
	        new ViewTuple(PafAxis.ROW, new String[] { "SLS_DLR", "CLS111-10" }), 
	        new ViewTuple(PafAxis.ROW, new String[] { "SLS_DLR", "CLS111-98" }), 
	        new ViewTuple(PafAxis.ROW, new String[] { "SLS_DLR", "CLS111-99" }),
	        new ViewTuple(PafAxis.ROW, new String[] { "SLS_DLR", "DPT111" })
        };
        for (ViewTuple rowTuple:rowTuples) {
        	rowTuple.setSymetricGroupNo(new Integer[] {0});
        }
        viewSection.setRowTuples(rowTuples);
        
 
        
        viewSection.setColTuples( new ViewTuple[] {
            new ViewTuple(PafAxis.COL, new String[] { "Feb" }), 
            new ViewTuple(PafAxis.COL, new String[] { "Mar" }), 
            new ViewTuple(PafAxis.COL, new String[] { "Apr" }), 
            new ViewTuple(PafAxis.COL, new String[] { "Q1" })               
        } );
        
        viewSection.setPageTuples(new PageTuple[] {
                new PageTuple("Years", "FY2005"), 
                new PageTuple("Version", "WP"), 
                new PageTuple("PlanType", "ClassChn")
        });
        
        viewSection.getRowTuples()[0].setNumberFormat(new PafNumberFormat("Test", "Pattern"));
        viewSection.setPrimaryFormattingAxis(PafAxis.ROW);
        
        view.setViewSections(new PafViewSection[] { viewSection} );
//        view.setData(new float[] {1,2,3,4} );
        
        return (new PafView[] { view } );
    }

    public static RuleSet[] getSampleRuleSets() {
        RuleSet rs = new RuleSet();
        RuleGroup rg = new RuleGroup();
        rg.setRules(new Rule[] { 
               new Rule("January = Week1 + Week2 + Week3 + Week4"),
               new Rule("Week1 = January - ( Week2 + Week3 + Week4 )"),
               new Rule("Week2 = January + ( Week1 + Week3 + Week4 )"),
               new Rule("Week3 = January + ( Week1 + Week2 + Week4 )"),
               new Rule("Week4 = January + ( Week1 + Week2 + Week3 )")
       });
        
        rs.setRuleGroups(new RuleGroup[] {rg});
        rs.setDimension("Time");
        rs.setType(1);
        
        RuleSet rs1 = new RuleSet();
        RuleGroup rg1 = new RuleGroup();
        rg1.setRules(new Rule[] { 
               new Rule("StoreTotal = Store1 + Store2"),
               new Rule("Store1 = StoreTotal - (Store2)"),
               new Rule("Store2 = StoreTotaL - (Store1)")
       });
        
        rs1.setRuleGroups(new RuleGroup[] {rg1});
        rs1.setDimension("Store");
        rs1.setType(0);
        
        return new RuleSet[] {rs, rs1};

    }
    
    public static UnitOfWork getTestUow() {
        UnitOfWork uow = new UnitOfWork(new String[] {"Measures", "Time", "PlanType", "Version", "Years", "Product", "Location"});
        uow.setDimMembers("Time", new String[] {"Feb", "Mar", "Apr", "Q1", 
                "May", "Jun", "Jul", "Q2", "S01", 
                "Aug", "Sep", "Oct", "Q3",
                "Nov", "Dec", "Jan", "Q4", "S02" });
        uow.setDimMembers("Measures", new String[] {"SLS_DLR", "MDTTL_DLR", "RECRTL_DLR", 
                "BOPRTL_DLR", "EOPRTL_DLR", "ADJ_DLR", "REC_U", "RECCST_DLR", "EOP_U", "EOPCST_DLR", 
                "BOP_U", "BOPCST_DLR", "COGS_DLR", "GM_DLR"});
        uow.setDimMembers("Product",  new String[] {"DPT110", "DPT111", "DPT112", "DPT114", "DPT115", "DPT120", "DPT121", "DPT130", 
                "DPT140", "DPT150", "DPT160", "DPT170", "DPT530", "DIV01"});
        uow.setDimMembers("PlanType",  new String[] {"ClassChn" });
        uow.setDimMembers("Version",  new String[] {"WP", "WF", "LY" });
        uow.setDimMembers("Years",  new String[] {"FY2006" });
        uow.setDimMembers("Location", new String[] {"StoreTotal", "Store1", "Store2"});
        return uow;
    }

    public static SliceState getTestSliceState() {
        SliceState sliceState = new SliceState();
        String[] axis = { "Time", "Measures", "Product", "PlanType", "Years", "Version", "Location" };
        Intersection[] chngCells = new Intersection[] {
                new Intersection(axis, new String[] { "Q1", "SLS_DLR", "DPT111", "ClassChn", "FY2005", "WP", "StoreTotal"  }),
                new Intersection(axis, new String[] { "Mar", "SLS_DLR", "DIV01", "ClassChn", "FY2005", "WP", "StoreTotal"  })
        };

        Intersection[] lckCells = new Intersection[] {
                new Intersection(axis, new String[] { "Feb", "SLS_DLR", "DIV01", "ClassChn", "FY2005", "WP"  })
        };
        
        
        sliceState.setChangedCells(chngCells);
        sliceState.setLockedCells(lckCells);

        return sliceState;
    }
    
    private static void parseTest(String expression) {
    
            int cpos = 0;
            boolean inTerm = false;
            int termType = 0; // 0 - primitive, 1 - function
            ArrayList<String> termList = new ArrayList<String>();
            StringBuffer currentToken = new StringBuffer();
            while ( cpos < expression.length() ) {
                switch (expression.charAt(cpos)) {
                case '+':
                case '-':
                case '*':
                case '/':
                case ' ':
                    if (inTerm && termType == 0) { // end term, simple measure name
                        inTerm = false;
                        termList.add(currentToken.toString());
                        currentToken = new StringBuffer();
                    }
                    else if (inTerm && termType == 1) { // function, just add
                        currentToken.append(expression.charAt(cpos)); 
                    }
                    break;                    
                    
                    
                case ')':  
                    if (inTerm && termType == 1) {                      
                        currentToken.append(expression.charAt(cpos));
                        termList.add(currentToken.toString());
                        currentToken = new StringBuffer();
                    }
                
                    inTerm = false;                
                    break;
                case '@':
                    if (inTerm) {
                        // starting new term, but stay 'interm'
                        termList.add(currentToken.toString()); 
                       currentToken = new StringBuffer();
                       currentToken.append(expression.charAt(cpos));
                       termType = 1;
                    }
                    else { // start new term, assumes currentToken is empty
                        currentToken.append(expression.charAt(cpos));                    
                        termType = 1;
                        inTerm = true;
                    }
                    
                    break;
                case '0':
                case '1':
                case '2':
                case '3':                    
                case '4':
                case '5':
                case '6':
                case '7':                       
                case '8':
                case '9':
                    // if in function assume function parameter, else assume primitive and skip
                    if (termType == 1) currentToken.append(expression.charAt(cpos));
                    break;
                    
                case ',':
                    // better be in a function
                    if (termType == 1) currentToken.append(expression.charAt(cpos));
                    break; 

                case '(':
                    if (inTerm && termType == 1) currentToken.append(expression.charAt(cpos));
                    break; 
                     
                default: //assumes alpha
                    // just add 
                    if (!inTerm) { //start of measure name
                        inTerm = true;
                        termType = 0;
                    }
                    currentToken.append(expression.charAt(cpos));
                    break;
                       
                }
                
                cpos++;
            }
            if (currentToken.length() > 0) termList.add(currentToken.toString().trim());

            
           for (String t :termList) System.out.println(t);
           System.out.println("-----------------");
    }

}
