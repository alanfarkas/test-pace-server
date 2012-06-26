package com.pace.server.comm;

import com.pace.base.comm.PafRequest;

public class PafGetPaceGroupsRequest extends PafRequest{
	private String application;

	public void setApplication(String application) {
		this.application = application;
	}

	public String getApplication() {
		return application;
	}
}
