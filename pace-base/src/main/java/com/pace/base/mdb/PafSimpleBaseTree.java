/*
 *	File: @(#)PafSimpleBaseTree.java 	Package: com.pace.base.server.data 	Project: PafServer
 *	Created: Aug 25, 2005  		By: JWatkins
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


/**
 * This is a simplified version of the Paf Base Member Tree
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafSimpleBaseTree extends PafSimpleDimTree {

 //   private PafSimpleBaseMember[] memberObjects;
 
    public PafSimpleBaseTree() {}

    /**
     * @param rootKey Root Node to use in initializing the PafSimpleBaseTree
	 * @param aliasTableNames List of Essbase table names
     */
    @Deprecated
    public PafSimpleBaseTree(String rootKey, String[] aliasTableNames) {
        
    	// Set instance variables
    	setId(rootKey);
       	setRootKey(rootKey);
        setAliasTableNames(aliasTableNames);
   }
    
    /**
     * @param id Dimension name
     * @param rootKey Root Node to use in initializing the PafSimpleBaseTree
	 * @param aliasTableNames List of Essbase table names
     */
    public PafSimpleBaseTree(String id, String rootKey, String[] aliasTableNames) {
        
    	// Set instance variables
    	setId(id);
       	setRootKey(rootKey);
        setAliasTableNames(aliasTableNames);
   }

 
//	/**
//	 *	Return the array of member objects
//	 *
//	 * @return Returns the array of member objects
//	 */
//    public PafSimpleBaseMember[] getMemberObjects() {
//        return memberObjects;
//    }
//	/**
//	 *	Set the array of member objects
//	 *
//	 * @param memberObjects The array of member objects to set
//	 */
//    public void setMemberObjects(PafSimpleBaseMember[] memberObjects) {
//        this.memberObjects = memberObjects;
//    }

}
