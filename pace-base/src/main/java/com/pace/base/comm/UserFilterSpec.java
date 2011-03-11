
/*
 *	File: @(#)UserFilterSpec.java 	Package: com.pace.base.comm 	Project: Paf Base Libraries
 *	Created: Apr 9, 2007  		By: AFarkas
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
package com.pace.base.comm;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * Uow User Filter Specification
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class UserFilterSpec implements Cloneable {

	private transient static final Logger logger = Logger.getLogger(UserFilterSpec.class);
	
	private String[] attrDimNames = null;

	/**
	 * @return the attrDimNames
	 */
	public String[] getAttrDimNames() {
		return attrDimNames;
	}

	/**
	 * @param attrDimNames the attrDimNames to set
	 */
	public void setAttrDimNames(String[] attrDimNames) {
		this.attrDimNames = attrDimNames;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(attrDimNames);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserFilterSpec other = (UserFilterSpec) obj;
		if (!Arrays.equals(attrDimNames, other.attrDimNames))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public UserFilterSpec clone() {
		
		UserFilterSpec userFilterSpec = null;
		
		try {
			userFilterSpec = (UserFilterSpec) super.clone();
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		
		return userFilterSpec;
	}
	
	
	
}

