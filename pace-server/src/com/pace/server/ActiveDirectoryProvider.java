package com.pace.server;

import javax.naming.*;
import javax.naming.ldap.*;
import javax.naming.directory.*;

import org.apache.log4j.Logger;

import com.sun.jndi.ldap.ctl.PagedResultsControl;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import com.pace.base.*;
import com.pace.base.app.*;
import com.pace.base.utility.*;

public class ActiveDirectoryProvider implements IPafLDAPProvider {
	
private static Logger logger = Logger.getLogger(PafServiceProvider.class);
final static String CN = "CN";
final static String DC = "DC";

	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#getLdapContext(com.pace.base.server.ServerSettings)
	 */
	public LdapContext getLdapContext(ServerSettings serverSettings) throws PafNotAbletoGetLDAPContext{
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		
		String securityPrincipal = ldapSettings.getSecurityPrincipal();
		String securityCredentials = ldapSettings.getSecurityCredentials();
		
		return getLdapContext(serverSettings, securityPrincipal, securityCredentials);
	}
	
	public LdapContext getLdapContext(ServerSettings serverSettings, String securityPrincipal, String securityCredentials) throws PafNotAbletoGetLDAPContext{
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		LdapContext ctx = null;
		
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, ldapSettings.getSecurityAuthentication().toLowerCase());
		env.put(Context.SECURITY_PRINCIPAL, securityPrincipal);
		env.put(Context.SECURITY_CREDENTIALS, securityCredentials);
		env.put(Context.SECURITY_PROTOCOL, ldapSettings.getSecurityProtocol().toLowerCase());
		env.put(Context.PROVIDER_URL, ldapSettings.getProviderURLGC());
		env.put("com.sun.jndi.ldap.connect.timeout", ldapSettings.getConnectTimeout());
		
		//Enable connection pooling
//		env.put("com.sun.jndi.ldap.connect.pool", "true");
//		env.put("com.sun.jndi.ldap.connect.pool.protocol", "plain ssl");
//		env.put("com.sun.jndi.ldap.connect.pool.timeout", "300000");
//		env.put("com.sun.jndi.ldap.connect.pool.debug", "all");

		//ssl enabled
		if (ldapSettings.getSecurityProtocol() != null && ldapSettings.getSecurityProtocol().equalsIgnoreCase("ssl")){
			String keystore = ldapSettings.getSslKeyStore();
			System.setProperty("javax.net.ssl.trustStore",keystore);
		}
		
		try{
			ctx = new InitialLdapContext(env,null);
			
		}
		catch (ConfigurationException  conEx){
			//log error
			PafErrHandler.handleException(conEx, PafErrSeverity.Error);
			ctx = null;
		}
		catch (CommunicationException comEx){
			//log error
			PafErrHandler.handleException(comEx, PafErrSeverity.Error);
			ctx = null;
		}
		catch (AuthenticationException authEx)
        {
			//log error
			PafErrHandler.handleException(authEx, PafErrSeverity.Error);
			ctx = null;
			return ctx;
        }
		catch (NamingException nameEx) {
			//log error
			PafErrHandler.handleException(nameEx, PafErrSeverity.Error);
			ctx = null;
		}
		catch (Exception ex) {
			//log error
			PafErrHandler.handleException(ex, PafErrSeverity.Error);
			ctx = null;
		}

		if (ctx == null){
			PafException pafException = new PafException("A LDAP connection could not be established.", PafErrSeverity.Error); //$NON-NLS-1$
			throw new PafNotAbletoGetLDAPContext(pafException);
		}
		
