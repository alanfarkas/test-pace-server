/**
 * 
 */
package com.palladium.paf.project.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.Ostermiller.util.StringTokenizer;
import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.app.CustomActionDef;
import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PafPlannerRole;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.paf.app.PlanCycle;
import com.palladium.paf.app.Season;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.comm.DataFilterSpec;
import com.palladium.paf.comm.PafPlannerConfig;
import com.palladium.paf.view.PafUserSelection;
import com.palladium.paf.view.PafView;
import com.palladium.paf.view.PafViewGroup;
import com.palladium.paf.view.PafViewGroupItem;
import com.palladium.paf.view.PafViewHeader;

/**
 * @author JavaJ
 *
 */
public class PaceProjectUtil {
	
	private static Logger logger = Logger.getLogger(PaceProjectUtil.class);
	
	private static final String EOF_FLAG = "eof";

	private static final String DELIMITER = "|";
	
	//sheet names
	private static final String SHEET_ROLES = "Roles";
	private static final String SHEET_SEASONS = "Seasons";
	private static final String SHEET_PLAN_CYCLES = "PlanCycles";
	private static final String SHEET_ROLE_CONFIGS = "RoleConfigs";
	private static final String SHEET_USER_SECURITY = "UserSecurity";
	private static final String SHEET_CUSTOM_MENUS = "CustomMenus";
	private static final String SHEET_VIEW_GROUPS = "ViewGroups";
	private static final String SHEET_VIEWS = "Views";
	
	
	//header idents
	private static final String HEADER_IDENT_SEASONS = "id";
	private static final String HEADER_IDENT_PLAN_CYCLE = "label";
	private static final String HEADER_IDENT_ROLES = "role name";
	private static final String HEADER_IDENT_ROLE_CONFIGURATION = "role";
	private static final String HEADER_IDENT_USER_SECURITY = "username";	
	private static final String HEADER_IDENT_CUSTOM_MENUS = "key";	
	private static final String HEADER_IDENT_VIEW_GROUPS = "view group name";	
	private static final String HEADER_IDENT_VIEWS = "view name";

	
	public static List<CustomMenuDef> getCustomMenus(HSSFWorkbook wb) {
		
		List<CustomMenuDef> customMenuList = new ArrayList<CustomMenuDef>();
		
		HSSFSheet customMenuSheet = wb.getSheet(SHEET_CUSTOM_MENUS);
		
		for (int i = 0; i <= customMenuSheet.getLastRowNum(); i++) {
			
			HSSFRow row = customMenuSheet.getRow(i);
			
			HSSFCell menuKey = row.getCell(0);
			
			
			if ( menuKey == null || menuKey.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG)) {
				break;
			} else 	if ( menuKey.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_CUSTOM_MENUS) ) {
				continue;
			}		
			
			HSSFCell caption = row.getCell(1);
			HSSFCell faceID = row.getCell(2);
			
			// boolean
			HSSFCell beginGroup = row.getCell(3);
			HSSFCell enableButton = row.getCell(4);
			
			HSSFCell actionClass = row.getCell(5);
			HSSFCell actionParms = row.getCell(6);
			HSSFCell userPrompts = row.getCell(7);
			
			// boolean
			HSSFCell autoSaveUow = row.getCell(8);
			HSSFCell autoRefreshUow = row.getCell(9);			
			
			HSSFCell confirmationMsg = row.getCell(10);
			HSSFCell terminationMsg = row.getCell(11);
			HSSFCell viewFilter = row.getCell(12);			
			
			CustomMenuDef cmd = new CustomMenuDef();
			
			cmd.setKey(menuKey.getRichStringCellValue().getString());
			cmd.setCaption(caption.getRichStringCellValue().getString());

			if ( faceID.getCellType() == HSSFCell.CELL_TYPE_NUMERIC ) {
				cmd.setFaceID(new Double(faceID.getNumericCellValue()).intValue());
			} else {
				cmd.setFaceID(new Integer(faceID.getRichStringCellValue().getString()).intValue());
			}
			
			cmd.setBeginGroup(beginGroup.getBooleanCellValue());
			cmd.setEnableButton(enableButton.getBooleanCellValue());			
			
			cmd.setCustomActionDefs(getCustomActionDef(actionClass, actionParms));
			cmd.setUserPrompts(new String[0]); // unused
			
