/**
 * 
 */
package com.palladium.paf.server.comm;

/**
 * Used to send back response information from a attribute members request
 *
 * @version	x.xx
 * @author AFarkas
 *
 */

public class PafValidAttrResponse {

	private boolean isSuccess = false;
	private String[] members = null;
	
	/**
	 * @return the isSuccess
	 */
	public boolean isSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the members
	 */
	public String[] getMembers() {
		return members;
	}
	/**
	 * @param members the members to set
	 */
	public void setMembers(String[] members) {
		this.members = members;
	}
	
}
