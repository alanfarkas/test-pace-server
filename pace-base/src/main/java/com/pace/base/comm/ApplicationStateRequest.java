

package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;



/**
 * The Class ApplicationStateRequest.
 * A simple container for the web service layer. Requests a list of application states
 * by application id. An empty list should return all application states that the service
 * is aware of.
 * 
 *
 * @author JWatkins
 */

public class ApplicationStateRequest extends PafRequest {
	
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
