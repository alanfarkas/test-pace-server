package com.pace.base.server;

import org.apache.log4j.Logger;

import java.util.*;

import com.pace.base.PafBaseConstants;
import com.pace.base.misc.KeyValue;

/**
 * LDAP Settings
 * 
 * @author PMack
 *
 */
public class PafLDAPSettings {
	
	private String ldapProviderName = "";
	private String securityPrincipal = "1";
	private String securityCredentials = "1";
	private String providerURLGC = "";
	private String securityAuthentication = "";
	private String securityProtocol = "simple";
	private String searchBase = "none";
	private String domainController = "";
	private Integer ldapPagesize = 1000;
	private Boolean ignoreBuiltInGroups = false;
	private Boolean ignoreExpiredAccounts = false;
	private Boolean ignoreLockedOutAccounts = false;
	private Boolean ignoreExpiredPWAccounts = false;
	private Boolean ignoreDisabledAccounts = false;
	private String kerberosRealm = "";
	private String kerberosKDC = "";
	private String kerberosLoginConf = "";
	private String sslKeyStore = "";
	private Map<String, String> netBiosNames = new HashMap<String, String>();
	private List<KeyValue> netBiosNamesList = new ArrayList<KeyValue>();
	private String connectTimeout = PafBaseConstants.DEFAULT_SERVER_URL_TIMEOUT_IN_MILLISECONDS;
	
	private static Logger logger = Logger.getLogger(PafLDAPSettings.class);
	
