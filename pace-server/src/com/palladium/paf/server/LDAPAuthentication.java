/*
 *	File: @(#)LDAPAuthentication.java 	Package: com.pace.base.server 	Project: PafServer
 *	Created: Jan 7, 2008  		By: PMack
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.server;

//import javax.naming.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.pace.base.*;
import com.pace.base.app.PafSecurityDomainUserNames;
import com.pace.base.app.PafUserDef;
import com.pace.base.app.PafUserNamesSecurityGroup;

import javax.naming.ldap.*;
//import javax.naming.directory.*;

/**
 * @author PMack
 *
 */
public class LDAPAuthentication implements IPAFAuthentication {
	
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.IPAFAuthentication#authenticateUser(java.lang.String, com.pace.base.server.ServerSettings, java.lang.String, java.lang.String)
	 */
	public PafUserDef authenticateUser2(ServerSettings serverSettings, String userName, String sid) throws PafInvalidLogonInformation, PafNotAbletoGetLDAPContext{
		IPafLDAPProvider ldapProvider = null;
		LdapContext ctx = null;
		PafUserDef userDef = null;
		PafInvalidLogonInformation exceptionToThrow = null;
		
		try{
			//We just have the Ad Provider right now so...
			ldapProvider = new ActiveDirectoryProvider();
			
			ctx = ldapProvider.getLdapContext(serverSettings);
			
			userDef = ldapProvider.authenticateUser(ctx, serverSettings, userName, sid);
			
			if (userDef == null){
				//set exception to be thrown as invalid user name exc
				exceptionToThrow = new PafInvalidLogonInformation();
			}
		}
		finally{
			ldapProvider.closeLDAPContext(ctx);
		}
		
		//if an exception needs to be thrown, throw
		if ( exceptionToThrow != null ) {
			throw exceptionToThrow;
		}
		
		return userDef;
	}
	
	public PafUserDef authenticateUser(ServerSettings serverSettings, String userPrincipalName, String password, String domain) throws PafInvalidLogonInformation, PafNotAbletoGetLDAPContext{
			IPafLDAPProvider ldapProvider;
		
		//We just have the Ad Provider right now so...
		ldapProvider = new ActiveDirectoryProvider();
		
		PafUserDef userDef = null;
		
		userDef = ldapProvider.authenticateUser(serverSettings, userPrincipalName, password, domain);
		
		PafInvalidLogonInformation exceptionToThrow = null;
		if (userDef == null){
			//set exception to be thrown as invalid user name exc
			exceptionToThrow = new PafInvalidLogonInformation();
		}
		
		//if an exception needs to be thrown, throw
		if ( exceptionToThrow != null ) {
			
			throw exceptionToThrow;
		}
		
		return userDef;
	}
	

	
	/* (non-Javadoc)
	 * @see com.pace.base.server.IPAFAuthentication#getUser(java.lang.String, com.pace.base.server.ServerSettings, java.lang.String, java.lang.String)
	 */
	public PafUserDef getUser(ServerSettings serverSettings, String userName, String domain)throws PafNotAbletoGetLDAPContext{
		IPafLDAPProvider ldapProvider = null;
		LdapContext ctx = null;
		PafUserDef userDef = null;
		
		try{
			//We just have the Ad Provider right now so...
			ldapProvider = new ActiveDirectoryProvider();
			
			ctx = ldapProvider.getLdapContext(serverSettings);
		
			userDef = new PafUserDef();
			
			userDef = ldapProvider.getUser(ctx, serverSettings, userName, domain);
		 }finally{
			 ldapProvider.closeLDAPContext(ctx);
		 }
		
		return userDef;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.IPAFAuthentication#getUserNamesforSecurityGroups(com.pace.base.server.ServerSettings, java.util.Map)
	 */
	public TreeSet<PafSecurityDomainUserNames> getUserNamesforSecurityGroups  (ServerSettings serverSettings, Map<String, List<String>> paceGroups)throws PafNotAbletoGetLDAPContext{
		IPafLDAPProvider ldapProvider = null;
		TreeSet<PafSecurityDomainUserNames> userNamesforSecurityGroups = new TreeSet<PafSecurityDomainUserNames>();
		LdapContext ctx = null;

		try{
			//We just have the Ad Provider right now so...
			ldapProvider = new ActiveDirectoryProvider();
			
			ctx = ldapProvider.getLdapContext(serverSettings);
			
			if (ctx != null){
				userNamesforSecurityGroups = ldapProvider.getUserNamesforSecurityGroups(ctx, serverSettings, paceGroups);
			}
		} finally{
			ldapProvider.closeLDAPContext(ctx);
		}
		
		return userNamesforSecurityGroups;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.IPAFAuthentication#getSecurityGroups(com.pace.base.server.ServerSettings)
	 */
	public Map<String, TreeSet<String>> getSecurityGroups(ServerSettings serverSettings) throws PafNotAbletoGetLDAPContext{
		IPafLDAPProvider ldapProvider = null;
		LdapContext ctx =  null;
		Map<String, TreeSet<String>> securityGroups = null;

		try{
			//We just have the Ad Provider right now so...
			ldapProvider = new ActiveDirectoryProvider();
			
			ctx = ldapProvider.getLdapContext(serverSettings);
			
			securityGroups = ldapProvider.getSecurityGroups(ctx, serverSettings);
		}finally{
			ldapProvider.closeLDAPContext(ctx);
		}
		
		return securityGroups;
	}
	
	public Map<String, List<String>> validateUsers(ServerSettings serverSettings, Map<String, List<String>> users) throws PafNotAbletoGetLDAPContext{
		IPafLDAPProvider ldapProvider = null;
		LdapContext ctx =  null;
		Map<String, List<String>> invalidUsers = null;
		
		try{
			//We just have the Ad Provider right now so...
			ldapProvider = new ActiveDirectoryProvider();
			
			ctx = ldapProvider.getLdapContext(serverSettings);
			
			invalidUsers = ldapProvider.validateUsers(ctx, serverSettings, users);
		}finally{
			ldapProvider.closeLDAPContext(ctx);
		}
		
		return invalidUsers;
	}
}

