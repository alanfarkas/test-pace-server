/*
 *	File: @(#)AESEncryptionUtil.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
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
package com.pace.base.utility;

import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Encryp/Decript Util
 * 
 * @version x.xx
 * @author pmack
 * 
 */
public class AESEncryptionUtil {

	private static final Logger logger = Logger.getLogger(AESEncryptionUtil.class);
	
	private static final String ARGUMENT_S_CAN_NOT_BE_NULL = "Argument(s) can not be null";
	
	private static final byte[] initVectorData = { (byte) 50, (byte) 51,
			(byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57 };

	/**
	 * 
	 *  Encrypts a string using an IV
	 *
	 * @param strToEncrypt	String to encrypt
	 * @param password			IV used to encrypt string
	 * @return				Encrypted string
	 * @throws Exception	
	 */
	public static String encrypt(String strToEncrypt, String IVString) throws Exception {
		
		String password = PafBaseConstants.AES_Password;

		//check input args		
		if ( strToEncrypt == null || IVString == null ) {
			
			throw new IllegalArgumentException(ARGUMENT_S_CAN_NOT_BE_NULL);
			
		}
		
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
		// setup key
		byte[] keyBytes = new byte[16];
		byte[] b = password.getBytes("UTF-8");
		int len = b.length;
		if (len > keyBytes.length)
			len = keyBytes.length;
		System.arraycopy(b, 0, keyBytes, 0, len);

		SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

		// setup key
		byte[] IVBytes = new byte[16];
		byte[] c = IVString.getBytes("UTF-8");
		len = c.length;
		if (len > IVBytes.length)
			len = IVBytes.length;
		System.arraycopy(c, 0, IVBytes, 0, len);
		
		IvParameterSpec ivSpec = new IvParameterSpec(IVBytes);

		cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
		byte[] results = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(results);
	}

	/**
	 * 
	 *  Decrypts string using IV
	 *
	 * @param encryptedStr  Encrypted string to dectrypt
	 * @param password			Used to decrypt encrypted string
	 * @return				Decrypted string
	 * @throws Exception	
	 */
	public static String decrypt(String encryptedStr, String IVString) throws Exception {

		String password = PafBaseConstants.AES_Password;
		
		//check input args
		if ( encryptedStr == null || IVString == null ) {
			
			throw new IllegalArgumentException(ARGUMENT_S_CAN_NOT_BE_NULL);
			
		}
		
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

		// setup key
		byte[] keyBytes = new byte[16];
		byte[] b = password.getBytes("UTF-8");
		int len = b.length;
		if (len > keyBytes.length)
			len = keyBytes.length;
		System.arraycopy(b, 0, keyBytes, 0, len);
		SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		
		// setup key
		byte[] IVBytes = new byte[16];
		byte[] c = IVString.getBytes("UTF-8");
		len = c.length;
		if (len > IVBytes.length)
			len = IVBytes.length;
		System.arraycopy(c, 0, IVBytes, 0, len);
		
		IvParameterSpec ivSpec = new IvParameterSpec(IVBytes);
		
		cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

		BASE64Decoder decoder = new BASE64Decoder();
		byte[] results = cipher.doFinal(decoder.decodeBuffer(encryptedStr));
		return new String(results, "UTF-8");

	}
	
	/**
	 * 
	 * Dynamically generates a unique IV.
	 *
	 * @return IV
	 */
	public static String generateIV() {
		
		String generatedIV = new Double(new Long((new Date()).getTime()).doubleValue() * Math.random()).toString();
		
		logger.debug("Generated IV: " + generatedIV);
		
		return generatedIV;
		
	}

}
