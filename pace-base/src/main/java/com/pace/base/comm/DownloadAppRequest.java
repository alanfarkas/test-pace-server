package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;


public class DownloadAppRequest extends PafRequest {
	private List<String> appIds = new ArrayList<String>();

	public List<String> getAppIds() {
		return appIds;
	}

	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}
}
