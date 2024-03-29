package com.pace.settings;

import com.pace.base.InvalidPasswordException;
import com.pace.base.InvalidUserNameException;
import com.pace.base.PafErrHandler;
import com.pace.base.PafException;
import com.pace.base.app.PafUserDef;
import com.pace.server.PafSecurityService;
import com.pace.settings.data.MDBDatasourceContainer;
import com.pace.settings.data.RDBDatasourceContainer;
import com.pace.settings.ui.LDAPSettingsForm;
import com.pace.settings.ui.LDAPSettingsView;
import com.pace.settings.ui.LoginView;
import com.pace.settings.ui.MDBDatasourceFieldFactory;
import com.pace.settings.ui.MDBDatasourceForm;
import com.pace.settings.ui.MDBDatasourceTable;
import com.pace.settings.ui.MDBDatasourcesView;
import com.pace.settings.ui.RDBDatasourceFieldFactory;
import com.pace.settings.ui.RDBDatasourceForm;
import com.pace.settings.ui.RDBDatasourceTable;
import com.pace.settings.ui.RDBDatasourcesView;
import com.pace.settings.ui.ServerInfoView;
import com.pace.settings.ui.ServerSettingsForm;
import com.pace.settings.ui.ServerSettingsView;
import com.pace.settings.ui.SettingsTree;
import com.vaadin.Application;
import com.vaadin.data.Item;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.BaseTheme;
import com.vaadin.ui.themes.Reindeer;

/**
 * Pace Settings Application.  The Pace Settings Application class holds the main components for logging in,
 * viewing and modifying server settings.
 * 
 * @author JMilliron
 *
 */
