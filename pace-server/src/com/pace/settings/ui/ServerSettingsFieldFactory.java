package com.pace.settings.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.pace.base.AuthMode;
import com.vaadin.data.Item;
import com.vaadin.data.validator.IntegerValidator;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

/**
 *  The server settings field factory overloads the default behavior for the 
 *  form fields.  It overrides the captions and in some cases widgets.
 *  
 * @author JMilliron
 *
 */
public class ServerSettingsFieldFactory extends DefaultFieldFactory {
	
	private static final long serialVersionUID = 8662372484558509574L;
	
	private static final String COMMON_FIELD_WIDTH = "20em";
	
	public static final String ENABLE_ROUNDING = "enableRounding";
	public static final String ENABLE_CLIENT_PASSWORD_RESET = "enableClientPasswordReset";
	public static final String ENABLE_SERVER_PASSWORD_RESET = "enableServerPasswordReset";
	public static final String CHANGED_CELL_LOGGING = "changedCellLogging";
	public static final String EVALUATION_STEP_LOGGING = "evaluationStepLogging";
	public static final String DEBUG_MODE = "debugMode";
	public static final String CLEAR_ALL_CELL_NOTES = "clearAllCellNotes";
	public static final String CLEAR_CELL_NOTES = "clearCellNotes";
	public static final String CLEAR_OUTLINE_CACHE = "clearOutlineCache";
	public static final String AUTO_LOAD_ATTRIBUTES = "autoLoadAttributes";
	public static final String AUTO_CONVERT_PROJECT = "autoConvertProject";
	public static final String CALC_SCRIPT_TIMEOUT = "calcScriptTimeout";
	public static final String MAX_PASSWORD_LENGTH = "maxPasswordLength";
	public static final String MIN_PASSWORD_LENGTH = "minPasswordLength";
	public static final String SMTP_USER_EMAIL_ACCOUNT = "smtpUserEmailAccount";
	public static final String SMTP_MAIL_HOST = "smtpMailHost";
	public static final String CLIENT_MIN_VERSION = "clientMinVersion";
	public static final String CLIENT_UPDATE_URL = "clientUpdateUrl";
	public static final String AUTH_MODE = "authMode";
	public static final String PAF_SECURITY_BOOTUP_PASSWORD = "pafSecurityBootupPassword";
	public static final String PAF_SECURITY_PASSWORD = "pafSecurityPassword";
	public static final String PAF_SECURITY_USER = "pafSecurityUser";
	
	//form order
	public static final Object[] NATURAL_COL_ORDER = new Object[] {
			PAF_SECURITY_USER, PAF_SECURITY_PASSWORD, PAF_SECURITY_BOOTUP_PASSWORD, AUTH_MODE, CALC_SCRIPT_TIMEOUT, CLIENT_UPDATE_URL, CLIENT_MIN_VERSION,
			MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH, SMTP_MAIL_HOST, SMTP_USER_EMAIL_ACCOUNT, 
			AUTO_CONVERT_PROJECT, AUTO_LOAD_ATTRIBUTES, CLEAR_OUTLINE_CACHE, CLEAR_CELL_NOTES, CLEAR_ALL_CELL_NOTES,
			DEBUG_MODE, EVALUATION_STEP_LOGGING, CHANGED_CELL_LOGGING, ENABLE_SERVER_PASSWORD_RESET, ENABLE_CLIENT_PASSWORD_RESET, ENABLE_ROUNDING 
		  };

	//override caption map
	private static Map<String, String> captionMap = new HashMap<String, String>();
	
	//required field set
	private static Set<String> requiredFieldSet = new HashSet<String>();
	
	ComboBox authModeComboBox = new ComboBox();
	
