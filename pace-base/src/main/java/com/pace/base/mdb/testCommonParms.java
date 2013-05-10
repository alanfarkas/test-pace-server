 /*
 *	File: @(#)testCommonParms.java 	Package: com.pace.base.mdb.essbase 	Project: Essbase Provider
 *	Created: Oct 7, 2005  		By: Alan Farkas
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
package com.pace.base.mdb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.essbase.api.metadata.IEssMember;
import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.PafException;
import com.pace.base.app.MdbDef;
import com.pace.base.app.MeasureDef;
import com.pace.base.app.MeasureType;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.app.PlanCycle;
import com.pace.base.app.Season;
import com.pace.base.app.SeasonList;
import com.pace.base.app.UnitOfWork;
import com.pace.base.app.VarRptgFlag;
import com.pace.base.app.VersionDef;
import com.pace.base.app.VersionFormula;
import com.pace.base.app.VersionType;
import com.pace.base.app.VersionVarianceType;
import com.pace.base.comm.ClientInitRequest;
import com.pace.base.data.Intersection;
import com.pace.base.data.MemberTreeSet;
import com.pace.base.state.PafClientState;
import com.pace.base.utility.PafXStream;
import com.pace.base.utility.PropertyLoader;
import com.pace.base.utility.StringUtils;
import com.pace.base.view.PafMVS;
import com.pace.base.view.PafView;
import com.pace.base.view.PafViewSection;

/**
 * Provide common parameters to unit tests
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class testCommonParms {

	private static final String fileSep = System.getProperty("file.separator");
	private static final Logger logger = Logger.getLogger(testCommonParms.class);
	
	public static void main(String args[]) throws PafException {
		//PafBaseMember parent = getPafBaseMemberParent();
		@SuppressWarnings("unused")
		PafBaseTree tree = getTimeTree();
		int i = 0;
		i++;
		
	}
	
    private static String pafServerHome = "C:\\Program Files\\Palladium\\PafServer";
//	private static Logger logger = Logger.getLogger(testCommonParms.class);

	public static String getSampleMdxSelect() {
		
		final String mdxSelect = "SELECT " 
//			+ "{[Feb], [Mar], [Apr], [May], [Jun], [Jul], [Aug], [Sep], [Oct], [Nov], [Dec], [Jan] }"
			+ " Descendants(S01)"
			+ " ON AXIS(0), "
			+ " {[SLS_DLR], [MDTTL_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR], [FWOS]} "
//			+ " {[Measures], [SLS_DLR], [MD_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR]} "
			+ " ON AXIS(1), "
//			+ " {[DPT110], [DPT120], [DPT130]} "
			+ " Descendants(DIV01)"
			+ " ON AXIS(2), "
			+ " {[ClassChn]} "
			+ " ON AXIS(3), "
			+ " {[WP], [LY], [WAP], [WF], [OP], [WF_vs_LY], [WAF], [WP_vs_LY], [WP_vs_LY_%], [WP_vs_OP]} "
			+ " ON AXIS(4), "
			+ " {[FY2006]} "
			+ " ON AXIS(5), " 
			+ " Descendants ( [Location] ) "
			+ " ON AXIS(6) ";
		
		return mdxSelect;
	}

	public static PafApplicationDef getAppDef()  {
		
		PafApplicationDef appDef = new PafApplicationDef();
		MdbDef mdbDef = new MdbDef();
//		Map<String, MeasureDef> measureDefs = null;
//		Map<String, VersionDef> versionDefs = null;
		MeasureDef[] measureDefs = null;
		VersionDef[] versionDefs = null;
		
		appDef.setAppId("Titan");
		appDef.setCurrentYear("FY2006");
		appDef.setLastPeriod("WK05");

		measureDefs = getMeasureDefs();
						
		appDef.initMeasures(Arrays.asList(measureDefs));
//		measureDefArray = importMeasures(measureDefArray);
//		for (MeasureDef measureDef:measureDefArray) {
//			measureDefs.put(measureDef.getName(), measureDef);
//		}
//		appDef.setMeasures(measureDefs);
		
//		versionDefArray = importVersions();
//		for (VersionDef versionDef:versionDefArray) {
//			versionDefs.put(versionDef.getName(), versionDef);
//		}
		versionDefs = getVersionDefs();				
		
		appDef.initVersions(Arrays.asList(versionDefs));
				
		mdbDef.setDataSourceId("Titan");
		mdbDef.setHierDims(new String[] {"Product", "Location"} );
		mdbDef.setMeasureDim("Measures");
		mdbDef.setPlanTypeDim("PlanType");
		mdbDef.setTimeDim("Time");
		mdbDef.setVersionDim("Version");
		mdbDef.setYearDim("Years");
		appDef.setMdbDef(mdbDef);
		
		Season s = new Season();
		s.setId("Forecast2006");
		s.setPlanCycle("Forecast");
		s.setOpen(true);
		s.setYears(new String[]{"2006"}); 
		s.setTimePeriod("S01");
		SeasonList sl = new SeasonList();
		sl.addSeason(s);
		appDef.setSeasonList(sl);
		
		PlanCycle pc1 = new PlanCycle("Forecast", "WF");
		PlanCycle pc2 = new PlanCycle("Plan", "WP");        
		PlanCycle pc3 = new PlanCycle("Approval", "WAP");        
		
		appDef.setPlanCycles(new PlanCycle[] {pc1, pc2, pc3});
				
		
		return appDef;
	}

	
	public static Properties getConnectionProps() {
						
		Properties props = PropertyLoader.loadProperties(PafBaseConstants.FN_EssbaseConnPropTest);
//		File propertyFile = new File(PafBaseConstants.FN_EssbaseConnPropTest);
//		
		
//		if ( propertyFile.exists() && propertyFile.canRead() ) {
//			
//			try {
//				props.load(new FileInputStream(propertyFile));
//			} catch (FileNotFoundException e) {
//				//do nothing
//			} catch (IOException e) {
//				logger.error(e.getMessage());
//			}
//						
//		} else {			
//			
		if( props == null ) {
			props = new Properties(); 
			
			props.setProperty("EDSDOMAIN", "Essbase");
			props.setProperty("EDSURL", "http://localhost:13080/aps/JAPI");
			props.setProperty("SERVER", "localhost");
			props.setProperty("USER", "system");
			props.setProperty("PASSWORD", "password");
			props.setProperty("APPLICATION", "Titan");
			props.setProperty("DATABASE", "Titan");
			
		}		
		
		return props;
	}
	
	public static PafConnectionProps getPafConnectionProps() {
		
		PafConnectionProps pafConnectProps = new PafConnectionProps();
		Properties props = PropertyLoader.loadProperties(PafBaseConstants.FN_EssbaseConnPropTest);
//		pafConnectProps.setProperties(getConnectionProps());
		pafConnectProps.setProperties(props);
		return pafConnectProps;
	}
	
	public static Properties getConnectionSampleBasicProps() {
		Properties props = new Properties();
		props.setProperty("EDSDOMAIN", "Essbase");
		props.setProperty("EDSURL", "http://localhost:13080/aps/JAPI");
//		props.setProperty("EDSURL", "http://localhost:11080/eds/EssbaseEnterprise");
		props.setProperty("SERVER", "localhost");
		props.setProperty("USER", "system");
		props.setProperty("PASSWORD", "password");
		props.setProperty("APPLICATION", "Sample");
		props.setProperty("DATABASE", "Basic");
		return props;
	}

	public static MeasureDef[] getMeasureDefs() {
		
		int SIZE = 5;
		int i = 0;
		MeasureDef[] md = new MeasureDef[SIZE];
		
		
		md[i] = new MeasureDef();
		md[i].setName("SLS_DLR");
		md[i].setType(MeasureType.Aggregate);
		md[i].addAlias("Default", "Sales $");
		md[i].setVarRptgFlag(VarRptgFlag.RevenueReporting);
		i++;
		md[i] = new MeasureDef();
		md[i].setName("MDTTL_DLR");
		md[i].setType(MeasureType.Aggregate);
		md[i].addAlias("Default", "Markdown Total $");
		md[i].setVarRptgFlag(VarRptgFlag.ExpenseReporting);
		i++;
		md[i] = new MeasureDef();
		md[i].setName("RECRTL_DLR");
		md[i].setType(MeasureType.Aggregate);
		md[i].addAlias("Default", "Receipt Retail $");
		md[i].setVarRptgFlag(VarRptgFlag.RevenueReporting);
		i++;
		md[i] = new MeasureDef();
		md[i].setName("BOPRTL_DLR");
		md[i].setType(MeasureType.TimeBalFirst);
		md[i].addAlias("Default", "BOP Retail $");
		md[i].setVarRptgFlag(VarRptgFlag.RevenueReporting);
		i++;
		md[i] = new MeasureDef();
		md[i].setName("EOPRTL_DLR");
		md[i].setType(MeasureType.TimeBalLast);
		md[i].addAlias("Default", "EOP Retail $");
		md[i].setVarRptgFlag(VarRptgFlag.RevenueReporting);
		i++;
			
		return md;
	}

	
	
	private static VersionDef[] getVersionDefs() {
		
		int SIZE = 11;
		int i = 0;
		VersionDef[] vd = new VersionDef[SIZE];
		VersionFormula[] vf = new VersionFormula[SIZE];
		
		vd[i] = new VersionDef();
		vd[i].setName("WF");
		vd[i].setType(VersionType.ForwardPlannable);
		vd[i].addAlias("Default", "Working Forecast");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WF_vs_LY");
		vd[i].setType(VersionType.Variance);
		vf[i] = new VersionFormula();
		vf[i].setBaseVersion("WF");
		vf[i].setCompareVersion("LY");
		vf[i].setVarianceType(VersionVarianceType.SimpleVariance);
		vd[i].setVersionFormula(vf[i]);
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WP");
		vd[i].setType(VersionType.Plannable);
		vd[i].addAlias("Default", "Working Plan");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("OP");
		vd[i].setType(VersionType.NonPlannable);
		vd[i].addAlias("Default", "Operating Plan");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WAF");
		vd[i].setType(VersionType.ForwardPlannable);
		vd[i].addAlias("Default", "Waiting for Forecast");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WAP");
		vd[i].setType(VersionType.Plannable);
		vd[i].addAlias("Default", "Waiting for Plan");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("LY");
		vd[i].setType(VersionType.Plannable);
		vd[i].addAlias("Default", "Last Year");
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WAP_vs_LY");
		vd[i].setType(VersionType.Variance);
		vf[i] = new VersionFormula();
		vf[i].setBaseVersion("WAP");
		vf[i].setCompareVersion("LY");
		vf[i].setVarianceType(VersionVarianceType.SimpleVariance);
		vd[i].setVersionFormula(vf[i]);
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WP_vs_LY");
		vd[i].setType(VersionType.Variance);
		vf[i] = new VersionFormula();
		vf[i].setBaseVersion("WP");
		vf[i].setCompareVersion("LY");
		vf[i].setVarianceType(VersionVarianceType.SimpleVariance);
		vd[i].setVersionFormula(vf[i]);
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WP_vs_LY_%");
		vd[i].setType(VersionType.Variance);
		vf[i] = new VersionFormula();
		vf[i].setBaseVersion("WP");
		vf[i].setCompareVersion("LY");
		vf[i].setVarianceType(VersionVarianceType.PercentVariance);
		vd[i].setVersionFormula(vf[i]);
		i++;
		vd[i] = new VersionDef();
		vd[i].setName("WP_vs_OP");
		vd[i].setType(VersionType.Variance);
		vf[i] = new VersionFormula();
		vf[i].setBaseVersion("WP");
		vf[i].setCompareVersion("OP");
		vf[i].setVarianceType(VersionVarianceType.SimpleVariance);
		vd[i].setVersionFormula(vf[i]);
		i++;
		
		
	
		return vd;
	}


	public static Map<String, Set<String>> getLockedPeriodMap() {
		
		Map<String, Set<String>> lockedPeriodMap = new HashMap<String, Set<String>>();
		lockedPeriodMap.put(getCurrentYear(), getLockedPeriods());
		
		return lockedPeriodMap;
	}


	public static Set<String> getLockedPeriods() {

		Set<String> lockedPeriods = new HashSet<String>();
		
		lockedPeriods.add("WK01");
		lockedPeriods.add("WK02");
		lockedPeriods.add("WK03");
		lockedPeriods.add("WK04");
		lockedPeriods.add("Feb");
		lockedPeriods.add("WK05");

		
		return lockedPeriods;
	}

	public static PafBaseMember getPafBaseMemberParent() throws PafException {
		
		String parentKey = "Parent", childKeyRoot = "Child", childKey = null;
		PafBaseMember pafBaseMember = new PafBaseMember(parentKey);
		PafBaseMember pafChild = null;
		
		// Create PafBaseTree
		PafBaseTree pafBaseTree = new PafBaseTree(pafBaseMember, new String[]{"Default"});
		
		// Add Children
		for (int i = 1; i < 5; i++) {
			childKey = childKeyRoot + Integer.toString(i);
			pafChild = new PafBaseMember(childKey);
			pafBaseTree.addChild(childKey, pafChild);
		}
		
		// Add Paf Member Properties
		pafBaseMember.setMemberProps(getPafBaseMemberProps());
		
		// Return PafBaseMember Parent
		return pafBaseMember;
	}
	
	public static PafBaseTree getPafBaseTree(String dimension) throws PafException {
		
  //      PafBaseTree esbMetaData = (PafBaseTree)jtest.Repository.getObject(PafBaseTree.class, "Tested-Class(1)");
        		 
		PafBaseTree tree = null;
		
		if (dimension.equalsIgnoreCase("time")) {
			// Create Time Tree for Q1
			String rootKey = "Q1";
			PafBaseMember root = new PafBaseMember(rootKey);
			PafBaseMemberProps attr = new PafBaseMemberProps();
			attr.setGenerationNumber(0);
			attr.setLevelNumber(2);
			root.setMemberProps(attr);
			tree = new PafBaseTree(root, new String[]{"Default"});
			// Add February
			PafBaseMember feb = new PafBaseMember("Feb");
			feb.setMemberProps(new PafBaseMemberProps());
			feb.getMemberProps().setGenerationNumber(1);
			feb.getMemberProps().setLevelNumber(1);
			tree.addChild(rootKey, feb);
			for (int i = 0; i < 4; i++) {
				PafBaseMember child = new PafBaseMember("WK" + String.format("%02d",(i + 1)));					
				child.setMemberProps(new PafBaseMemberProps());
				child.getMemberProps().setGenerationNumber(2);
				child.getMemberProps().setLevelNumber(0);
				tree.addChild("Feb", child);
			}
			
			// Add March
			PafBaseMember mar = new PafBaseMember("Mar");
			mar.setMemberProps(new PafBaseMemberProps());
			mar.getMemberProps().setGenerationNumber(1);
			mar.getMemberProps().setLevelNumber(1);
			tree.addChild(rootKey, mar);
			for (int i = 4; i < 8; i++) {
				PafBaseMember child = new PafBaseMember("WK" + String.format("%02d",(i + 1)));					
				child.setMemberProps(new PafBaseMemberProps());
				child.getMemberProps().setGenerationNumber(2);
				child.getMemberProps().setLevelNumber(0);
				tree.addChild("Mar", child);
			}
			 

			// Add April
			PafBaseMember apr = new PafBaseMember("Apr");
			apr.setMemberProps(new PafBaseMemberProps());
			apr.getMemberProps().setGenerationNumber(1);
			apr.getMemberProps().setLevelNumber(1);
			tree.addChild(rootKey, apr);
			for (int i = 8; i < 13; i++) {
				PafBaseMember child = new PafBaseMember("WK" + String.format("%02d",(i + 1)));					
				child.setMemberProps(new PafBaseMemberProps());
				child.getMemberProps().setGenerationNumber(2);
				child.getMemberProps().setLevelNumber(0);
				tree.addChild("Apr", child);
			}
		} else if (dimension.equalsIgnoreCase("year")) {
			// Create Year Tree for 
			String rootKey = "Year";
			PafBaseMember root = new PafBaseMember(rootKey);
			PafBaseMemberProps attr = new PafBaseMemberProps();
			attr.setGenerationNumber(1);
			attr.setLevelNumber(1);
			root.setMemberProps(attr);
			tree = new PafBaseTree(root, new String[]{"Default"});
			// Add FY2006
			PafBaseMember FY2006 = new PafBaseMember("FY2006");
			FY2006.setMemberProps(new PafBaseMemberProps());
			FY2006.getMemberProps().setGenerationNumber(1);
			FY2006.getMemberProps().setLevelNumber(1);
			tree.addChild(rootKey, FY2006);
			// Add FY2007
			PafBaseMember FY2007 = new PafBaseMember("FY2007");
			FY2007.setMemberProps(new PafBaseMemberProps());
			FY2007.getMemberProps().setGenerationNumber(1);
			FY2007.getMemberProps().setLevelNumber(1);
			tree.addChild(rootKey, FY2007);		
		}


		
		// Return PafBaseTree for Selected Dimension
		//EsbMetaData esbMetaData = new EsbMetaData(getConnectionProps());
		//PafBaseTree pafBaseTree = esbMetaData.getDimension(dimension);
		return tree;
	}

	public static PafBaseTree getTimeTree() throws PafException {
		
		// Return PafBaseTree for Time Dimension
		return getPafBaseTree(getAppDef().getMdbDef().getTimeDim());
	}

	public static PafBaseTree getYearTree() throws PafException {
		
		// Return PafBaseTree for Time Dimension
		return getPafBaseTree(getAppDef().getMdbDef().getYearDim());
	}

	private static PafBaseMemberProps getPafBaseMemberProps() {
		
		PafBaseMemberProps pafBaseMemberProps = new PafBaseMemberProps();
		pafBaseMemberProps.setConsolidationType(IEssMember.EEssConsolidationType.ADDITION);
		pafBaseMemberProps.addMemberAlias("Default", "Alias");
		
		// Return PafBaseMemberProps
		return pafBaseMemberProps;
	}

	public static String[] getActiveVersions() {
		
		String[] activeVersions = {"WP", "WF"};
		return activeVersions;
	}

	public static String getFcstVersion() {
		
		String fcstVersion = "WF";
		return fcstVersion;
	}

	public static String getPlanVersion() {
		
		String planVersion = "WP";
		return planVersion;
	}

	public static String getCurrentYear() {
		
		String cy = getAppDef().getCurrentYear();
		return cy;
	}

	public static String getNextYear() {
		
		final int digits = 2;
		String cy = getCurrentYear();
		String yy = cy.substring(cy.length()- digits);
		int nyNum = Integer.parseInt(yy) + 1;
		String nyDigits = String.valueOf(yy);
		String zeroPadFormat = "%0" + String.valueOf(digits) + "d";
		nyDigits = String.format(zeroPadFormat, nyNum);
		String ny = cy.substring(0, cy.length() - digits).concat(nyDigits);
		return ny;
	}

	public static Map<String, List<String>> getMemberFilters() {
		
		List<String> timeMemberList = null, measureMemberList = null;
		HashMap<String, List<String>>memberFilters = new HashMap<String, List<String>>();
		
		
		timeMemberList = new ArrayList<String>();
		timeMemberList.add("Feb");
		timeMemberList.add("Mar");	
		timeMemberList.add("Apr");
		memberFilters.put(getAppDef().getMdbDef().getTimeDim(), timeMemberList);
		
		measureMemberList= new ArrayList<String>();
		measureMemberList.add("SLS_DLR");
		measureMemberList.add("MDTTL_DLR");
		memberFilters.put(getAppDef().getMdbDef().getMeasureDim(), measureMemberList);
				
		return memberFilters;
		
	}
	
	public static Map<String, List<String>> getEmptyMemberFilters() {
		List<String> timeMemberList = null, measureMemberList = null;
		HashMap<String, List<String>>memberFilters = new HashMap<String, List<String>>();
		
		
		timeMemberList = new ArrayList<String>();
		timeMemberList.add("Feb");
		timeMemberList.add("Mar");	
		timeMemberList.add("Apr");
		memberFilters.put(getAppDef().getMdbDef().getTimeDim(), timeMemberList);
		
		measureMemberList= new ArrayList<String>();
//		measureMemberList.add("SLS_DLR");
//		measureMemberList.add("MD_DLR");
		memberFilters.put(getAppDef().getMdbDef().getMeasureDim(), measureMemberList);

		return memberFilters;
	}

	@SuppressWarnings("unused")
	private static MeasureDef[] importMeasures(MeasureDef[] measureDefArray) {
		
		String xmlFile = getConfigDirPath() + PafBaseConstants.FN_MeasureMetaData;
		try {
			measureDefArray  = (MeasureDef[]) PafXStream.importObjectFromXml(xmlFile);
		} catch (PafConfigFileNotFoundException e) {
			e.printStackTrace();
		}
		
		return measureDefArray;

 //       return (MeasureDef[]) importObject(MeasureDef[].class,
 //               getConfigDirPath() + PafBaseConstants.FN_MeasureMetaData);
	}


//	private static VersionDef[] importVersions() {
 //       return (VersionDef[]) importObject(VersionDef[].class,
   //             getConfigDirPath() + PafBaseConstants.FN_VersionMetaData);
//	}

	private static String getConfigDirPath() {
		String filePath = pafServerHome
				+ System.getProperty("file.separator") + "conf"
				+ System.getProperty("file.separator");
		return filePath;
	}

	public static String[] getUowDims() {
		// TODO Auto-generated method stub
		return getAppDef().getMdbDef().getAllDims();
	}
	/**
	 *	Return an expanded unit of work
	 *
	 * @return Map<Integer, List<String>>
	 */
	public static Map<Integer, List<String>> getExpandedUow() {
		
		Map<Integer, List<String>> expandedUow = new HashMap<Integer, List<String>>();
		String[] allDims = getUowDims();
		
		for (int i = 0; i < allDims.length; i++) {
			
			List<String> memberList = null;
			String dim = allDims[i];

			
			if (dim.equalsIgnoreCase("Time")) {
//				String[] members = {"Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};
				String[] members = {"S01", "Q1", "Feb", "WK01", "WK02", "WK03", "WK04", "Mar", "WK05", "WK06", "WK07", "WK08", "Apr", "WK09", "WK10", "WK11", "WK12", "WK13", "Q2", "May", "WK14", "WK15", "WK16", "WK17", "Jun", "WK18", "WK19", "WK20", "WK21", "Jul", "WK22", "WK23", "WK24", "WK25", "WK26"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("Measures")) {
				String[] members = {"SLS_DLR", "MDTTL_DLR", "RECRTL_DLR", "BOPRTL_DLR", "EOPRTL_DLR", "FWOS"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("PlanType")) {
				String[] members = {"ClassChn"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("Product")) {
				String[] members = {"DPT110", "DPT120", "DPT130"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("Version")) {
				String[] members = {"WP", "LY", "WAP", "WF", "OP", "WAF"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("Location")) {
				String[] members = {"Location", "StoreTotal", "Store1", "Store2"};
				memberList = Arrays.asList(members);
			} else if (dim.equalsIgnoreCase("Years")) {
				String[] members = {"FY2006" ,"FY2007"};
				memberList = Arrays.asList(members);
			}
			expandedUow.put(i, memberList);
		}
		@SuppressWarnings("unused")
		String timeDim = getAppDef().getMdbDef().getTimeDim();
	
		@SuppressWarnings("unused")
		final String mdxSelect = "SELECT " 
//			+ "{[Feb], [Mar], [Apr], [May], [Jun], [Jul], [Aug], [Sep], [Oct], [Nov], [Dec], [Jan] }"
			+ " Descendants(S01)"
			+ " ON AXIS(0), "
			+ " {[SLS_DLR], [MDTTL_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR], [FWOS]} "
//			+ " {[Measures], [SLS_DLR], [MD_DLR], [RECRTL_DLR], [BOPRTL_DLR], [EOPRTL_DLR]} "
			+ " ON AXIS(1), "
//			+ " {[DPT110], [DPT120], [DPT130]} "
			+ " Descendants(DIV01)"
			+ " ON AXIS(2), "
			+ " {[ClassChn]} "
			+ " ON AXIS(3), "
			+ " {[WP], [LY], [WAP], [WF], [OP], [WF_vs_LY], [WAF], [WP_vs_LY], [WP_vs_LY_%], [WP_vs_OP]} "
			+ " ON AXIS(4), "
			+ " {[FY2006]} "
			+ " ON AXIS(5), " 
			+ " Descendants ( [Location] ) "
			+ " ON AXIS(6) ";
		// TODO Auto-generated method stub
		return expandedUow;
	}

	/**
	 *	Display member list properly formatted
	 *
	 * @param members List of PafDimTree members
	 * @param logger Logger object of calling class
	 */
	public static void displayMemberList(List<PafDimMember> members, Logger logger) {
		
		if (!members.isEmpty()) {
			logger.info("Displaying members:");
			for (PafDimMember member : members) {
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print('\t');
				logger.info(member.getKey());
			}
			logger.info(""); 
		}
		logger.info(members.size() + " member(s) returned.\n");
	}
	
	

	/**
	 *	Display intersection set
	 *
	 * @param isSet Intersection set
	 * @param logger Logger object of calling class
	 */
	public static void displayIntersectionSet(Set<Intersection> isSet, Logger logger) {
		
		if (!isSet.isEmpty()) {
			logger.info("\n");
			logger.info("Displaying intersections:\n");
			for (Intersection is:isSet) {
				logger.info(StringUtils.arrayToString(is.getCoordinates(), "[", "]", "", "", ", "));									
			}
			logger.info("");
		}
		logger.info(isSet.size() + " intersection(s) returned.\n");		
	}

	public static PafClientState getClientState() {
		String clientId = "666";
		ClientInitRequest pcInit = new ClientInitRequest();
		//String paceHome = "C:" + File.pathSeparator + "Program Files" + File.pathSeparator + "Pace" + File.pathSeparator + "PafServer";
		String paceHome = System.getenv(PafBaseConstants.PACE_SERVER_HOME_ENV);
		String transferDirPath = paceHome + fileSep + PafBaseConstants.DN_TransferFldr;
		boolean debugMode = true;
		
		PafClientState clientState = new PafClientState(clientId, pcInit, paceHome, transferDirPath, debugMode);
		clientState.setApp(getAppDef());
		clientState.setUnitOfWork(getUowSpec());
		clientState.setUowTrees(getUowTrees());
		Season season = new Season();
		season.setId("Fall - Plan - 2006");
		season.setOpen(true);
		season.setPlanCycle("Plan");
		season.setYears(new String[]{"FY2007"});
		season.setTimePeriod("@IDESCENDENTS(S01)");
		clientState.setPlanSeason(season);
		return clientState;
	}

	private static MemberTreeSet getUowTrees() {
		MemberTreeSet dimTree = new MemberTreeSet();
		return dimTree;
	}

	/**
	 * @param expandedUowSpec
	 * @param appDef
	 * @return
	 */
	public static Map<String, Map<Integer, List<String>>> getDataSpecByVersion(
			Map<Integer, List<String>> expandedUowSpec, PafApplicationDef appDef) {
		// TODO Auto-generated method stub
		Map<String, Map<Integer, List<String>>> mdbExtractionMap = new HashMap<String, Map<Integer, List<String>>>();
		int versionAxis = appDef.getMdbDef().getVersionAxis();
		List<String> extractedVersions = expandedUowSpec.get(versionAxis);
		for (String version : extractedVersions) {
			Map<Integer, List<String>> intersectionMap = expandedUowSpec;
			mdbExtractionMap.put(version, intersectionMap);
		}
		return mdbExtractionMap;
	}

	/**
	 * @return UnitOfWork
	 */
	public static UnitOfWork getUowSpec() {
		
		String[] allDims = getUowDims();
		String[][]memberArray = new String[allDims.length][];
		for (int i = 0; i < allDims.length; i++) {
			
			String dim = allDims[i];
	
			if (dim.equalsIgnoreCase("Time")) {
//				String[] members = {"Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan"};
				String[] members = {"S01", "Q1", "Feb", "WK01", "WK02", "WK03", "WK04", "Mar", "WK05", "WK06", "WK07", "WK08", "Apr", "WK09", "WK10", "WK11", "WK12", "WK13", "Q2", "May", "WK14", "WK15", "WK16", "WK17", "Jun", "WK18", "WK19", "WK20", "WK21", "Jul", "WK22", "WK23", "WK24", "WK25", "WK26"};	
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("Measures")) {
				String[] members = {"SLS_DLR", "MDTTL_DLR", "RECRTL_DLR", "BOPRTL_DLR", "EOPRTL_DLR", "FWOS"};
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("PlanType")) {
				String[] members = {"ClassChn"};
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("Product")) {
				String[] members = {"DPT110", "DPT120", "DPT130"};
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("Version")) {
				String[] members = {"WP", "LY", "WAP", "WF", "OP", "WAF"};
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("Location")) {
				String[] members = {"Location", "StoreTotal", "Store1", "Store2"};
				memberArray[i] = members;
			} else if (dim.equalsIgnoreCase("Years")) {
				String[] members = {"FY2006" ,"FY2007"};
				memberArray[i] = members;
			}

		}
		UnitOfWork uowSpec = new UnitOfWork(allDims, memberArray);
		return uowSpec;
	}

	public static PafMVS getPafMVS() {
		
		PafMVS pafMVS = new PafMVS(getView(), getViewSection());
		return pafMVS;
	}

	private static PafView getView() {
		PafView pafView = new PafView();
		pafView.setName("View1");
		pafView.setViewSections(new PafViewSection[] {getViewSection()});
		return pafView;
	}

	private static PafViewSection getViewSection() {
		PafViewSection vs = new PafViewSection();
		vs.setName("ViewSection1");
		vs.setDimensionCalcSequence(getAppDef().getMdbDef().getAxisPriority());
		vs.setDimensionsPriority(getAppDef().getMdbDef().getAllDims());
		return vs;
	}

}

