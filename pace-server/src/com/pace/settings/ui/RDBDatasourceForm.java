/**
 * 
 */
package com.pace.settings.ui;

import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Item;

/**
 * RDB Datasources form
 * 
 * @author JMilliron
 *
 */
public class RDBDatasourceForm extends PaceSettingsForm {

	private static final long serialVersionUID = -6315525313032264430L;
		
	/**
	 * Constructor 
	 * 
	 * @param serverSettingsApplication application
	 */
	public RDBDatasourceForm(PaceSettingsApplication serverSettingsApplication) {
		super(serverSettingsApplication);
		getFooter().setVisible(false);
		save.setCaption(PaceSettingsConstants.UPDATE_BUTTON_LABEL);
	}
	
	@Override
	protected void setupForm() {

		setWriteThrough(false);
		
		setPaceSettingsDefaultFactory(serverSettingsApplication.getRdbDatasourceFieldFactory());
        
        setFormFieldFactory(getPaceSettingsDefaultFactory());
            
  		setImmediate(true);
  		  		
  		
	}

	@Override
	protected void saveForm() {

		setItemDataSource(null);
		
	}

	@Override
	protected void cancelForm() {

		setItemDataSource(null);
 	    
	}

	@Override
	protected void loadSettings() {
	}	
	
	/* (non-Javadoc)
	 * @see com.pace.settings.ui.PaceSettingsForm#setItemDataSource(com.vaadin.data.Item)
	 */
	@Override
	public void setItemDataSource(Item newDataSource) {
		
		if ( newDataSource != null ) {
			super.setItemDataSource(newDataSource, serverSettingsApplication.getRdbDatasourceFieldFactory().getFormOrderList());			
			getFooter().setVisible(true);
		
		} else {
			super.setItemDataSource(newDataSource);
			getFooter().setVisible(false);
		
		}
		
		
	}	
}
