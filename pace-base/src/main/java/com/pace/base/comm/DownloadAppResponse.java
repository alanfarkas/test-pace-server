package com.pace.base.comm;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class DownloadAppResponse extends PafSuccessResponse {
		
	private DataHandler paceProjectDataHandler;

	private String appId;
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	@XmlMimeType("application/octet-stream")
	public DataHandler getPaceProjectDataHandler() {
		return paceProjectDataHandler;
	}

	public void setPaceProjectDataHandler(DataHandler paceProjectDataHandler) {
		this.paceProjectDataHandler = paceProjectDataHandler;
	}
	

}
