package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;

public class PafVerifyUsersRequest extends PafRequest{
	private String[] users;

	public void setUsers(String[] users) {
		this.users = users;
	}

	public String[] getUsers() {
		return users;
	}
	
	

}
