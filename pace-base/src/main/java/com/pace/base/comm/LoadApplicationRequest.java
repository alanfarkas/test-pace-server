/*
 * 
 */
package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadApplicationRequest.
 * Communication object for requesting the server load an application.
 * This can also be used to reload the application data.
 * 
 */
public class LoadApplicationRequest extends PafRequest {
	
	/** The app ids. */
	private List<String> appIds = new ArrayList<String>();
	
	/** Is load mdb. */
	private boolean isLoadMdb;
	

	/**
	 * Checks if is load mdb.
	 *
	 * @return isLoadMdb
	 */
	public boolean isLoadMdb() {
		return isLoadMdb;
	}

	/**
	 * Sets the load mdb.
	 *
	 * @param loadMdb the loadMdb to set
	 */
	public void setLoadMdb(boolean loadMdb) {
		this.isLoadMdb = loadMdb;
	}

	/**
	 * Gets the app ids.
	 *
	 * @return the app ids
	 */
	public final List<String> getAppIds() {
		return appIds;
	}

	/**
	 * Sets the app ids.
	 *
	 * @param appIds the new app ids
	 */
	public final void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}

}
	
	
