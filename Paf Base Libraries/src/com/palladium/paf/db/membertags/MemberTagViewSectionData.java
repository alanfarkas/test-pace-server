/*
 *	File: @(#)MemberTagViewSectionData.java 		Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
 *	Created: Dec 6, 2007  			By: AFarkas
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
package com.palladium.paf.db.membertags;

import java.io.IOException;

import com.palladium.paf.IPafCompressedObj;
import com.palladium.paf.IPafCompressedSingleObj;
import com.palladium.paf.PafBaseConstants;
import com.palladium.utility.CompressionUtil;

/**
 * Holds member tag data on a view section
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MemberTagViewSectionData implements IPafCompressedSingleObj {
	
	private String memberTagName;
	private String[] memberTagValues;
    private String compressedData;
    private boolean isCompressed;
    
	
	/**
	 * @return the memberTagValues
	 */
	public String[] getMemberTagValues() {
		return memberTagValues;
	}
	/**
	 * @param memberTagValues the memberTagValues to set
	 */
	public void setMemberTagValues(String[] memberTagData) {
		this.memberTagValues = memberTagData;
	}
	
	/**
	 * @return the memberTagName
	 */
	public String getMemberTagName() {
		return memberTagName;
	}
	/**
	 * @param memberTagName the memberTagName to set
	 */
	public void setMemberTagName(String memberTagName) {
		this.memberTagName = memberTagName;
	}
	
	/* (non-Javadoc)
	 * @see com.palladium.paf.IPafCompressedObj#compressData()
	 */
	public void compressData() throws IOException {
		compressData(PafBaseConstants.DELIMETER_ELEMENT);
	}

	/* (non-Javadoc)
	 * @see com.palladium.paf.IPafCompressedObj#compressData()
	 * @param String dynamic delimiter
	 */
	public void compressData(String dynamicDelimiter) throws IOException {

		// Don't compress if data values are null or empty
		if (memberTagName == null || memberTagValues == null || memberTagValues.length == 0) {
			return;
		}

		// Compress data
		StringBuffer strBuff = new StringBuffer(memberTagValues.length * 20);
		strBuff.append(memberTagName);
		for (int i = 0; i < memberTagValues.length; i++) {
			strBuff.append(dynamicDelimiter);
			strBuff.append(memberTagValues[i]);
		}
		compressedData = strBuff.toString();
		
		// Clean up
		memberTagName = null;
		memberTagValues = null;
		isCompressed = true;
	
	}

	/* (non-Javadoc)
	 * @see com.palladium.paf.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {
		// Not needed on server	
	}


	public boolean isCompressed() {
		return isCompressed;
	}
	
	
	public void setCompressed(boolean isCompressed) {
		this.isCompressed = isCompressed;	
	}
	

	/**
	 * @return the compressedData
	 */
	public String getCompressedData() {
		return compressedData;
	}
	/**
	 * @param compressedData the compressedData to set
	 */
	public void setCompressedData(String compressedData) {
		this.compressedData = compressedData;
	}
		
	public Integer getDynamicEscapeCount(String delimiter, String escapeChar) {
		return CompressionUtil.generateEscapeSequenceForArray(memberTagValues, delimiter, escapeChar);
		
	}



	
}
