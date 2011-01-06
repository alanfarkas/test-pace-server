package com.palladium.paf.data;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.palladium.paf.mdb.PafDimTree;

public class MemberTreeSet {
	private HashMap<String, PafDimTree> memberTrees = new HashMap<String, PafDimTree>(10);
	
	public void addTree(String dim, PafDimTree tree) {
		memberTrees.put(dim, tree);
	}
	
	public PafDimTree getTree(String dim) {
		return memberTrees.get(dim);
	}
	
	public Set<String> getTreeDimensions() {
		return memberTrees.keySet();
	}

    
    public Collection<PafDimTree> getTrees() {
        return memberTrees.values();
    }
}
