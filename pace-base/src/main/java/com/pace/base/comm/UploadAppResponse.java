package com.pace.base.comm;


public class UploadAppResponse extends PafSuccessResponse {
	
	private boolean reinitClientState;
	
	public UploadAppResponse() {} // empty constructor for SOAP layer
	
	public UploadAppResponse(boolean b) {
		this.setSuccess(b);
	}

	public boolean isReinitClientState() {
		return reinitClientState;
	}

	public void setReinitClientState(boolean reinitClientState) {
		this.reinitClientState = reinitClientState;
	}
	
	
		
}
