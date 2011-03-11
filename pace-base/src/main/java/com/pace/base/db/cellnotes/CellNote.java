/*
 *	File: @(#)CellNote.java 	Package: com.pace.base.db.cellnotes 	Project: Paf Base Libraries
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

import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.pace.base.comm.SimpleCoordList;
import com.pace.base.db.Application;
import com.pace.base.db.DataSource;
import com.pace.base.db.Dimension;

/**
 * Cell Note.
 *
 * @author jmilliron
 * @version	1.00
 * 
 */
public class CellNote {

	private int id = -1;
	
	private String text;

	private String creator;

	private Date lastUpdated;

	private Application application;
	
	private DataSource dataSource;
	
	private boolean visible;
	
	private Set<CellNoteMapping> cellNoteMappingSet;

	/**
	 * Create a new Cell Note
	 *
	 */
	public CellNote() {		
	}
	
	/**
	 * 
	 * Create a new Cell Note from a Simple Cell Note
	 * 
	 * @param simpleCellNote Simple Cell Note
	 */
	public CellNote(SimpleCellNote simpleCellNote) {
		
		if ( simpleCellNote == null ) {
			throw new IllegalArgumentException("Simple Cell Note can not be null.");
		}
		
		int simpleID = simpleCellNote.getId();
		if(simpleID != -1){
			this.id = simpleID;
		}
				
		this.text = simpleCellNote.getText();
		this.creator = simpleCellNote.getCreator();
		this.lastUpdated = simpleCellNote.getLastUpdated();
		this.application = new Application(simpleCellNote.getApplicationName());
		this.dataSource = new DataSource(simpleCellNote.getDataSourceName());
		this.visible = simpleCellNote.isVisible();
		this.cellNoteMappingSet = new HashSet<CellNoteMapping>();
		
		SimpleCoordList simpleCoordList = simpleCellNote.getSimpleCoordList();
		
		if ( simpleCoordList != null ) {
			
			if ( simpleCoordList.getAxis() != null && simpleCoordList.getCoordinates() != null && simpleCoordList.getAxis().length == simpleCoordList.getCoordinates().length ) {				

				String[] dimensions = simpleCoordList.getAxis();
				String[] members = simpleCoordList.getCoordinates();
				
				for (int i = 0; i < dimensions.length; i++ ) {
					
					CellNoteMapping dimensionMemberMapping = new CellNoteMapping();
					dimensionMemberMapping.setDimension(new Dimension(dimensions[i], true));
					dimensionMemberMapping.setMemberName(members[i]);
					dimensionMemberMapping.setCellNote(this);
					
					cellNoteMappingSet.add(dimensionMemberMapping);
				}
					
			}
			
			
						
		}
		
	}
	
