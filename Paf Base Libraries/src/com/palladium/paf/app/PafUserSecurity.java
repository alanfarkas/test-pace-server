/*
 *	File: @(#)PafUser.java 	Package: com.palladium.paf.security 	Project: PafServer
 *	Created: Nov 2, 2005  		By: JWatkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.palladium.paf.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.utility.DomainNameParser;


/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafUserSecurity implements Cloneable {
    
	private transient final static Logger logger = Logger.getLogger(PafUserSecurity.class);
	
	private String userName;
	
	private String displayName;
	
	private String domainName;
	
	private boolean admin;
    
    private LinkedHashMap<String, PafWorkSpec[]> roleFilters = null;
    
    /**
     * @return Returns the userName.
     */
    public String getUserName() {
        return userName;
    }
    /**
     * @param userName The userName to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String[] getRoleNames() {
        return getRoleFilters().keySet().toArray(new String[0]);
    }
	public boolean getAdmin() {
		return admin;
	}
	
	public void setAdmin(Boolean admin) {
		
		if ( admin == null ) {
			
			this.admin = false;
			
		} else {
		
			this.admin = admin;
		}
			
	}
	public void removeRole(String roleName){
		roleFilters.remove(roleName);
	}
	/**
	 * @return the domainName
	 */
	public String getDomainName() {
		return domainName;
	}
	/**
	 * @param domainName the domainName to set
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	/**
	 * @return the displayName  Returns username if display name is blank or null
	 */
	public String getDisplayName() {
		
		//if display name is null or blank, return the user name
		if ( displayName == null || displayName.trim().equals("")) {
			
			return userName;
			
		}
		
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
			
		this.displayName = displayName;
	}
	
	/**
     * @return Returns the roleFilters.
     */
    public LinkedHashMap<String, PafWorkSpec[]> getRoleFilters() {
    	
    	if ( roleFilters == null ) {
    		
    		roleFilters = new LinkedHashMap<String, PafWorkSpec[]>();
    		
    	}
    	
        return roleFilters;
    }
    /**
     * @param roleFilters The roleFilters to set.
     */
    public void setRoleFilters(LinkedHashMap<String, PafWorkSpec[]> roleFilters) {
        this.roleFilters = roleFilters;
    }
	
	/**
	 * 
	 * Generates a key based off of username and domain name
	 *
	 * If domain is null or blank, native domain will be used
	 *
	 * @return
	 */
	public String getKey() {
		
		StringBuffer strBuff = new StringBuffer();
		
		if ( userName != null ) {
			
			strBuff.append(userName);
		
			
			if ( domainName != null && domainName.trim().length() > 0 ) {
				
				strBuff.append(DomainNameParser.AT_TOKEN + domainName);
				
			} else {
				
				strBuff.append(DomainNameParser.AT_TOKEN + PafBaseConstants.Native_Domain_Name);
				
			}
			
		}
						
		String key = strBuff.toString();
		
		if ( key.length() > 0 ) {
			
			return key;
			
		} else {
			
			return null;
			
		}
		
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		
		PafUserSecurity clonedPafUserSecurity = null;
				
		try {		
		
			clonedPafUserSecurity = (PafUserSecurity) super.clone();
				
			if ( roleFilters != null ) {
				
				LinkedHashMap<String, PafWorkSpec[]> newRoleFilterMap = new LinkedHashMap<String, PafWorkSpec[]>();
				
				for (String key : roleFilters.keySet()) {
					
					PafWorkSpec[] pafWorkSpecAr = roleFilters.get(key);
															
					if ( pafWorkSpecAr != null ) {
					
						List<PafWorkSpec> pafWorkSpecList = new ArrayList<PafWorkSpec>();
						
						for ( PafWorkSpec pafWorkSpec : pafWorkSpecAr ) {
							
							if ( pafWorkSpec != null ) {
								
								PafWorkSpec clonedPafWorkSpec = (PafWorkSpec) pafWorkSpec.clone();
								
								pafWorkSpecList.add(clonedPafWorkSpec);
								
							}
						
							
						}
						
						if ( pafWorkSpecList.size() > 0 ) {
																				
							newRoleFilterMap.put(key, pafWorkSpecList.toArray(new PafWorkSpec[0]));
						} 					
												
					}
					
				}
				
				clonedPafUserSecurity.setRoleFilters(newRoleFilterMap);
			
			}
			
		} catch (CloneNotSupportedException e) {
			logger.warn(e.getMessage());
		}
		
		return clonedPafUserSecurity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (admin ? 1231 : 1237);
		result = prime * result
				+ ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result
				+ ((domainName == null) ? 0 : domainName.hashCode());
		
		if ( roleFilters != null ) {
		
			for (String key : roleFilters.keySet()) {
				
				result = prime * result + key.hashCode();
				
				PafWorkSpec[] pafWorkSpecAr = roleFilters.get(key);
				
				if ( pafWorkSpecAr != null ) {
				
					for ( PafWorkSpec pafWorkSpec : pafWorkSpecAr ) {
						
						result = prime * result + pafWorkSpec.hashCode();
						
					}
					
				}
								
			}
			
			
		}
		
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafUserSecurity other = (PafUserSecurity) obj;
		if (admin != other.admin)
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (domainName == null) {
			if (other.domainName != null)
				return false;
		} else if (!domainName.equals(other.domainName))
			return false;
		if (roleFilters == null) {
			if (other.roleFilters != null)
				return false;
		} else  {
			
			for ( String key : roleFilters.keySet()) {
			
				if ( ! other.roleFilters.containsKey(key)) {
					return false;
				} else {
				
					PafWorkSpec[] pafWorkSpecAr = roleFilters.get(key);
					
					if ( ! Arrays.equals(pafWorkSpecAr, other.roleFilters.get(key))) {
						
						return false;
					}
					
				}				
				
			}			
			
		}
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	
}
