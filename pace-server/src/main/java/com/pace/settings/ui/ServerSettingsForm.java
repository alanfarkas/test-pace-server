/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.server.ServerSettings;
import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.data.PaceSettingsDataService;
import com.vaadin.data.util.BeanItem;

/**
 * 
 * Server Settings form
 * 
 * @author JMilliron
 *
 */
public class ServerSettingsForm extends PaceSettingsForm {
		

	private static final long serialVersionUID = -1856367965196923345L;
	
	public ServerSettingsForm(PaceSettingsApplication serverSettingsApplication) {
    	super(serverSettingsApplication);    	    	                
    }
   
	@Override
	protected void setupForm() {

		setWriteThrough(false);
		
		setPaceSettingsDefaultFactory(new ServerSettingsFieldFactory());
        
        setFormFieldFactory(getPaceSettingsDefaultFactory());
        
        loadSettings();
      
  		setItemDataSource(new BeanItem<ServerSettings>((ServerSettings) inputObject));
    
  		setImmediate(true);
  		
	}

	@Override
	protected void saveForm() {

		PaceSettingsDataService.setServerSettings((ServerSettings) inputObject);
		
	}

	@Override
	protected void cancelForm() {

		loadSettings();
		
 	    setItemDataSource(new BeanItem<ServerSettings>((ServerSettings) inputObject));
		
	}

	@Override
	protected void loadSettings() {

		try {
        	
			inputObject = PaceSettingsDataService.getServerSettings();
					    	
		} catch (PafConfigFileNotFoundException e) {
			
			inputObject = new ServerSettings();
			
		}
		
	}	
	
}
