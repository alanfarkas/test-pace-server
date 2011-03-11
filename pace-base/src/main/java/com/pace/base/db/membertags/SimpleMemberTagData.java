/*
 *	File: @(#)SimpleMemberTagData.java 		Package: com.pace.base.db.membertags 	Project: Paf Base Libraries
 *	Created: Nov 29, 2007  			By: AFarkas
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
package com.pace.base.db.membertags;

import java.io.IOException;
import java.util.Date;

import com.pace.base.IPafCompressedObj;
import com.pace.base.comm.SimpleCoordList;

/**
 * Simple member tag data suitable for soap layer
 *  
 * @version	1.00
 * @author AFarkas
 *
 */
public class SimpleMemberTagData implements IPafCompressedObj{

	private int id;
	private String applicationName;
	private String memberTagName;
	private SimpleCoordList simpleCoordList;
	private String data;
	private String memberTagType;
	private String creator;
	private Date lastUpdated;
	private boolean isCompressed;
	
	
	/**
	 * Default constructor
	 */
	public SimpleMemberTagData() {}
	
	/**
	 * @param applicationName Application name
	 * @param memberTagName Member tag name
	 * @param simpleCoordList Member tag coordinates
	 * @param data Member tag value
	 * @param memberTagType Member tag type
	 * @param creator Last user to create or update member tag data
	 * @param lastUpdated Last time data was updated
	 * @param isCompressed Indicates if data is compressed
	 */
	public SimpleMemberTagData(String applicationName, String memberTagName, SimpleCoordList simpleCoordList, 
			String data, String memberTagType, String creator, Date lastUpdated, boolean isCompressed) {
		
		this.applicationName = applicationName;
		this.memberTagName = memberTagName;
		this.simpleCoordList = simpleCoordList;
		this.data = data;
		setMemberTagType(memberTagType);
		this.creator = creator;
		this.lastUpdated = lastUpdated;
		setCompressed(isCompressed);
	}
	
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}


	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}


	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}


	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}


	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}


	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
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


	/**
	 * @return the memberTagType
	 */
	public String getMemberTagType() {
		return memberTagType;
	}

	/**
	 * @param memberTagType the memberTagType to set
	 */
	public void setMemberTagType(String memberTagType) {
		
		// Validate tag type
		MemberTagType.deCode(memberTagType);
		this.memberTagType = memberTagType;
	}
	
	/**
	 * @return the simpleCoordList
	 */
	public SimpleCoordList getSimpleCoordList() {
		return simpleCoordList;
	}


	/**
	 * @param simpleCoordList the simpleCoordList to set
	 */
	public void setSimpleCoordList(SimpleCoordList simpleCoordList) {
		this.simpleCoordList = simpleCoordList;
	}


	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#compressData()
	 */
	public void compressData() throws IOException {
		
		// Compress data
		if (!isCompressed) {
			if (simpleCoordList != null) {
				simpleCoordList.compressData();
				isCompressed = true;
			}
		}				
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#isCompressed()
	 */
	public boolean isCompressed() {
		return isCompressed;
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#setCompressed(boolean)
	 */
	public void setCompressed(boolean isCompressed) {
		
		// Ensure all components are compressed before setting compression to true
		if (isCompressed) {
			if (simpleCoordList != null && !simpleCoordList.isCompressed()) {
				String errMsg = "Can't set simple member tag commpression to [true] - not all components are compressed";
				throw new IllegalArgumentException(errMsg);
			}
		} else {
			if (simpleCoordList != null && simpleCoordList.isCompressed()) {
				String errMsg = "Can't set simple member tag commpression to [false] - not all components are uncompressed";
				throw new IllegalArgumentException(errMsg);
			}
		}
		
		this.isCompressed = isCompressed;
	}

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {
		
		// Uncompress data
		if (isCompressed) {
			if (simpleCoordList != null) {
				simpleCoordList.uncompressData();
			}
			isCompressed = false;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer("Simple Member Tag");
		
		// Display simple member tag data
		strBuff.append("\n\tId: " + this.id);
		strBuff.append("\n\tApplication: " + this.applicationName);
		strBuff.append("\n\tName: " + this.memberTagName);
		if (this.getSimpleCoordList() != null) {
			strBuff.append("\n\tCoordinates: " + this.simpleCoordList.toString());
		}
		strBuff.append("\n\tValue: " + this.data);
		strBuff.append("\n\tType: " + this.memberTagType);
		strBuff.append("\n\tCreator: " + this.creator);
		strBuff.append("\n\tLast Updated: " + this.lastUpdated);
		strBuff.append("\n");
		
		
		return strBuff.toString();
	}

}
