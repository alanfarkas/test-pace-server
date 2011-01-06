/**
 * 
 */
package com.palladium.paf.project.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;
import com.palladium.paf.app.DynamicMemberDef;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.VersionDef;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.db.membertags.MemberTagDef;
import com.palladium.paf.funcs.CustomFunctionDef;
import com.palladium.paf.project.utils.excel.PaceExcelError;
import com.palladium.paf.project.utils.excel.PaceExcelInput;
import com.palladium.paf.project.utils.excel.PaceExcelSheetId;
import com.palladium.paf.project.utils.excel.PaceExcelUtil;
import com.palladium.paf.project.utils.excel.PaceExcelRow;
import com.palladium.paf.project.utils.excel.PaceExcelRowItem;
import com.palladium.paf.rules.RoundingRule;
import com.palladium.paf.rules.RuleSet;
import com.palladium.paf.view.HierarchyFormat;
import com.palladium.paf.view.PafNumberFormat;
import com.palladium.paf.view.PafStyle;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.view.PafView;
import com.palladium.paf.view.PafViewGroup;
import com.palladium.paf.view.PafViewSection;

/**
 * @author JavaJ
 *
 */
public class PaceProjectExcelUtil {

	private static final Logger logger = Logger.getLogger(PaceProjectExcelUtil.class);
	
	private static final String endOfSheetFlag = "EOS";
	
	private static Map<Workbook, CellStyle> workbookBoldCellStyleMap = new HashMap<Workbook, CellStyle>();	
	
	private static void validateImportProjectArgs(String confDir, String fullExcelWorkbookLocation, Set<PaceExcelSheetId> excelSheetsToImportList) throws PafException {

		if ( confDir == null || fullExcelWorkbookLocation == null || excelSheetsToImportList == null ) {
			
			throw new IllegalArgumentException("ConfDir or full excel workbook location or excel sheets to import was null.");
			
		}
		
		File confDirFile = new File(confDir);
		
		if ( ! confDirFile.isDirectory() ) {
			
			throw new PafException("Directory " + confDir + " does not exist.", PafErrSeverity.Error);
		}
		
		File fullExcelWorkbookLocationFile = new File(fullExcelWorkbookLocation);
		
		if ( ! fullExcelWorkbookLocationFile.isFile() ) {
			
			throw new PafException("Excel file " + fullExcelWorkbookLocation + " does not exist.", PafErrSeverity.Error);
			
		}
		
		if ( ! fullExcelWorkbookLocation.endsWith(PaceExcelInput.XLSX_EXT)) {
			
			throw new PafException("Not supported Excel file.  The file extenstion must be " + PaceExcelInput.XLSX_EXT, PafErrSeverity.Error);
			
		}
		
	}
	
	/*public static Map<PaceExcelSheetId, List<PaceExcelError>> importProject(String confDir, String fullExcelWorkbookLocation) throws PafException  {
		
		return importProject(confDir, fullExcelWorkbookLocation, null);
		
	}*/
	
	/**
	 * 
	 * @param confDir
	 * @param fullExcelWorkbookLocation
	 * @param excelSheetsToImport
	 */
	public static Map<PaceExcelSheetId, List<PaceExcelError>> importProject(String confDir, String fullExcelWorkbookLocation, Set<PaceExcelSheetId> excelSheetsToImportList) throws PafException  {		
						
		validateImportProjectArgs(confDir, fullExcelWorkbookLocation, excelSheetsToImportList);
		
		Map<PaceExcelSheetId, List<PaceExcelError>> errorMap = new HashMap<PaceExcelSheetId, List<PaceExcelError>>();
		
		try {
		
			Workbook wb = new XSSFWorkbook(fullExcelWorkbookLocation);
			
			Map<PaceExcelSheetId, Object> importedProjectObjectMap = new HashMap<PaceExcelSheetId, Object>();
			
			for (PaceExcelSheetId paceExcelSheetId : excelSheetsToImportList ) {			
				
				switch(paceExcelSheetId) {
				
				case PlanCycles:
					
					List<PaceExcelError> errorList = new ArrayList<PaceExcelError>();
					
					List<PlanCycle> planCycleList = importPlanCycles(wb, paceExcelSheetId, errorList);
					
					if ( errorList != null && errorList.size() > 0) {
						
						//add errors to map for this sheet
						errorMap.put(paceExcelSheetId, errorList);
						
						logErrorMessages(errorMap.get(paceExcelSheetId));
						
					} else {
						
						importedProjectObjectMap.put(paceExcelSheetId, planCycleList);
											
					}
									
					break;
				
				}			
				
			}		
			
			//no errors exists, try to write to confDir
			if ( errorMap.size() == 0 ) {
				
				//use PafImportExportUtility to write in project
				
			}
		
		} catch ( IOException e ) {
			
			
			
		}
		
		
		return errorMap;
		
	}
	
