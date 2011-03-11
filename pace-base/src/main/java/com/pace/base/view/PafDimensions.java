/**
 * @(#) PafDimensions.java
 */

package com.pace.base.view;

public class PafDimensions {
	
	private String dimensionName;

	private PafDimType dimensionType;

	private String[] members;

	public String getDimensionName() {
		return dimensionName;
	}

	public PafDimType getDimensionType() {
		return dimensionType;
	}

	public String[] getMembers() {
		return members;
	}

	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
	}

	public void setDimensionType(PafDimType dimensionType) {
		this.dimensionType = dimensionType;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}

}
