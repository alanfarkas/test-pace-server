/*
 *	File: @(#)IMdbClassLoader.java 	Package: com.pace.base.mdb 		Project: Paf Base Libraries
 *	Created: March 4, 2010  		By: Alan Farkas
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
package com.pace.base.mdb;

import java.io.IOException;

import com.pace.base.PafException;

/**
 * Loads necessary mdb provider classes
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
/**
 * @author ADG
 *
 */
public interface IMdbClassLoader {


	/**
	 *  Load mdb provider classes
	 *   
	 * @throws IOException 
	 *  
	 */
	public void load() throws IOException;

	/**
	 * @return the mdbApiVersion
	 */
	public String getMdbApiVersion();

	/**
	 * @return the metaDataProvider
	 * @throws PafException 
	 */
	public IMdbMetaData getMetaDataProvider() throws PafException;

	/**
	 * @return the mdbDataProvider
	 * @throws PafException 
	 */
	public IMdbData getMdbDataProvider() throws PafException;

}
