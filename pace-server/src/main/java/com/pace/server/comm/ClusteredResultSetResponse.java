/**
 * 
 */
package com.pace.server.comm;

import com.pace.base.comm.PafResponse;

/**
 * @author jim
 *
 */
public class ClusteredResultSetResponse extends PafResponse {
	StringRow header;
	StringRow[] data;
	
	
	public StringRow[] getData() {
		return data;
	}
	public void setData(StringRow[] data) {
		this.data = data;
	}
	public StringRow getHeader() {
		return header;
	}
	public void setHeader(StringRow header) {
		this.header = header;
	}

	

}
