package com.pace.base;

public class PafSecurityToken {
	private String userName;
	private boolean admin;
	private String sessionToken;
    private boolean isValid;
    private String Domain;
    
    public PafSecurityToken(String name , String token, boolean valid) {
        super();
        isValid = valid;
        sessionToken = token;
        userName = name;
    }

    public PafSecurityToken()  {}

	public String getUserName() {
		return userName;
	}
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

	public boolean getAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getDomain() {
		return Domain;
	}
}
