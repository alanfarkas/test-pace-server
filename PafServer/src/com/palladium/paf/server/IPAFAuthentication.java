package com.palladium.paf.server;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.palladium.paf.PafNotAbletoGetLDAPContext;

import com.palladium.paf.PafInvalidLogonInformation;
import com.palladium.paf.app.PafUserDef;
import com.palladium.paf.app.PafUserNamesSecurityGroup;
import com.palladium.paf.app.PafSecurityDomainUserNames;

public interface IPAFAuthentication {

	public PafUserDef authenticateUser(ServerSettings serverSettings, String userPrincipalName, String password, String domain) throws PafInvalidLogonInformation, PafNotAbletoGetLDAPContext;

	public abstract PafUserDef getUser(ServerSettings serverSettings, String userName, String domain) throws PafNotAbletoGetLDAPContext;

	public abstract TreeSet<PafSecurityDomainUserNames> getUserNamesforSecurityGroups(
			ServerSettings serverSettings, Map<String, List<String>> paceGroups) throws PafNotAbletoGetLDAPContext;

	public abstract Map<String, TreeSet<String>> getSecurityGroups(
			ServerSettings serverSettings) throws PafNotAbletoGetLDAPContext;

}