/**
 * 
 */
package com.pace.settings.ui;

import java.util.ArrayList;
import java.util.List;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.data.Container;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Field;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.Button.ClickListener;

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
        setPageLength(paceSettingsApplication.getMdbDatasourceContainer().size());
        List<String> captionHeaderList = new ArrayList<String>();
        
        for (Object formOrder : paceSettingsApplication.getMdbDatasourceFieldFactory().getFormOrderList()) {
        	
        	String caption = formOrder.toString();
        	
        	if ( paceSettingsApplication.getMdbDatasourceFieldFactory().getCaptionMap().containsKey(caption)) {
        		
        		caption = paceSettingsApplication.getMdbDatasourceFieldFactory().getCaptionMap().get(caption);
        	}
        	
        	captionHeaderList.add(caption);
        	
        }
        
        setColumnHeaders(captionHeaderList.toArray(new String[0]));
        
        this.setColumnAlignment("connectionToolTip", Table.ALIGN_LEFT);
        this.setItemIcon("connectionToolTip",new ThemeResource("icons/32/questionmark1.png"));
		
        setSelectable(true);
        setImmediate(true);
        addListener((ItemClickListener) paceSettingsApplication);
        setNullSelectionAllowed(false);
     
        
        
        
  
        setColumnExpandRatio(MDBDatasourceFieldFactory.NAME, 10);
        setColumnExpandRatio(MDBDatasourceFieldFactory.CONNECTION_STRING, 45);
       
        setColumnExpandRatio(MDBDatasourceFieldFactory.META_DATA_SERVICE_PROVIDER, 25);
        setColumnExpandRatio(MDBDatasourceFieldFactory.DATA_SERVICE_PROVIDER, 20);
        
      
        
	}
	
	public void resizeTable() {
		
		if ( getContainerDataSource() != null ) {
			
			setPageLength(getContainerDataSource().size());
			
		}
		
	}

	/* (non-Javadoc)
	 * @see com.vaadin.ui.Table#setPageLength(int)
	 */
	@Override
	public void setPageLength(int pageLength) {
	
		int maxSize = 8;
		
		if ( pageLength <= maxSize ) {
		
			super.setPageLength(pageLength);
			
		} else {
			
			super.setPageLength(maxSize);
			
		}
		
		
	}

	

}
