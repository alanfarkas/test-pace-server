package com.pace.base.comm;


public class UploadAppResponse extends PafSuccessResponse {
	
	public UploadAppResponse() {} // empty constructor for SOAP layer
	
	public UploadAppResponse(boolean b) {
		this.setSuccess(b);
	}
		
}
