package com.palladium.paf.server.comm;

import com.palladium.paf.db.SecurityGroup;

public class PafGetPaceGroupsResponse {
	private SecurityGroup[] securityGroups;

	public void setSecurityGroups(SecurityGroup[] securityGroups) {
		this.securityGroups = securityGroups;
	}

	public SecurityGroup[] getSecurityGroups() {
		return securityGroups;
	}

}
