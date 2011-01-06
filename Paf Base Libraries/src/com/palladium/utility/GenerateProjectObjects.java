/**
 * 
 */
package com.palladium.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.app.AliasMapping;
import com.palladium.paf.app.AppColors;
import com.palladium.paf.app.AppSettings;
import com.palladium.paf.app.MdbDef;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.MeasureType;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.Season;
import com.palladium.paf.app.SeasonList;
import com.palladium.paf.app.SuppressZeroSettings;
import com.palladium.paf.app.VarRptgFlag;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.app.VersionFormula;
import com.palladium.paf.app.VersionType;
import com.palladium.paf.app.VersionVarianceType;
import com.palladium.paf.comm.DataFilterSpec;
import com.palladium.paf.comm.UserFilterSpec;
import com.palladium.paf.rules.Formula;
import com.palladium.paf.rules.Rule;
import com.palladium.paf.rules.RuleGroup;
import com.palladium.paf.rules.RuleSet;
import com.thoughtworks.xstream.XStream;

/**
 * @author jmilliron
 *
 * This class is used to generate project objects that can be used for
 * unit testing and/or xsd testing. 
 *
 */
public class GenerateProjectObjects {
	
	private static final XStream xs = new PafXStream().getXStream();
	
	static {
		
		xs.setMode(XStream.NO_REFERENCES);
		
	}
	
	/**
	 * @return
	 */
	public static RuleSet createRuleSet() {
		
		RuleSet ruleSet = new RuleSet();
		
		ruleSet.setDimension("TestDimension");
		ruleSet.setMeasureList(new String[] { "measure1", "measure2", "measure3"});
		ruleSet.setName("RuleSetName");
		ruleSet.setRuleGroups(new RuleGroup[] { createRuleGroup(1), createRuleGroup(2) });
		ruleSet.setType(0);
		
		return ruleSet;	
		
	}
	
	private static RuleGroup createRuleGroup(int i) {

		RuleGroup rg = new RuleGroup();
		
		rg.setBalanceSetKey("TestBalanceSetKey");
		rg.setDelayedPerpetual(true);
		rg.setPerformInitialAllocation(true);
		rg.setPerpetual(true);
		rg.setPerpetualAllocation(true);
		rg.setRuleGroupId("RuleGroup" + i);
		rg.setRules(new Rule[] { createRule(1), createRule(2)});
		rg.setSkipProtProc(true);
		
		return rg;
	}

	private static Rule createRule(int i) {
		
		Rule r = new Rule();
		
		r.setBaseAllocateMeasure("test");
		r.setCalcAllPeriods(true);
		r.setEvalLockedIntersections(true);
		r.setFormula(createFormula());
		r.setInitialTBFirstAllocation(true);
		r.setKey(i);
		r.setLockAllocation(true);
		r.setLockAllPriorTime(true);
		r.setLockSystemEvaluationResult(true);
		r.setLockUserEvaluationResult(true);
		r.setSkipAggregation(true);
		r.setSkipAllocation(true);
		r.setTriggerMeasures(createStringAr());
		
		return r;
	}

