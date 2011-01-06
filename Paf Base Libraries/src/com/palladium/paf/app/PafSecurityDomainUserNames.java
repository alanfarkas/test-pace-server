package com.palladium.paf.app;

import com.palladium.paf.app.PafUserNamesSecurityGroup;

public class PafSecurityDomainUserNames implements Comparable<PafSecurityDomainUserNames>{
	//domain name for the security group
	private String domainName;
	private PafUserNamesSecurityGroup[] userNamesSecurityGroup;
	
	public int compareTo(PafSecurityDomainUserNames domainUserNames) {
		
		int outcome = 0;
		
		if ( domainUserNames.getDomainName() != null && this.getDomainName() != null) {
			outcome = this.getDomainName().compareTo(domainUserNames.getDomainName());			
		}
		
		return outcome;
	}
	
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	public String getDomainName() {
		return domainName;
	}
	
	public void setUserNamesSecurityGroup(PafUserNamesSecurityGroup[] userNamesSecurityGroup) {
		this.userNamesSecurityGroup = userNamesSecurityGroup;
	}
	
	public PafUserNamesSecurityGroup[] getUserNamesSecurityGroup() {
		return userNamesSecurityGroup;
	}
	
}





