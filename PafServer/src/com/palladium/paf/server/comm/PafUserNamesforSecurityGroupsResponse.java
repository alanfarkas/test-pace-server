package com.palladium.paf.server.comm;

import com.palladium.paf.app.PafSecurityDomainUserNames;

public class PafUserNamesforSecurityGroupsResponse {
	private PafSecurityDomainUserNames[] domainUserNames;

	public void setDomainUserNames(PafSecurityDomainUserNames[] domainUserNames) {
		this.domainUserNames = domainUserNames;
	}

	public PafSecurityDomainUserNames[] getDomainUserNames() {
		return domainUserNames;
	}







	
	
}
