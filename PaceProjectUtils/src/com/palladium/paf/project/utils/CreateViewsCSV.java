/*
 *	File: @(#)CreateMeasuresCSV.java 	Package: com.palladium.paf.project.utils 	Project: PaceProjectUtils
 *	Created: May 23, 2008  		By: Jason
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2008 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.project.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.PafErrHandler;
import com.palladium.paf.app.MeasureDef;
import com.palladium.paf.view.PafView;
import com.palladium.utility.PafImportExportUtility;
import com.palladium.utility.PafXStream;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Jason
 *
 */
public class CreateViewsCSV {

	private static final String DELIMITER = ",";
	private static Logger logger = Logger.getLogger(CreateViewsCSV.class);
	
	/**
	 *  Method_description_goes_here
	 *
	 * @param args
	 */
	public static void main(String[] args) {

//		if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			
			logger.error("Please include project dir file as argument.");
			System.exit(1);
		}
				
		//FileUtility.verifyFileStatus(args[0]);
		
		PafView[] pafViews = PafImportExportUtility.importViews(args[0], false);
		
		if ( pafViews != null ) {
			
			StringBuffer strBuff = new StringBuffer(30);	
			
			for (PafView view : pafViews) {
							
				strBuff.append(view.getName());
				strBuff.append(DELIMITER + view.getViewSectionNames()[0]);
				strBuff.append("\n");
								
			}
			
			logger.info("\n" + strBuff.toString());
			
		}

	}
	



}
