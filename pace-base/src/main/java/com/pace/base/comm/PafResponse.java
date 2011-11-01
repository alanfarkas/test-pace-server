package com.pace.base.comm;



public class PafResponse {

// empty object to satisfy request/response paradigm of WS Calls
	int responseCode;
	String responseMsg;

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	    
}
