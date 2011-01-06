package com.palladium.paf.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.utility.PafImportExportUtility;

public class DisplayUserSecurityItems {

	private static Logger logger = Logger.getLogger(DisplayUserSecurityItems.class);
	
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
						
			
			Map<String, String> roleMap = PaceProjectUtil.getRolesNameFormulaMap(wb);
			
			for (String roleName : roleMap.keySet() ) {
				
				//System.out.println(roleName + "," + roleMap.get(roleName));
				
			}
			
			List<PafUserSecurity> userSecurityList = Arrays.asList(PafImportExportUtility.importUserSecurity("c:\\tmp\\selfridges\\self\\conf\\", false)); 
				//PaceProjectUtil.getUserSecurity(wb);
			
			if ( userSecurityList != null) {
												
				List<String> dimOrder = new ArrayList<String>();
				
				dimOrder.add("merchandise");
				dimOrder.add("location");
				dimOrder.add("brand");
				dimOrder.add("seasonality");
				
				for (PafUserSecurity userSec : userSecurityList ) {
				
					String userName = userSec.getDisplayName();
					String domainName = userSec.getDomainName();
					
					if ( domainName == null) {
						domainName = "";
					}
					
					LinkedHashMap<String, PafWorkSpec[]> map = userSec.getRoleFilters();
					
					int index = 0;
					
					if ( map != null ) {
												
						for (String roleName : map.keySet() ) {
							
							PafWorkSpec[] workSpecAr = map.get(roleName);
														
							for (PafWorkSpec workSpec : workSpecAr) {
																								
								PafDimSpec[] pafDimSpecAr = workSpec.getDimSpec();
																
								String[] memberNames = new String[pafDimSpecAr.length];
																
								for (PafDimSpec pafDimSpec : pafDimSpecAr) {
									
									String dimName = pafDimSpec.getDimension();
									String memberName = pafDimSpec.getExpressionList()[0];	
									
									if ( memberName.startsWith("@") && memberName.contains(",")) {
										
										memberName = "'" + memberName;
										
									}
									
									if ( memberName.contains(",")) {
										
										memberName = memberName.replace(',', '|');
										
									}
														
									if ( dimOrder != null && dimOrder.size() == pafDimSpecAr.length  ) {
										
										memberNames[dimOrder.indexOf(dimName)] =  memberName;
										
									} 
									
									
									
								}
								
								if ( index++ == 0 ) {
						
									System.out.println(userName + "," + domainName + "," + userSec.getAdmin() + "," + roleMap.get(roleName) + "," + PaceProjectUtil.createStringFromList(Arrays.asList(memberNames), ","));
								
								} else {
									System.out.println(",,," + roleMap.get(roleName) + "," + PaceProjectUtil.createStringFromList(Arrays.asList(memberNames), ","));
								}
								
							}
							
						}
						index = 0;
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