	/**
	 * @return the application
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * @param application the application to set
	 */
	public void setApplication(Application application) {
		this.application = application;
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
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the cellNoteMappingSet
	 */
	public Set<CellNoteMapping> getCellNoteMappingSet() {
		return cellNoteMappingSet;
	}

	/**
	 * @param cellNoteMappingSet the cellNoteMappingSet to set
	 */
	public void setCellNoteMappingSet(Set<CellNoteMapping> cellNoteMappingSet) {
		this.cellNoteMappingSet = cellNoteMappingSet;
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
	@SuppressWarnings("unused")
	private void setId(int id) {
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
	 * 
	 * Returns a Simple Cell Note populated from Cell Note data.
	 *
	 * @param axisSeqAr axis sequence order, used to build Simple Coord List
	 * @return A populated Simple Cell Note
	 */
	public SimpleCellNote getSimpleCellNote(String[] axisSeqAr) {
		
		/*
		if ( axisSeqAr == null || axisSeqAr.length != this.cellNoteMappingSet.size()) {
			throw new IllegalArgumentException("Axis Sequence doesn't match cell note dimensions.");
		}
		
		Set<String> cellNoteDimensionSet = new HashSet<String>(Arrays.asList(axisSeqAr));
		
		//populate cell note dimensions set
		for (CellNoteMapping cellNoteMapping : cellNoteMappingSet ) {
			
			cellNoteDimensionSet.add(cellNoteMapping.getDimension().getName());
			
		}
		
		for (String axisSeq : axisSeqAr ) {
			
			if ( cellNoteDimensionSet.contains(axisSeq)) {
				
				throw new IllegalArgumentException("Dimension " + axisSeq + " is invalid on cell note.");
				
			}
		}
		*/
		
		//create simple cell note
		SimpleCellNote simpleCellNote = new SimpleCellNote();
		
		
		simpleCellNote.setId(this.id);
				
		simpleCellNote.setText(this.text);
		simpleCellNote.setCreator(this.creator);
		
		if ( this.application != null ) {
			simpleCellNote.setApplicationName(this.application.getName());
		}
		
		if ( this.dataSource != null ) {
			simpleCellNote.setDataSourceName(this.dataSource.getName());
		}
		
		simpleCellNote.setLastUpdated(this.lastUpdated);
		simpleCellNote.setVisible(this.visible);
		
		//if dimension member set exists, create a simple coord list, populate and set.
		if ( this.cellNoteMappingSet != null ) {
		
			SimpleCoordList simpleCoordList = new SimpleCoordList();
			
			Map<String, String> dimensionMemberMap = getDimensionMemberMap();
			
			//dims and members ar should be same size
			String[] dimensions = new String[dimensionMemberMap.size()];
			String[] members = new String[dimensionMemberMap.size()];
			
			int dimMemberMappingCnt = 0;
									
			//loop through dim member mapping and populate dimensions
			// loop through in axis Seq provided, skipping dimensions not listed
			for (String dimensionName : axisSeqAr) {
				dimensions[dimMemberMappingCnt] = dimensionName;
				members[dimMemberMappingCnt++] = dimensionMemberMap.get(dimensionName);								
			}

			
			//set axis from dimensions and coorindates from members
			simpleCoordList.setAxis(dimensions);
			simpleCoordList.setCoordinates(members);
			
			//set simple coord list
			simpleCellNote.setSimpleCoordList(simpleCoordList);
		}
				
		return simpleCellNote;		
		
	}
	
	public SimpleCellNote getSimpleCellNote() {
		
		//create simple cell note
		SimpleCellNote simpleCellNote = new SimpleCellNote();
		
		
		simpleCellNote.setId(this.id);
		
		simpleCellNote.setText(this.text);
		simpleCellNote.setCreator(this.creator);
		
		if ( this.application != null ) {
			simpleCellNote.setApplicationName(this.application.getName());
		}
		
		if ( this.dataSource != null ) {
			simpleCellNote.setDataSourceName(this.dataSource.getName());
		}
		
		simpleCellNote.setLastUpdated(this.lastUpdated);
		simpleCellNote.setVisible(this.visible);
		
		//if dimension member set exists, create a simple coord list, populate and set.
		if ( this.cellNoteMappingSet != null ) {
		
			SimpleCoordList simpleCoordList = new SimpleCoordList();
			
			Map<String, String> dimensionMemberMap = getDimensionMemberMap();
			
			//dims and members ar should be same size
			String[] dimensions = new String[dimensionMemberMap.size()];
			String[] members = new String[dimensionMemberMap.size()];
			
			int dimMemberMappingCnt = 0;
									
			//loop through dim member mapping and populate dimensions
			// loop through in axis Seq provided, skipping dimensions not listed
			for (String dimensionName : dimensionMemberMap.keySet()) {
				dimensions[dimMemberMappingCnt] = dimensionName;
				members[dimMemberMappingCnt++] = dimensionMemberMap.get(dimensionName);								
			}

			
			//set axis from dimensions and coorindates from members
			simpleCoordList.setAxis(dimensions);
			simpleCoordList.setCoordinates(members);
			
			//set simple coord list
			simpleCellNote.setSimpleCoordList(simpleCoordList);
		}
				
		return simpleCellNote;		
		
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
	 *  Generates the key used to idenify the cell note.
	 *  
	 *  The key consist of the alphabetical dimension order of members seperated
	 *  by |.  
	 *  
	 *  For example, if this was the cellNoteMappingSet:
	 *  	Product = Div09
	 *  	Location = Store1
	 *  	Measures = SLS_AUR
	 *  	Version = WP
	 *  
	 *  	The key would be in order Location, Measure, Product, Version
	 *  	The key value would be Store1|SLS_AUR|Div09|WP
	 *
	 * @return dynamic key
	 */
	public String getKey() {
		
		String key = null;
		
		if ( cellNoteMappingSet != null ) {
			
			Map<String, String> dimensionMemberMap = getDimensionMemberMap();
						
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
	
	/**
	 * 
	 * updates relevant fields in the object from a passed in simple Note objects
	 * 
	 * @param simpleNote
	 */
	public void update(SimpleCellNote simpleNote) {
		this.text = simpleNote.getText();
		this.visible = simpleNote.isVisible();
//		this.application = simpleNote.getApplication();
//		this.dataSource = simpleNote.getDataSource();
		this.creator = simpleNote.getCreator();
	}
	
	
	
	/**
	 * 
	 * Gets a mapping of dimension name and member name.
	 * 
	 * Uses TreeMap to hold alphabetical order of dimension (key).
	 *
	 * @return map of dim name and member name
	 */
	private Map<String, String> getDimensionMemberMap() {
		
		Map<String, String> dimensionMemberMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		
		if ( cellNoteMappingSet != null ) {
			
			//loop over cell note mappings and add to dim member tree map
			for (CellNoteMapping cellNoteMapping : cellNoteMappingSet) {
			
				dimensionMemberMap.put(cellNoteMapping.getDimension().getName(), cellNoteMapping.getMemberName());
				
			}
			
		}
		
		return dimensionMemberMap;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer("Cell Note");
		
		strBuff.append("\n\tText: " + this.text);
		strBuff.append("\n\tCreator: " + this.creator);
		strBuff.append("\n\tLast Updated: " + this.lastUpdated);
		strBuff.append("\n\tId: " + this.id);
		strBuff.append("\n\tKey: " + this.getKey());
		if ( this.getApplication() != null ) {
			strBuff.append("\n\tApplication: " + this.getApplication().getName());
		}
		if ( this.getDataSource() != null ) {
			strBuff.append("\n\tDataSource: " + this.getDataSource().getName());
		}
		strBuff.append("\n");
		
		
		return strBuff.toString();
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean isEqual = false;
		
		if ( obj != null && obj instanceof CellNote ) {
			
			CellNote compareObj = (CellNote) obj;
			
			if ( this.cellNoteMappingSet != null && compareObj.cellNoteMappingSet != null 
					&& this.application != null && this.application.getName() != null 
					&& this.dataSource != null && this.dataSource.getName() != null
					&& compareObj.application != null && compareObj.application.getName() != null 
					&& compareObj.dataSource != null && compareObj.dataSource.getName() != null ) {
			
				isEqual = this.getKey().equals(compareObj.getKey()) 
						&& this.application.getName().equalsIgnoreCase(compareObj.application.getName())
						&& this.dataSource.getName().equalsIgnoreCase(compareObj.dataSource.getName());
				
			}
			
		}
		
		
		return isEqual;
	}


	@Override
	public int hashCode() {

		int hashCode = super.hashCode();
		
		//if key not null, create hashcode
		if ( getKey() != null ) {
	
			hashCode = 17 * getKey().hashCode();

		}
		
		return hashCode;
	}
	
	public static void main (String[] args ) {
		
		CellNote cn1 = new CellNote();
		CellNote cn2 = new CellNote();
		
		System.out.println(cn1.equals(cn2));
		
	}
}
