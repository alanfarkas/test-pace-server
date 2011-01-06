/*
 *	File: @(#)CellNotesInformation.java 	Package: com.palladium.paf.db.cellnotes 	Project: Paf Base Libraries
 *	Created: Aug 21, 2007  		By: jmilliron
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
package com.palladium.paf.db.cellnotes;

/**
 * Holds database cell note information
 *
 * @author jmilliron
 * @version	1.00 
 *
 */
public class CellNotesInformation {

	//app name
	private String applicationId;
	
	//override app name
	private String overrideApplicationId;
	
	//data source name
	private String dataSourceId;
	
	//override data source name
	private String overrideDataSourceId;	
	
	//number of cell notes in db
	private int cellNoteCount = 0;
	
	/**
	 * Default Constructor
	 *
	 */
	public CellNotesInformation() {
		
	}
	
	/**
	 * 
	 * Overloaded Construtor
	 * 
	 * @param applicationId Name of application
	 * @param dataSourceId  Name of Data source
	 * @param cellNoteCount   Number of cell notes found in db for this app and ds
	 */
	public CellNotesInformation(String applicationId, String dataSourceId, long cellNoteCount) {
		super();
		this.applicationId = applicationId;
		this.dataSourceId = dataSourceId;
		this.cellNoteCount = new Long(cellNoteCount).intValue();
	}
	
	/**
	 * 
	 * Overloaded Construtor
	 * 
	 * @param applicationId Name of application
	 * @param dataSourceId  Name of Data source
	 * @param cellNoteCount   Number of cell notes found in db for this app and ds
	 */
	public CellNotesInformation(String applicationId, String dataSourceId, int cellNoteCount) {
		super();
		this.applicationId = applicationId;
		this.dataSourceId = dataSourceId;
		this.cellNoteCount = cellNoteCount;
	}


	
	/**
	 * @return the cellNoteCount
	 */
	public int getCellNoteCount() {
		return cellNoteCount;
	}

	/**
	 * @param cellNoteCount the cellNoteCount to set
	 */
	public void setCellNoteCount(int cellNoteCount) {
		this.cellNoteCount = cellNoteCount;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		if ( applicationId != null && dataSourceId != null) {
			
			return "App Name: " + applicationId + ", Data Source Name: " 
					+ dataSourceId + ", Cell Note Count: " + cellNoteCount;
			
		}
		
		return super.toString();
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the dataSourceId
	 */
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * @param dataSourceId the dataSourceId to set
	 */
	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	/**
	 * @return the overrideApplicationId
	 */
	public String getOverrideApplicationId() {
		return overrideApplicationId;
	}

	/**
	 * @param overrideApplicationId the overrideApplicationId to set
	 */
	public void setOverrideApplicationId(String overrideApplicationId) {
		this.overrideApplicationId = overrideApplicationId;
	}

	/**
	 * @return the overrideDataSourceId
	 */
	public String getOverrideDataSourceId() {
		return overrideDataSourceId;
	}

	/**
	 * @param overrideDataSourceId the overrideDataSourceId to set
	 */
	public void setOverrideDataSourceId(String overrideDataSourceId) {
		this.overrideDataSourceId = overrideDataSourceId;
	}

}
