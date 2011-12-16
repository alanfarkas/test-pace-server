/**
 * 
 */
package com.pace.settings.ui;

import java.util.Arrays;
import java.util.List;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.server.ServerSettings;
import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.data.PaceSettingsDataService;
import com.vaadin.data.Item;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;

/**
 * 
 * Server Settings form
 * 
 * @author JMilliron
 *
 */
public class ServerSettingsForm extends Form implements ClickListener {
		

	private static final long serialVersionUID = -1856367965196923345L;
	
	private Button save = new Button("Save", (ClickListener) this);
    private Button cancel = new Button("Cancel", (ClickListener) this);
                 
    private PaceSettingsApplication serverSettingsApplication;
    
    ServerSettings ss = null;
    
    public ServerSettingsForm(PaceSettingsApplication serverSettingsApplication) {
    	
    	this.serverSettingsApplication = serverSettingsApplication;
    	
    	setWriteThrough(false);
    	
    	HorizontalLayout footer = new HorizontalLayout();
        footer.setSpacing(true);
        footer.addComponent(save);
        footer.addComponent(cancel);
        
        setFooter(footer);
        
        setFormFieldFactory(new ServerSettingsFieldFactory());
        
        try {
        	
			ss = PaceSettingsDataService.getServerSettings();
					    	
		} catch (PafConfigFileNotFoundException e) {
			
			ss = new ServerSettings();
			
		}
      
  		setItemDataSource(new BeanItem<ServerSettings>(ss));
    
  		setImmediate(true);
                
    }
    
    @Override
    public void setItemDataSource(Item newDataSource) {
    	
    	 if (newDataSource != null) {
             List<Object> orderedProperties = Arrays.asList(ServerSettingsFieldFactory.NATURAL_COL_ORDER);
             super.setItemDataSource(newDataSource, orderedProperties);
    	 } else {
    		 super.setItemDataSource(null);
    	 }
    	
    }


	@Override
	public void buttonClick(ClickEvent event) {

		Button source = event.getButton();

		//on save
    	if (source == save) {
        	
            if (!isValid()) {
            	
            	serverSettingsApplication.getMainWindow().showNotification("Errors on the form.  Check required fields.");
            	
                return;
            }
           	      
           //commit changes to data source
           commit();
           
           //write changes to disk
           PaceSettingsDataService.setServerSettings(ss);
          
           serverSettingsApplication.getMainWindow().showNotification("Saved");
           
       //on cancel
       } else if ( source == cancel) {
   
    	   //discard changes
    	   discard();
   
    	   //reload model
    	   try {
		
    		   ss = PaceSettingsDataService.getServerSettings();
		
    	   } catch (PafConfigFileNotFoundException e) {
    		   
    		   //serverSettingsApplication.getMainWindow().showNotification("Can't find file '" + PaceSettingsDataService.getServerSettingsFile() + "'.");
		
    		   ss = new ServerSettings();
		
    	   }
	
    	   setItemDataSource(new BeanItem<ServerSettings>(ss));
   
		   serverSettingsApplication.getMainWindow().showNotification("Canceled");
		   
       }
    	
	}	
	
}
