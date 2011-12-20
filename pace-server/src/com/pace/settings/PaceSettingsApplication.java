package com.pace.settings;

import java.awt.Canvas;

import com.pace.settings.ui.LDAPSettingsForm;
import com.pace.settings.ui.LDAPSettingsView;
import com.pace.settings.ui.ServerSettingsForm;
import com.pace.settings.ui.ServerSettingsView;
import com.pace.settings.ui.SettingsList;
import com.pace.settings.ui.SettingsTree;
import com.vaadin.Application;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
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
import com.vaadin.ui.themes.Reindeer;

public class PaceSettingsApplication extends Application implements
		ItemClickListener, Button.ClickListener, Property.ValueChangeListener {

	private static final long serialVersionUID = -3106115489087842180L;

	protected static final String TREE_NODE_WITHOUT_CHILDREN_STYLE = "no-children";

	private static final String PACE_SETTINGS_APPLICATION = "Pace Settings Application";

	private Label headingLabel = new Label(PACE_SETTINGS_APPLICATION);

	private HorizontalSplitPanel horizontalSplit = new HorizontalSplitPanel();

	private SettingsTree tree = new SettingsTree(this);

	private ServerSettingsView serverSettingsView;
	
	private LDAPSettingsView ldapSettingsView;

	private ServerSettingsForm serverSettingsForm = new ServerSettingsForm(this);
	
	private LDAPSettingsForm ldapSettingsForm = new LDAPSettingsForm(this);

	private SettingsList settingsList = new SettingsList(this);

	@Override
	public void init() {

		setMainWindow(new Window(PACE_SETTINGS_APPLICATION));

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

		vl.addComponent(createToolbar());
		vl.addComponent(horizontalSplit);

		vl.setExpandRatio(horizontalSplit, 1);
		horizontalSplit.setSplitPosition(250, HorizontalSplitPanel.UNITS_PIXELS);

		setTheme("pace");

		getMainWindow().setContent(vl);

		tree.select(SettingsTree.SERVER_SETTINGS);

		showServerSettingsView();
	}

	public HorizontalLayout createToolbar() {

		HorizontalLayout lo = new HorizontalLayout();

		headingLabel.setStyleName(Reindeer.LABEL_H1);

		lo.addComponent(headingLabel);
		lo.addComponent(headingLabel);
		lo.addComponent(headingLabel);

		lo.setWidth("100%");
		lo.setMargin(true);
		lo.setSpacing(true);

		return lo;
	}

	private void setPropertiesView(Component c) {
		horizontalSplit.setSecondComponent(c);
	}

	@Override
	public void itemClick(ItemClickEvent event) {

		if (event.getSource() == tree) {

			Object itemId = event.getItemId();
			
			if (itemId != null) {
				
				if (SettingsTree.SERVER_SETTINGS.equals(itemId)) {

					showServerSettingsView();
					
				} else if ( SettingsTree.LDAP_SETTINGS.equals(itemId)) {
					
					showLDAPSettingsView();
					
				}
			}

		}

	}

	public void showServerSettingsView() {

		setPropertiesView(getServerSettingsView());

	}
	
	public void showLDAPSettingsView() {

		setPropertiesView(getLDAPSettingsView());

	}
	
	public void showBlankView() {
		
		setPropertiesView(new Panel());
		
	}

	@Override
	public void buttonClick(ClickEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void valueChange(ValueChangeEvent event) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the serverSettingsView
	 */
	public ServerSettingsView getServerSettingsView() {

		if (serverSettingsView == null) {

			serverSettingsView = new ServerSettingsView(serverSettingsForm);
		}

		return serverSettingsView;
	}
	
	public LDAPSettingsView getLDAPSettingsView() {
		
		if ( ldapSettingsView == null ) {
			
			ldapSettingsView = new LDAPSettingsView(ldapSettingsForm);
			
		}
		
		return ldapSettingsView;
		
	}

}
