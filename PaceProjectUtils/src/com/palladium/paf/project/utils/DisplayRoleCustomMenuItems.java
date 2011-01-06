package com.palladium.paf.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.Ostermiller.util.StringTokenizer;
import com.palladium.paf.comm.CustomMenuDef;
import com.palladium.paf.comm.PafPlannerConfig;

public class DisplayRoleCustomMenuItems {

	private static Logger logger = Logger.getLogger(DisplayRoleCustomMenuItems.class);
	
	private static String workingDir = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			
			logger.error("Please include project csv file as argument.");
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
						
			List<PafPlannerConfig> roleConfigs = PaceProjectUtil.getRoleConfigurations(wb);
			
			List<CustomMenuDef> customMenus = PaceProjectUtil.getCustomMenus(wb);
			
			if ( roleConfigs != null && customMenus != null ) {
				
				Map<String, CustomMenuDef> customMenuDefMap = new HashMap<String, CustomMenuDef>();
				
				//populate custom menu map
				for (CustomMenuDef customMenu : customMenus ) {
					
					customMenuDefMap.put(customMenu.getKey(), customMenu);
					
				}
				
				for (PafPlannerConfig plannerConfig : roleConfigs ) {
				
					String role = plannerConfig.getRole();
					String cycle = plannerConfig.getCycle();
					
					String[] customMenuDefs = plannerConfig.getMenuItemNames();
					
					if ( customMenuDefs != null ) {
						
						int indxCnt = 0;
						
						for (String customMenuDefStr : customMenuDefs ) {
							
							if ( customMenuDefMap.containsKey(customMenuDefStr)) {
								
								CustomMenuDef cmd = customMenuDefMap.get(customMenuDefStr);
								
								if ( cmd != null ) {
									
									String caption = cmd.getCaption();
									String calcScriptEntry = cmd.getCustomActionDefs()[0].getActionNamedParameters()[1];
									
									if ( cycle == null ) {
										cycle = "WIF's";
									}
									
									String calcScript = calcScriptEntry.substring(calcScriptEntry.indexOf("=")+1);
									
									
									if ( indxCnt++ == 0) {
									
										System.out.println(role + "," + cycle + "," + caption + "," + calcScript);

									} else {
										
										System.out.println(",," + caption + "," + calcScript);
									}
									
								}
								
								
							}
							
						}
						
					}
					
					
				}				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
