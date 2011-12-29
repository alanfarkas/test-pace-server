/**
 * 
 */
package com.pace.settings.ui;

import java.util.List;

import com.pace.base.RunningState;
import com.pace.base.app.PafApplicationDef;
import com.pace.base.comm.ApplicationState;
import com.pace.server.PafAppService;
import com.pace.server.PafServerConstants;
import com.pace.settings.data.ApplicationInfo;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

/** 
 * Server info view.  Display information such as server version and list the apps.
 * 
 * @author JMilliron
 *
 */
public class ServerInfoView extends Panel implements ClickListener {

	private static final String _8EM = "8em";

	private static final long serialVersionUID = 1064648955340748472L;
			
	private Table appsTable = new Table();
	
	private BeanItemContainer<ApplicationInfo> containerDataSource = new BeanItemContainer<ApplicationInfo>(ApplicationInfo.class);
	
	private Button refreshAppsTableButton = new Button("Refresh", this);

	/**
	 * Constructor
	 */
	public ServerInfoView() {
		
		Label heading = new Label(SettingsTree.SERVER_INFO.toString());
		
		heading.setStyleName(Reindeer.LABEL_H2);
		
		addComponent(heading);

		VerticalLayout vl = new VerticalLayout();
		
		HorizontalLayout serverVersionHL = new HorizontalLayout();
		
		Label serverVersionLabel = new Label("<b>Server Version:</b>", Label.CONTENT_XHTML);
		
		serverVersionLabel.setWidth(_8EM);
		
		serverVersionHL.addComponent(serverVersionLabel);
		serverVersionHL.addComponent(new Label(PafServerConstants.SERVER_VERSION));		
		
		vl.addComponent(serverVersionHL);
		
		vl.addComponent(new Label(""));
			
		HorizontalLayout applicationsHL = new HorizontalLayout();
		
		Label applicationsLabel = new Label("<b>Applications:</b>", Label.CONTENT_XHTML);
		
		applicationsLabel.setWidth(_8EM);
		
		applicationsHL.addComponent(applicationsLabel);
		
		appsTable.setContainerDataSource(containerDataSource);
		
		appsTable.setNewItemsAllowed(false);
		
		appsTable.setPageLength(containerDataSource.size());
		
		appsTable.setVisibleColumns(new Object[] { "appId", "datasourceId", "appState" });
		appsTable.setColumnHeaders(new String[] {"Application Id", "Datasource Id", "Application State" });
	
		//refreshServerInfo();
		
		VerticalLayout applicationsVL = new VerticalLayout();
		
		applicationsVL.addComponent(appsTable);
		//applicationsHL.setSpacing(true);
		
		applicationsVL.addComponent(refreshAppsTableButton);
		
		applicationsVL.setSpacing(true);
		
		applicationsHL.addComponent(applicationsVL);
		
		vl.addComponent(applicationsHL);
		
		vl.setSizeFull();
		vl.setSpacing(true);
		vl.setMargin(true);
		
		addComponent(vl);
								
		setSizeFull();
						
		refreshServerInfo();
		
	}
	
	public void refreshServerInfo() {

		containerDataSource.removeAllItems();
		
		List<PafApplicationDef> applicationList = PafAppService.getInstance().getApplications();
		
		if ( applicationList != null ) {
		
			for ( PafApplicationDef app : applicationList ) {
				
				ApplicationState appState = PafAppService.getInstance().getApplicationState(app.getAppId());
												
				RunningState currentState = RunningState.STOPPED;
				
				if ( appState != null ) {
					
					currentState = appState.getCurrentRunState();
					
				}
								
				
				ApplicationInfo appInfo = new ApplicationInfo(app.getAppId(), app.getMdbDef().getDataSourceId(), currentState);
				
				containerDataSource.addBean(appInfo);
				
			}
			
		}	
		
		appsTable.setPageLength(containerDataSource.size());
		
	}

	@Override
	public void buttonClick(ClickEvent event) {

		if ( event.getButton() == refreshAppsTableButton ) {
			refreshServerInfo();
		}
		
	}
	
}
