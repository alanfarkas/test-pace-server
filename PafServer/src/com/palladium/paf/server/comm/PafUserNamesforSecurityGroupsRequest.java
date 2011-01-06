package com.palladium.paf.server.comm;

import java.util.List;
import java.util.Map;

import com.palladium.paf.app.PafSecurityDomainGroups;
import com.palladium.paf.comm.PafRequest;

public class PafUserNamesforSecurityGroupsRequest extends PafRequest{
	private PafSecurityDomainGroups[] domainGroups;
 	private String application; 

	public void setDomainUserNames(PafSecurityDomainGroups[] domainUserNames) {
		this.domainGroups = domainUserNames;
	}

	public PafSecurityDomainGroups[] getDomainUserNames() {
		return domainGroups;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getApplication() {
		return application;
	}
	
	
}