		return ctx;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#closeLDAPContext(javax.naming.ldap.LdapContext)
	 */
	public void closeLDAPContext(LdapContext ctx){
		
		//if context is not null and available
		if ( ctx != null ) {
			
			try{			
				ctx.close();
			}
			catch (NamingException e) {
	//			log error
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
			
		}
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#getUser(javax.naming.ldap.LdapContext, com.pace.base.server.ServerSettings, java.lang.String, java.lang.String)
	 */
	public PafUserDef getUser(LdapContext ctx, ServerSettings serverSettings, String userName, String domain){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		PafUserDef userDef = null;
		NamingEnumeration<SearchResult> answer = null;
		
		try{		
			//Create the search controls 		
			SearchControls searchCtls = new SearchControls();
			String returnedAtts[]={"givenName", "sn", "distinguishedName", "mail"};
			searchCtls.setReturningAttributes(returnedAtts);
			
			//Specify the search scope
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
								
			//specify the LDAP search filter
			String searchFilter = "(&(objectCategory=user)(name=" + userName.trim() + "))";
			 
			//Specify the Base for the search
			String searchBase = convertDomain(domain.trim());
		
			int pageSize = ldapSettings.getLdapPagesize();
			 
			//Request the paged results control
			Control[] ctls = new Control[]{new PagedResultsControl(pageSize)};
			ctx.setRequestControls(ctls);
			byte[] cookie = null;
						
			do {
				//Search for objects using the filter
				answer = ctx.search(searchBase, searchFilter, searchCtls);
								
				//Loop through the search results
				while (answer.hasMoreElements()) {
					SearchResult sr = (SearchResult)answer.next();
					
					Attributes attrs = sr.getAttributes();	
					userDef = new PafUserDef();
					
					if (attrs.get("givenName") != null){
						userDef.setFirstName(attrs.get("givenName").get().toString());
					}
					else{
						userDef.setFirstName("");
					}
					
					if (attrs.get("sn") != null){
						userDef.setLastName(attrs.get("sn").get().toString());
					}
					else{
						userDef.setLastName("");
					}
					
					if (attrs.get("distinguishedName") != null){
						Map<String, Queue<String>> keyMap = parseDistinguishedName(attrs.get("distinguishedName").get().toString());
						
						if (keyMap == null){
							userDef.setUserName("");
						}else{
							userDef.setUserName(keyMap.get(CN).poll());
						}
					}
					else{
						userDef.setUserName("");
					}
					
					if (attrs.get("mail") != null){
						userDef.setEmail(attrs.get("mail").get().toString());
					}
					else{
						userDef.setEmail("");
					}
				}
				// examine the response controls
				cookie = parseControls(ctx.getResponseControls());
	 
		        // pass the cookie back to the server for the next page
				ctx.setRequestControls(new Control[]{new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });
	 
			} while ((cookie != null) && (cookie.length != 0));
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
		
		return userDef;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#getUser(javax.naming.ldap.LdapContext, com.pace.base.server.ServerSettings, java.lang.String, java.lang.String)
	 */
	private PafUserDef getUser2(LdapContext ctx, ServerSettings serverSettings, String userPrincipalName){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		PafUserDef userDef = null;
		NamingEnumeration<SearchResult> answer = null;
		
		try{		
			//Create the search controls 		
			SearchControls searchCtls = new SearchControls();
			String returnedAtts[]={"givenName", "sn", "distinguishedName", "mail", "userPrincipalName"};
			searchCtls.setReturningAttributes(returnedAtts);
			
			//Specify the search scope
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
								
			//specify the LDAP search filter
			String searchFilter = "(&(objectCategory=user)(userPrincipalName="  + userPrincipalName + "))";

			//Specify the Base for the search
			String searchBase = ldapSettings.getSearchBase();
		
			int pageSize = ldapSettings.getLdapPagesize();
			 
			//Request the paged results control
			Control[] ctls = new Control[]{new PagedResultsControl(pageSize)};
			ctx.setRequestControls(ctls);
			byte[] cookie = null;
			
			boolean foundFlag = false;
			outerLoop:
			do {
				//Search for objects using the filter
				answer = ctx.search(searchBase, searchFilter, searchCtls);
				
				String domain = null;
				//If the userPrincipalName and the sAMAccountName are different then you have to query using the sAMAccountName
				if (! answer.hasMoreElements()){
					DomainNameParser dp = new DomainNameParser(userPrincipalName.trim());
					String sAMAccountName = dp.getUserName();
					domain = dp.getDomainName();
					searchFilter = "(&(objectCategory=user)(sAMAccountName="  + sAMAccountName + "))";
					
					//Search for objects using the filter
					answer = ctx.search(searchBase, searchFilter, searchCtls);
				}
				
					
				//Loop through the search results
				while (answer.hasMoreElements()) {
					SearchResult sr = (SearchResult)answer.next();
					
					Attributes attrs = sr.getAttributes();	
					userDef = new PafUserDef();
					
					if (attrs.get("givenName") != null){
						userDef.setFirstName(attrs.get("givenName").get().toString());
					}
					else{
						userDef.setFirstName("");
					}
					
					if (attrs.get("sn") != null){
						userDef.setLastName(attrs.get("sn").get().toString());
					}
					else{
						userDef.setLastName("");
					}
					
					if (attrs.get("distinguishedName") != null){
						Map<String, Queue<String>> keyMap = parseDistinguishedName(attrs.get("distinguishedName").get().toString());
						
						if (keyMap == null){
							userDef.setUserName("");
						}else{
							userDef.setUserName(keyMap.get(CN).poll());
						}
					}
					else{
						userDef.setUserName("");
					}
					
					if (attrs.get("userPrincipalName") != null){
						String temp = attrs.get("userPrincipalName").get().toString();
						DomainNameParser dp = new DomainNameParser(attrs.get("userPrincipalName").get().toString());
						userDef.setDomain(dp.getDomainName());
					}
					else{
						userDef.setUserName("");
					}
					
					if (attrs.get("mail") != null){
						userDef.setEmail(attrs.get("mail").get().toString());
					}
					else{
						userDef.setEmail("");
					}
					
					if(domain != null && userDef.getDomain().equalsIgnoreCase(domain)){
						foundFlag = true;
						break outerLoop;
					}else if(domain == null){
						foundFlag = true;
					}
				}
				// examine the response controls
				cookie = parseControls(ctx.getResponseControls());
	 
		        // pass the cookie back to the server for the next page
				ctx.setRequestControls(new Control[]{new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });
				
			} while ((cookie != null) && (cookie.length != 0));
			
			if(foundFlag == false){
				userDef = null;
			}
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}		
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
		
		return userDef;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#getSecurityGroups(javax.naming.ldap.LdapContext, com.pace.base.server.ServerSettings)
	 */
	public Map<String, TreeSet<String>> getSecurityGroups(LdapContext ctx, ServerSettings serverSettings){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		Map<String, TreeSet<String>> securityGroups = new HashMap<String, TreeSet<String>>();
		NamingEnumeration<SearchResult> answer = null;

		try{
			//Create the search controls 		
			SearchControls searchCtls = new SearchControls();
			String returnedAtts[]={"member"};
			searchCtls.setReturningAttributes(returnedAtts);
			
			//Specify the search scope
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			 
			//specify the LDAP search filter
			
			String searchFilter = "(&(objectCategory=group)(groupType:1.2.840.113556.1.4.803:=2147483648))";

			//Specify the Base for the search
			String searchBase = ldapSettings.getSearchBase();
			
			int pageSize = ldapSettings.getLdapPagesize();
 
			//Request the paged results control
			Control[] ctls = new Control[]{new PagedResultsControl(pageSize)};
			ctx.setRequestControls(ctls);
			byte[] cookie = null;
 
			TreeSet<String> groupNames;
			String groupName = "";
			StringBuilder domain;
			String container;
			Map<String, Queue<String>> keyMap;
			//int counter;
			do {
				//Search for objects using the filter
				answer = ctx.search(searchBase, searchFilter, searchCtls);
				
				//Loop through the search results
				while (answer.hasMoreElements()) {
	
					SearchResult sr = (SearchResult)answer.next();
					
					//Get the Group Attributes
					Attributes attrs = sr.getAttributes();
					
					//Skip security groups with no members
					if (attrs != null) {	
						
						//If there are no members (users) then skip to the next group
						if (attrs.get("member") == null){
							continue;
						}
					}
					
					keyMap = parseDistinguishedName(sr.getNameInNamespace());
					
					if (keyMap == null){
						continue;
					}
					
					domain = new StringBuilder();
					for (String value : keyMap.get(DC)) {
						
						if (domain.length() > 0)
						{
							domain.append('.');
						}
						domain.append(value);
					}
					
					groupName = keyMap.get(CN).poll();
					container = keyMap.get(CN).poll();
					
					if (container == null){
						container = "";
					}
									
					if (!(serverSettings.getLdapSettings().getIgnoreBuiltInGroups() && container.equals("Builtin"))){
					
						if (! securityGroups.containsKey(domain.toString())){
							groupNames = new TreeSet<String>();
							groupNames.add(groupName);
							securityGroups.put(domain.toString(), groupNames);
						}
						else{
							securityGroups.get(domain.toString()).add(groupName);
						}
					}
				}
				// examine the response controls
				cookie = parseControls(ctx.getResponseControls());
	 
		        // pass the cookie back to the server for the next page
				ctx.setRequestControls(new Control[]{new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });
	 
			} while ((cookie != null) && (cookie.length != 0));
		}
		catch (Exception e) {
//			log error
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
		
		return securityGroups;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#getUserNamesforSecurityGroups(javax.naming.ldap.LdapContext, java.util.Map, com.pace.base.server.ServerSettings)
	 */
	public TreeSet<PafSecurityDomainUserNames> getUserNamesforSecurityGroups(LdapContext ctx, ServerSettings serverSettings, Map<String, List<String>> paceGroups){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		TreeSet<PafSecurityDomainUserNames> securityDomain = new TreeSet<PafSecurityDomainUserNames>();
		NamingEnumeration<?> answer = null;
		NamingEnumeration<?> answer2 = null;
		
		try{		
			//Create the search controls 		
			SearchControls searchCtls = new SearchControls();
			String returnedAtts[]={"member"};
			searchCtls.setReturningAttributes(returnedAtts);
			
			//Specify the search scope
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			
			int pageSize = ldapSettings.getLdapPagesize();
			
			//get Domain attributes
			Attributes domainAttrs = null;
			try{
				domainAttrs = ctx.getAttributes(ldapSettings.getDomainController());
				
			}catch (NamingException nameEx) {
				//log error
				PafErrHandler.handleException(nameEx, PafErrSeverity.Error);
			}
								
			Long lockoutDuration = null;
			Long maxPwdAge = null;
			if (domainAttrs != null && domainAttrs.get("lockoutDuration") != null){
				lockoutDuration = Long.parseLong(domainAttrs.get("lockoutDuration").get().toString());
			}
			
			if (domainAttrs != null && domainAttrs.get("maxPwdAge") != null){
				maxPwdAge = Long.parseLong(domainAttrs.get("maxPwdAge").get().toString());
			}
			
//			Domain in domain.com format
			String domain;
//			Domain in DC=Domain, DC=com format
			String searchBase;
			String searchFilter;
			for (Map.Entry<String, List<String>> es : paceGroups.entrySet()){
				//specify the LDAP search filter
				StringBuffer groupString = new StringBuffer();
				for (String group : es.getValue()){
					groupString.append("(CN=" + group + ")");
				}
				
				searchFilter = "(&(objectCategory=group)(|" + groupString.toString() + "))";
				
				domain = es.getKey();
				searchBase = "";
				//Specify the Base for the search
				String[] keyValueEntrys = domain.split("\\.");
				for (String keyValueEntry : keyValueEntrys ) {
					if (searchBase.length() > 0){
						searchBase = searchBase + ",";
					}
					searchBase = searchBase + "dc=" + keyValueEntry;
				}
				 				
				//Search for objects using the filter
				answer = ctx.search(searchBase, searchFilter, searchCtls);
				
				PafSecurityDomainUserNames domainUserNames = new PafSecurityDomainUserNames();
				domainUserNames.setDomainName(domain.toString());
								
				//Loop through the search results
				String groupName = "";
				String userName = "";
				String groupDomain = "";
				Map<String, Queue<String>> keyMap;
				List<String> users;
				List<String> filteredUsers;
				List<String> filteredDisplaynames;
				List<PafUserNamesSecurityGroup> userNamesSecurityGroups = new ArrayList<PafUserNamesSecurityGroup>();
				while (answer.hasMoreElements()) {
					SearchResult sr = (SearchResult)answer.next();
					
					//Parse the DistinguishedName and extract the Group
					keyMap = parseDistinguishedName(sr.getNameInNamespace());
					
					if (keyMap == null){
						continue;
					}
					
					//Get Group Name
					groupName = keyMap.get(CN).poll();
					
					//Get Group Domain
     				groupDomain = "";
					for(String s : keyMap.get(DC)){
						if(groupDomain.length() > 0){
							groupDomain = groupDomain + ".";
						}
						groupDomain = groupDomain + s;
					}
					
					//In multi-domain forests with the same group name in multiple domains,
					//there are situations where a query for a local or a global group returns the wrong group.
					//This happens because the query returns the group belonging to the connected domain instead of the domain
					//being queried.  
					if(! domain.equalsIgnoreCase(groupDomain)){
						continue;
					}
					
					//Get the Group Attributes
					Attributes attrs = sr.getAttributes();
									
					if (attrs != null) {	
						
						//If there are no members (users) then skip to the next group
						if (attrs.get("member") == null){
							continue;
						}
						
						users = new ArrayList<String>();
						filteredUsers = new ArrayList<String>();
						filteredDisplaynames = new ArrayList<String>();
					
						//Get a list of users
						Attribute user = attrs.get("member");
						for (NamingEnumeration<?> e = user.getAll();e.hasMore();) {
							
						    //Parse the DistinguishedName and extract the User and Domain
							keyMap = parseDistinguishedName(e.next().toString());
							userName = keyMap.get(CN).poll();							
							users.add(userName);
						}
												
						// Create the search controls 		
						SearchControls searchCtls2 = new SearchControls();
						String returnedAtts2[]={"accountExpires","lockoutTime","pwdLastSet","pwdAge","userAccountControl","displayName"};
						searchCtls2.setReturningAttributes(returnedAtts2);
						
						//Specify the search scope
						searchCtls2.setSearchScope(SearchControls.SUBTREE_SCOPE);
																	
						//specify the LDAP search filter
					    searchFilter = "(&(objectCategory=user)(|";
					    
						for(String str:users){
							searchFilter += "(&(CN=" + str + "))";
						}
						searchFilter += "))";
																			
						//Request the paged results control
						Control[] ctls = new Control[]{new PagedResultsControl(pageSize)};
						ctx.setRequestControls(ctls);
						byte[] cookie = null;
						do {
							//Search for objects using the filter
							answer2 = ctx.search(searchBase, searchFilter, searchCtls2);
											
							//Loop through the search results
							while (answer2.hasMoreElements()) {
								boolean includeFlag = true;
																
								SearchResult sr2 = (SearchResult)answer2.next();
								
								Attributes attrs2 = sr2.getAttributes();
								
								includeFlag = AttributeFilter(serverSettings, attrs2, lockoutDuration, maxPwdAge, true);
																
								if (includeFlag == true){
									Map<String, Queue<String>> keyMap2 = parseDistinguishedName(sr2.getName());
									filteredUsers.add(keyMap2.get(CN).poll());
									if (attrs2.get("displayName") != null){
										filteredDisplaynames.add(attrs2.get("displayName").get().toString());
									}
									else{
										filteredDisplaynames.add("");
									}
								}
							}

							// examine the response controls
							cookie = parseControls(ctx.getResponseControls());

							// pass the cookie back to the server for the next page
							ctx.setRequestControls(new Control[]{new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });

						} while ((cookie != null) && (cookie.length != 0));

						if (filteredUsers.size() > 0){
							PafUserNamesSecurityGroup userNamesSecurityGroup = new PafUserNamesSecurityGroup();
							userNamesSecurityGroup.setGroupName(groupName);
							userNamesSecurityGroup.setUserNames(filteredUsers.toArray(new String[0]));
							userNamesSecurityGroup.setDisplayNames(filteredDisplaynames.toArray(new String[0]));
							userNamesSecurityGroups.add(userNamesSecurityGroup);
						}
					}
				}
				
				if(userNamesSecurityGroups.size() > 0){
					domainUserNames.setUserNamesSecurityGroup(userNamesSecurityGroups.toArray(new PafUserNamesSecurityGroup[0]));
					securityDomain.add(domainUserNames);
				}
			}
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
			
			try{
				if (answer2 != null){
					answer2.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
	
		return securityDomain;
	}
	
	/* (non-Javadoc)
	 * @see com.pace.base.server.iPafLDAPProvider#authenticateUserAccount(javax.naming.ldap.LdapContext, com.pace.base.server.ServerSettings, java.lang.String, java.lang.String)
	 */
	public PafUserDef authenticateUser (LdapContext ctx, ServerSettings serverSettings, String securityPrincipal, String sid){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		PafUserDef userDef = null;
		NamingEnumeration<?> answer = null;
	
		try{		
			//Create the search controls 		
			SearchControls searchCtls = new SearchControls();
			String returnedAtts[]={"accountExpires","lockoutTime","pwdLastSet","pwdAge","userAccountControl"};
			searchCtls.setReturningAttributes(returnedAtts);
			
			//Specify the search scope
			searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			
			//get Domain attributes
			Attributes domainAttrs = null;
			try{
				domainAttrs = ctx.getAttributes(ldapSettings.getDomainController());
			}catch (NamingException nameEx) {
				//log error
				PafErrHandler.handleException(nameEx, PafErrSeverity.Error);
			}
								
			Long lockoutDuration = null;
			if (domainAttrs != null && domainAttrs.get("lockoutDuration") != null){
				String str = domainAttrs.get("lockoutDuration").get().toString();
				lockoutDuration = Long.parseLong(domainAttrs.get("lockoutDuration").get().toString());
			}
		
			Long maxPwdAge = null;
			if (domainAttrs != null &&  domainAttrs.get("maxPwdAge") != null){
				maxPwdAge = Long.parseLong(domainAttrs.get("maxPwdAge").get().toString());
			}
								
			//specify the LDAP search filter
			String searchFilter;
			String userPrincipalName;
			//for single sign on the securityPrincipal must include a netbios name and a user name
			if (DomainNameParser.isValidDomainUserName(securityPrincipal.trim())){
				DomainNameParser dp = new DomainNameParser(securityPrincipal.trim());
				
				String domain;
				if (ldapSettings.getNetBiosNames().containsKey(dp.getDomainName().toLowerCase())){
					domain = ldapSettings.getNetBiosNames().get(dp.getDomainName().toLowerCase());
				}else{
					domain = dp.getDomainName();
				}
				userPrincipalName = dp.getUserName() + "@" + domain;
				searchFilter = "(&(objectCategory=user)(userPrincipalName=" + userPrincipalName + ")(objectSID=" + sid.trim() + "))";
			}else{
				return null;
			}
			 
			//Specify the Base for the search
			String searchBase = ldapSettings.getSearchBase();

			int counter = 0;
	
			//Search for objects using the filter
			answer = ctx.search(searchBase, searchFilter, searchCtls);
				
			boolean authenticated = false;
			//Loop through the search results
			while (answer.hasMoreElements()) {
				SearchResult sr = (SearchResult)answer.next();
				Attributes attrs = sr.getAttributes();
				
                //A user was found so the the flag is set to true unless the account is locked, disabled, etc
				authenticated = AttributeFilter(serverSettings, attrs, lockoutDuration, maxPwdAge, false);
				counter++;
			} 
			
			//If more than 1 user is then throw an error here
			if(counter > 1){
				logger.error("Duplicate user name.");
				return null;
			}
			
			if(authenticated == true){				
				userDef = this.getUser2(ctx, serverSettings, userPrincipalName);
			}
			
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
		
		return userDef;
	}
	
	public PafUserDef authenticateUser (ServerSettings serverSettings, String securityPrincipal, String password, String domain) throws PafNotAbletoGetLDAPContext{
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		PafUserDef userDef = null;
		
		String securityCredentials = password;
		
		//If securityPrincipal equals "" then an invalid context is created
		if(securityPrincipal.length() == 0){
			securityPrincipal = "1";
		}
		
		//If credentials equals "" then an anonymous connection takes place - creates a false authentication
		if(securityCredentials.length() == 0){
			securityCredentials = "1";
		}
		
		//Add the domain if needed
		String userPrincipalName = null;
		if (DomainNameParser.isValidDomainUserName(securityPrincipal.trim())){
			DomainNameParser dp = new DomainNameParser(securityPrincipal.trim());
			
			String domainName;
			if (ldapSettings.getNetBiosNames().containsKey(dp.getDomainName().toLowerCase())){
				domainName = ldapSettings.getNetBiosNames().get(dp.getDomainName().toLowerCase());
			}else{
				domainName = dp.getDomainName().toLowerCase();
			}
			userPrincipalName = dp.getUserName() + "@" + domainName;
		}
		else{
			userPrincipalName = securityPrincipal.trim() + "@" + domain.trim();
		}
		
		LdapContext uctx = null;
		try{
			uctx = this.getLdapContext(serverSettings, userPrincipalName, securityCredentials);
			if (uctx != null){
				//Get system context
				LdapContext ctx = null;
				try{
					ctx = this.getLdapContext(serverSettings);
					userDef = this.getUser2(ctx, serverSettings, userPrincipalName);
				} finally{
					this.closeLDAPContext(ctx);
				}
			}
		}finally{
			this.closeLDAPContext(uctx);
		}

		return userDef;
	}
	
	public Map<String, List<String>> validateUsers(LdapContext ctx, ServerSettings serverSettings, Map<String, List<String>> users){
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		NamingEnumeration<?> answer = null;
		
		try{
			//get Domain attributes
			Attributes domainAttrs = null;
			try{
				domainAttrs = ctx.getAttributes(ldapSettings.getDomainController());
			}catch (NamingException nameEx) {
				//log error
				PafErrHandler.handleException(nameEx, PafErrSeverity.Error);
			}
								
			Long lockoutDuration = null;
			if (domainAttrs != null && domainAttrs.get("lockoutDuration") != null){
				lockoutDuration = Long.parseLong(domainAttrs.get("lockoutDuration").get().toString());
			}
			
			Long maxPwdAge = null;
			if (domainAttrs != null &&  domainAttrs.get("maxPwdAge") != null){
				maxPwdAge = Long.parseLong(domainAttrs.get("maxPwdAge").get().toString());
			}
		
			for(String domain : users.keySet()){

				//Create the search controls 		
				SearchControls searchCtls = new SearchControls();
				String returnedAtts[]={"accountExpires","lockoutTime","pwdLastSet","pwdAge","userAccountControl"};
				searchCtls.setReturningAttributes(returnedAtts);

				//Specify the search scope
				searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
				
				String searchFilter = "(&(objectCategory=user)(|";
				//specify the LDAP search filter
				for(String user: users.get(domain)){
				    searchFilter += "(CN=" + user + ")";
				}
				searchFilter += "))";

				//Specify the Base for the search
				String searchBase = convertDomain(domain.trim());

				int pageSize = ldapSettings.getLdapPagesize();

				//Request the paged results control
				Control[] ctls = new Control[]{new PagedResultsControl(pageSize)};
				ctx.setRequestControls(ctls);
				byte[] cookie = null;

				do {
					//Search for objects using the filter
					answer = ctx.search(searchBase, searchFilter, searchCtls);

					while (answer.hasMoreElements()) {
						boolean includeFlag = true;
														
						SearchResult sr = (SearchResult)answer.next();
						
						Attributes attrs = sr.getAttributes();
						
						includeFlag = AttributeFilter(serverSettings, attrs, lockoutDuration, maxPwdAge, true);
														
						if (includeFlag == true){
							Map<String, Queue<String>> keyMap = parseDistinguishedName(sr.getName());
							
							if (keyMap == null){
								continue;
							}
							
							users.get(domain).remove(keyMap.get(CN).poll());
						}
					}
					
					// examine the response controls
					cookie = parseControls(ctx.getResponseControls());

					// pass the cookie back to the server for the next page
					ctx.setRequestControls(new Control[]{new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });

				} while ((cookie != null) && (cookie.length != 0));
			}
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		finally{
			try{
				if (answer != null){
					answer.close();
				}
			}catch(Exception e){
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
		
		return users;
	}
	
	static boolean AttributeFilter(ServerSettings serverSettings, Attributes attrs, Long lockoutDuration, Long maxPwdAge, boolean useldapSettings){
		
		PafLDAPSettings ldapSettings = serverSettings.getLdapSettings();
		
		boolean authenticationFlag = true;
		
		try{
     		//Get time since Win32 Epoch that is 1/1/1601 to 1/1/1970
			final long epochAdjustment = 11644473600000L;
			
//			GregorianCalendar Win32Epoch = new GregorianCalendar(1601,Calendar.JANUARY,1);
//          //Note that 1/1/1601 will be returned as a negative value by Java
//			Date Win32EpochDate = Win32Epoch.getTime();
			
			//Now get 1/1/1970 to today
			GregorianCalendar Today = new GregorianCalendar();
			Date TodaysDate = Today.getTime();
			//All comparisons with units from AD require the that the units be counted from 1/1/1601 and in 10,000 * millis
			long TimeSinceWin32Epoch = 10000 * (TodaysDate.getTime() + epochAdjustment); 
			
			logger.debug("TodaysDate:" + TodaysDate.getTime());
			logger.debug("EpochAdjustment:" + epochAdjustment);
			logger.debug("TimeSinceWin32Epoch:" + TimeSinceWin32Epoch);
			
			//Account expired
			if (useldapSettings == false || ldapSettings.getIgnoreExpiredAccounts() == false){
				
				if (attrs.get("accountExpires") != null){
					long accountExpires = Long.parseLong(attrs.get("accountExpires").get().toString());
					
                    //if accountExpires is set to "Never" then the value 9223372036854775807 will be returned.  This is the max value for a long.
					if(accountExpires == 9223372036854775807L){
						accountExpires = 0;
					}
					
					//Is the AD account expires time value less than the computed current time value
					if(accountExpires != 0 && accountExpires <= TimeSinceWin32Epoch){
						authenticationFlag = false;
					}
					
					logger.debug("accountExpires:" + accountExpires);
				}
			}
			
			if (authenticationFlag == true){
				//Locked Out
				//Watch out for lockoutDuration - if it is undefined in AD the previous value is still returned.  
				if (useldapSettings == false || ldapSettings.getIgnoreLockedOutAccounts() == false){
					if (attrs.get("lockoutTime") != null && ! attrs.get("lockoutTime").get().toString().equals("0")){

						long lockoutTime = Long.parseLong(attrs.get("lockoutTime").get().toString());

						if(lockoutDuration == null){
							lockoutDuration = 0L;
						}
						
						//if lockoutDuration is set to "0" then the value -9223372036854775808 will be returned.  This is the min value for a long.
						if(lockoutDuration == -9223372036854775808L){
							authenticationFlag = false;
						}
						//lockoutDuration is returned from AD as a negative number so the subtraction is really an addition
						//Is the locked out time plus the locked out duration greater than or equal to the current time
						else if(lockoutTime - lockoutDuration >= TimeSinceWin32Epoch){
							authenticationFlag = false;
						}

						logger.debug("lockoutTime:" + lockoutTime);
						logger.debug("lockoutDuration:" + lockoutDuration);
					}
				}
			}
			
			if (authenticationFlag == true){
				//Password expired
				//Watch out for maxPwdAge - if it is undefined in AD the previous value is still returned. 
				if (useldapSettings == false || ldapSettings.getIgnoreExpiredPWAccounts()  == false){
					if (attrs.get("userAccountControl") != null){
						long userAccountControl = Long.parseLong((String)attrs.get("userAccountControl").get());
						int UF_DONT_EXPIRE_PASSWD = 0x10000;
						//int UF_PASSWD_CANT_CHANGE = 0x0040;
						//int UF_PASSWD_NOTREQD = 0x0020;

						//Determine if the user account password is set to never expire or not
						if ((userAccountControl & UF_DONT_EXPIRE_PASSWD) != UF_DONT_EXPIRE_PASSWD) {
							if(attrs.get("pwdLastSet") != null){
								long pwdLastSet = Long.parseLong((String)attrs.get("pwdLastSet").get());

								//if maxPwdAge is set to "0" then the value 9223372036854775807 will be returned.  This is the max value for a long.
								//A "0" setting means the password never expires
								if(maxPwdAge != null && maxPwdAge != -9223372036854775808L){
									//maxPwdAge is returned from AD as a negative number so the subtraction is really an addition
									//Is the password last set time plus the max password age greater than or equal to the current time
									if (pwdLastSet - maxPwdAge <= TimeSinceWin32Epoch){
										authenticationFlag = false;
									}
								}

								logger.debug("userAccountControl:" + userAccountControl);
								logger.debug("pwdLastSet:" + pwdLastSet);
								logger.debug("maxPwdAge:" + maxPwdAge);
							}
						}
					}
				}
			}
			
			if (authenticationFlag == true){
				//Account disabled
				if (useldapSettings == false || ldapSettings.getIgnoreDisabledAccounts() == false){
					if (attrs.get("userAccountControl") != null ){
						int UF_ACCOUNTDISABLE = 0x0002;
						Long userAccountControl2 = null;
						userAccountControl2 = Long.parseLong((String)attrs.get("userAccountControl").get());

						if ((userAccountControl2 & UF_ACCOUNTDISABLE) == UF_ACCOUNTDISABLE) {
							authenticationFlag = false;
						}

						logger.debug("userAccountControl:" + userAccountControl2);
					}
				}
			}
		}
		catch (Exception e) {
			PafErrHandler.handleException(e, PafErrSeverity.Error);
		}
		
		return authenticationFlag;
	}
		
	static Map<String, Queue<String>> parseDistinguishedName(String str){
		Map<String, Queue<String>> keyMap = new HashMap<String, Queue<String>>();
		
		//How many equal signs are there?
		String[] equals = str.split("=");
		
		//We allow commas followed by a space in a user account name
		str = str.replace(", ", "//space");
		
//		How many commas are there?
		String[] keyValueEntrys = str.split(",");
		
		//Compare the number of "=" to the number of ",non-white space"
		if (equals.length != keyValueEntrys.length + 1){
			String errorMessage = "Invalid Active Directory Distinguished Name - " + str; 
			logger.error(errorMessage);
			
			return null;
		}
		
		for (String keyValueEntry : keyValueEntrys ) {
			String[] keyValue = keyValueEntry.split("=");
			String key = keyValue[0];
			key = key.replace("//space", ", ");
			String value = keyValue[1];
			value = value.replace("//space", ", ");
			
			Queue<String> valueSet;
			if (keyMap.containsKey(key)){
				valueSet = keyMap.get(key);
				valueSet.add(value);
			}
			else{
				valueSet = new LinkedList<String>();
				valueSet.add(value);
				keyMap.put(key, valueSet);
			}
		}
		
		return keyMap;
	}
		
	static byte[] parseControls(Control[] controls) throws NamingException {
		 
		byte[] cookie = null;
 
		if (controls != null) {
    		for (int i = 0; i < controls.length; i++) {
				if (controls[i] instanceof PagedResultsResponseControl) {
					PagedResultsResponseControl prrc = (PagedResultsResponseControl)controls[i];
					cookie = prrc.getCookie();
				}
    		}
		}
 
		return (cookie == null) ? new byte[0] : cookie;
    }
	
	
	static String convertDomain(String domain){
		String convertedDomain = "";
		String[] keyValueEntrys = domain.split("\\.");
		
		for (String keyValueEntry : keyValueEntrys ) {
			if (convertedDomain.length() > 0){
				convertedDomain = convertedDomain + ",";
			}
			convertedDomain = convertedDomain + "DC=" + keyValueEntry;
		}
		
		return convertedDomain;
	}
	

}
