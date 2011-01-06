/*
 *	File: @(#)FileUtility 	Package: com.palladium.paf.utils	Project: 
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
package com.palladium.paf.utils;

import java.io.File;
import org.apache.log4j.Logger;

/**
 * Used to perform operations on files
 *
 * @version	x.xx
 * @author Jason Milliron
 *
 */

public class FileUtility {

	private static Logger logger = Logger.getLogger(FileUtility.class);

	/**
	 * Checks to see if file exist and if file can be read from.
	 * 
	 * @param fileName
	 */
	public static void verifyFileStatus(String fileName) {

		File file = new File(fileName);

		// if file does not exist
		if (!file.exists()) {

			logger.error("File: " + fileName + " does not exist.");
			System.exit(2);

		}

		// if file is not readable
		if (!file.canRead()) {

			logger.error("File: " + fileName + " can not be read.");
			System.exit(3);
		}
	}

}
