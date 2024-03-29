/*
 *	File: @(#)UnitOfWork.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Sep 1, 2005  		By: JWatkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 *	05/24/06		AFarkas			x.xx			Moved from com.pace.base.data (PafServer)
 * 
 */
package com.pace.base.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pace.base.data.PafMemberList;
import com.pace.base.data.PafSimpleUow;

/**
 * Holds a completely qualified multidimensional space.
 * Each dimension has a list of members associated with it.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class UnitOfWork{
    private HashMap <String, String[]>dimMembers = new HashMap<String, String[]>();
    private String[] dimensions; // this is kept to preserve the order or retrieval from the hashmap
    private HashMap<Integer, String> axisIndex = new HashMap<Integer, String>();
    private HashMap<String, Integer> dimIndex = new HashMap<String, Integer>();
    
    // Discontiguous member groups by dimension. This collection is only populated for discontiguous
    // dimensions - dimensions whose unexpanded member list is comprised of multiple expressions,
    // instead of a single branch or member. Each member group contains the expanded member terms
    // for a single member expression. This information is needed for the subsequent process that
    // creates a discontiguous uow tree for each discontiguous dimension. 
    private Map<String, List<List<String>>> discMbrGrpsByDim = new HashMap<String, List<List<String>>>(); 
    
    public UnitOfWork() {}
    
    public UnitOfWork(PafSimpleUow simpleUow) {
        dimensions = new String[simpleUow.getPafMemberEntries().length];
       
        int i = 0;
        for (PafMemberList memberList : simpleUow.getPafMemberEntries()) {
        	axisIndex.put(i, memberList.getDimName());
        	dimIndex.put(memberList.getDimName(), i);
            dimensions[i++] = memberList.getDimName();
            dimMembers.put(memberList.getDimName(), memberList.getMemberNames());
        } 
    }
    
    public UnitOfWork(String[] dimensions) {
        this.dimensions = dimensions;
        
        int i =0;
        for (String dim : dimensions) {
           	dimIndex.put(dim, i);
           	axisIndex.put(i++, dim);
           	dimMembers.put(dim, new String[] {dim});
        }
    }
    
    public UnitOfWork(String[] dimensions, String[][]members) {

        if (dimensions.length != members.length) 
            throw new IllegalArgumentException("Dimension count and member list count must be identical");
        
        this.dimensions = dimensions;
        int i =0;
        for (String dim : dimensions) {
        	axisIndex.put(i, dim);
           	dimIndex.put(dim, i);
           	dimMembers.put(dim, members[i++]);
        }
    }
    
	public UnitOfWork(PafDimSpec[] pafDimSpecs){
		dimensions = new String[pafDimSpecs.length];
		int i = 0;
		
        for (PafDimSpec pafDimSpec : pafDimSpecs) {
        	axisIndex.put(i, pafDimSpec.getDimension());
          	dimIndex.put(pafDimSpec.getDimension(), i);
          	dimensions[i++] = pafDimSpec.getDimension();
            dimMembers.put(pafDimSpec.getDimension(), pafDimSpec.getExpressionList());
        }
	}
    
    public void setDimensions(String[] dimensions) {
        this.dimensions = dimensions;
        
        int i =0;
        for (String dim : dimensions) {
          	dimIndex.put(dim, i);
        	axisIndex.put(i++, dim);
            dimMembers.put(dim, new String[] {dim});
        }
    }
    
    public void setDimMembers(String dim, String[] members) {
        dimMembers.put(dim, members);
    }
    
    public String[] getDimMembers(String dim) {
        return dimMembers.get(dim);
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String dim : dimMembers.keySet()) {
            sb.append(dim + " : ");
            for (String entry : dimMembers.get(dim) )
            	sb.append(entry + ", ");
            sb.append("\n");
        }
        return sb.toString();
    }

    public String[] getDimensions() {
        return dimensions;
    }

    public HashMap<String, String[]> getDimMembers() {
        return dimMembers;
    }

    /**
	 * @return the discontiguous dimensions
	 */
	public Set<String> getDiscontigDims() {
		
		Set<String> discontigDims = new HashSet<String>();
		if (discMbrGrpsByDim != null) {
			for (String dim : discMbrGrpsByDim.keySet()) {
				if (!discMbrGrpsByDim.get(dim).isEmpty()) {
					discontigDims.add(dim);
				}
			}
		}
		return discontigDims;
	}

	/**
	 * 	Determine if the dimension is discontiguous
	 *
	 * @param dimension Dimension
	 * @return True is the dimension is discontiguous
	 */
	public boolean isDiscontigDim(String dimension) {
		return getDiscontigDims().contains(dimension);
	}
	
	/**
	 * @return the discontigMemberGroups
	 */
	public Map<String, List<List<String>>> getDiscontigMemberGroups() {
		return discMbrGrpsByDim;
	}

	/**
	 * @param discMbrGroupsByDim the discontigMemberGroups to set
	 */
	public void setDiscontigMemberGroups(Map<String, List<List<String>>> discMbrGroupsByDim) {
		this.discMbrGrpsByDim = discMbrGroupsByDim;
	}

	/**
	 * Return the list of discontiguous member groups for the specified
	 * dimension.
	 * 
	 * @param dimension Dimension name
	 * @return List<List<String>>
	 */
	public List<List<String>> getDiscontigMemberGroups(String dimension) {
		return discMbrGrpsByDim.get(dimension);
	}


	public PafSimpleUow getSimpleUow() {
        PafSimpleUow simpleUow = new PafSimpleUow();
        PafMemberList[] memberLists = new PafMemberList[dimensions.length];
        int i = 0;
        for (String dim : dimensions) {
            memberLists[i] = new PafMemberList();
            memberLists[i].setDimName(dim);
            memberLists[i].setMemberNames(dimMembers.get(dim));
            i++;
        }
        simpleUow.setPafMemberEntries(memberLists);
        return simpleUow;
    }

	public HashMap<Integer, String> getAxisIndices() {
		return axisIndex;
	}
    
	public UnitOfWork clone(){
		UnitOfWork UOWClone = new UnitOfWork();
		
		String[] dimensions = this.getDimensions().clone();
    	UOWClone.setDimensions(dimensions);
    	
    	for(String dimension : dimensions){
    		UOWClone.setDimMembers(dimension, this.getDimMembers(dimension).clone());
    	}
    	
    	for (String dimension : discMbrGrpsByDim.keySet()) {
    		List<List<String>> dimMbrGrps = discMbrGrpsByDim.get(dimension);
    		List<List<String>> clonedMbrGrps = new ArrayList<List<String>>();
    		for (List<String> memberList : dimMbrGrps) {
    			List<String> clonedMemberList = new ArrayList<String>(memberList);
    			clonedMbrGrps.add(clonedMemberList);
    		}
    		UOWClone.getDiscontigMemberGroups().put(dimension, clonedMbrGrps);
    	}
 
    	return UOWClone;
    }
		
	public PafDimSpec[] getPafDimSpecs(){
		PafDimSpec[] pafDimSpecs = new PafDimSpec[dimensions.length];
		int i = 0;
		
        for (String dim : dimensions) {
        	PafDimSpec pafDimSpec = new PafDimSpec();
        	pafDimSpec.setDimension(dim);
        	pafDimSpec.setExpressionList(dimMembers.get(dim));
        	
        	pafDimSpecs[i++] = pafDimSpec;
        }
        
        return pafDimSpecs;
	}
	
	public long getMemberCount(){
		long count = 1;
		for (String dim : dimensions) {
			count = count * dimMembers.get(dim).length;
		}
		return count;
	}
    
	public String[] getEmptyDimensions(){
		List<String> emptyDimensions = new ArrayList<String>();
		for (String dim : dimensions) {
			if (dimMembers.get(dim).length == 0){
				emptyDimensions.add(dim);
			}

		}
		return emptyDimensions.toArray(new String[0]);
	}

	
	/**
	 *  Convert unit of work to a map
	 *  
	 * @return Map<Integer, List<String>>
	 */
	public Map<Integer, List<String>> buildUowMap() {
		
		Map <Integer, List<String>> uowMap = new HashMap<Integer, List<String>>(axisIndex.size());
		for (int axis = 0; axis < axisIndex.size(); axis++) {
			String[] members = getDimMembers(axisIndex.get(axis)); 
			List<String> memberList = new ArrayList<String>(Arrays.asList(members));
			uowMap.put(axis, memberList);
		}
		return uowMap;
		
	}

	/**
	 *  Convert unit of work to a member filter map
	 *  
	 * @return Map<String, List<String>>
	 */
	public Map<String, List<String>> buildMemberFilter() {
		
		Map <String, List<String>> memberFilter = new HashMap<String, List<String>>(axisIndex.size());
		for (String dim : dimensions) {
			String[] members = getDimMembers(dim); 
			List<String> memberList = new ArrayList<String>(Arrays.asList(members));
			memberFilter.put(dim, memberList);
		}
		return memberFilter;
		
	}

	/**
	 * 	Return axis for specified dimension
	 * 
	 * @param dimension Uow Dimension
	 * @return Axis number
	 */
	public Integer getDimIndex(String dimension) {
		return dimIndex.get(dimension);
	}
}
