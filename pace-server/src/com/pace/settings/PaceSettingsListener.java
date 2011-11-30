package com.pace.settings;

import com.pace.base.utility.PafXStream;
import com.pace.server.PafMetaData;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Window;

public class PaceSettingsListener {
	private Window mainWindow;
	private PaceSettingsApplication paceSettingsApplication;
	
	public PaceSettingsListener(PaceSettingsApplication paceSettingsApplication) {
		this.paceSettingsApplication = paceSettingsApplication;
		this.mainWindow = paceSettingsApplication.getMainWindow();
		
	}
	
	public void handleSave(Button.ClickEvent event) {
		PafXStream.exportObjectToXml(paceSettingsApplication.getServerSettings(), PafMetaData.getServerConfDirPath(), "_settings.xml");
		//PafMetaData.get
		mainWindow.showNotification("Settings Saved");
		
//		Window mywindow = new Window("Settings Saved");
//		mainWindow.addWindow(mywindow);
	}
	
	public void handleCancel(Button.ClickEvent event) {
		
		mainWindow.showNotification("Settings Reverted");
	}	




}
