package com.pace.server.comm;

import com.pace.base.comm.PafRequest;

public class PafVerifyUsersRequest extends PafRequest{
	private String[] users;

	public void setUsers(String[] users) {
		this.users = users;
	}

	public String[] getUsers() {
		return users;
	}
	
	

}
