package com.pace.server.comm;

import com.pace.base.app.PafSecurityDomainGroups;

public class PafGroupSecurityResponse {
	private PafSecurityDomainGroups[] domainGroups;

	public void setDomainGroups(PafSecurityDomainGroups[] domainGroups) {
		this.domainGroups = domainGroups;
	}

	public PafSecurityDomainGroups[] getDomainGroups() {
		return domainGroups;
	}


}
