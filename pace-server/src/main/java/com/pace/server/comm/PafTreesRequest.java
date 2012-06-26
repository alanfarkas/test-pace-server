/**
 * 
 */
package com.pace.server.comm;

import com.pace.base.comm.PafRequest;

/**
 * @author jmilliron
 *
 */
public class PafTreesRequest extends PafRequest {

	private boolean isCompressResponse = false;

	/**
	 * @return the isCompressResponse
	 */
	public boolean isCompressResponse() {
		return isCompressResponse;
	}

	/**
	 * @param isCompressResponse the isCompressResponse to set
	 */
	public void setCompressResponse(boolean isCompressResponse) {
		this.isCompressResponse = isCompressResponse;
	}
	
}
