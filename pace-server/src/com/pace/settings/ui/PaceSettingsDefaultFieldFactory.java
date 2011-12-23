/**
 * 
 */
package com.pace.settings.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Item;
import com.vaadin.ui.Component;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

/**
 * Abstract Pace Settings Default Field Factory
 * 
 * @author JMilliron
 * 
 */
public abstract class PaceSettingsDefaultFieldFactory extends DefaultFieldFactory {

	private static final long serialVersionUID = -1442191615737978281L;

	// form order
	protected List<Object> formOrderList = new ArrayList<Object>();

	// override caption map
	protected Map<String, String> captionMap = new HashMap<String, String>();

	// required field set
	protected Set<String> requiredFieldSet = new HashSet<String>();

	@Override
	public Field createField(Item item, Object propertyId, Component uiContext) {

		Field field = super.createField(item, propertyId, uiContext);

		// add catpion
		if (captionMap.containsKey(propertyId)) {

			field.setCaption(captionMap.get(propertyId));

		}

		// add if required and set error message
		if (requiredFieldSet.contains(propertyId)) {

			// add required field
			field.setRequired(true);
			field.setRequiredError(field.getCaption() + " is a required field.");

		}
		
		// if text field, change nulls to empty strings and set the common width
		if (field instanceof TextField) {

			((TextField) field).setNullRepresentation("");
			((TextField) field)
					.setWidth(PaceSettingsConstants.COMMON_FIELD_WIDTH_20_EM);

		}
		
		return field;
	}
	
	/**
	 * @return the formOrderList
	 */
	public List<Object> getFormOrderList() {

		return new ArrayList<Object>(formOrderList);

	}

	/**
	 * @return the captionMap
	 */
	public Map<String, String> getCaptionMap() {
		return new HashMap<String, String>(captionMap);
	}

	/**
	 * @return the requiredFieldSet
	 */
	public Set<String> getRequiredFieldSet() {
		return new HashSet<String>(requiredFieldSet);
	}
	
	
	
}