	 static {
	    	
		 //captions
		captionMap.put(PAF_SECURITY_USER, "Security Database User");
		captionMap.put(PAF_SECURITY_PASSWORD, "Security Database Password");
		captionMap.put(PAF_SECURITY_BOOTUP_PASSWORD, "Security Database Bootup Password");
		captionMap.put(AUTH_MODE, "Authentication Mode");
		captionMap.put(CLIENT_UPDATE_URL, "Client Update URL");
		captionMap.put(CLIENT_MIN_VERSION, "Client Minimum Version");
		captionMap.put(SMTP_MAIL_HOST, "SMTP Mail Host");
		captionMap.put(SMTP_USER_EMAIL_ACCOUNT, "SMTP User Email Account");
		captionMap.put(MIN_PASSWORD_LENGTH, "Minimum User Password Length");
		captionMap.put(MAX_PASSWORD_LENGTH, "Maximum User Password Length");
		captionMap.put(CALC_SCRIPT_TIMEOUT, "Calculation Script Timeout (in seconds)");
		captionMap.put(AUTO_CONVERT_PROJECT, "Auto Convert Pace Project");
		captionMap.put(AUTO_LOAD_ATTRIBUTES, "Auto Load Attributes");
		captionMap.put(CLEAR_OUTLINE_CACHE, "Clear Outline Cache");
		captionMap.put(CLEAR_CELL_NOTES, "Clear Application Cell Notes");
		captionMap.put(CLEAR_ALL_CELL_NOTES, "Clear All Applications Cell Notes");
		captionMap.put(DEBUG_MODE, "Debug Mode");
		captionMap.put(EVALUATION_STEP_LOGGING, "Enable Evaluation Step Logging");
		captionMap.put(CHANGED_CELL_LOGGING, "Enabled Changed Cell Logging");
		captionMap.put(ENABLE_SERVER_PASSWORD_RESET, "Enable Server Password Reset");
		captionMap.put(ENABLE_CLIENT_PASSWORD_RESET, "Enable Client Password Reset");
		captionMap.put(ENABLE_ROUNDING, "Enable Rounding");
		
		//required fields
		requiredFieldSet.add(PAF_SECURITY_USER);
		requiredFieldSet.add(PAF_SECURITY_PASSWORD);
		requiredFieldSet.add(PAF_SECURITY_BOOTUP_PASSWORD);
		requiredFieldSet.add(AUTH_MODE);
		requiredFieldSet.add(CLIENT_UPDATE_URL);
		requiredFieldSet.add(CLIENT_MIN_VERSION);
		requiredFieldSet.add(CLIENT_MIN_VERSION);
		requiredFieldSet.add(CALC_SCRIPT_TIMEOUT);
		requiredFieldSet.add(MIN_PASSWORD_LENGTH);
		requiredFieldSet.add(MAX_PASSWORD_LENGTH);
	        
	}

	public ServerSettingsFieldFactory() {
		
		authModeComboBox.setNewItemsAllowed(false);
		authModeComboBox.setNullSelectionAllowed(false);
		authModeComboBox.addItem(AuthMode.nativeMode.toString());
		authModeComboBox.addItem(AuthMode.mixedMode.toString());
		
	}
	
	@Override
    public Field createField(Item item, Object propertyId, Component uiContext) {
       
		 Field field = super.createField(item, propertyId, uiContext);
		 
		 //add catpion
	     if ( captionMap.containsKey(propertyId) ) {
	        
	    	 field.setCaption(captionMap.get(propertyId));
	        	
	     }
		
	     //add if required and set error message
	     if ( requiredFieldSet.contains(propertyId)) {
	    
	    	//add required field	     
		     field.setRequired(true);
		     field.setRequiredError(field.getCaption() + " is a required field.");
		    
	     }
	     
	     //if auth mode, return combo instad of text field
	     if (propertyId.equals(AUTH_MODE)) {
				
			authModeComboBox.setCaption(field.getCaption());
			authModeComboBox.setRequired(requiredFieldSet.contains(propertyId));
			authModeComboBox.setWidth(COMMON_FIELD_WIDTH);
			return authModeComboBox;
	    }
	     
	    //if text field, change nulls to empty strings and set the common width
		if ( field instanceof TextField ) {
			
			((TextField) field).setNullRepresentation("");
			((TextField) field).setWidth(COMMON_FIELD_WIDTH);
			
		}
        
		//add validators
        if (propertyId.equals(CALC_SCRIPT_TIMEOUT)) {
        	
            TextField tf = (TextField) field;

            tf.addValidator(new RegexpValidator("[1-9][0-9]*",
                "Calculateion Script Timeout must be an whole number and can't start with 0."));
            
        } else if ( propertyId.equals(MIN_PASSWORD_LENGTH)) {
        	
            TextField tf = (TextField) field;

            tf.addValidator(new IntegerValidator("Minimum User Password Length must be a whole number."));
            
        } else if ( propertyId.equals(MAX_PASSWORD_LENGTH)) {
        	
            TextField tf = (TextField) field;

            tf.addValidator(new RegexpValidator("[1-9][0-9]*",
                "Maximum User Password Length must be a whole number and can't start with 0."));
        	
        }

        return field;
    }

}
