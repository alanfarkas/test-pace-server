package com.pace.base.app;

public class PafSecurityDomainGroups {
	//domain name for the security group
	private String domain;
	private PafSecurityGroup[] securityGroups;
	

	public void setSecurityGroups(PafSecurityGroup[] securityGroups) {
		this.securityGroups = securityGroups;
	}

	public PafSecurityGroup[] getSecurityGroups() {
		return securityGroups;
	}

	
	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	public String getDomain() {
		return domain;
	}
	
	public String[] getgroups(){
		String[] groups = new String[securityGroups.length];
		int i = 0;
		
		for (PafSecurityGroup securityGroup : securityGroups){
			groups[i++] = securityGroup.getGroupName();
		}
		
		return groups;
	}


}
