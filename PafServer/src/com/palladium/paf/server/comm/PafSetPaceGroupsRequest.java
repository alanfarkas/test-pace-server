package com.palladium.paf.server.comm;

import java.util.ArrayList;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.db.SecurityGroup;

public class PafSetPaceGroupsRequest extends PafRequest{
	private SecurityGroup[] securityGroups;
	private String application;
	//private String application;

	public void setSecurityGroups(SecurityGroup[] securityGroups) {
		this.securityGroups = securityGroups;
	}

	public SecurityGroup[] getSecurityGroups() {
		return securityGroups;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getApplication() {
		return application;
	}

}