			cmd.setAutoSaveUow(autoSaveUow.getBooleanCellValue());
			cmd.setAutoRefreshUow(autoRefreshUow.getBooleanCellValue());	
			
			cmd.setConfirmationMessage(confirmationMsg.getRichStringCellValue().getString());
			cmd.setTerminationMessage(terminationMsg.getRichStringCellValue().getString());
			cmd.setViewFilter(getViewFilter(viewFilter));
			
			customMenuList.add(cmd);			
		}
		
		return customMenuList;
	}
	
	public static Map<String, PafViewGroup> getViewGroups(HSSFWorkbook wb) {
		
		Map<String, PafViewGroup> viewGroupMap = new HashMap<String, PafViewGroup>();
		
		HSSFSheet sheet = wb.getSheet(SHEET_VIEW_GROUPS);
		
		String lastViewGroupName = null;
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			
			HSSFRow row = sheet.getRow(i);
			
			HSSFCell viewGroupNameCell = row.getCell(0);
			
			//if header, continue
			if ( viewGroupNameCell != null && viewGroupNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_VIEW_GROUPS) ) {
				continue;
			}		
			
			if ( viewGroupNameCell != null && viewGroupNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG)) { 
				break;
			}
			
			String viewGroupName = null;
			
			if ( viewGroupNameCell == null || viewGroupNameCell.getRichStringCellValue().getString().trim().equals("")) {
				
				viewGroupName = lastViewGroupName;
				
			} else {
				
				viewGroupName = viewGroupNameCell.getRichStringCellValue().getString();
				
			}
						
			PafViewGroup pvg = null;
			
			if ( viewGroupMap.containsKey(viewGroupName) ) {
				
				pvg = viewGroupMap.get(viewGroupName);
				
			} 
			
			if ( pvg == null ) {
				
				pvg = new PafViewGroup();
				
			}
			
			pvg.setName(viewGroupName);
			
			HSSFCell viewNameOrGroupNameCell = row.getCell(1);
			HSSFCell isViewGroupCell = row.getCell(2);
			
			String viewNameOrGroupName = viewNameOrGroupNameCell.getRichStringCellValue().getString();
			boolean isViewGroup = isViewGroupCell.getBooleanCellValue();
			
			PafViewGroupItem pvgi = new PafViewGroupItem(viewNameOrGroupName, isViewGroup);
			
			if ( pvg.getPafViewGroupItems() == null || pvg.getPafViewGroupItems().length == 0 ) {
				
				pvg.setPafViewGroupItems(new PafViewGroupItem[] { pvgi } );
				
			} else {
				
				List<PafViewGroupItem> pafViewGroupItemList = new ArrayList<PafViewGroupItem>(Arrays.asList(pvg.getPafViewGroupItems()));
				
				pafViewGroupItemList.add(pvgi);
				
				pvg.setPafViewGroupItems(pafViewGroupItemList.toArray(new PafViewGroupItem[0]));
				
			}
			
			
			viewGroupMap.put(viewGroupName, pvg);			
			lastViewGroupName = viewGroupName;
			
		}
		
		return viewGroupMap;
	}	

	public static PafView[] getViews(HSSFWorkbook wb) {
		
		PafView[] pafViews = null;
		
		HSSFSheet sheet = wb.getSheet(SHEET_VIEWS);
					
		List<PafView> pafViewList = new ArrayList<PafView>();
		
		if ( sheet != null ) {
		
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				
				HSSFRow row = sheet.getRow(i);
				
				HSSFCell viewNameCell = row.getCell(0);
				
				//if header, continue
				if ( viewNameCell != null && viewNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_VIEWS) ) {
					continue;
				}		
				
				if ( viewNameCell != null && viewNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG)) { 
					break;
				}
				
				PafView pafView = new PafView();			
				
				HSSFCell viewSecionNameCell = row.getCell(1);
				HSSFCell viewDescCell = row.getCell(2);
				HSSFCell pageOrientationCell = row.getCell(3);
				HSSFCell pagesTallCell = row.getCell(4);
				HSSFCell pagesWideCell = row.getCell(5);
				
				pafView.setName(getString(viewNameCell));
				pafView.setDesc(getString(viewDescCell));
				
				if (pafView.getDesc() == null ) {
					pafView.setDesc("");
				}
				
								
				pafView.setPageOrientation(getString(pageOrientationCell));
				pafView.setPagesTall(getInteger(pagesTallCell));
				pafView.setPagesWide(getInteger(pagesWideCell));
												
				pafView.setHeaders(new PafViewHeader[0]);
				pafView.setUserSelections(new PafUserSelection[0]);
				
				String viewSectionName = getString(viewSecionNameCell);
				
				if ( viewSectionName != null ) {
					
					pafView.setViewSectionNames(new String[] { viewSectionName });
					
				}		
				
				pafViewList.add(pafView);
				
			}
		}
		if ( pafViewList.size() > 0 ) {
			
			pafViews = pafViewList.toArray(new PafView[0]);
			
		
		}
		return pafViews;
	}		

	public static List<PafPlannerRole> getRoles(HSSFWorkbook wb) {		
		
		HSSFSheet rolesSheet = wb.getSheet(SHEET_ROLES);
				
		Map<String, PafPlannerRole> roleMap = new TreeMap<String, PafPlannerRole>();
		
		String lastRoleName = null;
		
		for (int i = 0; i < rolesSheet.getLastRowNum(); i++) {
			
			HSSFRow row = rolesSheet.getRow(i);
			
			HSSFCell roleNameCell = row.getCell(0);
			
			//if header, continue
			if ( roleNameCell != null && roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_ROLES) ) {
				continue;
			}		
			
			if ( roleNameCell != null && roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG) ) {
				break;
			}
			
			HSSFCell planTypeCell = row.getCell(1);
			HSSFCell readOnlyCell = row.getCell(2);
			HSSFCell seasonCell = row.getCell(3);
			
			if ( roleNameCell == null || roleNameCell.getRichStringCellValue().getString().trim().equals("") ) {
				
				if ( lastRoleName != null && roleMap.containsKey(lastRoleName)) { 					
				
					PafPlannerRole plannerRole = roleMap.get(lastRoleName);
					
					List<String> seasonList = new ArrayList(Arrays.asList(plannerRole.getSeasonIds()));
					
					if ( seasonCell != null ) {
					
						String seasonId = seasonCell.getRichStringCellValue().getString();
													
						seasonList.add(seasonId);
						
						plannerRole.setSeasonIds(seasonList.toArray(new String[0]));
						
						roleMap.put(lastRoleName, plannerRole);
						
					}
										
				}
				
 			} else {
 				
 				PafPlannerRole plannerRole = new PafPlannerRole();
 				plannerRole.setRoleName(roleNameCell.getRichStringCellValue().getString());
 				plannerRole.setPlanType(planTypeCell.getRichStringCellValue().getString());
 				plannerRole.setReadOnly(readOnlyCell.getBooleanCellValue());
 				plannerRole.setSeasonIds(new String[] {seasonCell.getRichStringCellValue().getString()});
 				
 				roleMap.put(plannerRole.getRoleName(), plannerRole);
 				
 				lastRoleName = plannerRole.getRoleName();
 			}
			
		}
						
		return new ArrayList(roleMap.values());
	}
	
	public static Map<String, String> getRolesNameFormulaMap(HSSFWorkbook wb) {		
		
		HSSFSheet rolesSheet = wb.getSheet(SHEET_ROLES);
				
		Map<String, String> roleMap = new TreeMap<String, String>();
				
		for (int i = 0; i < rolesSheet.getLastRowNum(); i++) {
			
			HSSFRow row = rolesSheet.getRow(i);
			
			HSSFCell roleNameCell = row.getCell(0);
			
			//if header, continue
			if ( roleNameCell == null || roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_ROLES) || roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase("") ) {
				continue;
			}		
			
			if ( roleNameCell != null && roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG) ) {
				break;
			}		
			
			String roleName = roleNameCell.getRichStringCellValue().toString();
			
			String formualValue = "=Roles!$A$"+ (i+1);
			
			roleMap.put(roleName, formualValue);
			
		}
						
		return roleMap;
	}

	public static List<PafPlannerConfig> getRoleConfigurations(HSSFWorkbook wb) {
		
		HSSFSheet rolesSheet = wb.getSheet(SHEET_ROLE_CONFIGS);
		
		List<PafPlannerConfig> roleConfigList = new ArrayList<PafPlannerConfig>();
		
		
		for (Iterator rit = rolesSheet.rowIterator(); rit.hasNext(); ) {
			
			HSSFRow row = (HSSFRow)rit.next();
			
			HSSFCell roleNameCell = row.getCell(0);
			
//			if header, continue
			if ( roleNameCell == null || roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_ROLE_CONFIGURATION) ) {
				continue;
			}
			
			if ( roleNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG) ) {
				break;
			}
			
			HSSFCell planCycleCell = row.getCell(1);
			HSSFCell defaultEvalEnabledCell = row.getCell(2);
			HSSFCell defaultRuleSetNameCell = row.getCell(3);
			HSSFCell ruleSetNamesCell = row.getCell(4);
			HSSFCell versionFiltersCell = row.getCell(5);
			HSSFCell roleFilterEnabledCell = row.getCell(6);
			HSSFCell viewViewGroupNamesCell = row.getCell(7);
			HSSFCell visibleMenuNamesCell = row.getCell(8);
			HSSFCell autoSaveMenuNameCell = row.getCell(9);
			HSSFCell replicateEnabledCell = row.getCell(10);
			HSSFCell replicateAllEnabledCell = row.getCell(11);
			HSSFCell allowSuppressInvalidIntersectionCell = row.getCell(12);
			HSSFCell suppressInvalidIntersectionCell = row.getCell(13);
			HSSFCell largeLimitCell = row.getCell(14);
			HSSFCell maxLimitCell = row.getCell(15);
			
			
			PafPlannerConfig plannerConfig = new PafPlannerConfig();
			
			if ( roleNameCell != null) {
				plannerConfig.setRole(roleNameCell.getRichStringCellValue().getString());
			}
			
			if ( planCycleCell != null ) {
				
				plannerConfig.setCycle(planCycleCell.getRichStringCellValue().getString());
				
			}
			
			if ( defaultEvalEnabledCell == null ) {
				plannerConfig.setDefaultEvalEnabledWorkingVersion(false);
			} else {
				plannerConfig.setDefaultEvalEnabledWorkingVersion(defaultEvalEnabledCell.getBooleanCellValue());
			}
			
			if ( defaultRuleSetNameCell != null ) {
				
				plannerConfig.setDefaultRulesetName(defaultRuleSetNameCell.getRichStringCellValue().getString());
				
			}
			
										
			plannerConfig.setRuleSetNames(splitIntoArray(ruleSetNamesCell));
			plannerConfig.setVersionFilter(splitIntoArray(versionFiltersCell));
			plannerConfig.setIsUserFilteredUow(getBoolean(roleFilterEnabledCell));
			plannerConfig.setViewTreeItemNames(splitIntoArray(viewViewGroupNamesCell));
			plannerConfig.setMenuItemNames(splitIntoArray(visibleMenuNamesCell));
			plannerConfig.setAutoRunOnSaveMenuItemNames(splitIntoArray(autoSaveMenuNameCell));
			plannerConfig.setReplicateEnabled(getBoolean(replicateEnabledCell));
			plannerConfig.setReplicateAllEnabled(getBoolean(replicateAllEnabledCell));
			plannerConfig.setIsDataFilteredUow(getBoolean(allowSuppressInvalidIntersectionCell));
			
			if ( suppressInvalidIntersectionCell != null && ! suppressInvalidIntersectionCell.getRichStringCellValue().getString().trim().equals("") ) {
				
				String[] dimensionValueAr = splitIntoArray(suppressInvalidIntersectionCell, ",");
				
				if ( dimensionValueAr != null ) {
					
					DataFilterSpec dfs = new DataFilterSpec();
					
					List<PafDimSpec> dimSpectList = new ArrayList<PafDimSpec>();
					
					for (String dimensionValue : dimensionValueAr) {
						
						String[] dimVal = splitIntoArray(dimensionValue, "=");
						
						if ( dimVal != null ) {
							
							String dim = dimVal[0];
							String val = dimVal[1];
							
							PafDimSpec pafDimSpec = new PafDimSpec();
							pafDimSpec.setDimension(dim);
							pafDimSpec.setExpressionList(new String[] { val });
							
							dimSpectList.add(pafDimSpec);					
							
						}
					}
					
					dfs.setDimSpec(dimSpectList.toArray(new PafDimSpec[0]));
					
					plannerConfig.setDataFilterSpec(dfs);
						
				}
					
			}
			
			
			plannerConfig.setUowSizeLarge(getInteger(largeLimitCell));
			plannerConfig.setUowSizeMax(getInteger(maxLimitCell));
			
			roleConfigList.add(plannerConfig);
		}
		
		
		
		return roleConfigList;
		
	}

	public static List<PafUserSecurity> getUserSecurityOld(HSSFWorkbook wb) {		
		
		HSSFSheet userSecuritySheet = wb.getSheet(SHEET_USER_SECURITY);
				
		Map<String, PafUserSecurity> userSecurityMap = new TreeMap<String, PafUserSecurity>();
		
		String lastUserName = null;
		
		String lastRoleName = null;
		
		String lastDomainName = null;
		
		boolean lastIsTestingUser = false;
		
		for (int i = 0; i < userSecuritySheet.getLastRowNum(); i++) {
			
			HSSFRow row = userSecuritySheet.getRow(i);
			
			if ( row == null ) {
				continue;
			}
			
			HSSFCell userNameCell = row.getCell(0);
			
			//if header, continue
			if ( userNameCell != null && userNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_USER_SECURITY) ) {
				continue;
			}		
			
			if ( userNameCell != null && userNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG) ) {
				break;
			}
			
			HSSFCell domainNameCell = row.getCell(1);
			HSSFCell testingUserCell = row.getCell(2);
			HSSFCell roleNameCell = row.getCell(3);
			HSSFCell dimensionCell = row.getCell(4);
			HSSFCell securityMemberCell = row.getCell(5);
			
			if ( dimensionCell == null || securityMemberCell == null)  {
				
				logger.error("dimension cell or security member cell is null, skipping row.");
				
				continue;
			}
			
			String userName = getString(userNameCell, lastUserName);
						
			
			//if user switched, reset domain and testing user
			if( lastUserName != null && ! userName.equalsIgnoreCase(lastUserName)) {
				lastDomainName = null;
				lastIsTestingUser = false;
			}
			
			String domainName = getString(domainNameCell, lastDomainName);
			
			Boolean isTestUserBool = getBoolean(testingUserCell);			
						
			boolean isTestUser = false;
			
			if ( isTestUserBool != null ) {
				
				isTestUser = isTestUserBool;
			} else {
				isTestUser = lastIsTestingUser;
			}
			
			String roleName = getString(roleNameCell, lastRoleName);			
						
			PafUserSecurity userSecurity = userSecurityMap.get(userName);
			
			if ( userSecurity == null ) {
				
				userSecurity = new PafUserSecurity();
				
				userSecurity.setUserName(userName);
			
			}
	
			
			LinkedHashMap<String, PafWorkSpec[]> userRoleMap = userSecurity.getRoleFilters();
			
			if ( userRoleMap == null ) {
				
				userRoleMap = new LinkedHashMap<String, PafWorkSpec[]>();
				
			}
			
			PafWorkSpec[] userRoleWorkSpec = userRoleMap.get(roleName);

			String dimensionName = dimensionCell.getRichStringCellValue().getString();
			
			String securityMember = securityMemberCell.getRichStringCellValue().getString();
			
			PafDimSpec pafDimSpec = new PafDimSpec();
			
			pafDimSpec.setDimension(dimensionName);
			
			pafDimSpec.setExpressionList(new String[] { securityMember });
			
			if ( userRoleWorkSpec == null ) {
				
				PafWorkSpec pafWorkSpec = new PafWorkSpec();
				
				pafWorkSpec.setName(roleName);
				
				pafWorkSpec.setDimSpec(new PafDimSpec[] { pafDimSpec } );
				
				userRoleMap.put(roleName, new PafWorkSpec[] { pafWorkSpec });
				
			} else {
				
				for (int j = 0; j < userRoleWorkSpec.length; j++ ) {
					
					if ( userRoleWorkSpec[j].getName().equalsIgnoreCase(roleName)) {
						
						List<PafDimSpec> dimSpecList = new ArrayList<PafDimSpec>(Arrays.asList(userRoleWorkSpec[j].getDimSpec()));
						
						dimSpecList.add(pafDimSpec);
				
						userRoleWorkSpec[j].setDimSpec(dimSpecList.toArray(new PafDimSpec[0]));
												
						break;
					}
					
				}
				
				userRoleMap.put(roleName, userRoleWorkSpec);
				
			}			
			
			userSecurity.setRoleFilters(userRoleMap);
			
			//if not null and not default
			if ( domainName != null && ! domainName.equalsIgnoreCase(PafBaseConstants.Native_Domain_Name)) {
				userSecurity.setDomainName(domainName);
			}
			
			userSecurity.setAdmin(isTestUser);
			
			userSecurityMap.put(userName, userSecurity);
			
			lastUserName = userName;
			lastRoleName = roleName;
			lastDomainName = domainName;
			lastIsTestingUser = isTestUser;
			
		}
						
		return new ArrayList(userSecurityMap.values());
	}	

	public static List<PafUserSecurity> getUserSecurity(HSSFWorkbook wb) {		
		
		HSSFSheet userSecuritySheet = wb.getSheet(SHEET_USER_SECURITY);
				
		Map<String, PafUserSecurity> userSecurityMap = new TreeMap<String, PafUserSecurity>();
		
		String lastUserName = null;
		
		String lastRoleName = null;
		
		String lastDomainName = null;
		
		boolean lastIsTestingUser = false;
		
		List<String> hierDimList = new ArrayList<String>();
		
		for (int i = 0; i < userSecuritySheet.getLastRowNum(); i++) {
			
			HSSFRow row = userSecuritySheet.getRow(i);
			
			if ( row == null ) {
				continue;
			}
			
			HSSFCell userNameCell = row.getCell(0);
			
			//if header, continue
			if ( userNameCell != null && userNameCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_USER_SECURITY) ) {
				
				
				for (int t = 4; t < 100; t++)  {
					
					HSSFCell dimNameHeaderCell = row.getCell(t);
					
					if ( dimNameHeaderCell !=null && ! dimNameHeaderCell.getRichStringCellValue().getString().equals("") ) {
						
						hierDimList.add(dimNameHeaderCell.getRichStringCellValue().toString().trim());
						
					} else {
						
						break;
					}
					
				}
				
				
				continue;
			}		
			
			if ( userNameCell != null && userNameCell.getRichStringCellValue().getString().equalsIgnoreCase(EOF_FLAG) ) {
				break;
			}
			
			HSSFCell domainNameCell = row.getCell(1);
			HSSFCell testingUserCell = row.getCell(2);
			HSSFCell roleNameCell = row.getCell(3);
			
			Map<String, HSSFCell> hierDimCellMap = new HashMap<String, HSSFCell>();
			
			int hierCellPos = 4;
			
			for (String hierDim : hierDimList) {
				
				if ( row.getCell(hierCellPos) != null) {
					hierDimCellMap.put(hierDim, row.getCell(hierCellPos++));
				}
				
			}
			
			if ( hierDimCellMap.size() != hierDimList.size())  {
				
				logger.error("dimension cell or security member cell is null, skipping row.");
				
				continue;
			}
			
			String userName = getString(userNameCell, lastUserName);
						
			
			//if user switched, reset domain and testing user
			if( lastUserName != null && ! userName.equalsIgnoreCase(lastUserName)) {
				lastDomainName = null;
				lastIsTestingUser = false;
			}
			
			String domainName = getString(domainNameCell, lastDomainName);
			
			Boolean isTestUserBool = getBoolean(testingUserCell);			
						
			boolean isTestUser = false;
			
			if ( isTestUserBool != null ) {
				
				isTestUser = isTestUserBool;
			} else {
				isTestUser = lastIsTestingUser;
			}
			
			String roleName = getString(roleNameCell, lastRoleName);			
						
			PafUserSecurity userSecurity = userSecurityMap.get(userName);
			
			if ( userSecurity == null ) {
				
				userSecurity = new PafUserSecurity();
				
				userSecurity.setUserName(userName);
			
			}
	
			
			LinkedHashMap<String, PafWorkSpec[]> userRoleMap = userSecurity.getRoleFilters();
			
			if ( userRoleMap == null ) {
				
				userRoleMap = new LinkedHashMap<String, PafWorkSpec[]>();
				
			}
			
			PafWorkSpec[] userRoleWorkSpec = userRoleMap.get(roleName);
			
			for (String hierDim : hierDimList) {
											
				String dimensionName = hierDim;
				
				String securityMember = hierDimCellMap.get(hierDim).getRichStringCellValue().toString().trim();
				
				PafDimSpec pafDimSpec = new PafDimSpec();
				
				pafDimSpec.setDimension(dimensionName);
				
				pafDimSpec.setExpressionList(new String[] { securityMember });
				
				if ( userRoleWorkSpec == null ) {
					
					PafWorkSpec pafWorkSpec = new PafWorkSpec();
					
					pafWorkSpec.setName(roleName);
					
					pafWorkSpec.setDimSpec(new PafDimSpec[] { pafDimSpec } );
					
					userRoleWorkSpec = new PafWorkSpec[] { pafWorkSpec };
					
					userRoleMap.put(roleName, userRoleWorkSpec );
					
					
					
				} else {
					
					for (int j = 0; j < userRoleWorkSpec.length; j++ ) {
						
						if ( userRoleWorkSpec[j].getName().equalsIgnoreCase(roleName)) {
							
							List<PafDimSpec> dimSpecList = new ArrayList<PafDimSpec>(Arrays.asList(userRoleWorkSpec[j].getDimSpec()));
							
							dimSpecList.add(pafDimSpec);
					
							userRoleWorkSpec[j].setDimSpec(dimSpecList.toArray(new PafDimSpec[0]));
													
							break;
						}
						
					}
					
					userRoleMap.put(roleName, userRoleWorkSpec);
					
				}		
				
			}
			
			userSecurity.setRoleFilters(userRoleMap);
			
			//if not null and not default
			if ( domainName != null && ! domainName.equalsIgnoreCase(PafBaseConstants.Native_Domain_Name)) {
				userSecurity.setDomainName(domainName);
			}
			
			userSecurity.setAdmin(isTestUser);
			
			userSecurityMap.put(userName, userSecurity);
			
			lastUserName = userName;
			lastRoleName = roleName;
			lastDomainName = domainName;
			lastIsTestingUser = isTestUser;
			
		}
						
		return new ArrayList(userSecurityMap.values());
	}	

	
	public static List<PlanCycle> getPlanCycles(HSSFWorkbook wb) {

		List<PlanCycle> planCycleList = new ArrayList<PlanCycle>();
		
		HSSFSheet planCycleSheet = wb.getSheet(SHEET_PLAN_CYCLES);
		
		for (int i = 0; i < planCycleSheet.getLastRowNum(); i++) {
			
			HSSFRow row = planCycleSheet.getRow(i);
			
			HSSFCell labelCell = row.getCell(0);
			
			//if header, continue
			if ( labelCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_PLAN_CYCLE) ) {
				continue;
			}
			
			HSSFCell versionCell = row.getCell(1);
								
						
			PlanCycle pc = new PlanCycle(labelCell.getRichStringCellValue().getString(), 
					versionCell.getRichStringCellValue().getString());
			
			planCycleList.add(pc);
			
		}
		
		return planCycleList;
	}
	
	public static CustomActionDef[] getCustomActionDef(HSSFCell actionClass,
			HSSFCell actionParms) {

		// get string value, semicolon (;) delimited for action parms
		// only supports single actionDefs for now.
		
		String parmStr = actionParms.getRichStringCellValue().getString();
		String classStr = actionClass.getRichStringCellValue().getString();
		
		CustomActionDef[] cad = new CustomActionDef[1];
		cad[0] = new CustomActionDef();
		cad[0].setActionClassName(classStr);
		
		String[] parms = parmStr.split(";");
		cad[0].setActionNamedParameters(parms);

		return cad;
	}

	
	public static List<Season> getSeasons(HSSFWorkbook wb) {

		List<Season> seasonList = new ArrayList<Season>();
		
		HSSFSheet seasonSheet = wb.getSheet(SHEET_SEASONS);
		
		for (int i = 0; i < seasonSheet.getLastRowNum(); i++) {
			
			HSSFRow row = seasonSheet.getRow(i);
			
			HSSFCell idCell = row.getCell(0);
			
			//if header, continue
			if ( idCell.getRichStringCellValue().getString().equalsIgnoreCase(HEADER_IDENT_SEASONS) ) {
				continue;
			}		
			
			HSSFCell planCycleCell = row.getCell(1);
			HSSFCell yearCell = row.getCell(2);
			HSSFCell processOpenCell = row.getCell(3);
			HSSFCell timeCell = row.getCell(4);
									
			Season season = new Season();
			
			season.setId(idCell.getRichStringCellValue().getString());
			season.setPlanCycle(planCycleCell.getRichStringCellValue().getString());
			
			if ( yearCell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC ) {
			
				season.setYear(Integer.toString(new Double(yearCell.getNumericCellValue()).intValue()));
				
			} else {
				
				season.setYear(yearCell.getRichStringCellValue().getString());
				
			}
			
			season.setOpen(processOpenCell.getBooleanCellValue());
			season.setTimePeriod(timeCell.getRichStringCellValue().getString());
			seasonList.add(season);
			
		}
		
		return seasonList;
	}
	


	private static String[] splitIntoArray(HSSFCell cell) {

		return splitIntoArray(cell, DELIMITER);
		
	}
	
	private static String[] splitIntoArray(String stringToSplit, String delim) {

		if ( stringToSplit == null) {
			return null;
		}
		
		StringTokenizer st = new StringTokenizer(stringToSplit, delim);
		
		String[] stringAr = st.toArray();
		
		if ( stringAr != null ) {
			
			for (int i = 0; i < stringAr.length; i++ 	) {
				
				stringAr[i] = stringAr[i].trim();
			}
			
		}
		return stringAr;
		
	}

	public static String createStringFromList(List<String> list, String delim) {

		if ( list == null) {
			return null;
		}
		
		StringBuffer strBuff = new StringBuffer(80);
		
		if ( list.size() > 0 ) {
			
			int ndx = 0;
					
			for (String str : list ) {
				
				strBuff.append(str);
				
				ndx++;
				
				if ( ndx != list.size()) {
					strBuff.append(delim);
				}
			}
			
		}
		
		return strBuff.toString();
		
	}
	
	private static String[] splitIntoArray(HSSFCell cell, String delim) {

		if ( cell == null) {
			return null;
		}
		
		String stringToSplit = cell.getRichStringCellValue().getString();
		
		if ( stringToSplit == null ) {
			
			return null;
			
		}
		
		return splitIntoArray(stringToSplit, delim);
		
	}

	private static String getString(HSSFCell cell) {
		
		String str = null;
		
		if ( cell != null && ! cell.getRichStringCellValue().getString().trim().equals("")) {
			
			str = cell.getRichStringCellValue().getString().trim();
			
		}	
		
		return str;
		
		
	}
	
	private static String getString(HSSFCell cell, String defaultValue) {
		
		String str = getString(cell);
		
		if ( str == null || str.trim().equals("")) {
			
			str = defaultValue;
			
		}
		
		return str;
		
		
	}
	
	private static Boolean getBoolean(HSSFCell cell) {
		
		Boolean bool = null;
		
		if ( cell != null ) {
			
			switch(cell.getCellType()) {
			
				case HSSFCell.CELL_TYPE_BOOLEAN:
					
					try {
						bool = cell.getBooleanCellValue();
					} catch (NumberFormatException nfe) {
						bool = null;
					}
					
					break;
				case HSSFCell.CELL_TYPE_STRING:
				
					if ( cell.getRichStringCellValue().getString().trim().equalsIgnoreCase(Boolean.TRUE.toString()) ||
							cell.getRichStringCellValue().getString().trim().equalsIgnoreCase(Boolean.FALSE.toString()) ) {
					
						bool = new Boolean(cell.getRichStringCellValue().getString().trim());
						
					}
					
					break;
					
				case HSSFCell.CELL_TYPE_FORMULA:
					
					try {
						bool = cell.getBooleanCellValue();
					} catch (NumberFormatException nfe) {
						bool = null;
					}
					
					break;
			}
		}			
		
		return bool;	
		
	}
	
	private static Integer getInteger(HSSFCell cell) {
		
		Integer intVal = null;
		
		if ( cell != null ) {
			
			switch(cell.getCellType()) {
			
				case HSSFCell.CELL_TYPE_NUMERIC:
					
					try {
						intVal = new Double(cell.getNumericCellValue()).intValue();
					} catch (NumberFormatException nfe) {
						intVal = null;
					}
					
					break;
				case HSSFCell.CELL_TYPE_STRING:
					
					try {
						intVal = new Integer(cell.getRichStringCellValue().toString().trim());
					} catch (NumberFormatException nfe) {
						intVal = null;
					}
					
					break;
					
				case HSSFCell.CELL_TYPE_FORMULA:
					
					try {
						intVal = new Double(cell.getNumericCellValue()).intValue();
					} catch (NumberFormatException nfe) {
						intVal = null;
					}
					
					break;
			}
		}			
		
		return intVal;	
		
	}
	
	private static String[] getViewFilter(HSSFCell viewFilter) {
		// TODO Auto-generated method stub
		return null;
	}
}
