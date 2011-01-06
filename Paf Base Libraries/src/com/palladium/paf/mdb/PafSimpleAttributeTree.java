/*
 *	File: @(#)PafSimpleAttributeTree.java 		Package: com.palladium.paf.mdb 	Project: Paf Base Libraries
 *	Created: Nov 21, 2006  		By: AFarkas
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

/**
 * This is a simplified version of the Paf Attribute Member Tree
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public class PafSimpleAttributeTree extends PafSimpleDimTree {
 
    public PafSimpleAttributeTree() {}

    /**
     * @param rootKey Root Node to use in initializing the PafSimpleBaseTree
	 * @param aliasTableNames List of Essbase table names
     */
    @Deprecated
    public PafSimpleAttributeTree(String rootKey, String[] aliasTableNames) {
        
    	// Set instance variables
        setId(rootKey);
    	setRootKey(rootKey);
      	setAliasTableNames(aliasTableNames);
   }
    
    /**
     * @param id Attribute name 
     * @param rootKey Root Node to use in initializing the PafSimpleBaseTree
	 * @param aliasTableNames List of Essbase table names
     */
    public PafSimpleAttributeTree(String id, String rootKey, String[] aliasTableNames) {
        
    	// Set instance variables
        setId(id);
    	setRootKey(rootKey);
      	setAliasTableNames(aliasTableNames);
   }

}
