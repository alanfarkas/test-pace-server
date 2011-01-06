/*
 *	File: @(#)MemberTagId.java 		Package: com.palladium.paf.db.membertags 	Project: Paf Base Libraries
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
package com.palladium.paf.db.membertags;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.palladium.paf.db.Application;

/**
 * Identifies a member tag assigned to an application
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
@Entity
@Table(name = "MEMBER_TAG_ID", schema = "PAFSYS")
public class MemberTagId {
	
	private Integer id;
	private Application application;
	private String memberTagName;
	private Set<MemberTagCoord> memberTagCoordSet;
	
	public MemberTagId() {}
	
	/**
	 * Create a member tag id
	 * 
	 * @param application Application object
	 * @param memberTagName Member tag name
	 */
	public MemberTagId(Application application, String memberTagName) {

		this.application = application;
		this.memberTagName = memberTagName;
	}

	/**
	 * @return the application
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APP_ID_INT", nullable = false)
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
	 * @return the id
	 */
	@Id
	@Column(name = "ID_INT", nullable = false)
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
	 * @return the memberTagName
	 */
	@Column(name = "MEMBER_TAG_NAME_TXT", nullable = false, length = 80)
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
	 * @return the memberTagCoordSet
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "memberTagId")
	public Set<MemberTagCoord> getMemberTagCoordSet() {
		return memberTagCoordSet;
	}

	/**
	 * @param memberTagCoordSet the memberTagCoordSet to set
	 */
	public void setMemberTagCoordSet(Set<MemberTagCoord> memberTagCoordSet) {
		this.memberTagCoordSet = memberTagCoordSet;
	}

	/**
	 *  Generate a key for the member tag id
	 *
	 * @return String
	 */
	public String generateKey() {
		
		// Key is appName + "." + memberTagName
		if (this.application != null) {
			return application.getName() + "." + this.memberTagName;
		}
		return null;
	}


}
