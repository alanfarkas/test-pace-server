package com.palladium.paf.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

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
import com.palladium.utility.PafImportExportUtility;
import com.palladium.utility.PafXStream;

public class CreateProjectXml {
	
	private static String workingDir = null;

	private static Logger logger = Logger.getLogger(CreateProjectXml.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			
			logger.error("Please include project xls file as argument.");
			System.exit(1);
		}
		
		FileUtility.verifyFileStatus(args[0]);
		
		File workingDirectory = new File(args[0]);
		
		workingDir = workingDirectory.getParent();
		
		if ( workingDir == null || workingDir.trim().equals("")) {
			workingDir = ".";
		}
		
		POIFSFileSystem fs = null;
		
		try {
			
			fs = new POIFSFileSystem(new FileInputStream(args[0]));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			
			processPlanCycles(wb);		
			
			processSeasons(wb);
			
			processRoles(wb);
			
			processRoleConfigurations(wb);
			
			processUserSecurity(wb);
			
			processCustomMenus(wb);
			
			processViewGroups(wb);
			
			processViews(wb);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void processPlanCycles(HSSFWorkbook wb) {

		List<PlanCycle> planCycleList = PaceProjectUtil.getPlanCycles(wb);
		
		if ( planCycleList.size() > 0 ) {
			
			logger.info("\n" + PafXStream.getXStream().toXML(planCycleList.toArray(new PlanCycle[0])));
			
			
		} else {
			
			logger.info("No Plan Cycles found");
			
		}				
		
	}

	private static void processSeasons(HSSFWorkbook wb) {
		
		List<Season> seasonsList = PaceProjectUtil.getSeasons(wb);
		
		if ( seasonsList.size() > 0 ) {
			
			logger.info("\n" + PafXStream.getXStream().toXML(seasonsList.toArray(new Season[0])));
			
			
		} else {
			
			logger.info("No Seasons found");
			
		}
		
	}
	
	private static void processRoles(HSSFWorkbook wb) {
		
		List<PafPlannerRole> rolesList = PaceProjectUtil.getRoles(wb);
		
		if ( rolesList.size() > 0 ) {
			
			PafPlannerRole[] roles = rolesList.toArray(new PafPlannerRole[0]);
			
			logger.info("\n" + PafXStream.getXStream().toXML(roles));
			
			String fileName = workingDir + File.separator + PafBaseConstants.FN_RoleMetaData;
			
			PafXStream.exportObjectToXml(roles, fileName);
			
			logger.info("Roles output file can be found: " + fileName);
			
		} else {
			
			logger.info("No Roles found");
			
		}
		
	}
	
	private static void processRoleConfigurations(HSSFWorkbook wb) {
		
		List<PafPlannerConfig> roleConfigsList = PaceProjectUtil.getRoleConfigurations(wb);
		
		if ( roleConfigsList.size() > 0 ) {
			
			PafPlannerConfig[] plannerConfigs = roleConfigsList.toArray(new PafPlannerConfig[0]);
			
			logger.info("\n" + PafXStream.getXStream().toXML(plannerConfigs));
			
			String fileName = workingDir + File.separator + PafBaseConstants.FN_PlannerConfigs;
			
			PafXStream.exportObjectToXml(plannerConfigs, fileName);
			
			logger.info("Role Config output file can be found: " + fileName);
			
		} else {
			
			logger.info("No Role Configurations found");
			
		}
		
	}
	
	private static void processUserSecurity(HSSFWorkbook wb) {
		
		List<PafUserSecurity> userSecurityList = PaceProjectUtil.getUserSecurity(wb);
		
		if ( userSecurityList.size() > 0 ) {
			
			logger.info("\n" + PafXStream.getXStream().toXML(userSecurityList.toArray(new PafUserSecurity[0])));
			
			String fileName = workingDir + File.separator + PafBaseConstants.FN_SecurityMetaData;
			
			PafXStream.exportObjectToXml(userSecurityList.toArray(new PafUserSecurity[0]), fileName);
			
			logger.info("Security output file can be found: " + fileName);
			
		} else {
			
			logger.info("No User Security found");
			
		}
		
	}
	

	private static void processCustomMenus(HSSFWorkbook wb) {
		
		List<CustomMenuDef> customMenuList = PaceProjectUtil.getCustomMenus(wb);
		
		if ( customMenuList.size() > 0 ) {
			
			logger.info("\n" + PafXStream.getXStream().toXML(customMenuList.toArray(new CustomMenuDef[0])));
			
			String fileName = workingDir + File.separator + PafBaseConstants.FN_CustomMenus;
			
			PafXStream.exportObjectToXml(customMenuList.toArray(new CustomMenuDef[0]), fileName);
			
			logger.info("Custom menus file can be found: " + fileName);
			
		} else {
			
			logger.info("No Custom Menus found");		
			
		}
		
	}
	
	
	

	private static void processViewGroups(HSSFWorkbook wb) {
		
		Map<String, PafViewGroup> map = PaceProjectUtil.getViewGroups(wb);
		
		if ( map != null && map.size() > 0 ) {
			
			String renderedXML = PafXStream.getXStream().toXML(map);
			
			logger.info("\n" + renderedXML);
			
			String fileName = workingDir + File.separator + PafBaseConstants.FN_ViewGroups;
			
			PafXStream.exportObjectToXml(map, fileName);
			
			logger.info("View Groups file can be found: " + fileName);
			
		} else {
			
			logger.info("No View Groups found");		
			
		}
		
	}

	private static void processViews(HSSFWorkbook wb) {
		
		PafView[] pafViews = PaceProjectUtil.getViews(wb);
		
		if ( pafViews != null && pafViews.length > 0 ) {
			
			String renderedXML = PafXStream.getXStream().toXML(pafViews);
			
			logger.info("\n" + renderedXML);
			
			PafImportExportUtility.exportViews(pafViews, workingDir, true);
			
			logger.info("View files can be found in dir: " + workingDir + File.separator + PafBaseConstants.DN_ViewsFldr);
			
		} else {
			
			logger.info("No Views found");		
			
		}
		
	}
		
}