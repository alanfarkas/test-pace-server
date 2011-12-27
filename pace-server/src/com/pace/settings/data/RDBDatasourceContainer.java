package com.pace.settings.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.db.RdbProps;
import com.vaadin.data.util.BeanItemContainer;

/**
 * Relational Datasource Container.
 * 
 * @author JMilliron
 *
 */
public class RDBDatasourceContainer extends BeanItemContainer<RdbProps>{
	
	private static final long serialVersionUID = -2992769974346112813L;
	
	private static final Logger logger = Logger.getLogger(RDBDatasourceContainer.class);

	public RDBDatasourceContainer() throws IllegalArgumentException {
		super(RdbProps.class);
		readData();
		
	}
		
	/**
	 * Saves data
	 * 
	 * @return true if successful
	 */
	public boolean saveData() {
		
		boolean isSaved = false;
		
		List<RdbProps> rdbPropsList = new ArrayList<RdbProps>();
		
		for ( RdbProps rdbProps : getAllItemIds()) {
			
			rdbPropsList.add(rdbProps);
			
		}
				
		PaceSettingsDataService.setRDBDatasources(rdbPropsList);
		
		isSaved = true;
		
		return isSaved;
		
	}
	
	/**
	 * Reads data
	 */
	public void readData() {
		
		removeAllItems();
		
		List<RdbProps> data = null;
		
		try {
			
			data = PaceSettingsDataService.getRDBDatasources();

		} catch (PafConfigFileNotFoundException e) {
			logger.info(e);
		}
		
		if ( data == null ) {
			
			data = new ArrayList<RdbProps>();
			
		}
		
		addAll(data);
	}


	
}