	private static Formula createFormula() {
		
		Formula f = new Formula();
		
		try {
			f.setExpression("@IF(ACCT1 &gt;= SLS_DLR, 1, -2)");
		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setExpressionTerms(createStringAr());
		f.setParsed(true);
		f.setResultFunction(false);
		try {
			f.setResultTerm("STORE_COUNT");
		} catch (PafException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return f;
	}

	public static PafApplicationDef[] createPafApps() {
		
		PafApplicationDef[] pafAppDefs = new PafApplicationDef[1]; 
		
		PafApplicationDef pafAppDef = new PafApplicationDef();
		
		pafAppDef.setAppId("TestAppId");		
		pafAppDef.setAppSettings(createAppSettings());
		pafAppDef.setCurrentYear("FY2006");
		pafAppDef.setEssAttrDimFilter(createStringAr());
		pafAppDef.setEssNetTimeOut(300);
		pafAppDef.setLastPeriod("WK33");
		pafAppDef.setMdbDef(createMdbDef());
		
		pafAppDef.setPlanCycles(createPlanCycles());
		pafAppDef.setSeasonList(createSeasonList());
		
		//not needed for xsd generation
		pafAppDef.setMeasureDefs(null);
		pafAppDef.setMemberTagDefs(null);
		pafAppDef.setVersionDefs(null);		
		
		pafAppDefs[0] = pafAppDef;
		
		return pafAppDefs;
	}
	
	public static MeasureDef[] createPafMeasures() {
		
		List<MeasureDef> measureDefs = new ArrayList<MeasureDef>();
		
		for (int i = 0; i < 5; i++) {
			
			measureDefs.add(createMeasureDef(i));
			
		}		
		
		return measureDefs.toArray(new MeasureDef[0]);		
	}
	
	public static VersionDef[] createPafVersions() {
		
		List<VersionDef> versionDefs = new ArrayList<VersionDef>();
		
		for (int i = 0; i < 5; i++) {
			
			versionDefs.add(createVersionDef(i));
			
		}		
		
		return versionDefs.toArray(new VersionDef[0]);
		
	}
	
	private static VersionDef createVersionDef(int i) {
		
		VersionDef vd = new VersionDef();
		
		vd.setAliases(createStringKeyStringValueMap());
		vd.setName("Version" + i);
		vd.setNumericFormatName("Numeric Format " + i);
		vd.setType(VersionType.Variance);
		vd.setVersionFormula(createVersionFormula());
		
		return vd;
	}

	private static VersionFormula createVersionFormula() {
		
		VersionFormula vf = new VersionFormula();
		
		vf.setBaseVersion("BaseVersion");
		vf.setCompareIsSpec(createPafDimSpecs());
		vf.setCompareVersion("CompareVersion");
		vf.setVarianceType(VersionVarianceType.PercentVariance);
		
		return vf;
	}

	public static MeasureDef createMeasureDef(int i) {
		
		MeasureDef md = new MeasureDef();
		
		md.setAliases(createStringKeyStringValueMap());
		md.setName("MeasureDef" + i);
		md.setNumericFormatName("Numeric Formatting " + i );
		md.setPlannable(true);
		md.setRecalcTBOveride(MeasureType.Aggregate);
		md.setVarRptgFlag(VarRptgFlag.ExpenseReporting);
		
		return md;
	}


	private static Map<String, String> createStringKeyStringValueMap() {

		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < 3; i++) {
		
			map.put("Key" + i, "Value" + i);
			
		}
		
		return map;
	}

	public static SeasonList createSeasonList() {

		SeasonList sl = new SeasonList();
		
		sl.addSeason(createSeason("id 1", true, "pc1", "tp1", "year1"));
		sl.addSeason(createSeason("id 2", false, "pc2", "tp2", "year2"));
		
		return sl;
	}

	public static Season createSeason(String id, boolean isOpen, String planCycle, String timePeriod, String year) {
		
		Season s = new Season();
		
		s.setId(id);
		s.setOpen(isOpen);
		s.setOtherDims(createPafDimSpecs());
		s.setPlanCycle(planCycle);
		s.setTimePeriod(timePeriod);
		s.setYear(year);
		
		return s;
	}

	public static PlanCycle[] createPlanCycles() {
		
		List<PlanCycle> planCycles = new ArrayList<PlanCycle>();
		
		planCycles.add(createPlanCycle("Label1", "Version1"));
		planCycles.add(createPlanCycle("Label2", "Version2"));
		planCycles.add(createPlanCycle("Label3", "Version3"));
		
		return planCycles.toArray(planCycles.toArray(new PlanCycle[0]));
	}

	public static PlanCycle createPlanCycle(String label, String version) {
		
		PlanCycle pc = new PlanCycle();
		
		pc.setLabel(label);
		pc.setVersion(version);
		
		return pc;
	}

	public static MdbDef createMdbDef() {
		
		MdbDef md = new MdbDef();
		
		md.setAxisPriority(createStringAr());
		md.setDataSourceId("Test DS");
		md.setHierDims(createStringAr());
		md.setMeasureDim("MeasureDim");
		md.setMeasureRoot("MeasureRoot");
		md.setPlanTypeDim("PlanTypeDim");
		md.setTimeDim("TimeDim");
		md.setVersionAxis(0);
		md.setVersionDim("VersionDim");
		md.setYearDim("YearDim");		
		
		return md;
	}

	private static String[] createStringAr() {
		
		return new String[] { "one", "two", "three" };
	}

	public static AppSettings createAppSettings() {
		
		AppSettings as = new AppSettings();
		
		as.setAppColors(createAppColors());
		as.setAppTitle("Test App Title");
		as.setEnableRounding(false);
		as.setGlobalAliasMappings(createAliasMappings());
		as.setGlobalDataFilteredUow(true);
		as.setGlobalDataFilterSpec(createDataFilterSpec());
		as.setGlobalReplicateAllEnabled(true);
		as.setGlobalReplicateEnabled(false);
		as.setGlobalSuppressZeroSettings(createSuppressZeroSettings());
		as.setGlobalUowSizeLarge(1);
		as.setGlobalUowSizeMax(100);
		as.setGlobalUserFilteredUow(true);
		as.setGlobalUserFilterSpec(createUserFilterSpec());		
		
		return as;
	}

	public static UserFilterSpec createUserFilterSpec() {
		
		UserFilterSpec ufs = new UserFilterSpec();
		
		ufs.setAttrDimNames(new String[] { "att1", "att2", "att3"} );

		return ufs;
	}

	public static SuppressZeroSettings createSuppressZeroSettings() {

		SuppressZeroSettings szs = new SuppressZeroSettings();
		
		szs.setColumnsSuppressed(true);
		szs.setEnabled(false);
		szs.setRowsSuppressed(false);
		szs.setVisible(true);
		
		return szs;
	}

	public static DataFilterSpec createDataFilterSpec() {

		DataFilterSpec dfs = new DataFilterSpec();
		
		dfs.setDimSpec(createPafDimSpecs());
		
		return dfs;
	}

	public static PafDimSpec[] createPafDimSpecs() {
		
		List<PafDimSpec> pafDimSpecList = new ArrayList<PafDimSpec>();
		
		pafDimSpecList.add(createPafDimSpec("Dim1", new String[] { "Test1", "Test2"}));
		pafDimSpecList.add(createPafDimSpec("Dim2", new String[] { "Test3", "Test4"}));
		
		return pafDimSpecList.toArray(new PafDimSpec[0]);
	}

	private static PafDimSpec createPafDimSpec(String dimName, String[] expressionList ) {

		PafDimSpec pds = new PafDimSpec();
		
		pds.setDimension(dimName);
		pds.setExpressionList(expressionList);
		//transient pds.setSelectable(isSelectable);
		
		return pds;
	}

	public static AliasMapping[] createAliasMappings() {
		
		List<AliasMapping> aliasMappings = new ArrayList<AliasMapping>();
		
		aliasMappings.add(createAliasMapping("Dim1", PafBaseConstants.ALIAS_TABLE_DEFAULT, "Alias", null));
		aliasMappings.add(createAliasMapping("Dim2", null, "Alias", null));
		aliasMappings.add(createAliasMapping("Dim3", PafBaseConstants.ALIAS_TABLE_DEFAULT, "Alias", "Member"));
		
		return aliasMappings.toArray(new AliasMapping[0]);
	}

	public static AliasMapping createAliasMapping(String dimName, String aliasTableName, String priFormatting, String additionalFormatting) {
	
		AliasMapping am = new AliasMapping();
		
		am.setDimName(dimName);
		am.setAliasTableName(aliasTableName);
		am.setPrimaryRowColumnFormat(priFormatting);
		am.setAdditionalRowColumnFormat(additionalFormatting);
		
		return am;
	}
	
	public static AppColors createAppColors() {
		
		AppColors ac = new AppColors();
		
		ac.setForwardPlannableProtectedColor("FF8080");
		ac.setNonPlannableProtectedColor("008080");
		ac.setNoteColor("99CCFF");
		ac.setProtectedColor("FF6600");
		ac.setSystemLockColor("FFFF00");
		ac.setUserLockColor("00FFFF");
		
		return ac;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.out.println(xs.toXML(createPafApps()));
		//System.out.println(xs.toXML(createPafMeasures()));
		//System.out.println(xs.toXML(createPafVersions()));
		System.out.println(xs.toXML(createRuleSet()));

	}

}
