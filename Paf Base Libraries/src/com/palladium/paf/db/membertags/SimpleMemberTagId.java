package com.palladium.paf.db.membertags;

import com.palladium.paf.data.Intersection;

public class SimpleMemberTagId {
	private String appName;
	private String memberTagName;
	
	public SimpleMemberTagId() {}
	
	public SimpleMemberTagId(String appName, String memberTagName) {

		this.appName = appName;
		this.memberTagName = memberTagName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return appName;
	}
	public void setMemberTagName(String memberTagName) {
		this.memberTagName = memberTagName;
	}
	public String getMemberTagName() {
		return memberTagName;
	}
	
	@Override
	public String toString() {
		
		StringBuffer strBuff = new StringBuffer("Simple Member Tag ID");
		
		// Display simple member tag data
		strBuff.append("\n\tApplication: " + this.appName);
		strBuff.append("\n\tName: " + this.memberTagName);
		strBuff.append("\n");
		
		return strBuff.toString();
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof SimpleMemberTagId)){
			return false;
		}

		SimpleMemberTagId simpleMTId = (SimpleMemberTagId) o;
		if (this.toString().equals(simpleMTId.toString())){
			return true;
		}else{
			return false;
		}	
	}
	
	public int hashCode() {
		int result = this.toString().hashCode();

		return result;
	}

}
