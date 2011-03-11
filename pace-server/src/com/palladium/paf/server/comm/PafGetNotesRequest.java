/**
 * 
 */
package com.palladium.paf.server.comm;

import com.pace.base.comm.PafRequest;
import com.pace.base.comm.SimpleCoordList;

/**
 * @author fskrgic
 *
 */
public class PafGetNotesRequest extends PafRequest {
	
	private SimpleCoordList simpleCoordList;
	
	private boolean refreshFromDatabase;

	/**
	 * @return the refreshFromDatabase
	 */
	public boolean isRefreshFromDatabase() {
		return refreshFromDatabase;
	}

	/**
	 * @param refreshFromDatabase the refreshFromDatabase to set
	 */
	public void setRefreshFromDatabase(boolean refreshFromDatabase) {
		this.refreshFromDatabase = refreshFromDatabase;
	}

	/**
	 * @return the simpleCoordLists
	 */
	public SimpleCoordList getSimpleCoordLists() {
		return simpleCoordList;
	}

	/**
	 * @param simpleCoordLists the simpleCoordLists to set
	 */
	public void setSimpleCoordLists(SimpleCoordList simpleCoordList) {
		this.simpleCoordList = simpleCoordList;
	}

	/**
	 * 
	 */
	public PafGetNotesRequest() {
		// TODO Auto-generated constructor stub
	}

}
