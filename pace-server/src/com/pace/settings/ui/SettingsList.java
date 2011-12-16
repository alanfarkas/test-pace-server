/**
 * 
 */
package com.pace.settings.ui;

import java.util.Arrays;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.ui.ListSelect;

/**
 * @author JMilliron
 *
 */
public class SettingsList extends ListSelect {
	
	public static final String SERVER_SETTINGS = "Server Settings";
	public static final String LDAP_SETTINGS = "LDAP Settings";
	public static final String RELATIONAL_SETTINGS = "Relational Database Settings";
	public static final String MULTIDIMENSIONAL_DATABASE_SETTINGS = "Multidimensional Database Settings";
	
	public SettingsList(PaceSettingsApplication app) {
		
		super("Pace Settings", Arrays.asList(SERVER_SETTINGS));
		
		setWidth("100%");
		
		
		
		/*addItem(SERVER_SETTINGS);
		addItem(LDAP_SETTINGS);
		addItem(RELATIONAL_SETTINGS);
		addItem(MULTIDIMENSIONAL_DATABASE_SETTINGS);*/
		
		
	}

}
