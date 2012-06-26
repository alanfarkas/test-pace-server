/**
 * 
 */
package com.pace.settings.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.mdb.PafConnectionProps;
import com.vaadin.data.util.BeanItemContainer;

/**
 * @author JMilliron
 *
 */
public class MDBDatasourceContainer extends BeanItemContainer<PafConnectionProps> {

	private static final long serialVersionUID = -1411854235540811035L;
	
	private static final Logger logger = Logger.getLogger(MDBDatasourceContainer.class);
	
	/**
	 * Creates container
	 * 
	 * @throws IllegalArgumentException
	 */
	public MDBDatasourceContainer() throws IllegalArgumentException {
		super(PafConnectionProps.class);
		readData();
		
	}
		
	public boolean saveData() {
		
		boolean isSaved = false;
		
		List<PafConnectionProps> pafConnectionPropsList = new ArrayList<PafConnectionProps>();
		
		for ( PafConnectionProps pafConnectionProps : getAllItemIds()) {
			
			pafConnectionPropsList.add(pafConnectionProps);
			
		}
				
		PaceSettingsDataService.setMDBDatasources(pafConnectionPropsList);
		
		isSaved = true;
		
		return isSaved;
		
	}
	
	public void readData() {
		
		removeAllItems();
		
		List<PafConnectionProps> data = null;
		
		try {
			
			data = PaceSettingsDataService.getMDBDatasources();

		} catch (PafConfigFileNotFoundException e) {
			logger.info(e);
		}
		
		if ( data == null ) {
			
			data = new ArrayList<PafConnectionProps>();
			
		}
		
		addAll(data);
	}

}
