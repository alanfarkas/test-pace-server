package com.palladium.paf.project.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.app.PafDimSpec;
import com.palladium.paf.app.PafUserSecurity;
import com.palladium.paf.app.PafWorkSpec;
import com.palladium.utility.PafImportExportUtility;
import com.palladium.utility.PafXStream;

public class SortUserSecurityFile {

	private static Logger logger = Logger.getLogger(SortUserSecurityFile.class);
	
	private static String workingDir = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			
			logger.error("Please include project dir as argument.");
			System.exit(1);
		}
		
		FileUtility.verifyFileStatus(args[0]);
		
		File workingDirectory = new File(args[0]);
		
		workingDir = workingDirectory.getParent();
		
		if ( workingDir == null || workingDir.trim().equals("")) {
			workingDir = ".";
		}
		
		workingDir += "\\conf\\";
		
		PafUserSecurity[] pafUsers = PafImportExportUtility.importUserSecurity(workingDir, false);
		
		//String[] order = new String[] { "brand", "location", "seasonality", "merchandise" };
		
		List<PafUserSecurity> userList = Arrays.asList(pafUsers);
		
		Collections.sort(userList, new NameComparator());
					
		for (PafUserSecurity pafUser : userList) {
			
				Map<String, PafWorkSpec[]> pafWorkSpecArMap = pafUser.getRoleFilters();
								
				for (PafWorkSpec[] pafWorkSpecAr : pafWorkSpecArMap.values()) {
												
					for (PafWorkSpec workSpec : pafWorkSpecAr) {
																						
						PafDimSpec[] pafDimSpecAr = workSpec.getDimSpec();
										
						Map<String, PafDimSpec> pafDimSpecMap = new HashMap<String, PafDimSpec>();
						
						String[] memberNames = new String[pafDimSpecAr.length];
														
						for (PafDimSpec pafDimSpec : pafDimSpecAr) {
							
							String dimName = pafDimSpec.getDimension();
							
							pafDimSpecMap.put(dimName, pafDimSpec);						
														
						}
						
						String[] keys = pafDimSpecMap.keySet().toArray(new String[0]);
						
						Arrays.sort(keys);
						
						List<PafDimSpec> dimSpecList = new ArrayList<PafDimSpec>();
						
						for (String dimName : keys) {
						
							dimSpecList.add(pafDimSpecMap.get(dimName));
							
						}
						
						workSpec.setDimSpec(dimSpecList.toArray(new PafDimSpec[0]));						
						
					}
			
				}
		}
		
		PafXStream.exportObjectToXml(userList.toArray(new PafUserSecurity[0]), workingDir.toString() + "\\" + PafBaseConstants.FN_SecurityMetaData + ".sorted");

	}

}
