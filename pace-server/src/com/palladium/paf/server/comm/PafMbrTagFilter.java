package com.palladium.paf.server.comm;

/**
 * Member tag filter to be used in server provider requests
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafMbrTagFilter {

	private String appName;
	private String[] memberTagNames = new String[0];
	private String[] newMemberTagNames = new String[0];
	
	/**
	 *  default constructor
	 */
	public PafMbrTagFilter() {}
	
	/**
	 * @param appName Application name
	 */
	public PafMbrTagFilter(String appName) {
		this.appName = appName;
	}
	
	/**
	 * @param appName Application name
	 * @param memberTagNames Member tag names
	 */
	public PafMbrTagFilter(String appName, String[] memberTagNames) {
		this.appName = appName;
		this.memberTagNames = memberTagNames;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * @return the memberTagNames
	 */
	public String[] getMemberTagNames() {
		return memberTagNames;
	}
	/**
	 * @param memberTagNames the memberTagNames to set
	 */
	public void setMemberTagNames(String[] memberTagNames) {
		this.memberTagNames = memberTagNames;
	}
	/**
	 * @return the newMemberTagNames
	 */
	public String[] getNewMemberTagNames() {
		return newMemberTagNames;
	}
	/**
	 * @param newMemberTagNames the newMemberTagNames to set
	 */
	public void setNewMemberTagNames(String[] newMemberTagNames) {
		this.newMemberTagNames = newMemberTagNames;
	}		
}
