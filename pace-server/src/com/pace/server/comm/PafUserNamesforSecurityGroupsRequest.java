package com.pace.server.comm;

import java.util.List;
import java.util.Map;

import com.pace.base.app.PafSecurityDomainGroups;
import com.pace.base.comm.PafRequest;

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
