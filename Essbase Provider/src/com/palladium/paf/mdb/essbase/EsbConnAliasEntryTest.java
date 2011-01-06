/*
 *	File: @(#)TestEsbConnAliasEntry.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 13, 2005  					By: Alan Farkas
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
package com.palladium.paf.mdb.essbase;


import org.apache.log4j.Logger;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbConnAliasEntryTest extends TestCase {

	private static Logger logger = Logger.getLogger(EsbConnAliasEntryTest.class);

	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbConnAliasEntry.EsbConnAliasEntry(String)'
	 */
	public void testEsbConnAliasEntry() {

		boolean isSuccess = true;
		EsbConnAliasEntry aliasEntry =	null;
		String connAliases[] = {"TitanServer", "TitanCube", "TitanCube2"};
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Loop through each connection alias and display it's info
			for (int i = 0; i < connAliases.length; i++) {
				aliasEntry = new EsbConnAliasEntry(connAliases[i]);
				logger.info("\n-- Creating new EsbConnAliasEntry object for " + aliasEntry.getEsbConnAlias());
				logger.info("-- Connection Alias: " + aliasEntry.getEsbConnAlias());
				logger.info("-- Connection Type: " + aliasEntry.getEsbConnType().toString());
				logger.info("-- Server: " + aliasEntry.getEsbServer());
				logger.info("-- User: " + aliasEntry.getEsbUser());
				logger.info("-- Password: " + aliasEntry.getEsbPswd());
				logger.info("-- App: " + aliasEntry.getEsbApp());
				logger.info("-- Db: " + aliasEntry.getEsbDb());
			}
		} catch (Exception e) {
			isSuccess = false;
			logger.info("Java Exception: " + e.getMessage());			
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				logger.info("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				logger.info("***************************************************");
				logger.info(""); 
			}
		}

	}

}
