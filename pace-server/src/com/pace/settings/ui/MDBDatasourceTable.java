/**
 * 
 */
package com.pace.settings.ui;

import java.util.ArrayList;
import java.util.List;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.data.Container;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;

/**
 * @author JMilliron
 *
 */
public class MDBDatasourceTable extends Table {

	private PaceSettingsApplication paceSettingsApplication = null;

	private static final long serialVersionUID = 5420191120805247205L;
	
	public MDBDatasourceTable(PaceSettingsApplication paceSettingsApplication) {
		
		this.paceSettingsApplication = paceSettingsApplication;
		
		setSizeFull();
		
		setContainerDataSource(paceSettingsApplication.getMdbDatasourceContainer());
        setVisibleColumns(paceSettingsApplication.getMdbDatasourceFieldFactory().getFormOrderList().toArray());
        
        List<String> captionHeaderList = new ArrayList<String>();
        
        for (Object formOrder : paceSettingsApplication.getMdbDatasourceFieldFactory().getFormOrderList()) {
        	
        	String caption = formOrder.toString();
        	
        	if ( paceSettingsApplication.getMdbDatasourceFieldFactory().getCaptionMap().containsKey(caption)) {
        		
        		caption = paceSettingsApplication.getMdbDatasourceFieldFactory().getCaptionMap().get(caption);
        	}
        	
        	captionHeaderList.add(caption);
        	
        }
        
        setColumnHeaders(captionHeaderList.toArray(new String[0]));
		
        setSelectable(true);
        setImmediate(true);
        //addListener((Property.ValueChangeListener) paceSettingsApplication);
        addListener((ItemClickListener) paceSettingsApplication);
        
        setNullSelectionAllowed(false);
        
        setTableFieldFactory(new TableFieldFactory() {
			
			@Override
			public Field createField(Container container, Object itemId,
					Object propertyId, Component uiContext) {
				
				
				if ( propertyId.equals(MDBDatasourceFieldFactory.CONNECTION_STRING)) {
					
					//setColumnWidth(propertyId, 100);
					setStyleName("table-text-wrap");
					
					
				}
				
				
				return null;
			}
		});
        
        setColumnExpandRatio(MDBDatasourceFieldFactory.NAME, 10);
        setColumnExpandRatio(MDBDatasourceFieldFactory.CONNECTION_STRING, 45);
        setColumnExpandRatio(MDBDatasourceFieldFactory.META_DATA_SERVICE_PROVIDER, 25);
        setColumnExpandRatio(MDBDatasourceFieldFactory.DATA_SERVICE_PROVIDER, 20);
        
        
        
	}

	

}
