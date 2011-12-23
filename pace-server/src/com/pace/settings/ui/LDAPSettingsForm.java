/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.server.PafLDAPSettings;
import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.data.PaceSettingsDataService;
import com.vaadin.data.util.BeanItem;

/**
 * LDAP Settings form
 * 
 * @author JMilliron
 *
 */
public class LDAPSettingsForm extends PaceSettingsForm {

	private static final long serialVersionUID = -3760996903039086588L;
	
	/**
	 * Constructor 
	 * 
	 * @param serverSettingsApplication application
	 */
	public LDAPSettingsForm(PaceSettingsApplication serverSettingsApplication) {
		super(serverSettingsApplication);
	}
	
	@Override
	protected void setupForm() {

		setWriteThrough(false);
		
		setPaceSettingsDefaultFactory(new LDAPSettingsFieldFactory());
        
        setFormFieldFactory(getPaceSettingsDefaultFactory());
        
        loadSettings();
      
  		setItemDataSource(new BeanItem<PafLDAPSettings>((PafLDAPSettings) inputObject));
    
  		setImmediate(true);
  		
	}

	@Override
	protected void saveForm() {

		PaceSettingsDataService.setLDAPSettings((PafLDAPSettings) inputObject);
		
	}

	@Override
	protected void cancelForm() {

		loadSettings();
		
 	    setItemDataSource(new BeanItem<PafLDAPSettings>((PafLDAPSettings) inputObject));
 	    
 	    //fixes scroll issue
 	    serverSettingsApplication.showBlankView();
 	    serverSettingsApplication.showLDAPSettingsView();
 	    
	}

	@Override
	protected void loadSettings() {

		try {
        	
			inputObject = PaceSettingsDataService.getLDAPSettings();
					    	
		} catch (PafConfigFileNotFoundException e) {
			
			inputObject = new PafLDAPSettings();
			
		}
		
	}	
}
