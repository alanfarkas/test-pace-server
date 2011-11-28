package com.pace.base.data;

import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("userMemberLists")
public class UserMemberLists {
	

	private Map<String, PafMemberList> memberLists = new HashMap<String, PafMemberList>();
	
	public void addMemberList(String label, PafMemberList ml) {
		memberLists.put(label,  ml);
	}
	
	public void clearMemberLists() {
		memberLists.clear();
	}
	
	public PafMemberList getMemberList(String alias) {
		return memberLists.get(alias);
	}
	
}
