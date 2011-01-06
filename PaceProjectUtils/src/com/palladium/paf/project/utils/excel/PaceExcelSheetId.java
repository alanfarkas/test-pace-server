/**
 * 
 */
package com.palladium.paf.project.utils.excel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jmilliron
 *
 */
public enum PaceExcelSheetId {
	
	ApplicationDef ("app id", "app title", "app settings - global large uow size", "app settings - global max uow size", "app settings - global replicate enabled", "app settings - global replicate all enabled ", "app settings - is global user filtered uow", "app settings - is global data filtered uow", "app settings - global data filter spec - dimension name", "app settings - global data filter spec - expression list", "app settings - global user filter spec - attribute dimension names", "app settings - enable rounding", "app colors - non plannable protected color", "app colors - forward plannable protected color", "app colors - protected color", "app colors - system lock color", "app colors - user lock color", "app colors - note color", "alias mapping - dim name", "alias mapping - alias table name", "alias mapping - primary row column format", "alias mapping - additional row column format", "global suppress zero settings - enabled", "global suppress zero settings - visible", "global suppress zero settings - row suppressed", "global suppress zero settings - col suppressed", "mdb def - data source id", "mdb def - measure dim", "mdb def - measure root", "mdb def - time dim", "mdb def - plan type dim", "mdb def - version dim", "mdb def - year dim", "mdb def - hierarchy dimensions", "mdb def - axis priority dimensions", "last period", "current year", "essbase net timeout", "essbase attribute dimension filter list"), 
	NumericFormats ("name", "pattern", "is default format"), 
	HierarchyFormats ("name", "dimension", "type (Level, Generation)", "number", "global style name"), 
	GlobalStyles ("name", "font name", "font color", "font size", "font alignment", "font bold", "font italic", "font strikeout", "font underline", "font double underline", "background fill color"), 
	UserSelections ("name", "dimension", "allow multiple selection", "prompt string"), 
	Versions ("name", "type", "alias table name", "alias value", "base version", "compare version", "variance type", "compare dimension", "compare member list", "numeric format name"),
	Measures ("name", "type", "alias table name", "alias value", "numeric format name", "var report flag", "plannable", "recalc TB override"), 
	DynamicMembers ("dimension", "member"), 
	PlanCycles ("name", "version"), 
	Seasons ("id", "plan cycle", "year", "is open", "time"), 
	Roles ("name", "description", "plantype", "is read only", "seasons"), 
	RoleConfigs ("role name", "plan cycle name", "default eval on working version", "save working version on uow load", "default rule set name", "rule set names (pipe delimited)", "version filters (pipe delimited) ", "enable role filter", "role filter (pipe delimited)", "view / view group names (pipe delimited)", "visible menus (pipe delimited)", "auto save menus (pipe delimited)", "replicate enabled", "replicate all enabled", "allow suppress invalid intersection", "suppress invalid intersection entry", "large cell limit", "max cell limit"), 
	CustomMenus ("key", "caption", "face id", "begin group", "enable button", "action class name", "action class params", "user prompts", "auto save uow", "auto refresh uow", "confirmation message", "termination message", "view filter"), 
	CustomFunctions ("function name", "class name"),
	Views ("view name", "view seciton name", "description", "page orientation", "pages tall (int)", "pages wide (int)"), 
	ViewSections ("name", "xml1"), 
	ViewGroups ("view group name", "description", "view name / view group name", "is view group"), 
	MemberTags ("name", "type", "label", "dimensions", "is editable", "is comment visible"), 
	UserSecurity ("username", "domain name", "testing user", "role name"),
	RoundingRules ("name", "digits", "dimension", "member"),
	RuleSets,
	RuleSets_RuleSet ("rule set", "name", "measure list"),
	RuleSets_RuleGroup ("", "rule group", "id", "perpetual", "skip protection processing", "balance key set", "delayed perpetual", "perpetual allocation", "perform initial allocation"),
	RuleSets_Rule ("", "", "rule(s)", "result term", "expression", "base allocate measure", "trigger measures", "skip allocation", "lock allocation", "skip aggeration", "lock system evaluation result", "lock user evaluation result", "eval locked intersections", "lock all prior time", "calc all periods", "initial TB first allocation");
	
	//headers tied to the excel sheet
	private List<String> headerList;
		
	/**
	 * Allows headers to be added to this enum.
	 * 
	 * @param headers var arg of headers associated to this sheet id
	 */
	PaceExcelSheetId(String... headers) {		
		
		if ( headers != null ) {
			
			headerList = Arrays.asList(headers);
			
		}
		
	}
	
	/**
	 * @return the headerList: always returns non null list.
	 */
	public List<String> getHeaderList() {
		
		List<String> headerList = null;
		
		if ( this.headerList != null ) {
			
			headerList = new ArrayList<String>(this.headerList);
			
		} else {
			
			headerList = new ArrayList<String>();
		}
		
		return headerList;
	}
	
}
