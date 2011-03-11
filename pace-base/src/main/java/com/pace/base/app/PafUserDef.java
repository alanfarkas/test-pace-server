/**
 * 
 */
package com.pace.base.app;

/**
 * @author jmilliron
 *
 */
public class PafUserDef implements Cloneable {
	
	private String userName;
	private String domain;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private boolean admin;

	private boolean changePassword;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the admin
	 */
	public boolean getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	/**
	 * @return Returns the changePassword.
	 */
	public boolean getChangePassword() {
		return changePassword;
	}
	/**
	 * @param changePassword The changePassword to set.
	 */
	public void setChangePassword(boolean changePassword) {
		this.changePassword = changePassword;
	}
	/**
	 * @param set the domain that the user is in
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
}
