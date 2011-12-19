/*
 *	File: @(#)PafXmlValidator 	Package: com.palladium.paf.validator	Project: 
 *	Created: March 8nd, 2006  		By: JMilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.validator;

import org.apache.log4j.Logger;

import com.pace.base.PafConfigFileNotFoundException;
import com.palladium.paf.utils.FileUtility;


/**
 * Validates XML files that have classes registered with PafXStream.
 *
 * @version	x.xx
 * @author Jason Milliron
 *
 */

public class PafXmlValidator {

	private static Logger logger = Logger.getLogger("PafXmlValidator.class");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//if no args or if args don't contain 1 argument
		if (args == null || args.length != 1) {
			logger.error("Please include an xml file to be validated.");
			System.exit(1);
		}

		String fileName = args[0].trim();
		
		FileUtility.verifyFileStatus(fileName);
		
		boolean error = false;
		
		logger.info("Beginning to validate file: " + fileName);
		
		try {
			
			com.pace.base.utility.PafXStream.importObjectFromXml(fileName);
			
		} catch (PafConfigFileNotFoundException e) {
			
			//already handled this
			
		} catch (Exception e) {
			
			error = true;
			
		}

		if ( error ) {
			
			logger.error("Problems validating file: " + fileName);
			
		} else {
			
			logger.info("Successfully validated file: " + fileName);
			
		}
		
	}

}
