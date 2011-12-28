package com.pace.server;

import java.io.File;

import javax.naming.ldap.LdapContext;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pace.base.PafBaseConstants;
import com.pace.base.server.ServerSettings;

public class ActiveDirectoryProviderUTest extends TestCase {
	
	private static ApplicationContext appContext = null;
	private static Logger logger = Logger.getLogger(ActiveDirectoryProviderUTest.class);
	
	public void testLdapContext()	{
		
		//String serverfileloc = "C:\\program files\\pace\\pafserver\\conf_server\\";		
		String serverfileloc = System.getenv("PaceHome") + File.separator + PafBaseConstants.DN_ConfServerFldr + File.separator;
		
		try{
			appContext = new FileSystemXmlApplicationContext(serverfileloc + PafBaseConstants.FN_ServerSettings);
			ServerSettings serverSettings = (ServerSettings) appContext.getBean("appServerSettings");
			
			IPafLDAPProvider adp = new ActiveDirectoryProvider();
			
			LdapContext ctx = adp.getLdapContext(serverSettings);
			
			//***Get Security Groups***
//			Map<String, TreeSet<String>> groups = adp.getSecurityGroups(ctx, serverSettings);
//			for (Map.Entry<String, TreeSet<String>> group : groups.entrySet()){
//				System.out.println(group.getKey() + ": ");
//				for (String groupName : group.getValue()){
//					System.out.println(groupName);
//				}
//			}

			//***Get Domains/Groups/Users***
//			Map<String,List<String>> paceGroups = new HashMap<String,List<String>>();
//			List<String> paceGroup = new ArrayList<String>();
//			paceGroup.add("Pace Users");
//			paceGroup.add("ADG Users");
//			paceGroup.add("Domain Users");
//			paceGroup.add("Fake Users2");
//			paceGroups.put("ADG.com", paceGroup);
////			paceGroup.add("Fake Users2");
////			paceGroups.put("Fake.com", paceGroup);
//
//			TreeSet<PafSecurityDomainUserNames> userGroups = adp.getUserNamesforSecurityGroups(ctx,serverSettings, paceGroups);
//			
//			for (PafSecurityDomainUserNames domainUserNames : userGroups){
//				System.out.println(domainUserNames.getDomainName() + ": ");
//				
//				for (PafUserNamesSecurityGroup userNamesSecurityGroup : domainUserNames.getUserNamesSecurityGroup()){
//					System.out.println(userNamesSecurityGroup.getGroupName());
//					//System.out.println(users.);
//					for (String user : userNamesSecurityGroup.getUserNames()){
//						System.out.println(user);
//					}
//				}
//			}
			
			//***Get User***
//			PafUserDef userDef = adp.getUser(ctx, serverSettings, "Paul Mack", "ADG.com");
//			System.out.println(userDef.getUserName());
//			System.out.println(userDef.getFirstName());
//			System.out.println(userDef.getLastName());
//			System.out.println(userDef.getEmail());
			
			//***Authenticate***
//			System.out.println(adp.authenticateUser(ctx, serverSettings, "Paul Mack", "ADG.com"));
			
			adp.closeLDAPContext(ctx);
			assertTrue(true);
		}
		catch (Exception e) {
			logger.error(e.toString());
		}
	}

}
