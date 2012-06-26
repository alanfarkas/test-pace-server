/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.mdb.PafConnectionProps;
import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.themes.Reindeer;

/**
 * MDB Datasources View. Used to hold label, table and form. 
 * 
 * @author JMilliron
 *
 */
public class MDBDatasourcesView extends VerticalSplitPanel implements Property.ValueChangeListener {
	
	private static final long serialVersionUID = -6009807502444532956L;
	
	private Button newButton = null;
		
	private Button copyButton = null;
	
	private Button deleteButton = null;
	
	private Button saveAllButton = null;
	
	private Button cancelAllButton = null;
	
	private MDBDatasourceTable mdbDsTable = null;
	
	private MDBDatasourceForm mdbDatasourceForm = null;
	
	private PaceSettingsApplication paceSettingsApplication = null;
	
	/**
	 * Constructor
	 * 
	 * @param mdbDatasourceForm form to use in view.
	 */
	public MDBDatasourcesView(PaceSettingsApplication paceSettingsApplication, MDBDatasourceTable mdbDsTable, MDBDatasourceForm mdbDatasourceForm) {
		this.paceSettingsApplication = paceSettingsApplication;
		this.mdbDsTable = mdbDsTable;
		this.mdbDatasourceForm = mdbDatasourceForm;
		
		newButton = new Button(PaceSettingsConstants.NEW_BUTTON_LABEL, (ClickListener) paceSettingsApplication);
		
		copyButton = new Button(PaceSettingsConstants.COPY_BUTTON_LABEL, (ClickListener) paceSettingsApplication);
		
		copyButton.setEnabled(false);
		
		deleteButton = new Button(PaceSettingsConstants.DELETE_BUTTON_LABEL, (ClickListener) paceSettingsApplication);
		
		deleteButton.setEnabled(false);
		
		saveAllButton = new Button(PaceSettingsConstants.SAVE_BUTTON_LABEL, (ClickListener) paceSettingsApplication);
		
		cancelAllButton = new Button(PaceSettingsConstants.CANCEL_BUTTON_LABEL, (ClickListener) paceSettingsApplication);
		
		VerticalLayout vl = new VerticalLayout();
		
		Label heading = new Label(SettingsTree.MULTIDIMENSIONAL_DATABASE_DATASOURCES.toString());
		
		heading.setStyleName(Reindeer.LABEL_H2);
		
		vl.addComponent(heading);
		vl.addComponent(mdbDsTable);
		vl.setSpacing(true);
		
		mdbDsTable.addListener((Property.ValueChangeListener) this);
		//mdbDsTable.setHeight("100%");
		
		HorizontalLayout hl = new HorizontalLayout();
		hl.addComponent(saveAllButton);
		hl.addComponent(cancelAllButton);
		hl.addComponent(newButton);
		hl.addComponent(copyButton);
		hl.addComponent(deleteButton);
		hl.setSpacing(true);
		
		vl.addComponent(hl);
		//vl.setSizeFull();
		
		Panel topPanel = new Panel();
		topPanel.addComponent(vl);
		topPanel.setSizeFull();
		
		setFirstComponent(topPanel);
		
		Panel bottomPanel = new Panel();
		bottomPanel.addComponent(mdbDatasourceForm);
		bottomPanel.setSizeFull();
		
		setSecondComponent(bottomPanel);
		
		setSplitPosition(40);
		
		setHeight("100%");
		
	}

	/**
	 * @return the newButton
	 */
	public Button getNewButton() {
		return newButton;
	}

	/**
	 * @return the copyButton
	 */
	public Button getCopyButton() {
		return copyButton;
	}

	
	
	/**
	 * @return the deleteButton
	 */
	public Button getDeleteButton() {
		return deleteButton;
	}
	
	

	/**
	 * @return the saveAllButton
	 */
	public Button getSaveAllButton() {
		return saveAllButton;
	}

	/**
	 * @return the cancelAllButton
	 */
	public Button getCancelAllButton() {
		return cancelAllButton;
	}

	@Override
	public void valueChange(ValueChangeEvent event) {
		
		Property property = event.getProperty();
		
		if ( property == mdbDsTable ) {
			
			copyButton.setEnabled(mdbDsTable.getValue() != null);
			deleteButton.setEnabled(mdbDsTable.getValue() != null);
		}
		
	}

	public void removeMDBDatasource() {

		Object selectedItem = paceSettingsApplication.getMdbDatasourceTable().getValue();
		
		if ( selectedItem != null ) {
		
			paceSettingsApplication.getMdbDatasourceTable().removeItem(selectedItem);
		
			mdbDatasourceForm.setItemDataSource(null);
		
			copyButton.setEnabled(false);
			
			deleteButton.setEnabled(false);
			
			if ( paceSettingsApplication.getMdbDatasourceTable().size() > 0 ) {
				
				paceSettingsApplication.getMdbDatasourceTable().select(paceSettingsApplication.getMdbDatasourceTable().firstItemId());
				
			}
			
		}
		
	}
	
	public void selectFirstItemInTable() {
		
		if ( mdbDsTable.firstItemId() != null ) {
		
			mdbDsTable.setValue(mdbDsTable.firstItemId());
			
			mdbDatasourceForm.setItemDataSource(new BeanItem<PafConnectionProps>((PafConnectionProps) mdbDsTable.getValue()));
		
		} else {
			
			mdbDatasourceForm.setItemDataSource(null);
			
		}
		
	}
	
	public void removeSelectionFromTable() {
		
		
		mdbDsTable.select(null);
		mdbDatasourceForm.setItemDataSource(null);
		
	}
	
}
