/*
 *	File: @(#)PafValidAttrRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: April 23, 2007  				By: AFarkas
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

import com.pace.base.app.PafDimSpec;
import com.pace.base.comm.PafRequest;

/**
 * Essbase Server Request
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafValidAttrRequest extends PafRequest {
	
	private String reqAttrDim = null;
	private String selBaseDim = null;
	private String selBaseMember = null;
//	private String[] selAttrDims = null;
	private PafDimSpec[] selAttrSpecs = null;
	
	/**
	 * @return the reqAttrDim
	 */
	public String getReqAttrDim() {
		return reqAttrDim;
	}
	/**
	 * @param reqAttrDim the reqAttrDim to set
	 */
	public void setReqAttrDim(String reqAttrDim) {
		this.reqAttrDim = reqAttrDim;
	}
	/**
	 * @return the selBaseDim
	 */
	public String getSelBaseDim() {
		return selBaseDim;
	}
	/**
	 * @param selBaseDim the selBaseDim to set
	 */
	public void setSelBaseDim(String selBaseDim) {
		this.selBaseDim = selBaseDim;
	}
	/**
	 * @return the selBaseMember
	 */
	public String getSelBaseMember() {
		return selBaseMember;
	}
	/**
	 * @param selBaseMember the selBaseMember to set
	 */
	public void setSelBaseMember(String selBaseMember) {
		this.selBaseMember = selBaseMember;
	}
	public PafDimSpec[] getSelAttrSpecs() {
		return selAttrSpecs;
	}
	public void setSelAttrSpecs(PafDimSpec[] selAttrSpecs) {
		this.selAttrSpecs = selAttrSpecs;
	}

}
