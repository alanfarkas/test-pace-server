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
import com.palladium.utility.PafXStream;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Jason
 *
 */
public class CreateMeasuresCSV {

	private static final String DELIMITER = ",";
	private static Logger logger = Logger.getLogger(CreateMeasuresCSV.class);
	
	/**
	 *  Method_description_goes_here
	 *
	 * @param args
	 */
	public static void main(String[] args) {

//		if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			
			logger.error("Please include project csv file as argument.");
			System.exit(1);
		}
		
		if ( ! args[0].endsWith(PafBaseConstants.FN_MeasureMetaData))	 {
			logger.error("File name does not match " + PafBaseConstants.FN_MeasureMetaData);
			System.exit(2);
		}
		
		FileUtility.verifyFileStatus(args[0]);
		
		MeasureDef[] measures = importMeasures(args[0]);
		
		if ( measures != null ) {
			
			StringBuffer strBuff = new StringBuffer(30);	
			
			for (MeasureDef measure : measures) {
				
		
				
				strBuff.append(measure.getName());
				strBuff.append(DELIMITER + measure.getType());
				strBuff.append(DELIMITER);
				strBuff.append(DELIMITER);
				if ( measure.getNumericFormatName() != null ) { 
					strBuff.append(measure.getNumericFormatName());
				}
				strBuff.append(DELIMITER + measure.getVarRptgFlag());
				strBuff.append(DELIMITER + measure.getPlannable() + "\n");
								
			}
			
			logger.info("\n" + strBuff.toString());
			
		}

	}
	
	/**
     *  Imports the measure defs from xml
     *
     * @return MeasureDef[]	All the imported measure defs.
     */
	public static MeasureDef[] importMeasures(String fileName) {
        return (MeasureDef[]) importObject(MeasureDef[].class, fileName);
	}
	
	private static Object importObject(Class type, String location) {
		logger.info("Importing " + type.getSimpleName() + " from "
				+ location);

		Object o = null;
		try {
			o = type.cast(PafXStream.importObjectFromXml(location));
		} catch (PafConfigFileNotFoundException ex) {
			PafErrHandler.handleException(ex);
		}

		logger.info("Successfully imported "
				+ type.getSimpleName());

		return o;
	}


}
