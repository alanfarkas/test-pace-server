package com.palladium.paf.server.comm;

import com.palladium.paf.app.PafSecurityDomainGroups;

public class PafGroupSecurityResponse {
	private PafSecurityDomainGroups[] domainGroups;

	public void setDomainGroups(PafSecurityDomainGroups[] domainGroups) {
		this.domainGroups = domainGroups;
	}

	public PafSecurityDomainGroups[] getDomainGroups() {
		return domainGroups;
	}


}
