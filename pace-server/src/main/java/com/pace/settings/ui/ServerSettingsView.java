/**
 * 
 */
package com.pace.settings.ui;

import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.Reindeer;

/**
 * Server Settings View. Used to hold label and form. 
 * 
 * @author JMilliron
 *
 */
public class ServerSettingsView extends Panel {

	private static final long serialVersionUID = 4697527910145885915L;

	/**
	 * Constructor
	 * 
	 * @param form form to use in view.
	 */
	public ServerSettingsView(ServerSettingsForm form) {
		
		Label heading = new Label(SettingsTree.SERVER_SETTINGS.toString());
		
		heading.setStyleName(Reindeer.LABEL_H2);
		
		addComponent(heading);
		
		addComponent(form);
		
		setSizeFull();
		
	}
	
}
