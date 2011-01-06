/*
 *	File: @(#)CompressionUtil.java 	Package: com.palladium.utility 	Project: com.palladium.paf.adminconsole.global
 *	Created: Sept 5, 2007  		By: jmilliron
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

import java.io.IOException;

import com.palladium.paf.IPafCompressedObj;
import com.palladium.paf.IPafCompressedSingleObj;
import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.db.membertags.MemberTagViewSectionData;
import com.palladium.paf.view.ViewTuple;

/**
 * 
 * Compresses and uncompresses data structures.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class CompressionUtil {
		
	/**
	 * 
	 *  Tries to Uncompress data if class implements IPafCompressedObj
	 *
	 * @param <T> Type of class to uncompress
	 * @param objectToUncompress	Object to uncompress
	 * @return		uncompressed Object
	 */
	public static <T> T tryToUncompress (T objectToUncompress) {
		
		//if instance of compressed obj interfact
		if (objectToUncompress != null && objectToUncompress instanceof IPafCompressedObj) {
		
			//cast to interface
			IPafCompressedObj compressedObj = (IPafCompressedObj) objectToUncompress;
			
			//if compressed, uncompress 
			if ( compressedObj.isCompressed() ) {
			
				compressedObj.uncompressData();
				
				//set initial value to uncompressedObj
				objectToUncompress = (T) compressedObj;
				
			}
						
		}
		
		return objectToUncompress;		
		
	}

	/**
	 * 
	 *  Tries to Uncompress array of data if class implements IPafCompressedObj
	 *
	 * @param <T> Type of class to uncompress
	 * @param arrayToUncompress	Object array to uncompress
	 * @return		uncompressed Object array
	 */
	public static <T> T[] tryToUncompress (T[] arrayToUncompress) {
		
		//if instance of compressed obj interfact
		if (arrayToUncompress != null && arrayToUncompress.length > 0) {
			for (int i = 0; i < arrayToUncompress.length; i++) {
				tryToUncompress(arrayToUncompress[i]);
			}
		}
		
		return arrayToUncompress;		
	}

	
	/**
	 *  Compress each element of the specified array
	 *
	 * @param arrayToCompress Array of compressible objects
	 * 
	 * @return IPafCompressedObj[]
	 * @throws IOException
	 */
	public static IPafCompressedObj[] compressArray(IPafCompressedObj[] arrayToCompress) throws IOException {
		
		// Compress array if not null and not empty
		if (arrayToCompress != null && arrayToCompress.length > 0) {
			for (int i = 0; i < arrayToCompress.length; i++) {
				arrayToCompress[i].compressData();
			}
		}
		
		return arrayToCompress;
	}

	/**
	 *  Compress array of objects into a single string
	 *
	 * @param arrayToCompress Array of objects to compress
	 *
	 * @return String
	 * @throws IOException 
	 */
	public static String compressArrayToString(IPafCompressedSingleObj[] arrayToCompress, String elementDelimiter, String groupDelimiter) throws IOException {

		StringBuffer sb = null;
		final int AVG_TEXT_LENGTH = 25;
		
		// Exit if array is null or empty
		if (arrayToCompress == null || arrayToCompress.length == 0) {
			return null;
		}
		
		// Compress first element
		sb = new StringBuffer(arrayToCompress.length * AVG_TEXT_LENGTH);
		String compData = null;
			arrayToCompress[0].compressData(elementDelimiter);
			compData = arrayToCompress[0].getCompressedData();
			
			if(compData != null){
				sb.append(compData);
			}

		// Compress any remaining elements
		for (int i = 1; i < arrayToCompress.length; i++) {
			arrayToCompress[i].compressData(elementDelimiter);
			compData = arrayToCompress[i].getCompressedData();
			
			if(compData != null){
				sb.append(groupDelimiter);
				sb.append(compData);
			}
		}
		
		
		return sb.toString();
	}
	
	/**
	 *  Generate Dynamic Delimiter
	 *
	 * @param arrayToCompress Array of objects to compress
	 * @param delimiter String delimiter character searched for in text string
	 * @param escapeChar String escape character to be used
	 *
	 * @return String
	 */
	public static String generateDynamicEscapeSequenceForArrayofArrays(IPafCompressedSingleObj[] arrayToCompress, String delimiter, String escapeChar){
		
		Integer greatestEscapeCounter = null;
		for (int i = 0; i < arrayToCompress.length; i++) {
			Integer escapeCounter = arrayToCompress[i].getDynamicEscapeCount(delimiter, escapeChar);

			if(escapeCounter != null){	
				if(greatestEscapeCounter == null || escapeCounter > greatestEscapeCounter){
					greatestEscapeCounter = escapeCounter;
				}
			}
		}
			
		//Create escape character string
		String escapeSequence = "";
		int counter = 0;
		if(greatestEscapeCounter != null){
			while (counter <= greatestEscapeCounter){
				escapeSequence = escapeSequence + escapeChar;
				counter++;
			}
		}
		
		return escapeSequence;
	}
	
	/**
	 *  Determines the count of escape characters to repeat
	 *
	 * @param arrayToCompress Array of objects to compress
	 * @param delimiter String delimiter character searched for in text string
	 * @param escapeChar String escape character to be used
	 *
	 * @return Integer
	 */
	public static Integer generateEscapeSequenceForArray(String[] array, String delimiter, String escapeChar){
		
		//Inspect the values for the element delimiter.  If found, an escape character is added to the left of the delimiter.
		//If values are found to have the escape characters to the left, the number of escape chars is increased
		Integer greatestEscapeCounter = null;
		for (int i = 0; i < array.length; i++) {
			int fromIndex = 0;
			Integer escapeCounter;
			int endIndex;
			while(array[i].indexOf(delimiter, fromIndex) != -1){
				endIndex = array[i].indexOf(delimiter, fromIndex);
				fromIndex = endIndex + 1;
				int beginIndex = endIndex - 1;
				
				escapeCounter = null;
				while(beginIndex >= 0 && array[i].substring(beginIndex, endIndex).equals(escapeChar)){
					
					if(escapeCounter == null){
						escapeCounter = 0;
					}else{
						escapeCounter++;
					}
					
					beginIndex--;
					endIndex--;
				}
				
				if(escapeCounter == null){
					//delimeter element in string, but no escape characters to the left
					if(endIndex != -1){
						escapeCounter = 0;
						
						if(greatestEscapeCounter == null || escapeCounter > greatestEscapeCounter){
							greatestEscapeCounter = escapeCounter;
						}
					}
				}else{
					if(greatestEscapeCounter == null || (escapeCounter + 1) > greatestEscapeCounter){
						//Store the max value of the number of adjacent escape chars immediately to the left of a delimiter plus one
						greatestEscapeCounter = escapeCounter + 1;
					}
				}
			}
		}

		return greatestEscapeCounter;
	}
	
	
	
	/**
	 *  This is a testing stub
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		String compressedSimpleCoordList4 = "dim1^dim2^dim3^dim4|^abc^def^hig^kdkd^kdjk^kaa^ddd^addd^aaa^bbb^ccc^ddd";
						
		SimpleCoordList simpleCoodList4 = new SimpleCoordList();
		simpleCoodList4.setAxis(new String[] { "dim1","dim2","dim3", "dim4" } );
		simpleCoodList4.setCoordinates(new String[] {"abc", "def", "hig", "kdkd", "kdjk", "kaa", "ddd", "addd", "aaa", "bbb", "ccc", "ddd" });
		SimpleCoordList simpleCoodList4b = new SimpleCoordList();
		simpleCoodList4b.setAxis(new String[] { "dim1","dim2","dim3", "dim4" } );
		simpleCoodList4b.setCoordinates(new String[] {"abc", "def", "hig", "kdkd", "kdjk", "kaa", "ddd", "addd", "aaa", "bbb", "ccc", "ddd" });
		SimpleCoordList[] coordArray = new SimpleCoordList[]{simpleCoodList4, simpleCoodList4b};
		try {
			simpleCoodList4.compressData();
			simpleCoodList4b.compressData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		simpleCoodList4 = tryToUncompress(simpleCoodList4);
		coordArray = tryToUncompress(coordArray);
		
		System.out.println("Compressed: " + compressedSimpleCoordList4);
		System.out.println("Uncompressed:   " + simpleCoodList4.getAxis() + " : " + simpleCoodList4.getCoordinates());
		
		
	}

}
