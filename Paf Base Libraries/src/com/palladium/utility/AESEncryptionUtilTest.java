/*
 *	File: @(#)AESEncryptionUtilTest.java 	Package: com.palladium.utility 	Project: Paf Base Libraries
 *	Created: Jan 28, 2008  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.palladium.utility;

import java.util.Date;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class AESEncryptionUtilTest extends TestCase {
	
	
	private static final Logger logger = Logger.getLogger(AESEncryptionUtilTest.class);

	private String userName = "javaj123";
	
	private String password = "password";
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * 
	 *  Test method for {@link com.palladium.utility.AESEncryptionUtil#generateIV()}.
	 *
	 */
	public void testGenerateIV() {
		
		assertNotNull(AESEncryptionUtil.generateIV());
		
	}
	
	/**
	 * Test method for {@link com.palladium.utility.AESEncryptionUtil#encrypt(java.lang.String, java.lang.String)}.
	 */
	public void testEncryptDecrypt() {		

		assertNotNull(userName);
		assertNotNull(password);
		
		for (int i = 0; i < 10; i++ ) {
			
			try{
				
				String iV = AESEncryptionUtil.generateIV();
				
				assertNotNull(iV);
				
				logger.info("IV is '" + iV + "'");
				
				String encryptedUserName = AESEncryptionUtil.encrypt(userName,iV);

				assertNotNull(encryptedUserName);

				logger.info("Encrypted '" + userName + "' to '" + encryptedUserName + "'");
				
				String encryptedPassword = AESEncryptionUtil.encrypt(password,iV);
				
				assertNotNull(encryptedPassword);
				
				logger.info("Encrypted '" + password + "' to '" + encryptedPassword + "'");
				
				String decryptedUserName = AESEncryptionUtil.decrypt(encryptedUserName,iV);
				
				assertNotNull(decryptedUserName);
				
				assertEquals(userName, decryptedUserName);
				
				logger.info("Orginally '" + userName + "' decrypted '" + encryptedUserName + "' to '" + decryptedUserName + "'");
				
				String decryptedPassword = AESEncryptionUtil.decrypt(encryptedPassword,iV);
				
				logger.info("Orginally '" + password + "' decrypted '" + encryptedPassword + "' to '" + decryptedPassword + "'");
				
				assertNotNull(decryptedPassword);
				
				assertEquals(password, decryptedPassword);
	
			}catch (Exception e){
				fail(e.getMessage());
			}
						
		}
		
	}
	
	/**
	 * Test method for {@link com.palladium.utility.AESEncryptionUtil#encrypt(java.lang.String, java.lang.String)}.
	 */	
	public void testEncryptWithNullStrToEncrypt() {		
		
		try {
			
			AESEncryptionUtil.encrypt(null, "IV");
			
			fail("Shouldn't get here.");
			
		} catch (Exception e) {

			assertEquals(e.getClass(), IllegalArgumentException.class);
			
		}
		
	}

	
	/**
	 * Test method for {@link com.palladium.utility.AESEncryptionUtil#decrypt(java.lang.String, java.lang.String)}.
	 */
	public void testDecryptWithNullStrToDecrypt() {
		
		
		try {
			
			AESEncryptionUtil.decrypt(null, "IV");
			
			fail("Shouldn't get here.");
			
		} catch (Exception e) {

			assertEquals(e.getClass(), IllegalArgumentException.class);
			
		}
		
	}
	
	/**
	 * Test method for {@link com.palladium.utility.AESEncryptionUtil#encrypt(java.lang.String, java.lang.String)}.
	 */
	public void testEncryptWithNullIV() {
		
				
		try {
			
			AESEncryptionUtil.encrypt("something to encrypt", null);
			
			fail("Shouldn't get here.");
			
		} catch (Exception e) {

			assertEquals(e.getClass(), IllegalArgumentException.class);
			
		}
		
	}

	/**
	 * Test method for {@link com.palladium.utility.AESEncryptionUtil#decrypt(java.lang.String, java.lang.String)}.
	 */	
	public void testDecryptWithNullIV() {		
		
		try {
			
			AESEncryptionUtil.decrypt("generated str to decrypt", null);
			
			fail("Shouldn't get here.");
			
		} catch (Exception e) {

			assertEquals(e.getClass(), IllegalArgumentException.class);
			
		}
		
	}


}
