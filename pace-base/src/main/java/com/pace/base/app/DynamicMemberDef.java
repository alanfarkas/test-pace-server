/*
 *	File: @(#)DynamicMemberDef.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Aug 28, 2007  		By: jmilliron
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
package com.pace.base.app;

import java.util.Arrays;

/**
 * Dynamic member definition
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class DynamicMemberDef {

	//dimension name
	private String dimension;
	
	//array of member specs {@PLAN_VERSION, @PLAN_VERSION_vs_LY, etc}
	private String[] memberSpecs;
	
	/**
	 * Default Constructor.  Creates a dynamic member definition.
	 *
	 */
	public DynamicMemberDef() {
		
	}

	/**
	 * 	Overloaded Constructor. Creates a dynamic member definition from
	 *  the dimension and memberSpecs;
	 * 
	 * @param dimension
	 * @param memberSpecs
	 */
	public DynamicMemberDef(String dimension, String[] memberSpecs) {
		this.dimension = dimension;
		this.memberSpecs = memberSpecs;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the memberSpecs
	 */
	public String[] getMemberSpecs() {
		return memberSpecs;
	}

	/**
	 * @param memberSpecs the memberSpecs to set
	 */
	public void setMemberSpecs(String[] memberSpecs) {
		this.memberSpecs = memberSpecs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if ( dimension != null && memberSpecs != null) {
			
			StringBuffer strBuff = new StringBuffer(dimension + ": ");
			
			int memberSpecCnt = 0;
			
			for (String memberSpec : memberSpecs ) {
								
				strBuff.append(memberSpec);
				
				if ( ++memberSpecCnt != memberSpecs.length) {
					
					strBuff.append(", ");
					
				}
				
			}
			
			return strBuff.toString();
			
		}
		
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dimension == null) ? 0 : dimension.hashCode());
		result = prime * result + Arrays.hashCode(memberSpecs);
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
		DynamicMemberDef other = (DynamicMemberDef) obj;
		if (dimension == null) {
			if (other.dimension != null)
				return false;
		} else if (!dimension.equals(other.dimension))
			return false;
		if (!Arrays.equals(memberSpecs, other.memberSpecs))
			return false;
		return true;
	}
	
	
	
}