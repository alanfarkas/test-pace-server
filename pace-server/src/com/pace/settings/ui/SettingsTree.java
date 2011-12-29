/**
 * 
 */
package com.pace.settings.ui;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Tree;

/**
 * @author JMilliron
 * 
 */
public class SettingsTree extends Tree {

	public static final Object SERVER_INFO = "Server Information";
	public static final Object SERVER_SETTINGS = "Server Settings";
	public static final Object LDAP_SETTINGS = "LDAP Settings";
	public static final Object RELATIONAL_DATABASE_DATASOURCES = "Relational DB Datasources";
	public static final Object MULTIDIMENSIONAL_DATABASE_DATASOURCES = "Multidimensional DB Datasources";

	public SettingsTree(PaceSettingsApplication app) {

		super("Pace Settings");
		
		//setItemCaptionPropertyId("Pace Settings");
		
		setImmediate(true);
		/*Item parent = addItem("Pace Settings");
		
		setChildrenAllowed(parent, true);*/
		
		addItem(SERVER_INFO);
		addItem(SERVER_SETTINGS);
		addItem(LDAP_SETTINGS);
		addItem(RELATIONAL_DATABASE_DATASOURCES);
		addItem(MULTIDIMENSIONAL_DATABASE_DATASOURCES);

		setSelectable(true);
		setNullSelectionAllowed(false);

		addListener((ItemClickListener) app);

	}
	
}
