/**
 * 
 */
package com.pace.settings.ui;

import com.vaadin.data.Item;
import com.vaadin.data.validator.IntegerValidator;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

/**
 * 
 * LDAP Settings Field Factory
 * 
 * @author JMilliron
 * 
 */
public class LDAPSettingsFieldFactory extends PaceSettingsDefaultFieldFactory {

	private static final long serialVersionUID = -33689708703686950L;

	public static final String LDAP_PROFIDER_NAME = "ldapProviderName";
	public static final String SECURITY_PRINCIPAL = "securityPrincipal";
	public static final String SECURITY_CREDENTIALS = "securityCredentials";
	public static final String PROVIDER_URL_GC = "providerURLGC";
	public static final String SECURITY_AUTHENTICATION = "securityAuthentication";
	public static final String SECURITY_PROTOCOL = "securityProtocol";
	public static final String SEARCH_BASE = "searchBase";
	public static final String DOMAIN_CONTROLLER = "domainController";
	public static final String LDAP_PAGE_SIZE = "ldapPagesize";
	public static final String IGNORE_BUILT_IN_GROUPS = "ignoreBuiltInGroups";
	public static final String IGNORE_EXPIRED_ACCOUNTS = "ignoreExpiredAccounts";
	public static final String IGNORE_LOCKED_OUT_ACCOUNTS = "ignoreLockedOutAccounts";
	public static final String IGNORE_EXPIRED_PW_ACCOUNTS = "ignoreExpiredPWAccounts";
	public static final String IGNORE_DISABLED_ACCOUNTS = "ignoreDisabledAccounts";
	public static final String KERBEROS_REALM = "kerberosRealm";
	public static final String KERBEROS_KDC = "kerberosKDC";
	public static final String KERBEROS_LOGIN_CONF = "kerberosLoginConf";
	public static final String SSL_KEY_STORE = "sslKeyStore";
	public static final String CONNECT_TIMEOUT = "connectTimeout";
	public static final String NET_BIOS_NAMES_LIST = "netBiosNamesList";
	
	private KeyValueTable netBiosNameTable = new KeyValueTable("Net Bios Key", "Net Bios Value");

	public LDAPSettingsFieldFactory() {

		formOrderList.add(LDAP_PROFIDER_NAME);
		formOrderList.add(SECURITY_PRINCIPAL);
		formOrderList.add(SECURITY_CREDENTIALS);
		formOrderList.add(PROVIDER_URL_GC);
		formOrderList.add(SECURITY_AUTHENTICATION);
		formOrderList.add(SECURITY_PROTOCOL);
		formOrderList.add(SEARCH_BASE);
		formOrderList.add(DOMAIN_CONTROLLER);
		formOrderList.add(LDAP_PAGE_SIZE);
		formOrderList.add(KERBEROS_REALM);
		formOrderList.add(KERBEROS_KDC);
		formOrderList.add(KERBEROS_LOGIN_CONF);
		formOrderList.add(SSL_KEY_STORE);
		formOrderList.add(CONNECT_TIMEOUT);
		formOrderList.add(IGNORE_BUILT_IN_GROUPS);
		formOrderList.add(IGNORE_EXPIRED_ACCOUNTS);
		formOrderList.add(IGNORE_LOCKED_OUT_ACCOUNTS);
		formOrderList.add(IGNORE_EXPIRED_PW_ACCOUNTS);
		formOrderList.add(IGNORE_DISABLED_ACCOUNTS);
		formOrderList.add(NET_BIOS_NAMES_LIST);
		
		captionMap.put(PROVIDER_URL_GC, "Provider URL GC");
		captionMap.put(KERBEROS_KDC, "Kerberos KDC");
		captionMap.put(SSL_KEY_STORE, "SSL Key Store");
		captionMap.put(NET_BIOS_NAMES_LIST, "Net Bios Names");
		
		
		requiredFieldSet.add(LDAP_PROFIDER_NAME);
		requiredFieldSet.add(SECURITY_PRINCIPAL);
		requiredFieldSet.add(PROVIDER_URL_GC);
		requiredFieldSet.add(SECURITY_AUTHENTICATION);
		requiredFieldSet.add(SECURITY_PROTOCOL);
		requiredFieldSet.add(DOMAIN_CONTROLLER);
		requiredFieldSet.add(LDAP_PAGE_SIZE);
		requiredFieldSet.add(SSL_KEY_STORE);
		requiredFieldSet.add(CONNECT_TIMEOUT);

	}

	@Override
	public Field createField(Item item, Object propertyId, Component uiContext) {
		
		Field field = super.createField(item, propertyId, uiContext);
		
		if (propertyId.equals(LDAP_PAGE_SIZE) || propertyId.equals(CONNECT_TIMEOUT)) {

			TextField tf = (TextField) field;
			
			tf.addValidator(new IntegerValidator(tf.getCaption() + " must be a whole number."));
			
		} else if ( propertyId.equals(NET_BIOS_NAMES_LIST)) {
									
			netBiosNameTable.setCaption(captionMap.get(NET_BIOS_NAMES_LIST));
			
			return netBiosNameTable;
			
		}
		
		return field;
	}
	
}
