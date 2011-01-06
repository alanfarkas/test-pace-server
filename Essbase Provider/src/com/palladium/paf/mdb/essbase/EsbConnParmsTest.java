/*
 *	File: @(#)TestEsbConnParms.java 	Package: com.palladium.paf.mdb.essbase	Project: Essbase Provider
 *	Created: Aug 13, 2005  				By: Alan Farkas
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


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class EsbConnParmsTest extends TestCase {

	/*
	 * Test method for 'com.palladium.paf.mdb.essbase.EsbConnType.EsbConnParms.EsbConnParms(String)'
	 */
	public void testEsbConnParms() {
		
		boolean isSuccess = true;
		EsbConnParms connParms =	null;
		String connAliases[] = {"TitanServer", "TitanCube", "TitanCube2"};
		
		System.out.println("***************************************************");
		System.out.println(this.getName() +  " - Test Started");
		try {
			// Loop through each connection alias and display it's info
			for (int i = 0; i < connAliases.length; i++) {
				connParms = new EsbConnParms(connAliases[i]);
				System.out.println("\n-- Creating new EsbConnParms object for " + connAliases[i]);
				System.out.println("-- Connection Type: " + connParms.getEsbConnType().toString());
				System.out.println("-- Server: " + connParms.getEsbServer());
				System.out.println("-- User: " + connParms.getEsbUser());
				System.out.println("-- Password: " + connParms.getEsbPswd());
				System.out.println("-- App: " + connParms.getEsbApp());
				System.out.println("-- Db: " + connParms.getEsbDb());
			}
		} catch (Exception e) {
			isSuccess = false;
			System.out.println("Java Exception: " + e.getMessage());			
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					System.out.println(" - Successful");
				}
				else {
					System.out.println(" - Failed");			
				}
				System.out.println("***************************************************");
				System.out.println(""); 
			}
		}

	}

}
