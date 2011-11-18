package com.pace.base.comm;


public class UploadAppResponse extends PafSuccessResponse {
	
	private boolean reinitClientState;
	
	private boolean applyConfigurationUpdateSuccess;
	
	private boolean applyCubeUpdateSuccess;
	
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

	public boolean isApplyConfigurationUpdateSuccess() {
		return applyConfigurationUpdateSuccess;
	}

	public void setApplyConfigurationUpdateSuccess(
			boolean applyConfigurationUpdateSuccess) {
		this.applyConfigurationUpdateSuccess = applyConfigurationUpdateSuccess;
	}

	public boolean isApplyCubeUpdateSuccess() {
		return applyCubeUpdateSuccess;
	}

	public void setApplyCubeUpdateSuccess(boolean applyCubeUpdateSuccess) {
		this.applyCubeUpdateSuccess = applyCubeUpdateSuccess;
	}
	
	
		
}
