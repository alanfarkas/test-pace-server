package com.pace.server.comm;

import com.pace.base.comm.PafResponse;
import com.pace.base.comm.SimpleCoordList;

public class PaceDescendantsResponse extends PafResponse {
	
	private SimpleCoordList[] sessionIntersections;
	
	public PaceDescendantsResponse() {}
	
	public PaceDescendantsResponse(SimpleCoordList[] sessionIntersections) {
		this.sessionIntersections = sessionIntersections;
	}

	public SimpleCoordList[] getSessionIntersections() {
		return sessionIntersections;
	}

	public void setSessionIntersections(SimpleCoordList[] sessionIntersections) {
		this.sessionIntersections = sessionIntersections;
	}
}
