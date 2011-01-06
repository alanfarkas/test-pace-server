/*
 *	File: @(#)TestPafBaseMember.java 	Package: com.palladium.paf.mdb 	Project: Essbase Provider
 *	Created: Oct 24, 2005  		By: Alan Farkas
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

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.palladium.paf.mdb.PafBaseMember;
import com.palladium.paf.mdb.PafSimpleBaseMember;

/**
 * Test PafBaseMember
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafBaseMemberTest extends TestCase {
	
	private static Logger logger = Logger.getLogger(PafBaseMemberTest.class);
	
	/*
	 * Test method for 'com.palladium.paf.mdb.PafBaseMember.getSimpleVersion()'
	 */
	public void testGetSimpleVersion() {
		boolean isSuccess = true;
		
		String validationErrors = "";
		final String key = "Test Member";
		
		PafBaseMember member = null;
		PafSimpleBaseMember simple = null;
		
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create and populate a representative PafBaseMember
			member = new PafBaseMember(key);
			
			// Get simple version of PafBaseMember
			simple = member.getSimpleVersion();

		
			// Validate member key
			if (!simple.getKey().equals(member.getKey())) {
				validationErrors += "Member key doesn't match\n";
			}
			
		} catch (Exception e) {
			logger.info("Java Exception: " + e.getMessage());	
			isSuccess = false;
		} finally {
			try {
				if (validationErrors.length() > 0) {
					isSuccess = false;
					logger.info("Validation Error(s) Encountered:\r" + validationErrors);
				}
				assertTrue(isSuccess);
			} finally {
				System.out.print(this.getName());
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	
	}
		
}