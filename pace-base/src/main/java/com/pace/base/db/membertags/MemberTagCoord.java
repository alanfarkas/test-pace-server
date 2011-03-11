/*
 *	File: @(#)MemberTagMapping.java 		Package: com.pace.base.db.membertags 	Project: Paf Base Libraries
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

import com.pace.base.app.PafSecurityGroup;
import com.pace.base.data.Intersection;
import com.pace.base.db.Dimension;
import com.pace.base.db.membertags.MemberTagId;

/**
 * Member tag coorindate
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class MemberTagCoord implements Comparable<MemberTagCoord> {

	private Integer id;
	private MemberTagId memberTagId;
	private Dimension dimension;
	private String memberName;
	private MemberTagData memberTagData;
	
	public MemberTagCoord() {}

	/**
	 * @param memberTagId Member tag id
	 * @param dimension Coordinate dimension
	 * @param memberName Coordinate Member name
	 * @param memberTagData Member tag data
	 */
	public MemberTagCoord(MemberTagId memberTagId, Dimension dimension, String memberName, MemberTagData memberTagData) {
		this.memberTagId = memberTagId;
		this.dimension = dimension;
		this.memberName = memberName;
		this.memberTagData = memberTagData;
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
	 * @return the memberTagId
	 */
	public MemberTagId getMemberTagId() {
		return memberTagId;
	}

	/**
	 * @param memberTagId the memberTagId to set
	 */
	public void setMemberTagId(MemberTagId memberTagId) {
		this.memberTagId = memberTagId;
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
	 * @return the memberTagData
	 */
	public MemberTagData getMemberTagData() {
		return memberTagData;
	}

	/**
	 * @param memberTagData the memberTagData to set
	 */
	public void setMemberTagData(MemberTagData memberTagData) {
		this.memberTagData = memberTagData;
	}
	
	public int compareTo(MemberTagCoord coord) {
		
		int outcome = 0;
		
		if ( coord.getDimension() != null && this.getDimension() != null) {
			outcome = this.getDimension().getName().compareTo(coord.getDimension().getName());			
		}
		
		return outcome;
	}
}
