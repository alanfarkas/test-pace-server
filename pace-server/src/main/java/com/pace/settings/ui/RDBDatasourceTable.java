/**
 * 
 */
package com.pace.settings.ui;

import java.util.ArrayList;
import java.util.List;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.ui.Table;

/**
 * Relational Datasource Table
 * 
 * @author JMilliron
 *
 */
public class RDBDatasourceTable extends Table {

	private static final long serialVersionUID = -8136604842128189919L;
	
	public RDBDatasourceTable(PaceSettingsApplication paceSettingsApplication) {
		
		//this.paceSettingsApplication = paceSettingsApplication;
		
		setSizeFull();
		
		setContainerDataSource(paceSettingsApplication.getRdbDatasourceContainer());
		setNewItemsAllowed(false);
		setPageLength(paceSettingsApplication.getRdbDatasourceContainer().size());
        setVisibleColumns(paceSettingsApplication.getRdbDatasourceFieldFactory().getFormOrderList().toArray());
        
        List<String> captionHeaderList = new ArrayList<String>();
        
        for (Object formOrder : paceSettingsApplication.getRdbDatasourceFieldFactory().getFormOrderList()) {
        	
        	String caption = formOrder.toString();
        	
        	if ( paceSettingsApplication.getRdbDatasourceFieldFactory().getCaptionMap().containsKey(caption)) {
        		
        		caption = paceSettingsApplication.getRdbDatasourceFieldFactory().getCaptionMap().get(caption);
        	}
        	
        	captionHeaderList.add(caption);
        	
        }
        
        setColumnHeaders(captionHeaderList.toArray(new String[0]));
		
        setSelectable(true);
        setImmediate(true);

        addListener((ItemClickListener) paceSettingsApplication);
        
        setNullSelectionAllowed(false);
               
        setColumnExpandRatio(RDBDatasourceFieldFactory.NAME, 10);
        setColumnExpandRatio(RDBDatasourceFieldFactory.HIBERNATE_PROPERTY_LIST, 90);
        
	}

	

}
