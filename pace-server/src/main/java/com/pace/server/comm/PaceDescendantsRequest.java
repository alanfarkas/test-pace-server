package com.pace.server.comm;

import com.pace.base.comm.PafRequest;
import com.pace.base.comm.SimpleCoordList;

public class PaceDescendantsRequest extends PafRequest {

	private SimpleCoordList[] sessionCells;
	
	public PaceDescendantsRequest() {}
	
	public PaceDescendantsRequest(SimpleCoordList[] sessionCells) {
		this.sessionCells = sessionCells;
	}
	
	public SimpleCoordList[] getSessionCells() {
		return sessionCells;
	}

	public void setSessionCells(SimpleCoordList[] sessionCells) {
		this.sessionCells = sessionCells;
	}
	
	
	
}
