package com.palladium.paf.server;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.naming.ldap.LdapContext;

import com.pace.base.PafNotAbletoGetLDAPContext;
import com.pace.base.app.PafSecurityDomainGroups;
import com.pace.base.app.PafSecurityDomainUserNames;
import com.pace.base.app.PafUserDef;

public interface IPafLDAPProvider {

	public abstract LdapContext getLdapContext(ServerSettings serverSettings) throws PafNotAbletoGetLDAPContext;

	public abstract void closeLDAPContext(LdapContext ctx);

	public abstract PafUserDef getUser(LdapContext ctx,
			ServerSettings serverSettings, String userName, String domain);

	public abstract Map<String, TreeSet<String>> getSecurityGroups(
			LdapContext ctx, ServerSettings serverSettings);

	public abstract TreeSet<PafSecurityDomainUserNames> getUserNamesforSecurityGroups(
			LdapContext ctx, ServerSettings serverSettings, Map<String, List<String>> paceGroups);

	public PafUserDef authenticateUser (LdapContext ctx, ServerSettings serverSettings, String securityPrincipal, String sid);
	
	public PafUserDef authenticateUser (ServerSettings serverSettings, String securityPrincipal, 
			String domain, String password) throws PafNotAbletoGetLDAPContext;
	
	public Map<String, List<String>> validateUsers(LdapContext ctx, ServerSettings serverSettings, Map<String, List<String>> users);
	

}