	private static void validateExportProjectArgs(String confDir, String workbookDir) throws PafException {

		if ( confDir == null || workbookDir == null )  {
			
			throw new IllegalArgumentException("ConfDir or excel workbook directory was null.");
			
		}
		
		File confDirFile = new File(confDir);
		
		if ( ! confDirFile.isDirectory() ) {
			
			throw new PafException("Directory " + confDir + " does not exist.", PafErrSeverity.Error);
		}
		
		File workbookDirFile = new File(workbookDir);
		
		if ( ! workbookDirFile.isDirectory() ) {
			
			throw new PafException("Excel directory " + workbookDirFile + " does not exist.", PafErrSeverity.Error);
			
		}
				
		
	}
		
	public static void exportProject(String confDir, String workbookDir, boolean linkData) throws PafException {
	
		validateExportProjectArgs(confDir, workbookDir);
		
		//read in contents of confDir, add to a map<PaceExcelSheetId, Object>
		//use PafImportExportUtility to read in project
		
		//if link data is enabled, create link data map
		
		//create instance of workbook; for file name do pace_project_<timestamp>.xlsx
		Workbook wb = new XSSFWorkbook();
		
		FileOutputStream fileOut = null;
		
		try {
			
			fileOut = new FileOutputStream(workbookDir + File.separator + "pace_project_" + (new Date()).getTime() + PaceExcelInput.XLSX_EXT );
		
				//loop through map keys
				//switch on sheetId
					//export sheet with data from map
			
				VersionDef[] versionDefAr = new VersionDef[3];
				versionDefAr[0] = new VersionDef();
				versionDefAr[0].setName("Test1");
				versionDefAr[1] = new VersionDef();
				versionDefAr[1].setName("Test2");
				versionDefAr[2] = new VersionDef();
				versionDefAr[2].setName("Test3");			
			
				exportVersions(wb, confDir);
								
				List<PlanCycle> planCycles = new ArrayList<PlanCycle>();
				
				planCycles.add(new PlanCycle("one", "Test1"));
				planCycles.add(new PlanCycle("two", "Test2"));
				planCycles.add(new PlanCycle("three", "Test3"));
				planCycles.add(new PlanCycle("four", "Test4"));
				
				//exportPlanCycles(wb, confDir, linkData);
		
			//end loop through map keys
		
			//save workbook
			wb.write(fileOut);	
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if ( fileOut != null ) {
				
				try {
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.error(e.getMessage());
				}
				
			}
			
		}
		
		
				
	}

