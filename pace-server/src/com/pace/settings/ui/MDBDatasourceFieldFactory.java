package com.pace.settings.ui;

import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Item;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;

/**
 * MDB Datasource Field Factory
 * 
 * @author JMilliron
 *
 */
public class MDBDatasourceFieldFactory extends PaceSettingsDefaultFieldFactory {

	
	private static final long serialVersionUID = 2885762876258153110L;
	
	public static final String NAME = "name";
	public static final String CONNECTION_STRING = "connectionString";
	public static final String META_DATA_SERVICE_PROVIDER = "metaDataServiceProvider";
	public static final String DATA_SERVICE_PROVIDER = "dataServiceProvider";
	public static final String MDB_CLASS_LOADER = "mdbClassLoader";
	
	private ComboBox metaDataServiceProviderComboBox = new ComboBox();
	
	private ComboBox dataServiceProviderComboBox = new ComboBox();
	
	public MDBDatasourceFieldFactory() {
		
		formOrderList.add(NAME);
		formOrderList.add(CONNECTION_STRING);
		formOrderList.add(META_DATA_SERVICE_PROVIDER);
		formOrderList.add(DATA_SERVICE_PROVIDER);		
		formOrderList.add(MDB_CLASS_LOADER);
		
		requiredFieldSet.add(NAME);
		requiredFieldSet.add(META_DATA_SERVICE_PROVIDER);
		requiredFieldSet.add(DATA_SERVICE_PROVIDER);
		requiredFieldSet.add(CONNECTION_STRING);
		
		captionMap.put(NAME, "Name");
		captionMap.put(META_DATA_SERVICE_PROVIDER, "Meta Data Service Provider");
		captionMap.put(DATA_SERVICE_PROVIDER, "Data Service Provider");
		captionMap.put(CONNECTION_STRING, "Connection String");
		captionMap.put(MDB_CLASS_LOADER, "MDB Class Loader");
		
		metaDataServiceProviderComboBox.setNewItemsAllowed(false);
		metaDataServiceProviderComboBox.setNullSelectionAllowed(false);
		metaDataServiceProviderComboBox.addItem("com.pace.mdb.essbase.EsbMetaData");
		
		dataServiceProviderComboBox.setNewItemsAllowed(false);
		dataServiceProviderComboBox.setNullSelectionAllowed(false);
		dataServiceProviderComboBox.addItem("com.pace.mdb.essbase.EsbData");
		
	}
	
	@Override
	public Field createField(Item item, Object propertyId, Component uiContext) {
		
		Field field = super.createField(item, propertyId, uiContext);
	
		if ( propertyId.equals(CONNECTION_STRING)) {
			
			field.setHeight("3em");
			field.setWidth("95%");
			
		} else if ( propertyId.equals(META_DATA_SERVICE_PROVIDER) ) {
			
			metaDataServiceProviderComboBox.setCaption(field.getCaption());
			metaDataServiceProviderComboBox.setRequired(requiredFieldSet.contains(propertyId));
			metaDataServiceProviderComboBox.setWidth(PaceSettingsConstants.COMMON_FIELD_WIDTH_25_EM);
			
			return metaDataServiceProviderComboBox;
			
		} else if ( propertyId.equals(DATA_SERVICE_PROVIDER) ) {
			
			dataServiceProviderComboBox.setCaption(field.getCaption());
			dataServiceProviderComboBox.setRequired(requiredFieldSet.contains(propertyId));
			dataServiceProviderComboBox.setWidth(PaceSettingsConstants.COMMON_FIELD_WIDTH_25_EM);
			
			return dataServiceProviderComboBox;
			
		} 
		
		
		return field;
	}

}
