/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.db.RdbProps;
import com.pace.settings.PaceSettingsApplication;
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
public class RDBDatasourcesView extends VerticalSplitPanel {

	private static final long serialVersionUID = -7659181748370375186L;

	private Button saveAllButton = null;
	
	private Button cancelAllButton = null;
	
	private RDBDatasourceTable rdbDsTable = null;
	
	private RDBDatasourceForm rdbDatasourceForm = null;
	
	/**
	 * Constructor
	 * 
	 * @param rdbDatasourceForm form to use in view.
	 */
	public RDBDatasourcesView(PaceSettingsApplication paceSettingsApplication, RDBDatasourceTable rdbDsTable, RDBDatasourceForm rdbDatasourceForm) {

		this.rdbDsTable = rdbDsTable;
		this.rdbDatasourceForm = rdbDatasourceForm;
				
		saveAllButton = new Button("Save", (ClickListener) paceSettingsApplication);
		
		cancelAllButton = new Button("Cancel", (ClickListener) paceSettingsApplication);
		
		VerticalLayout vl = new VerticalLayout();
		
		Label heading = new Label(SettingsTree.RELATIONAL_DATABASE_DATASOURCES.toString());
		
		heading.setStyleName(Reindeer.LABEL_H2);
		
		vl.addComponent(heading);
		vl.addComponent(rdbDsTable);
		vl.setSpacing(true);
				
		HorizontalLayout hl = new HorizontalLayout();
		hl.addComponent(saveAllButton);
		hl.addComponent(cancelAllButton);
		hl.setSpacing(true);
		
		vl.addComponent(hl);
						
		Panel topPanel = new Panel();
		topPanel.addComponent(vl);
		topPanel.setSizeFull();
						
		setFirstComponent(topPanel);
		
		Panel bottomPanel = new Panel();
		bottomPanel.addComponent(rdbDatasourceForm);
		bottomPanel.setSizeFull();
		
		setSecondComponent(bottomPanel);
		
		setSplitPosition(30);
		
		setHeight("100%");
		
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
	


	public void selectFirstItemInTable() {
		
		if ( rdbDsTable.firstItemId() != null ) {
		
			//mdbDsTable.select(mdbDsTable.firstItemId());
			
			rdbDsTable.setValue(rdbDsTable.firstItemId());
			
			rdbDatasourceForm.setItemDataSource(new BeanItem<RdbProps>((RdbProps) rdbDsTable.getValue()));
		
		} else {
			
			rdbDatasourceForm.setItemDataSource(null);
			
		}
		
	}
	
	public void removeSelectionFromTable() {
		
		
		rdbDsTable.select(null);
		rdbDatasourceForm.setItemDataSource(null);
		
	}

	
	
	
}