	/**
	 *  
	 * @param workbookDir
	 * @param workbookName
	 * @param sheetId
	 * @param errorMap
	 * @return
	 * @throws PafException
	 */
	private static List<PlanCycle> importPlanCycles(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {

		List<PlanCycle> planCycleList = new ArrayList<PlanCycle>();
						
		PaceExcelInput input = new PaceExcelInput(workbook, sheetId.toString(), sheetId.getHeaderList().size(), sheetId.getHeaderList(), endOfSheetFlag);
		
		List<PaceExcelRow> planCycleRowList = PaceExcelUtil.readExcelSheet(input);
	
		for ( PaceExcelRow paceRow : planCycleRowList ) {
			
			if ( ! paceRow.isHeader() ) {
												
				PaceExcelRowItem rowItem1 = paceRow.getPaceRowItems().get(0);								
				PaceExcelRowItem rowItem2 = paceRow.getPaceRowItems().get(1);
				
				if ( rowItem1.isBlank() && rowItem2.isBlank()) {
					continue;
				} else if ( rowItem1.isBlank() ) {
				
					errorList.add(new PaceExcelError(input.getSheetName(), rowItem1.getCellAddress(), "Name is required and can't be blank"));
					
				} else if ( rowItem2.isBlank() ) {
					
					errorList.add(new PaceExcelError(input.getSheetName(), rowItem1.getCellAddress(), "Version is required and can't be blank"));
					
				}
				
				PlanCycle pc = new PlanCycle();
				
				pc.setLabel(rowItem1.getValueAsString());
				pc.setVersion(rowItem2.getValueAsString());
				
				planCycleList.add(pc);
				
			}
			
		}	
				
		return planCycleList;
	}
	
	private static void exportPlanCycles(Workbook workbook, PaceExcelSheetId sheetId, List<PlanCycle> planCycleList, boolean linkData) throws PafException {
		
		if ( workbook != null && sheetId != null ) {

			Map<String, String> versionRefMap = new HashMap<String, String>();
			
			if ( linkData ) {
				
				PaceExcelInput versionInput = new PaceExcelInput(workbook, PaceExcelSheetId.Versions.toString(), 1, PaceExcelSheetId.Versions.getHeaderList());

				List<PaceExcelRow> versionRows = PaceExcelUtil.readExcelSheet(versionInput);
				
				for (PaceExcelRow versionRow : versionRows ) {
					
					int versionNameNdx = PaceExcelSheetId.Versions.getHeaderList().indexOf("name");						
					
					PaceExcelRowItem versionNameRowItem = versionRow.getPaceRowItems().get(versionNameNdx);
					
					if ( ! versionRow.isHeader() && ! versionNameRowItem.isBlank() ) {
						
						versionRefMap.put(versionNameRowItem.getValueAsString(), versionNameRowItem.getCellAddress(true));
						
					}
					
				}
				
			}
			
			CreationHelper createHelper = workbook.getCreationHelper();
			
			Sheet sheet = workbook.createSheet(sheetId.toString());			
	
			int rowNdx = 0;
						
			Row row = sheet.createRow(rowNdx++);
			
			Cell header1 = row.createCell(0);
			
			header1.setCellValue(createHelper.createRichTextString(sheetId.getHeaderList().get(0)));
			
			Cell header2 = row.createCell(1);
			
			header2.setCellValue(createHelper.createRichTextString(sheetId.getHeaderList().get(1)));
			
			//add bold if bold style exists
			if ( getBoldCellStyle(workbook) != null ) {
				
				header1.setCellStyle(getBoldCellStyle(workbook));
				header2.setCellStyle(getBoldCellStyle(workbook));
			}		
			
			for (PlanCycle planCycle : planCycleList) {
				
				row = sheet.createRow(rowNdx++);
				
				Cell planCycleName = row.createCell(0);
				
				planCycleName.setCellValue(createHelper.createRichTextString(planCycle.getLabel()));
				
				Cell versionName = row.createCell(1);
				
				String version = planCycle.getVersion();
				
				if ( versionRefMap.containsKey(version)) {
					
					version = createExcelReference(PaceExcelSheetId.Versions.toString(), versionRefMap.get(version));
														
					versionName.setCellFormula(version);
					
				} else {
				
					versionName.setCellValue(createHelper.createRichTextString(version));
					
				}
			}
						
		}		
		
	}

	private static List<PafApplicationDef> importApplicationDefinition(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static Map<String, PafNumberFormat> importNumericFormats(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static Map<String, PafStyle> importGlobalStyles(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static Map<String, HierarchyFormat> importHierarchyFormats(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafUserSelection> importUserSelections(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<VersionDef> importVersions(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<MeasureDef> importMeasures(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<DynamicMemberDef> importDynamicMembers(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafPlannerRole> importRoles(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafPlannerConfig> importRoleConfigurations(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<CustomMenuDef> importCustomMenus(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<CustomFunctionDef> importCustomFunctions(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafView> importViews(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafViewSection> importViewSections(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static Map<String, PafViewGroup> importViewGroups(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<MemberTagDef> importMemberTags(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<PafUserSecurity> importUserSecurity(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<RoundingRule> importRoundingRules(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}
	private static List<RuleSet> importRuleSets(Workbook workbook, PaceExcelSheetId sheetId, List<PaceExcelError> errorList) throws PafException {return null;}

	private static void exportApplicationDefinition(Workbook workbook, PaceExcelSheetId sheetId, List<PafApplicationDef> appDef) throws PafException {}
	private static void exportNumericFormats(Workbook workbook, PaceExcelSheetId sheetId, Map<String, PafNumberFormat> numericFormatMap) throws PafException {}
	private static void exportGlobalStyles(Workbook workbook, PaceExcelSheetId sheetId, Map<String, PafStyle> globalStyleMap) throws PafException {}
	private static void exportHierarchyFormats(Workbook workbook, PaceExcelSheetId sheetId, Map<String, HierarchyFormat> hierarchyFormatMap) throws PafException {}
	private static void exportUserSelections(Workbook workbook, PaceExcelSheetId sheetId, List<PafUserSelection> pafUserSelectionAr) throws PafException {}
	
	private static void exportVersions(Workbook workbook, String confDir) throws PafException {
				
		if ( workbook != null && confDir != null ) {
			
			List<VersionDef> versionDefList = null;
			
			Sheet sheet = workbook.createSheet(PaceExcelSheetId.Versions.toString());
			
			int rowNdx = 0;
			
			Row row = sheet.createRow(rowNdx++);
			
			Cell header1 = row.createCell(0);
			
			header1.setCellValue(new XSSFRichTextString(PaceExcelSheetId.Versions.getHeaderList().get(0)));
						
			if ( getBoldCellStyle(workbook) != null ) {
			
				header1.setCellStyle(getBoldCellStyle(workbook));
				
			}			
						
			if ( versionDefList != null ) {				
								
				for (VersionDef versionDef : versionDefList ) {
					
					row = sheet.createRow(rowNdx++);
					
					Cell versionName = row.createCell(0);
					
					versionName.setCellValue(new XSSFRichTextString(versionDef.getName()));
					
				}
				
			}			
			
		}		
		
	}
	
	private static void exportMeasures(Workbook workbook, PaceExcelSheetId sheetId, List<MeasureDef> measureDefAr) throws PafException {}
	private static void exportDynamicMembers(Workbook workbook, PaceExcelSheetId sheetId, List<DynamicMemberDef> dynamicMembersDefAr) throws PafException {}
	private static void exportRoles(Workbook workbook, PaceExcelSheetId sheetId, List<PafPlannerRole> roleAr) throws PafException {}
	private static void exportRoleConfigurations(Workbook workbook, PaceExcelSheetId sheetId, List<PafPlannerConfig> plannerConfigAr) throws PafException {}
	private static void exportCustomMenus(Workbook workbook, PaceExcelSheetId sheetId, List<CustomMenuDef> customMenuDefAr) throws PafException {}
	private static void exportCustomFunctions(Workbook workbook, PaceExcelSheetId sheetId, List<CustomFunctionDef> customFunctionDefAr) throws PafException {}
	private static void exportViews(Workbook workbook, PaceExcelSheetId sheetId, List<PafView> viewList) throws PafException {}
	private static void exportViewSections(Workbook workbook, PaceExcelSheetId sheetId, List<PafViewSection> viewSectionList) throws PafException {}
	private static void exportViewGroups(Workbook workbook, PaceExcelSheetId sheetId, Map<String, PafViewGroup> viewGroupMap) throws PafException {}
	private static void exportMemberTags(Workbook workbook, PaceExcelSheetId sheetId, List<MemberTagDef> memberTagDefList) throws PafException {}
	private static void exportUserSecurity(Workbook workbook, PaceExcelSheetId sheetId, List<PafUserSecurity> userSecurityList) throws PafException {}
	private static void exportRoundingRules(Workbook workbook, PaceExcelSheetId sheetId, List<RoundingRule> roundingRuleList) throws PafException {}
	private static void exportRuleSets(Workbook workbook, PaceExcelSheetId sheetId, List<RuleSet> ruleSetList) throws PafException {}	

	/**
	 * 
	 * If error list exist, logs them as error.
	 * 
	 * @param errorList list of pace excel error's
	 */
	private static void logErrorMessages(List<PaceExcelError> errorList) {
		
		if ( errorList != null ) {
		
			for (PaceExcelError error : errorList) {
			
				logger.error("Sheet: " + error.getSheetName() + "; Cell Address: " + error.getCellAddress() + "; Error: " + error.getErrorMessage());
			
			}
			
		}		
		
	}
	
	private static String createExcelReference(String sheetId, String address) {

		return sheetId + "!" + address;
				
	}
	
	private static CellStyle getBoldCellStyle(Workbook workbook) {
		
		CellStyle cellStyle = null;
		
		if ( workbook != null ) {
		
			
			if ( workbookBoldCellStyleMap.containsKey(workbook)) {
			
				cellStyle = workbookBoldCellStyleMap.get(workbook);
				
			} else {
				
				cellStyle = workbook.createCellStyle();
				
				Font font = workbook.createFont();
				
				font.setBoldweight(Font.BOLDWEIGHT_BOLD);
				
				cellStyle.setFont(font);
				
			}		
			
		} 
		
		
		return cellStyle;	
		
	}
}
