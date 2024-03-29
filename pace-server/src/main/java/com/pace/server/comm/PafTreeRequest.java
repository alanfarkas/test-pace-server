/**
 * 
 */
package com.pace.server.comm;

import com.pace.base.comm.PafRequest;


/**
 * @author jmilliron
 *
 */
public class PafTreeRequest extends PafRequest {
	
	private String treeName;
	
	private boolean isCompressResponse = false;

	/**
	 * @return the treeName
	 */
	public String getTreeName() {
		return treeName;
	}

	/**
	 * @param treeName the treeName to set
	 */
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

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
