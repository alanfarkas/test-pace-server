package com.pace.server;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.pace.base.PafInvalidLogonInformation;
import com.pace.base.PafNotAbletoGetLDAPContext;
import com.pace.base.app.PafSecurityDomainUserNames;
import com.pace.base.app.PafUserDef;
import com.pace.base.server.ServerSettings;


public interface IPAFAuthentication {

	public PafUserDef authenticateUser(ServerSettings serverSettings, String userPrincipalName, String password, String domain) throws PafInvalidLogonInformation, PafNotAbletoGetLDAPContext;

	public abstract PafUserDef getUser(ServerSettings serverSettings, String userName, String domain) throws PafNotAbletoGetLDAPContext;

	public abstract TreeSet<PafSecurityDomainUserNames> getUserNamesforSecurityGroups(
			ServerSettings serverSettings, Map<String, List<String>> paceGroups) throws PafNotAbletoGetLDAPContext;

	public abstract Map<String, TreeSet<String>> getSecurityGroups(
			ServerSettings serverSettings) throws PafNotAbletoGetLDAPContext;

}