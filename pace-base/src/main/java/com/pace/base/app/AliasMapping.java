/*
 *	File: @(#)AliasMapping.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Jun 21, 2007  		By: Jason
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

import com.pace.base.PafBaseConstants;

/**
 * Alias Mapping class.  Maps a dimension name, alias table and a member format together.
 *
 * @version	x.xx
 * @author Jason
 *
 */
public class AliasMapping {

	private String dimName;
	private String aliasTableName;
	private String primaryRowColumnFormat;
	private String additionalRowColumnFormat;
	
	/**
	 *  
	 *
	 */
	public AliasMapping() {

	}
	
	/**
	 * @return the aliasTableName
	 */
	public String getAliasTableName() {
		return aliasTableName;
	}
	/**
	 * @param aliasTableName the aliasTableName to set
	 */
	public void setAliasTableName(String aliasTableName) {
		this.aliasTableName = aliasTableName;
	}
	/**
	 * @return the dimName
	 */
	public String getDimName() {
		return dimName;
	}
	/**
	 * @param dimName the dimName to set
	 */
	public void setDimName(String dimName) {
		this.dimName = dimName;
	}

	/**
	 * @return the additionalRowColumnFormat
	 */
	public String getAdditionalRowColumnFormat() {
		return additionalRowColumnFormat;
	}

	/**
	 * @param additionalRowColumnFormat the additionalRowColumnFormat to set
	 */
	public void setAdditionalRowColumnFormat(String additionalRowColumnFormat) {
		this.additionalRowColumnFormat = additionalRowColumnFormat;
	}

	/**
	 * @return the primaryRowColumnFormat
	 */
	public String getPrimaryRowColumnFormat() {
		return primaryRowColumnFormat;
	}

	/**
	 * @param primaryRowColumnFormat the primaryRowColumnFormat to set
	 */
	public void setPrimaryRowColumnFormat(String primaryRowColumnFormat) {
		this.primaryRowColumnFormat = primaryRowColumnFormat;
	}
	
	/**
	 * 
	 * Creates a default alias mapping object.
	 *
	 * @param dimensionName Name of dimension
	 * @return an AliasMapping with default values
	 */
	public static AliasMapping createDefaultAliasMapping(String dimensionName) {
		
		
		AliasMapping defaultAliasMapping = null;

		if ( dimensionName != null ) {
		
			defaultAliasMapping = new AliasMapping();
			defaultAliasMapping.setDimName(dimensionName);
			defaultAliasMapping.setAliasTableName(PafBaseConstants.ALIAS_TABLE_DEFAULT);
			defaultAliasMapping.setPrimaryRowColumnFormat(AliasMemberDisplayType.Alias.toString());
			defaultAliasMapping.setAdditionalRowColumnFormat("");
			
		}		
		
		return defaultAliasMapping;
		
	}

	
/*	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof AliasMapping ) {
			
			AliasMapping otherAliasMapping = (AliasMapping) obj;
			
			if ( this.dimName != null && otherAliasMapping.getDimName() != null ) {
				
				return this.dimName.equalsIgnoreCase(otherAliasMapping.getDimName());
				
			}
			
		}
		
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		
		if ( dimName != null ) {
			return dimName.hashCode();
		}
		
		return super.hashCode();
	}*/
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((additionalRowColumnFormat == null) ? 0
						: additionalRowColumnFormat.hashCode());
		result = prime * result
				+ ((aliasTableName == null) ? 0 : aliasTableName.hashCode());
		result = prime * result + ((dimName == null) ? 0 : dimName.hashCode());
		result = prime
				* result
				+ ((primaryRowColumnFormat == null) ? 0
						: primaryRowColumnFormat.hashCode());
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
		AliasMapping other = (AliasMapping) obj;
		if (additionalRowColumnFormat == null) {
			if (other.additionalRowColumnFormat != null)
				return false;
		} else if (!additionalRowColumnFormat
				.equals(other.additionalRowColumnFormat))
			return false;
		if (aliasTableName == null) {
			if (other.aliasTableName != null)
				return false;
		} else if (!aliasTableName.equals(other.aliasTableName))
			return false;
		if (dimName == null) {
			if (other.dimName != null)
				return false;
		} else if (!dimName.equals(other.dimName))
			return false;
		if (primaryRowColumnFormat == null) {
			if (other.primaryRowColumnFormat != null)
				return false;
		} else if (!primaryRowColumnFormat.equals(other.primaryRowColumnFormat))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
		if ( this.dimName != null && this.aliasTableName != null && this.primaryRowColumnFormat != null && this.additionalRowColumnFormat != null ) {
			
			return "Dim: " + dimName + ", Alias Table Name: " + aliasTableName + ", Format 1: " + primaryRowColumnFormat + ", Format 2: " + additionalRowColumnFormat + "\n";
			
		}
		
		return super.toString();
	}
	
	/*
	public int compareTo(Object o) {

		AliasMapping otherAliasMapping = (AliasMapping) o;
		
		int outcome = 0;
		
		if ( this.getDimName() != null && otherAliasMapping.getDimName() != null) {
			
			outcome = this.dimName.compareToIgnoreCase(otherAliasMapping.getDimName());
		}
		
		
		return outcome;
	}
	*/
}
