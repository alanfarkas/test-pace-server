package com.pace.base.data;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.pace.base.mdb.PafDimTree;
import com.pace.base.mdb.PafDimTree.DimTreeType;

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

	public List<String> getAttributeDimensions() {
	
		List<String> attributeDims = new ArrayList<String>();
		for (String dim : getTreeDimensions()) {
			PafDimTree dimTree = getTree(dim);
			if (dimTree.getTreeType().equals(DimTreeType.Attribute)) {
				attributeDims.add(dim);
			}
		}
		
		return attributeDims;
	}
	
	public List<String> getBaseDimensions() {
		
		List<String> baseDims = new ArrayList<String>();
		for (String dim : getTreeDimensions()) {
			PafDimTree dimTree = getTree(dim);
			if (dimTree.getTreeType().equals(DimTreeType.Base)) {
				baseDims.add(dim);
			}
		}
		
		return baseDims;
	}
    
    public Collection<PafDimTree> getTrees() {
        return memberTrees.values();
    }
}
