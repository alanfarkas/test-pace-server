package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;

public class PafGetPaceGroupsRequest extends PafRequest{
	private String application;

	public void setApplication(String application) {
		this.application = application;
	}

	public String getApplication() {
		return application;
	}
}
