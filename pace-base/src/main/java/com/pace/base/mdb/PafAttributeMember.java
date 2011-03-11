package com.pace.base.mdb;

import org.apache.log4j.Logger;

public class PafAttributeMember extends PafDimMember {

	private static Logger logger = Logger.getLogger(PafBaseMember.class);
 	
    /**
	 * @param key Member name
	 */
	public PafAttributeMember(String key) {
	
		// Set PafBaseMember key
		setKey(key);
	}
    
    public PafAttributeMember() {
        
    }


	/**
	 *	Return pointer to parent node
	 *
	 * @return PafAttributeMember Parent Node 
	 */
	public PafAttributeMember getParent() {
		return (PafAttributeMember) super.getParent();
	}

   /**
	 *	Return the PafAttributeMember property object
	 *
	 * @return Returns the PafAttributeMember property object
	 */
	public PafAttributeMemberProps getMemberProps() {
		return (PafAttributeMemberProps)super.getMemberProps();
	}
	/**
	 *	Set the PafAttributeMember property object
	 *
	 * @param memberProps The PafAttributeMember property object to set
	 */
	public void setMemberProps(PafAttributeMemberProps memberProps) {
		super.setMemberProps(memberProps);
	}

	/**
	 *  Indicates if member is shared
	 *
	 * @return true if member is shared
	 */
	public boolean isShared() {
		// Attribute trees don't support shared members
		return false;
	}
        
    /**
     *	This method returns a new object with no pointers to parents or children
     *  hence "Disc" or disconnected. It is intended to be placed into a reordered
     *  hierarchical structure.
     *  Note the properties object is shallow copies, as these are assumed to be static
     *  for the life of all trees that can point to it.
     *
     * @return PafAttributeMember
     */
    public PafAttributeMember getShallowDiscCopy() {
        PafAttributeMember newMember = null;        
        newMember = new PafAttributeMember(getKey());
            
        // these properties do not change during the life of the member so
        // allow shallow copy
        newMember.setMemberProps(getMemberProps());

        return newMember;
    }

	/**
	 *	Return a simple version of the PafBaseMember
	 *
	 * @return PafSimpleAttributeMember
	 */
	public PafSimpleAttributeMember getSimpleVersion() {
		
		PafSimpleAttributeMember simpleAttributeMember = null;

		logger.debug("Returning simple version of PafBaseMember: [" + getKey() + "]");

		simpleAttributeMember = new PafSimpleAttributeMember(getKey());
		
		return simpleAttributeMember;
	}
    
}
