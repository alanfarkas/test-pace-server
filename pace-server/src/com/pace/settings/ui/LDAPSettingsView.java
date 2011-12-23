/**
 * 
 */
package com.pace.settings.ui;

import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.Reindeer;

/**
 * LDAP Settings View. Used to hold label and form. 
 * 
 * @author JMilliron
 *
 */
public class LDAPSettingsView extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6009807502444532956L;

	/**
	 * Constructor
	 * 
	 * @param form form to use in view.
	 */
	public LDAPSettingsView(LDAPSettingsForm form) {
		
		Label heading = new Label(SettingsTree.LDAP_SETTINGS + " - please refer to the LDAP Integration Overview document");
		
		heading.setStyleName(Reindeer.LABEL_H2);
		
		addComponent(heading);
		
		addComponent(form);
		
		setHeight("100%");
		
	}
	
}
