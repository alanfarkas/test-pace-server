/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.mdb.PafConnectionProps;
import com.pace.settings.PaceSettingsApplication;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
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
		
		newButton = new Button("New", (ClickListener) paceSettingsApplication);
		
		copyButton = new Button("Copy", (ClickListener) paceSettingsApplication);
		
		copyButton.setEnabled(false);
		
		deleteButton = new Button("Delete", (ClickListener) paceSettingsApplication);
		
		deleteButton.setEnabled(false);
		
		saveAllButton = new Button("Save", (ClickListener) paceSettingsApplication);
		
		cancelAllButton = new Button("Cancel", (ClickListener) paceSettingsApplication);
		
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
						
		setFirstComponent(vl);
		
		setSecondComponent(mdbDatasourceForm);
		
		setSplitPosition(50);
		
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
		
			//mdbDsTable.select(mdbDsTable.firstItemId());
			
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

	/*@Override
	public void buttonClick(ClickEvent event) {
		
		if ( event.getButton() == addButton ) {
			addButton.getApplication().getMainWindow().showNotification("ADD");
		} else if ( event.getButton() == copyButton ) {
			addButton.getApplication().getMainWindow().showNotification("COPY");
		}
		
	}*/
	
	
	
}
