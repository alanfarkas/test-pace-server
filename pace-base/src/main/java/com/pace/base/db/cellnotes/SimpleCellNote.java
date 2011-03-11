/*
 *	File: @(#)SimpleCellNote.java 	Package: com.pace.base.db.cellnotes 	Project: Paf Base Libraries
 *	Created: Jul 18, 2007  		By: jmilliron
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
package com.pace.base.db.cellnotes;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.pace.base.IPafCompressedObj;
import com.pace.base.comm.SimpleCoordList;

/**
 * Simple cell note.  This is the note used to pass over webservices.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class SimpleCellNote implements IPafCompressedObj {

	private SimpleCoordList simpleCoordList;
	
	private int id;
	
	private String text;

	private String creator;

	private Date lastUpdated;
	
	private boolean visible;

	private String applicationName;
	
	private String dataSourceName;

	private boolean isCompressed;

	public SimpleCellNote() {
		
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

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @param visible the visible to set
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	

	/**
	 * 
	 *  Generates the key.
	 *
	 * @return generated key.
	 */
	public String generateKey(){
		
		String key = null;
		
		if ( simpleCoordList != null ) {
			Map<String, String> dimensionMemberMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
			if ( simpleCoordList.getAxis() != null && simpleCoordList.getCoordinates() != null && simpleCoordList.getAxis().length == simpleCoordList.getCoordinates().length ) {				

				String[] dimensions = simpleCoordList.getAxis();
				String[] members = simpleCoordList.getCoordinates();
				
				for (int i = 0; i < dimensions.length; i++ ) {
					dimensionMemberMap.put(dimensions[i], members[i]);
				}	
			}
			
			//create string buffer to hold contents of key
			StringBuffer strBuff = new StringBuffer();
			
			int cnt = 0;
			
			for ( String member : dimensionMemberMap.values() ) {
				
				strBuff.append(member);
				
				if ( ++cnt != dimensionMemberMap.size() ) {
					strBuff.append("|");
				}
				
			}
			
			//set key value from buffer value
			key = strBuff.toString();
			
						
		}
		return key;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#compressData()
	 */
	public void compressData() throws IOException {
		
		if ( simpleCoordList != null ) {
			
			simpleCoordList.compressData();
			
			isCompressed = true;
		}
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#isCompressed()
	 */
	public boolean isCompressed() {
		
		return isCompressed;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#setCompressed(boolean)
	 */
	public void setCompressed(boolean isCompressed) {
		this.isCompressed = isCompressed;
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.pace.base.IPafCompressedObj#uncompressData()
	 */
	public void uncompressData() {

		if ( isCompressed ) {

			if ( simpleCoordList != null ) {
			
				simpleCoordList.uncompressData();
				
			}
						
			isCompressed = false;
			
		}
		
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
	 * @return the dataSourceName
	 */
	public String getDataSourceName() {
		return dataSourceName;
	}

	/**
	 * @param dataSourceName the dataSourceName to set
	 */
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer("Simple Cell Note");
		
		strBuff.append("\n\tText: " + this.text);
		strBuff.append("\n\tCreator: " + this.creator);
		strBuff.append("\n\tLast Updated: " + this.lastUpdated);
		strBuff.append("\n\tId: " + this.id);
		strBuff.append("\n\tKey: " + this.generateKey());
		strBuff.append("\n\tApplication: " + this.getApplicationName());
		strBuff.append("\n\tDataSource: " + this.getDataSourceName());
		strBuff.append("\n");
		
		
		return strBuff.toString();
	}	
}
