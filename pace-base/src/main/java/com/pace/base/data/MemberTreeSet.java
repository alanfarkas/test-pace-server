package com.pace.base.data;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.base.mdb.PafAttributeTree;
import com.pace.base.mdb.PafBaseTree;
import com.pace.base.mdb.PafDimTree;
import com.pace.base.mdb.PafDimTree.DimTreeType;

public class MemberTreeSet {
	
	private Map<String, PafDimTree> memberTrees = new HashMap<String, PafDimTree>(10);
	private List<String> attributeDims = new ArrayList<String>();
	private List<String> baseDims = new ArrayList<String>();
	

	public MemberTreeSet() {
	}
	
	public MemberTreeSet(Map<String, ?> treeMap) {
		addAllTrees(treeMap);
	}
	
	public void addTree(String dim, PafDimTree tree) {
		memberTrees.put(dim, tree);
		if (tree.getTreeType().equals(DimTreeType.Base)) {
			baseDims.add(dim);
		} else {
			if (tree.getTreeType().equals(DimTreeType.Attribute)) {
				attributeDims.add(dim);
			}
		}
	}
	
	public void addAllTrees(Map<String, ?> treeMap) {
		for (String dim : treeMap.keySet()) {
			addTree(dim, (PafDimTree) treeMap.get(dim));
		}
	}
	
	public PafDimTree getTree(String dim) {
		return memberTrees.get(dim);
	}
	
	public PafAttributeTree getAttributeTree(String dim) {
		PafAttributeTree attributeTree = null;
		if (attributeDims.contains(dim)) {
			attributeTree = (PafAttributeTree) memberTrees.get(dim);
		}
		return attributeTree;
	}
	
	public Map<String, PafAttributeTree> getAttributeTrees() {
		Map<String, PafAttributeTree> attributeTrees = new HashMap<String, PafAttributeTree>(attributeDims.size());
		for (String dim : attributeDims) {
			attributeTrees.put(dim, getAttributeTree(dim));
		}
		return attributeTrees;
	}
	
	public PafBaseTree getBaseTree(String dim) {
		PafBaseTree baseTree = null;
		if (baseDims.contains(dim)) {
			baseTree = (PafBaseTree) memberTrees.get(dim);
		}
		return baseTree;
	}
	
	public Map<String, PafBaseTree> getBaseTrees() {
		Map<String, PafBaseTree> baseTrees = new HashMap<String, PafBaseTree>(baseDims.size());
		for (String dim : baseDims) {
			baseTrees.put(dim, getBaseTree(dim));
		}
		return baseTrees;
	}
	
	public Set<String> getTreeDimensions() {
		return memberTrees.keySet();
	}

	public List<String> getAttributeDimensions() {	
		return attributeDims;
	}
	
	public List<String> getBaseDimensions() {
		return baseDims;
	}
    
    public Collection<PafDimTree> getTrees() {
        return memberTrees.values();
    }
}
