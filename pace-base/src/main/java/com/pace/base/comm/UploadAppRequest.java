package com.pace.base.comm;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class UploadAppRequest extends PafRequest {
	
	private String appId;
	private DataHandler paceProjectDataHandler;
	private boolean applyConfigurationUpdate;
	private boolean applyCubeUpdate;
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public DataHandler getPaceProjectDataHandler() {
		return paceProjectDataHandler;
	}

	@XmlMimeType("application/octet-stream") 
	public void setPaceProjectDataHandler(DataHandler paceProjectDataHandler) {
		this.paceProjectDataHandler = paceProjectDataHandler;
	}

	public boolean isApplyConfigurationUpdate() {
		return applyConfigurationUpdate;
	}

	public void setApplyConfigurationUpdate(boolean applyConfigurationUpdate) {
		this.applyConfigurationUpdate = applyConfigurationUpdate;
	}

	public boolean isApplyCubeUpdate() {
		return applyCubeUpdate;
	}

	public void setApplyCubeUpdate(boolean applyCubeUpdate) {
		this.applyCubeUpdate = applyCubeUpdate;
	}


}
