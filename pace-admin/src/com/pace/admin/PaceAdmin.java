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

@WebService
public interface PaceAdmin {

	@WebMethod
	public ServerStatusResponse getServerStatus(ServerStatusRequest req);
}
