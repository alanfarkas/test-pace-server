/**
 * 
 */
package com.pace.settings.ui;

import java.util.LinkedList;
import java.util.List;

import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Container;
import com.vaadin.data.validator.IntegerValidator;
import com.vaadin.data.validator.NullValidator;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;

/**
 * @author JMilliron
 *
 */
public class KeyValueTableFieldFactory implements TableFieldFactory {

	private static final long serialVersionUID = -4215588571631113843L;

	private List<Field> allFields;
	
	public KeyValueTableFieldFactory() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.TableFieldFactory#createField(com.vaadin.data.Container, java.lang.Object, java.lang.Object, com.vaadin.ui.Component)
	 */
	@Override
	public Field createField(Container container, Object itemId,
			Object propertyId, Component uiContext) {
		
		TextField field = new TextField();
		
        if ("key".equals(propertyId) || "value".equals(propertyId) ) {
        	                	
        	field.setNullRepresentation("");
        	field.setWidth(PaceSettingsConstants.COMMON_FIELD_WIDTH_20_EM);	
        	
        	if ( "key".equals(propertyId)) {
        		field.setReadOnly(true);        	
        		
        	} else if ( "value".equals(propertyId)) {
        		field.setRequired(true);
        		field.setRequiredError("Can not be blank");
        		//field.addValidator(new NullValidator("Can't be empty", false));
        		//field.addValidator(new IntegerValidator("Must be a whole number."));
        		
        	}
        } else if ( "Delete".equals(propertyId)) {
        	
        	field.setWidth(PaceSettingsConstants.COMMON_BUTTON_WIDTH);
        	
        }
        
        
        field.setImmediate(true);
        
        getAllFields().add(field);
        
        return field;
	}

	/**
	 * @return the allFields
	 */
	public List<Field> getAllFields() {
		
		if ( allFields == null ) {
			allFields = new LinkedList<Field>();
		}
		return allFields;
	}
	
	public void clearFields() {
							
		getAllFields().clear();
		
		
	}

	
	
}
