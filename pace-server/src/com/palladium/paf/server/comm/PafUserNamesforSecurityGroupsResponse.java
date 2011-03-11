package com.palladium.paf.server.comm;

import com.pace.base.app.PafSecurityDomainUserNames;

public class PafUserNamesforSecurityGroupsResponse {
	private PafSecurityDomainUserNames[] domainUserNames;

	public void setDomainUserNames(PafSecurityDomainUserNames[] domainUserNames) {
		this.domainUserNames = domainUserNames;
	}

	public PafSecurityDomainUserNames[] getDomainUserNames() {
		return domainUserNames;
	}







	
	
}
