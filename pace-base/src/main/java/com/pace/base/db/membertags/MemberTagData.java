/*
 *	File: @(#)MemberTagData.java 		Package: com.pace.base.db.membertags 	Project: Paf Base Libraries
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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.pace.base.comm.SimpleCoordList;
import com.pace.base.db.Application;
import com.pace.base.db.Dimension;

/**
 * Member tag data
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MemberTagData {

	private Integer id;
	private String data;
	private String memberTagType;
	private String creator;
	private Date lastUpdated;
	private MemberTagId memberTagId;
	private SortedSet<MemberTagCoord> memberTagCoordSet;
	
	public MemberTagData() {}

	
	/**
	 * Create a new member tag from a simple member tag
	 * 
	 * @param simpleMemberTagData
	 */
	public MemberTagData(SimpleMemberTagData simpleMemberTagData) {
		
		// Validate simple member tag data
		if (simpleMemberTagData == null ) {
			String errMsg = "Unable to create  memberTagData object - simple member tag was null.";
			throw new IllegalArgumentException(errMsg);
		}
		
		// Check for invalid id
		int simpleID = simpleMemberTagData.getId();
		if(simpleID != -1){
			this.id = simpleID;
		} else {
			this.id = null;
		}
		
		// Set basic properties
		this.data = simpleMemberTagData.getData(); 
		this.memberTagType = simpleMemberTagData.getMemberTagType();
		this.creator = simpleMemberTagData.getCreator();
		this.lastUpdated = simpleMemberTagData.getLastUpdated();
		
		
		// Set the member tag coordinate set
		this.memberTagCoordSet = new TreeSet<MemberTagCoord>();
		SimpleCoordList simpleCoordList = simpleMemberTagData.getSimpleCoordList();
		if (simpleCoordList != null ) {
	
			// Ensure that there is a valid set of coordinates to convert and that these coordinates 
			// represents a single data intersection.
			if (simpleCoordList.getAxis() != null && simpleCoordList.getCoordinates() != null 
					&& simpleCoordList.getAxis().length == simpleCoordList.getCoordinates().length ) {	
				
				// Create the member tag id
				Application application = new Application(simpleMemberTagData.getApplicationName());
				MemberTagId memberTagId = new MemberTagId(application, simpleMemberTagData.getMemberTagName());
				
				// Set each coordinate record
				String[] dimensions = simpleCoordList.getAxis();
				String[] members = simpleCoordList.getCoordinates();			
				for (int i = 0; i < dimensions.length; i++ ) {		
					Dimension dimension = new Dimension(dimensions[i], false);
					MemberTagCoord memberTagCoord = new MemberTagCoord(memberTagId, dimension, members[i], this);
					this.memberTagCoordSet.add(memberTagCoord);
				}	
			}						
		}
		
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
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * @return the memberTagType
	 */
	public String getMemberTagType() {
		return memberTagType;
	}

	/**
	 * @param memberTagType the memberTagType to set
	 */
	public void setMemberTagType(String memberTagType) {
		this.memberTagType = memberTagType;
	}

	/**
	 * @return the memberTagCoordSet
	 */
	public SortedSet<MemberTagCoord> getMemberTagCoordSet() {
		return memberTagCoordSet;
	}

	/**
	 * @param memberTagCoordSet the memberTagCoordSet to set
	 */
	public void setMemberTagCoordSet(SortedSet<MemberTagCoord> memberTagCoordSet) {
		this.memberTagCoordSet = memberTagCoordSet;
	}

	/**
	 *	Return simple version of member tag data
	 *
	 * @return SimpleMemberTagData
	 */
	public SimpleMemberTagData getSimpleMemberTagData() {

		// Create simple member tag data
		SimpleMemberTagData simpleMemberTagData = new SimpleMemberTagData();
		
		// Set basic properties
		if (this.id == null){
			simpleMemberTagData.setId(-1);
		}
		else{
			simpleMemberTagData.setId(this.id);
		}
		simpleMemberTagData.setData(this.data);
		simpleMemberTagData.setCreator(this.creator);
		simpleMemberTagData.setMemberTagType(this.memberTagType);
		simpleMemberTagData.setLastUpdated(this.lastUpdated);
		simpleMemberTagData.setCompressed(false);
				
		
		// Set complex properties
		if ( this.memberTagCoordSet != null ) {
			
			// Set application name and member tag name
			MemberTagCoord[] coords = this.memberTagCoordSet.toArray(new MemberTagCoord[0]);
			MemberTagId memberTagId = coords[0].getMemberTagId();
			simpleMemberTagData.setApplicationName(memberTagId.getApplication().getName());
			simpleMemberTagData.setMemberTagName(memberTagId.getMemberTagName());

			// Set simple coordinate list
			int coordCnt = this.memberTagCoordSet.size();
			String[] dims = new String[coordCnt];
			String[] members = new String[coordCnt];
			for (int i = 0; i < coordCnt; i++) {
				MemberTagCoord coord = coords[i];
				dims[i] = coord.getDimension().getName();
				members[i] = coord.getMemberName();
			}	
			simpleMemberTagData.setSimpleCoordList(new SimpleCoordList(dims, members));
		}
				
		return simpleMemberTagData;		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String appName = null, memberTagName = null, coords = null;
		StringBuffer strBuff = new StringBuffer("Member Tag");
		
		// Get app and member tag name
		if (this.memberTagCoordSet!= null && !memberTagCoordSet.isEmpty()) {
			MemberTagCoord coord = this.memberTagCoordSet.toArray(new MemberTagCoord[0])[0];
			MemberTagId memberTagId = coord.getMemberTagId();
			if (memberTagId != null) {
				appName = memberTagId.getApplication().getName();
				memberTagName = memberTagId.getMemberTagName();
			}
		}
		
		// Display member tag data
		strBuff.append("\n\tId: " + this.id);
		if (appName != null ) {
			strBuff.append("\n\tApplication: " + appName);
		}
		if (memberTagName != null) {
			strBuff.append("\n\tName: " + memberTagName);
		}
		if (coords != null) {
			strBuff.append("\n\tCoordinates: " + coords);
		}
		strBuff.append("\n\tValue: " + this.data);
		strBuff.append("\n\tType: " + this.memberTagType);
		strBuff.append("\n\tCreator: " + this.creator);
		strBuff.append("\n\tLast Updated: " + this.lastUpdated);
		strBuff.append("\n");
		
		
		return strBuff.toString();
	}


	public void setMemberTagId(MemberTagId memberTagId) {
		this.memberTagId = memberTagId;
	}


	public MemberTagId getMemberTagId() {
		return memberTagId;
	}








}
