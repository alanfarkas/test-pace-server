package com.pace.settings;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Window;

public class PaceSettingsListener {
	private Window mainWindow;
	
	public PaceSettingsListener(Window mainWindow) {
		this.mainWindow = mainWindow;
		
	}
	
	public void handleSave(Button.ClickEvent event) {
		mainWindow.showNotification("Settings Saved");
		
//		Window mywindow = new Window("Settings Saved");
//		mainWindow.addWindow(mywindow);
	}
	
	public void handleCancel(Button.ClickEvent event) {
		
		mainWindow.showNotification("Settings Reverted");
	}	




}
