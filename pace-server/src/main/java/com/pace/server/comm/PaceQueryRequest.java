package com.pace.server.comm;

import java.util.ArrayList;

import com.pace.base.app.PafDimSpec;
import com.pace.base.comm.PafRequest;

public class PaceQueryRequest extends PafRequest {


	PafDimSpec members;
	ArrayList<PafDimSpec> attributes;
	int level;
	
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}


	/**
	 * @return the members
	 */
	public PafDimSpec getMembers() {
		return members;
	}


	/**
	 * @param members the members to set
	 */
	public void setMembers(PafDimSpec members) {
		this.members = members;
	}


	/**
	 * @return the attributes
	 */
	public ArrayList<PafDimSpec> getAttributes() {
		return attributes;
	}


	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(ArrayList<PafDimSpec> attributes) {
		this.attributes = attributes;
	}

	
	public PaceQueryRequest(PafDimSpec members, ArrayList<PafDimSpec> attributes) {
		this.members = members;
		this.attributes = attributes;
	}
	
	public PaceQueryRequest() {}

}
