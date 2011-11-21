package com.pace.settings;

import com.pace.server.PafMetaData;
import com.pace.server.ServerSettings;
import com.vaadin.Application;
import com.vaadin.ui.*;

public class PaceSettingsApplication extends Application {
	private GridLayout gridLayout_1;

	private Table tblDetail;

	private Tree treeRdbs;
	
	private Tree treeMdbs;
	
	private Table tblSettings;
	
	
	
	@Override
	public void init() {
		Window mainWindow = new Window("Pace Application Settings");
	
		mainWindow.addComponent(layoutGrid());
 
		setMainWindow(mainWindow);

	}
	
	private GridLayout layoutGrid() {
		
					

			// common part: create layout
			gridLayout_1 = new GridLayout();
			gridLayout_1.setImmediate(false);
			gridLayout_1.setWidth("100.0%");
			gridLayout_1.setHeight("100.0%");
			gridLayout_1.setMargin(false);
			gridLayout_1.setColumns(2);
			gridLayout_1.setRows(4);

			
			// Panels for Settings
			Panel pnlSettings = new Panel("Application Settings");
			pnlSettings.setHeight("100.0%");
			pnlSettings.setWidth("90.0%");			


			
			
			// tblSettings
			tblSettings = loadTableSettings();
			tblSettings.setImmediate(false);
			tblSettings.setWidth("100.0%");
			tblSettings.setHeight("-1px");
			pnlSettings.addComponent(tblSettings);
			gridLayout_1.addComponent(pnlSettings, 0, 1, 0, 2);
			
			// treeMdbs
			treeMdbs = new Tree();
			treeMdbs.setImmediate(false);
			treeMdbs.setWidth("-1px");
			treeMdbs.setHeight("100.0%");
			treeMdbs.addItem("Titan");
			treeMdbs.getItem("Titan");
			VerticalLayout vlMdbs = new VerticalLayout();
			vlMdbs.setHeight("150px");
			vlMdbs.addComponent(treeMdbs);
			
			TabSheet tabDataSources = new TabSheet();
			tabDataSources.addTab(vlMdbs);
			tabDataSources.getTab(vlMdbs).setCaption("Multidimensional Connections");
			

			
			// treeRdbs
			treeRdbs = new Tree();
			treeRdbs.setImmediate(false);
			treeRdbs.setWidth("-1px");
			treeRdbs.setHeight("100.0%");
			treeRdbs.addItem("Cacheing Database");

			VerticalLayout vlRdbs = new VerticalLayout();
			vlRdbs.setHeight("150px");
			vlRdbs.addComponent(treeRdbs);
			
			vlRdbs.addComponent(treeRdbs);
			tabDataSources.addTab(vlRdbs);
			tabDataSources.getTab(vlRdbs).setCaption("Relatonal Connections");

			
			
			// table_1
			tblDetail = new Table();
			tblDetail.setImmediate(false);
			tblDetail.setWidth("90%");
			tblDetail.setHeight("-1px");
			gridLayout_1.addComponent(tblDetail, 1, 2);

			gridLayout_1.addComponent(tabDataSources, 1, 1);			
			
			Button btnSave = new Button("Save");
			Button btnCancel = new Button("Cancel");
			
			HorizontalLayout hl = new HorizontalLayout();
			hl.addComponent(btnSave);
			hl.addComponent(btnCancel);
			
			gridLayout_1.addComponent(hl, 0, 3, 1, 3);
		
			
			return gridLayout_1;
				
	}

	private Table loadTableSettings() {
		// TODO Auto-generated method stub
		Table table = new Table();
		table.setEditable(true);
		PafMetaData.updateApplicationConfig();
		ServerSettings ss = PafMetaData.getServerSettings();
		int i=1;
		
		table.addContainerProperty("Setting", String.class,  null);
		table.addContainerProperty("Value",  String.class,  null);
		
		table.addItem(new Object[] {
				"Authorizaion Mode", ss.getAuthMode()		}, i++ );
		table.addItem(new Object[] {
				"Calcscript Timout", ss.getCalcScriptTimeout()		}, i++ );
		table.addItem(new Object[] {
				"Minimum Client Version", ss.getClientMinVersion()		}, i++ );
		table.addItem(new Object[] {
				"Client Update URL", ss.getClientUpdateUrl()		}, i++ );
		
		
		
		return table;
	}


}
