/**
 * 
 */
package com.pace.admin;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author jim
 *
 */

@WebService(endpointInterface = "com.pace.admin.PaceAdmin", serviceName = "PaceAdminService")
public class PaceAdminService implements PaceAdmin {

	/* (non-Javadoc)
	 * @see com.pace.admin.PaceAdmin#getServerStatus(com.pace.admin.ServerStatusRequest)
	 */
	@Override
	public ServerStatusResponse getServerStatus(ServerStatusRequest req) {
		// TODO Auto-generated method stub
		return new ServerStatusResponse();
	}

}