public class PaceSettingsApplication extends Application implements
		ItemClickListener, Button.ClickListener {

	private static final long serialVersionUID = -3106115489087842180L;

	protected static final String TREE_NODE_WITHOUT_CHILDREN_STYLE = "no-children";
	
	private Label headingLabel = new Label();

	private HorizontalSplitPanel horizontalSplit = new HorizontalSplitPanel();

	private SettingsTree tree = new SettingsTree(this);
	
	

	private ServerInfoView serverInfoView;
	
	private ServerSettingsView serverSettingsView;
	
	private LDAPSettingsView ldapSettingsView;
	
	private ServerSettingsForm serverSettingsForm = null;
	
	private LDAPSettingsForm ldapSettingsForm = null;
	
	private MDBDatasourcesView mdbDatasourcesView;
	
	private MDBDatasourceForm mdbDatasourceForm = null;
	
	private MDBDatasourceTable mdbDatasourceTable = null;
	
	private MDBDatasourceContainer mdbDatasourceContainer = new MDBDatasourceContainer();
	
	private MDBDatasourceFieldFactory mdbDatasourceFieldFactory = new MDBDatasourceFieldFactory();
	
	private RDBDatasourcesView rdbDatasourcesView;
	
	private RDBDatasourceForm rdbDatasourceForm = null;
	
	private RDBDatasourceTable rdbDatasourceTable = null;
	
	private RDBDatasourceContainer rdbDatasourceContainer = new RDBDatasourceContainer();
	
	private RDBDatasourceFieldFactory rdbDatasourceFieldFactory = new RDBDatasourceFieldFactory();
	
	private LoginView loginView = null;
	
	private PafUserDef pafUserDef = null;
	
	private Button logoutButton = new Button(PaceSettingsConstants.LOGOUT_BUTTON_LABEL, this);

	@Override
	public void init() {

		setMainWindow(new Window(PaceSettingsConstants.PACE_APP_HEADING+" ( "+this.getURL().getHost()+":"+this.getURL().getPort()+" )"));

		VerticalLayout vl = new VerticalLayout();
		vl.setSizeFull();

		// remove arrow if tree itme doesn't have children
		Tree.ItemStyleGenerator itemStyleGenerator = new Tree.ItemStyleGenerator() {

			private static final long serialVersionUID = -1268456420627465539L;

			public String getStyle(Object itemId) {

				if (tree.getChildren(itemId) == null
						|| tree.getChildren(itemId).size() == 0) {
					return TREE_NODE_WITHOUT_CHILDREN_STYLE;
				} else {
					return null;
				}

			}
		};

		tree.setItemStyleGenerator(itemStyleGenerator);

		horizontalSplit.setFirstComponent(tree);
		
		headingLabel.setCaption(PaceSettingsConstants.PACE_APP_HEADING+" ( "+this.getURL().getHost()+":"+this.getURL().getPort()+" )");

		vl.addComponent(createToolbar());
		vl.addComponent(horizontalSplit);

		vl.setExpandRatio(horizontalSplit, 1);
		horizontalSplit.setSplitPosition(250, HorizontalSplitPanel.UNITS_PIXELS);

		setTheme("pace");

		getMainWindow().setContent(vl);

		/*tree.select(SettingsTree.SERVER_INFO);

		showServerInfoView();*/
		
		showLoginView();
		
		System.out.println("*************"+tree.getApplication().getURL());
	}

	public HorizontalLayout createToolbar() {

		HorizontalLayout lo = new HorizontalLayout();

		headingLabel.setStyleName(Reindeer.LABEL_H1);

		lo.addComponent(headingLabel);
		//lo.addComponent(headingLabel);
		//lo.addComponent(headingLabel);
		
		logoutButton.setStyleName(BaseTheme.BUTTON_LINK);		
		
		lo.addComponent(logoutButton);
		lo.setExpandRatio(headingLabel, 95);
		lo.setExpandRatio(logoutButton, 5);
		lo.setComponentAlignment(logoutButton, Alignment.BOTTOM_RIGHT);
						
		logoutButton.setVisible(false);
		
		lo.setWidth("100%");
		lo.setMargin(true);
		lo.setSpacing(true);

		return lo;
	}

	private void setPropertiesView(Component c) {
		
		if ( c != getLoginView() && pafUserDef == null ) {
			
			showLoginView();
			
		} else {
		
			horizontalSplit.setSecondComponent(c);
			
		}
		
		
	}

	@Override
	public void itemClick(ItemClickEvent event) {

		if (event.getSource() == tree) {

			Object itemId = event.getItemId();
			
			if (itemId != null) {
				
				if (SettingsTree.SERVER_INFO.equals(itemId)) {

					showServerInfoView();
				
				} else if (SettingsTree.SERVER_SETTINGS.equals(itemId)) {

					showServerSettingsView();
					
				} else if ( SettingsTree.LDAP_SETTINGS.equals(itemId)) {
					
					showLDAPSettingsView();
					
				} else if ( SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES.equals(itemId)) {
					
					showMDBDatasourcesView();
					
				} else if ( SettingsTree.RELATIONAL_DATABASE_DATASOURCES.equals(itemId)) {
					
					showRDBDatasourcesView();
					
				}
			}

		} else if ( event.getSource() == mdbDatasourceTable ) {			
			
			Item item = mdbDatasourceTable.getItem(event.getItemId());
			
			if ( item != mdbDatasourceForm.getItemDataSource() ) {
				
				mdbDatasourceForm.setItemDataSource(item);
				
			}
			
		} else if ( event.getSource() == rdbDatasourceTable ) {			
			
			Item item = rdbDatasourceTable.getItem(event.getItemId());
			
			if ( item != rdbDatasourceForm.getItemDataSource() ) {
				
				rdbDatasourceForm.setItemDataSource(item);
				
			}
			
		}

	}
	

	private void showServerInfoView() {
		
		getServerInfoView().refreshServerInfo();
		
		setPropertiesView(getServerInfoView());
		
	}

	public void showServerSettingsView() {

		setPropertiesView(getServerSettingsView());

	}
	
	public void showLoginView() {
				
		setPropertiesView(getLoginView());
		getLoginView().getUsername().focus();
		
	}
	
	public void showLDAPSettingsView() {

		setPropertiesView(getLDAPSettingsView());

	}
	
	public void showMDBDatasourcesView() {
				
		setPropertiesView(getMdbDatasourcesView());
		
	}
	
	public void showRDBDatasourcesView() {
		setPropertiesView(getRdbDatasourcesView());
	}
	
	public void showBlankView() {
		
		setPropertiesView(new Panel());
		
	}

	@Override
	public void buttonClick(ClickEvent event) {

		if ( event.getButton() == getLoginView().getLoginButton()) {
			
			loginUser();
			
		} else if ( event.getButton() == logoutButton) {
			
			logoutUser();
			
		} else if ( event.getButton() == getMdbDatasourcesView().getNewButton() ) {
		
			mdbDatasourceForm.addMDBDatasource();
			
		} else if ( event.getButton() == getMdbDatasourcesView().getCopyButton() ) {
			
			mdbDatasourceForm.copyMDBDatasource();
			
		} else if ( event.getButton() == getMdbDatasourcesView().getDeleteButton() ) {
			
			getMdbDatasourcesView().removeMDBDatasource();
			
			getMdbDatasourceTable().resizeTable();
			
			//this.getMainWindow().showNotification(SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES + " Deleted Item Successfully");
			
		} else if ( event.getButton() == getMdbDatasourcesView().getSaveAllButton() ) {
					
			boolean isSuccessful = mdbDatasourceContainer.saveData();
			
			if ( isSuccessful ) {
			
				this.getMainWindow().showNotification(SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES.toString() + " Saved Successfully");

			} else {
			
				this.getMainWindow().showNotification(SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES.toString() + " NOT Saved Successfully");
				
			}			
			
		} else if ( event.getButton() == getMdbDatasourcesView().getCancelAllButton() ) {
		
			mdbDatasourceContainer.readData();
			getMdbDatasourcesView().removeSelectionFromTable();
			this.getMainWindow().showNotification(SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES.toString() + " Cancelled Successfully");
			
		} else if ( event.getButton() == getRdbDatasourcesView().getSaveAllButton() ) {
			
			boolean isSuccessful = rdbDatasourceContainer.saveData();
			
			if ( isSuccessful ) {
			
				this.getMainWindow().showNotification(SettingsTree.RELATIONAL_DATABASE_DATASOURCES.toString() + " Saved Successfully");

			} else {
			
				this.getMainWindow().showNotification(SettingsTree.RELATIONAL_DATABASE_DATASOURCES.toString() + " NOT Saved Successfully");
				
			}			
			
		} else if ( event.getButton() == getRdbDatasourcesView().getCancelAllButton() ) {
		
			rdbDatasourceContainer.readData();
			getRdbDatasourcesView().removeSelectionFromTable();
			this.getMainWindow().showNotification(SettingsTree.RELATIONAL_DATABASE_DATASOURCES.toString() + " Cancelled Successfully");
			
		}

	}

	/**
	 * Logins user.  Shows error notifications if problem logging in.
	 */
	private void loginUser() {

		String userName = (String) getLoginView().getUsername().getValue();
		String password = (String) getLoginView().getPassword().getValue();
		
		if ( userName != null && password != null ) {
		
			userName = userName.trim();
						
			if ( userName.equals("")) {
				getMainWindow().showNotification(PaceSettingsConstants.USERNAME_IS_A_REQUIRED_FIELD);
				getLoginView().getUsername().focus();
			} else {
				
				try {
					
					PafUserDef pafUserDef = PafSecurityService.authenticate(userName, password);
					
					if ( pafUserDef == null ) {
						getMainWindow().showNotification(PaceSettingsConstants.INVALID_USERNAME_OR_PASSWORD);
					} else {
						
						if ( pafUserDef.getAdmin() ) {
							
							this.pafUserDef = pafUserDef;
							
							logoutButton.setVisible(true);
							
							tree.select(SettingsTree.SERVER_INFO);
							
							showServerInfoView();
							
							//set trimmed value
							getLoginView().getUsername().setValue(userName);
							
							//clear password
							getLoginView().getPassword().setValue("");
							
						} else {
					
							getMainWindow().showNotification("User " + userName + " doesn't have access to view or modify settings");
							
						}
						
					}
					
				} catch (InvalidUserNameException e) {
					getMainWindow().showNotification(PaceSettingsConstants.INVALID_USERNAME_OR_PASSWORD);
				} catch (InvalidPasswordException e) {
					getMainWindow().showNotification(PaceSettingsConstants.INVALID_USERNAME_OR_PASSWORD);
				} catch (PafException e) {
					PafErrHandler.handleException(e);
				}
				
			}
		}
		
	}
	
	private void logoutUser() {
		
		pafUserDef = null;
		logoutButton.setVisible(false);
		showLoginView();
		
	}

	/**
	 * @return the serverSettingsView
	 */
	public ServerSettingsView getServerSettingsView() {

		if (serverSettingsView == null) {

			serverSettingsForm = new ServerSettingsForm(this);
			serverSettingsView = new ServerSettingsView(serverSettingsForm);
		}

		return serverSettingsView;
	}
	
	public LDAPSettingsView getLDAPSettingsView() {
		
		if ( ldapSettingsView == null ) {
			
			ldapSettingsForm = new LDAPSettingsForm(this); 
			ldapSettingsView = new LDAPSettingsView(ldapSettingsForm);
			
		}
		
		return ldapSettingsView;
		
	}


	/**
	 * @return the mdbDatasourcesView
	 */
	public MDBDatasourcesView getMdbDatasourcesView() {
		
		if ( mdbDatasourcesView == null ) {
			
			mdbDatasourceForm = new MDBDatasourceForm(this);
			mdbDatasourceTable = new MDBDatasourceTable(this);
			mdbDatasourcesView = new MDBDatasourcesView(this, mdbDatasourceTable, mdbDatasourceForm);
						
		}
		
		return mdbDatasourcesView;
	}
	
	public RDBDatasourcesView getRdbDatasourcesView() {
		
		if ( rdbDatasourcesView == null ) {
			
			rdbDatasourceForm = new RDBDatasourceForm(this);
			rdbDatasourceTable = new RDBDatasourceTable(this);
			rdbDatasourcesView = new RDBDatasourcesView(this, rdbDatasourceTable, rdbDatasourceForm);
			
		}
		
		return rdbDatasourcesView;		
	}

	/**
	 * @return the mdbDatasourceContainer
	 */
	public MDBDatasourceContainer getMdbDatasourceContainer() {
		return mdbDatasourceContainer;
	}

	/**
	 * @return the mdbDatasourceFieldFactory
	 */
	public MDBDatasourceFieldFactory getMdbDatasourceFieldFactory() {
		return mdbDatasourceFieldFactory;
	}

	/**
	 * @return the mdbDatasourceTable
	 */
	public MDBDatasourceTable getMdbDatasourceTable() {
		return mdbDatasourceTable;
	}

	/**
	 * @return the rdbDatasourceContainer
	 */
	public RDBDatasourceContainer getRdbDatasourceContainer() {
		return rdbDatasourceContainer;
	}

	/**
	 * @return the rdbDatasourceFieldFactory
	 */
	public RDBDatasourceFieldFactory getRdbDatasourceFieldFactory() {
		return rdbDatasourceFieldFactory;
	}
	
	public ServerInfoView getServerInfoView() {
		
		if ( serverInfoView == null ) {
			
			serverInfoView = new ServerInfoView();
			
		}
		
		return serverInfoView;		
		
	}

	/**
	 * @return the loginView
	 */
	public LoginView getLoginView() {
		
		if ( loginView == null ) {
			
			loginView = new LoginView(this);
			
		}
		
		return loginView;
	}
	
	
}
