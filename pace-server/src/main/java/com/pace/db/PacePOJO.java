/**
 * 
 */
package com.pace.db;

/**
 * @author jim
 *
 */
public class PacePOJO {
	private String clientId;
	private String sessionId;
	
	public PacePOJO(){super();}
	
	public PacePOJO(String clientId, String sessionId) {
		super();
		this.clientId = clientId;
		this.sessionId = sessionId;
	}
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
