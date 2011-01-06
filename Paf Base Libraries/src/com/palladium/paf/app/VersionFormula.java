/*
 *	File: @(#)VarianceFormula.java 	Package: com.palladium.paf.app 	Project: Paf Base Libraries
 *	Created: Jan 19, 2006  			By: afarkas
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
package com.palladium.paf.app;

import java.util.Arrays;

/**
 * Variance Formula
 *
 * @version	x.xx
 * @author afarkas
 *
 */
public class VersionFormula {

	// Common fields
	private String baseVersion;

	// Variance formula fields
	private String compareVersion;
	private VersionVarianceType varianceType;
	
	// Contribution percent fields
	PafDimSpec[] compareIsSpec;
	
	public VersionFormula() {    }

	/**
	 * @param baseVersion Base Version
	 * @param compareVersion Comparison Version
	 * @param varianceType Variance Type
	 */
	public VersionFormula(String baseVersion, String compareVersion, VersionVarianceType varianceType) {

		this.baseVersion = baseVersion;
		this.compareVersion = compareVersion;
		this.varianceType = varianceType;
	}

	
	/**
	 * @param baseVersion Base Version
	 * @param compareMembers Comparison member specifications
	 */
	public VersionFormula(String baseVersion, PafDimSpec[] compareMembers) {

		this.baseVersion = baseVersion;
		this.compareIsSpec = compareMembers;
		
		if (compareMembers.length == 0) {
			String errMsg = "Version formula instantiation error - compareMembers array is empty";
			throw new IllegalArgumentException(errMsg);
		}
	}

	/**
	 * @return the baseVersion
	 */
	public String getBaseVersion() {
		return baseVersion;
	}

	/**
	 * @param baseVersion the baseVersion to set
	 */
	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}

	/**
	 * @return Returns the compareVersion.
	 */
	public String getCompareVersion() {		
		return compareVersion;
	}
	/**
	 * @param compareVersion The compareVersion to set.
	 */
	public void setCompareVersion(String compareVersion) {
		this.compareVersion = compareVersion;
	}

	/**
	 * @return Returns the varianceType.
	 */
	public VersionVarianceType getVarianceType() {
		return varianceType;
	}
	/**
	 * @param varianceType The varianceType to set.
	 */
	public void setVarianceType(VersionVarianceType varianceType) {
		this.varianceType = varianceType;
	}

	/**
	 * @return the compareIsSpec
	 */
	public PafDimSpec[] getCompareIsSpec() {
		return compareIsSpec;
	}
	/**
	 * @param compareIsSpec the compareIsSpec to set
	 */
	public void setCompareIsSpec(PafDimSpec[] compareIsSpec) {
		this.compareIsSpec = compareIsSpec;
	}

	/**
	 * @return the compare intersection dimensions
	 */
	public String[] getCompareIsDims() {
		
		// Return empty set if compare intersection spec is null
		if (compareIsSpec == null) {
			return new String[0];
		}
		
		// Return all compare intersection dimensions
		int dimCount = compareIsSpec.length;
		String[] compareIsDims = new String[dimCount];
		for (int i = 0; i < dimCount; i++) {
			compareIsDims[i] = compareIsSpec[i].getDimension();
		}	
		
		return compareIsDims;
	}

	/**
	 * @return the compare intersection membes
	 */
	public String[] getCompareIsMembers() {
		
		// Return empty set if compare intersection spec is null
		if (compareIsSpec == null) {
			return new String[0];
		}
		
		// Return all compare intersection members
		int dimCount = compareIsSpec.length;
		String[] compareIsMembers = new String[dimCount];
		for (int i = 0; i < dimCount; i++) {
			compareIsMembers[i] = compareIsSpec[i].getExpressionList()[0];
		}	
		
		return compareIsMembers;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((baseVersion == null) ? 0 : baseVersion.hashCode());
		result = prime * result + Arrays.hashCode(compareIsSpec);
		result = prime * result
				+ ((compareVersion == null) ? 0 : compareVersion.hashCode());
		result = prime * result
				+ ((varianceType == null) ? 0 : varianceType.hashCode());
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
		VersionFormula other = (VersionFormula) obj;
		if (baseVersion == null) {
			if (other.baseVersion != null)
				return false;
		} else if (!baseVersion.equals(other.baseVersion))
			return false;
		if (!Arrays.equals(compareIsSpec, other.compareIsSpec))
			return false;
		if (compareVersion == null) {
			if (other.compareVersion != null)
				return false;
		} else if (!compareVersion.equals(other.compareVersion))
			return false;
		if (varianceType == null) {
			if (other.varianceType != null)
				return false;
		} else if (!varianceType.equals(other.varianceType))
			return false;
		return true;
	}
	
	

}
