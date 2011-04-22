package com.pace.server.comm;

import com.pace.base.db.SecurityGroup;

public class PafGetPaceGroupsResponse {
	private SecurityGroup[] securityGroups;

	public void setSecurityGroups(SecurityGroup[] securityGroups) {
		this.securityGroups = securityGroups;
	}

	public SecurityGroup[] getSecurityGroups() {
		return securityGroups;
	}

}
