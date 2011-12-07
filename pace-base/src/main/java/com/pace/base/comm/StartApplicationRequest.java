/**
 * 
 */
package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

/**
 * Start Application Request.
 * 
 * @author JMilliron
 *
 */
public class StartApplicationRequest extends PafRequest {

	/** The app ids. */
	private List<String> appIds = new ArrayList<String>();
	
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