	public Boolean getIgnoreBuiltInGroups() {
		return ignoreBuiltInGroups;
	}
	public void setIgnoreBuiltInGroups(Boolean ignoreBuiltInGroups) {
		this.ignoreBuiltInGroups = ignoreBuiltInGroups;
	}
	public Boolean getIgnoreDisabledAccounts() {
		return ignoreDisabledAccounts;
	}
	public void setIgnoreDisabledAccounts(Boolean ignoreDisabledAccounts) {
		this.ignoreDisabledAccounts = ignoreDisabledAccounts;
	}
	public Boolean getIgnoreExpiredAccounts() {
		return ignoreExpiredAccounts;
	}
	public void setIgnoreExpiredAccounts(Boolean ignoreExpiredAccounts) {
		this.ignoreExpiredAccounts = ignoreExpiredAccounts;
	}
	public Boolean getIgnoreExpiredPWAccounts() {
		return ignoreExpiredPWAccounts;
	}
	public void setIgnoreExpiredPWAccounts(Boolean ignoreExpiredPWAccounts) {
		this.ignoreExpiredPWAccounts = ignoreExpiredPWAccounts;
	}
	public Boolean getIgnoreLockedOutAccounts() {
		return ignoreLockedOutAccounts;
	}
	public void setIgnoreLockedOutAccounts(Boolean ignoreLockedOutAccounts) {
		this.ignoreLockedOutAccounts = ignoreLockedOutAccounts;
	}
	public String getKerberosKDC() {
		return kerberosKDC;
	}
	public void setKerberosKDC(String kerberosKDC) {
		this.kerberosKDC = kerberosKDC;
	}
	public String getKerberosLoginConf() {
		return kerberosLoginConf;
	}
	public void setKerberosLoginConf(String kerberosLoginConf) {
		this.kerberosLoginConf = kerberosLoginConf;
	}
	public String getKerberosRealm() {
		return kerberosRealm;
	}
	public void setKerberosRealm(String kerberosRealm) {
		this.kerberosRealm = kerberosRealm;
	}
	public Integer getLdapPagesize() {
		return ldapPagesize;
	}
	//minimum ldapPagesize is 10
	public void setLdapPagesize(Integer ldapPagesize) {
		if (ldapPagesize < 10){
			ldapPagesize = 10;
		}
		this.ldapPagesize = ldapPagesize;
	}
	public String getLdapProviderName() {
		return ldapProviderName;
	}
	public void setLdapProviderName(String ldapProviderName) {
		this.ldapProviderName = ldapProviderName;
	}
	public String getProviderURLGC() {
		return providerURLGC;
	}
	public void setProviderURLGC(String providerURLGC) {
		this.providerURLGC = providerURLGC;
	}
	public String getSecurityAuthentication() {
		return securityAuthentication;
	}
	public void setSecurityAuthentication(String securityAuthentication) {
		this.securityAuthentication = securityAuthentication;
	}
	public String getSecurityCredentials() {
		return securityCredentials;
	}
	public void setSecurityCredentials(String securityCredentials) {
		this.securityCredentials = securityCredentials;
	}
	public String getSecurityPrincipal() {
		return securityPrincipal;
	}
	public void setSecurityPrincipal(String securityPrincipal) {
		this.securityPrincipal = securityPrincipal;
	}
	public String getSecurityProtocol() {
		return securityProtocol;
	}
	public void setSecurityProtocol(String securityProtocol) {
		this.securityProtocol = securityProtocol;
	}
	public String getSslKeyStore() {
		return sslKeyStore;
	}
	public void setSslKeyStore(String sslKeyStore) {
		this.sslKeyStore = sslKeyStore;
	}
	public String getSearchBase() {
		return searchBase;
	}
	public void setSearchBase(String searchBase) {
		this.searchBase = searchBase;
	}
	public String getDomainController() {
		return domainController;
	}
	public void setDomainController(String domainController) {
		this.domainController = domainController;
	}
	public void setNetBiosNames(Map<String, String> netBiosNames) {
		this.netBiosNames = netBiosNames;
	}
	public Map<String, String> getNetBiosNames() {
		return netBiosNames;
	}
	public void setConnectTimeout(String connectTimeout) {
		
		//Use the default value if the value in the server config isn't numeric or less than zero
		try{
			if (Integer.valueOf(connectTimeout) > 0 ) {
				this.connectTimeout = connectTimeout;
			}
			else{
				logger.error("The LDAP connect timeout value in the serverConfig is invalid.");
			}
		}
		catch (NumberFormatException nfe){
			logger.error("The LDAP connect timeout value in the serverConfig is invalid.");
		}
		
		return;
	}
	public String getConnectTimeout() {
		return connectTimeout;
	}
	/**
	 * @return the netBiosNamesList
	 */
	public List<KeyValue> getNetBiosNamesList() {
		return netBiosNamesList;
	}
	/**
	 * @param netBiosNamesList the netBiosNamesList to set
	 */
	public void setNetBiosNamesList(List<KeyValue> netBiosNamesList) {
		this.netBiosNamesList = netBiosNamesList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PafLDAPSettings [ldapProviderName=" + ldapProviderName
				+ ", securityPrincipal=" + securityPrincipal
				+ ", securityCredentials=" + securityCredentials
				+ ", providerURLGC=" + providerURLGC
				+ ", securityAuthentication=" + securityAuthentication
				+ ", securityProtocol=" + securityProtocol + ", searchBase="
				+ searchBase + ", domainController=" + domainController
				+ ", ldapPagesize=" + ldapPagesize + ", ignoreBuiltInGroups="
				+ ignoreBuiltInGroups + ", ignoreExpiredAccounts="
				+ ignoreExpiredAccounts + ", ignoreLockedOutAccounts="
				+ ignoreLockedOutAccounts + ", ignoreExpiredPWAccounts="
				+ ignoreExpiredPWAccounts + ", ignoreDisabledAccounts="
				+ ignoreDisabledAccounts + ", kerberosRealm=" + kerberosRealm
				+ ", kerberosKDC=" + kerberosKDC + ", kerberosLoginConf="
				+ kerberosLoginConf + ", sslKeyStore=" + sslKeyStore
				+ ", netBiosNames=" + netBiosNames + ", netBiosNamesList="
				+ netBiosNamesList + ", connectTimeout=" + connectTimeout + "]";
	}

	
}
