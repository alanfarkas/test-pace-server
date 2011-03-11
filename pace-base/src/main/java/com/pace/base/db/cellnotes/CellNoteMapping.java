/*
 *	File: @(#)DimensionMemberMapping.java 	Package: com.pace.base.db.cellnotes 	Project: Paf Base Libraries
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

import com.pace.base.db.Dimension;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class CellNoteMapping {

	private int id = -1;
	
	private Dimension dimension;
	
	private CellNote cellNote;
	
	private String memberName;

	/**
	 * Empty constructor
	 *
	 */
	public CellNoteMapping() {
	}

	/**
	 * 
	 * Creates a cell note mapping from a dimension, member name and cell note
	 * 
	 * @param dimension		Dimension
	 * @param memberName	Member Name
	 * @param cellNote		Cell note mapping is tied to.
	 */
	public CellNoteMapping(Dimension dimension, String memberName, CellNote cellNote) {
		this.dimension = dimension;
		this.memberName = memberName;
		this.cellNote = cellNote;
	}
	
	/**
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}



	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}


	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	@SuppressWarnings("unused")
	private void setId(int id) {
		this.id = id;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof CellNoteMapping ) {
			
			CellNoteMapping secondPafDimMember = (CellNoteMapping) obj;
			
			if ( this.dimension != null && secondPafDimMember.dimension != null ){
			
				if ( this.dimension.getName().equals(secondPafDimMember.dimension.getName())
						&& this.cellNote.getId() == secondPafDimMember.cellNote.getId()) {
					return true;
				}
				
			}
			
			
			
		}
		
		return super.equals(obj);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		if (this.dimension != null && this.dimension.getName() != null ) {
			
			return this.dimension.getName().hashCode();
			
		}
		
		return super.hashCode();
	}

	/**
	 * @return the cellNote
	 */
	public CellNote getCellNote() {
		return cellNote;
	}

	/**
	 * @param cellNote the cellNote to set
	 */
	public void setCellNote(CellNote cellNote) {
		this.cellNote = cellNote;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuffer strBuff = new StringBuffer("Cell Note Mapping: " + super.toString());
		
		strBuff.append("\n\tCell Note Mapping Id: " + id);
		strBuff.append("\n\tDimension: " + dimension.getName() + ", Dimension Id: " + dimension.getId());
		strBuff.append("\n\tMember Name: " + memberName);
		
		if ( cellNote == null) {
			strBuff.append("\n\tNot tied to a cell note.");
		} else {
			strBuff.append("\n\tCell Note Id: " + cellNote.getId() + "\n");
		}
		
		
		return strBuff.toString();
	}


	

	
}
