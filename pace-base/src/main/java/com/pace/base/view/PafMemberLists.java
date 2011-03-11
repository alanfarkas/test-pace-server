/**
 * @(#) PafMemberLists.java
 */

package com.pace.base.view;

public class PafMemberLists {
	
	private String memberName;

	private String dimensionName;

	private String[] memberList;

	public String getDimensionName() {
		return dimensionName;
	}

	public void setDimensionName(String dimensionName) {
		this.dimensionName = dimensionName;
	}

	public String[] getMemberList() {
		return memberList;
	}

	public void setMemberList(String[] memberList) {
		this.memberList = memberList;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
