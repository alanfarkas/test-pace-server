/*
 *	File: @(#)IMdbMetaData.java 	Package: com.palladium.paf.mdb 		Project: Paf Base Libraries
 *	Created: Jul 3, 2005  			By: Alan Farkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
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

import com.palladium.paf.PafException;

/**
 * Provides access to the mid-tier meta-data layer
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public interface IMdbMetaData {

    /**
     *	Return a tree structure containing an Essbase dimension member, it's descendants,
     *  and any member properties. This method will in-turn call getDimension(0, branch, 0).
     *
     * @param branch 
     * @return PafBaseTree
     * @throws PafException 
     */
    public abstract PafBaseTree getBaseDimension(String branch) throws PafException;

    /**
     *	Return a tree structure containing an Essbase dimension member, it's descendants,
     *  and any member properties. This method will in-turn call getDimension(essNetTimeOut, branch, 0).
     *
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
     * @param branch 
     * @return PafBaseTree
     * @throws PafException 
     */
    public abstract PafBaseTree getBaseDimension(int essNetTimeOut, String branch) throws PafException;

    /**
     *	Return a tree structure containing an Essbase dimension member, it's descendants,
     *  and any member properties - down to the specified Essbase level.
     *
     * @param branch
     * @param toLevel
     * @return PafBaseTree 
     * @throws PafException 
     */
    public abstract PafBaseTree getBaseDimension(String branch, int toLevel) throws PafException;

    /**
     *	Return a tree structure containing an Essbase dimension member, it's descendants,
     *  and any member properties - down to the specified Essbase level.
     *
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
     * @param branch
     * @param toLevel
     * @return PafBaseTree 
     * @throws PafException 
     * @throws ClassNotFoundException 
     */
    public abstract PafBaseTree getBaseDimension(int essNetTimeOut, String branch, int toLevel) throws PafException;

	/**
	 *	Extract the specificed Attribute Dimension from Essbase
	 *
	 * @param dimension An array of attribute dimension names
	 * @param mdbProps Properties of multi-dimensional database
	 * @param essNetTimeOut Essbase network timeout (in milliseconds)
	 * 
	 * @return Paf attribute tree
	 * @throws PafException 
	 */

	public abstract PafAttributeTree getAttributeDimension(int essNetTimeOut, String dimension, PafMdbProps mdbProps) throws PafException;
      
    /**
     * Disconnect from Essbase
     * @throws PafException 
     * 
     */
    public abstract void disconnect() throws PafException;

	/**
	 *	Return basic multidimensional database properties
	 *
	 * @return MdbProps Basic multidimensional database properties
	 * @throws PafException 
	 */
	public abstract PafMdbProps getMdbProps() throws PafException;
	
	public boolean varyingAttributesExist(String[] dims, PafMdbProps mdbProps, int essNetTimeOut)throws PafException;
}
