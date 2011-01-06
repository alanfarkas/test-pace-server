/*
 *	File: @(#)PafDimMember.java 	Package: com.palladium.paf.mdb 	Project: Paf Base Libraries
 *	Created: Nov 12, 2006  		By: AFarkas
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
 * 
 */
package com.palladium.paf.mdb;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.palladium.paf.PafErrSeverity;
import com.palladium.paf.PafException;


/**
 * Node of a Paf Dim tree
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class PafDimMember implements Cloneable {

	private String key;
	private PafDimMemberProps memberProps;
	private List<PafDimMember> children = null;
	private PafDimMember parent = null;
	private static Logger logger = Logger.getLogger(PafDimMember.class);


	/**
	 *  Indicates if member is shared
	 *
	 * @return true if member is shared
	 */
	public abstract boolean isShared();
	
	/**
	 *	Return children of current PafBaseMember
	 *
	 * @return children Arraylist of PafBaseMembers
	 */
	public List<PafDimMember> getChildren() {
		
		List<PafDimMember> childList = null;
		
		// If no children are found, return empty array list
		if (children == null) {
			childList = new ArrayList<PafDimMember>();
		} else {
			// Else, return pointer to children
			childList = children;
		}
		return childList;
	}
	
	/**
	 * @param children The children to set.
	 */
	public void setChildren(List<PafDimMember> children) {
		this.children = children;
	}
	
	/**
	 *	Return PafBaseMember key (member name)
	 *
	 * @return PafBaseMember key (member name)
	 */
	public String getKey() {
		return key;
	}
    
	/**
	 *	Set PafBaseMember key (member name)
	 *
	 * @param key (member name)
	 */
    protected void setKey(String key) {
        this.key = key;
    }

    /**
	 *	Return the PafDimMember property object
	 *
	 * @return Returns the PafDimMember property object
	 */
	public PafDimMemberProps getMemberProps() {
		return memberProps;
	}
	/**
	 *	Set the PafDimMember property object
	 *
	 * @param memberProps The PafDimMember property object to set
	 */
	public void setMemberProps(PafDimMemberProps memberProps) {
		this.memberProps = memberProps;
	}

	/**
	 *	Return pointer to parent node
	 *
	 * @return PafDimMember Parent Node 
	 */
	public PafDimMember getParent() {
		return parent;
	}

	/**
	 *	Set parent node pointer
	 *
	 * @param parent Parent node (type PafDimMember)
	 */
	public void setParent(PafDimMember parent) {
		this.parent = parent;
	}

	/**
	 *	Add child node to PafDimTree
	 *
	 * @param childNode Child node to be added to PafDimTree
	 * @throws PafException 
	 */
	protected void addChild(PafDimMember childNode) throws PafException {
		
		try {
			// Create a new ArrayList of child nodes, if this is the first child
			if (children == null) 
				children = new ArrayList<PafDimMember>();
			
			// Set parent of child node to current PafBaseMember node
			childNode.parent = this;

			// Add child node to PafBaseTree
			children.add(childNode);

		} catch (Exception ex) {
			// throw Paf Exception
			String errMsg = "Java Exception: " + ex.getMessage();
			logger.error(errMsg);
			PafException pfe = new PafException(errMsg, PafErrSeverity.Error, ex);	
			throw pfe;
		}
	}

    public boolean hasChildren() {
        if (children == null || children.size() == 0) 
            return false;
 
        return true;
    }

    public boolean isFirstChild() {
        
    	boolean isFirstChild = false;
    	
        // by default if a node has no parent it is not a child of anything,
        // but for the purposes of the application it is currently considered
        // a singleton and both a 1st and last child.
        if (this.parent == null) {
        	isFirstChild = true;
        } else {       
        	if (this.parent.children.get(0) == this)
        		isFirstChild = true;
        	else
        		isFirstChild = false;
        }
        return isFirstChild;
    }
    
    public boolean isLastChild() {
 
    	boolean isLastChild = false;

        // by default if a node has no parent it is not a child of anything,
        // but for the purposes of the application it is currently considered
        // a singleton and both a 1st and last child.
        if (this.parent == null) {
        	isLastChild = true;
        } else {
        	if (this.parent.children.get(this.parent.children.size()-1) == this)
        		isLastChild = true;
        	else
        		isLastChild = false;
        }
        return isLastChild;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected PafDimMember clone() throws CloneNotSupportedException {
		
		PafDimMember dimMember = (PafDimMember) super.clone();
		
		// Clone parent
		if (this.parent != null) {
			dimMember.parent = this.parent;
		}
		
		// Clone children
		if (this.children != null) {
			dimMember.children = new ArrayList<PafDimMember>();
			for (int i = 0; i < this.children.size(); i++) {
				dimMember.children.add(this.children.get(i).clone());
			}
		}

		// Clone member properties
		if (this.memberProps != null) {
			dimMember.memberProps = this.memberProps.clone();
		}
		
		// Return dim member clone
		return dimMember;
	}
    
    /*
     *	Return the member key
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
    	return key;
     }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result
				+ ((memberProps == null) ? 0 : memberProps.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PafDimMember))
			return false;
		
		// Check individual member properties
		PafDimMember compare = (PafDimMember) obj;
		
		// -- Check key
		if (key == null) {
			if (compare.key != null)
				return false;
		} else if (!key.equals(compare.key))
			return false;

		// -- Check memberProps
		if (memberProps == null) {
			if (compare.memberProps != null)
				return false;
		} else if (!memberProps.equals(compare.memberProps))
			return false;
		
		// -- Check parent by just comparing parent keys. This avoids
		// redundant comparisons.
		if (parent == null) {
			if (compare.parent != null)
				return false;
		} else if (compare.parent == null) {
			return false;
		} else if (!parent.key.equals(compare.parent.key))
			return false;
		
		// -- Check children using scripted comparison logic. Using the default
		// comparison (".equals") results in excessive recursion.
		if (children == null) {
			if (compare.children != null)
				return false;
		} else if (compare.children == null) {
			return false;
		} else if (children.size() != compare.children.size()) {
			return false;
		} else for (int i = 0; i < children.size(); i++) {
			if (!children.get(i).key.equals(compare.children.get(i).key)) {
				return false;
			}
		}
		
		return true;
	}

}
