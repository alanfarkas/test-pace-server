/*
 *	File: @(#)PafSaveMbrTagRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Dec 3, 2007  		By: Alan
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
package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.db.membertags.SimpleMemberTagData;

/**
 * Defines updates to the member tag database
 *
 * @version	x.xx
 * @author Alan
 *
 */
public class PafSaveMbrTagRequest extends PafRequest {

	private SimpleMemberTagData[] addMemberTags;
	private SimpleMemberTagData[] updateMemberTags;
	private SimpleMemberTagData[] deleteMemberTags;
	
	/**
	 * @return the addMemberTags
	 */
	public SimpleMemberTagData[] getAddMemberTags() {
		return addMemberTags;
	}
	/**
	 * @param addMemberTags the addMemberTags to set
	 */
	public void setAddMemberTags(SimpleMemberTagData[] addMemberTags) {
		this.addMemberTags = addMemberTags;
	}
	/**
	 * @return the deleteMemberTags
	 */
	public SimpleMemberTagData[] getDeleteMemberTags() {
		return deleteMemberTags;
	}
	/**
	 * @param deleteMemberTags the deleteMemberTags to set
	 */
	public void setDeleteMemberTags(SimpleMemberTagData[] deleteMemberTags) {
		this.deleteMemberTags = deleteMemberTags;
	}
	/**
	 * @return the updateMemberTags
	 */
	public SimpleMemberTagData[] getUpdateMemberTags() {
		return updateMemberTags;
	}
	/**
	 * @param updateMemberTags the updateMemberTags to set
	 */
	public void setUpdateMemberTags(SimpleMemberTagData[] updateMemberTags) {
		this.updateMemberTags = updateMemberTags;
	}	
}
