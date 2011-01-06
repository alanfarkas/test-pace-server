/**
 * 
 */
package com.palladium.paf.server.comm;

/**
 * @author jmilliron
 *
 */
public class PafClientChangePasswordRequest extends PafClientSecurityRequest {

	private String newPassword;
		
	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
}
