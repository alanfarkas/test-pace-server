/*
 *	File: @(#)PafBaseMember.java 	Package: com.pace.base.mdb 	Project: Paf Base Libraries
 *	Created: Aug 3, 2005  			By: Alan Farkas
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
package com.pace.base.mdb;

import org.apache.log4j.Logger;

import com.essbase.api.metadata.IEssMember.EEssShareOption;
import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;

/**
 * Node of a PafBaseTree
 * 
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafBaseMember extends PafDimMember implements Cloneable {

	private static Logger logger = Logger.getLogger(PafBaseMember.class);
 	
    /**
	 * @param key Member name
	 */
	public PafBaseMember(String key) {
	
		// Set PafBaseMember key
		setKey(key);
	}
    
    /**
	 * @param key Member name
	 */
	public PafBaseMember(String key, PafBaseMemberProps memberProps) {
	
		// Set PafBaseMember key
		setKey(key);
		
		// Set Properties
		setMemberProps(memberProps);
	}
    
    public PafBaseMember() {
        
    }

	
	/**
	 *	Return pointer to parent node
	 *
	 * @return PafBaseMember Parent Node 
	 */
	public PafBaseMember getParent() {
		return (PafBaseMember) super.getParent();
	}

   /**
	 *	Return the PafBaseMember property object
	 *
	 * @return Returns the PafBaseMember property object
	 */
	public PafBaseMemberProps getMemberProps() {
		return (PafBaseMemberProps)super.getMemberProps();
	}
	/**
	 *	Set the PafBaseMember property object
	 *
	 * @param memberProps The PafBaseMember property object to set
	 */
	public void setMemberProps(PafBaseMemberProps memberProps) {
		super.setMemberProps(memberProps);
	}

   
//    public PafBaseMember clone() throws CloneNotSupportedException {
//        PafBaseMember newMember = (PafBaseMember) super.clone();
//        ArrayList<PafBaseMember> childrenCopies = new ArrayList<PafBaseMember>(this.getChildren().size());
//        for (PafBaseMember child : this.getChildren() ) {
//            childrenCopies.add(child.clone());
//        }
//        newMember.children = childrenCopies;
//        
//        return newMember;
//    }
    
    /**
     *	This method returns a new object with no pointers to parents or children
     *  hence "Disc" or disconnected. It is intended to be placed into a reordered
     *  hierarchical structure.
     *  Note the properties object is shallow copies, as these are assumed to be static
     *  for the life of all trees that can point to it.
     *
     * @return PafBaseMember
     * @throws PafException 
     */
    public PafBaseMember getShallowDiscCopy() throws PafException  {
        PafBaseMember newMember = new PafBaseMember(getKey());
            
        // Clone member properties since they may differ on shared
        // hierarchies (TTN-1347).
			try { 
				newMember.setMemberProps(getMemberProps().clone());
			} catch (CloneNotSupportedException e) {
				// throw Paf Exception
				String errMsg = "Error getting disconnected copy of member: [" + getKey() 
					+ "] - " + e.getMessage();
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error, e);	
				pfe.setStackTrace(e.getStackTrace());
				throw pfe;
 		}

        return newMember;
    }

	/**
	 *	Return a simple version of the PafBaseMember
	 *
	 * @return PafSimpleBaseMember
	 */
	public PafSimpleBaseMember getSimpleVersion() {
		
		PafSimpleBaseMember simpleBaseMember = null;

		logger.debug("Returning simple version of PafBaseMember: [" + getKey() + "]");

		simpleBaseMember = new PafSimpleBaseMember(getKey());
		
		return simpleBaseMember;
	}

	/**
	 *  Indicates if member is read-only
	 *
	 * @return true if member is read-only
	 */
	public boolean isReadOnly() {
		return getMemberProps().isReadOnly();
	}

	/**
	 *  Indicates if member is shared
	 *
	 * @return true if member is shared
	 */
	public boolean isShared() {
		return getMemberProps().getShareOption() == EEssShareOption.SHARED_MEMBER;
	}

	/**
	 *  Indicates if member is synthetic
	 *
	 * @return true if member is synthetic
	 */
	public boolean isSynthetic() {
		return getMemberProps().isSynthetic();
	}

	/* (non-Javadoc)
	 * @see com.pace.base.mdb.PafDimMember#clone()
	 */
	@Override
	public PafBaseMember clone() throws CloneNotSupportedException {
		
		PafBaseMember baseMember = (PafBaseMember) super.clone();
		
		// Clone member properties
		if (getMemberProps() != null) {
			baseMember.setMemberProps((PafBaseMemberProps) getMemberProps().clone());
		}
		
		// Return base member clone
		return baseMember;
		
	}

	
}
