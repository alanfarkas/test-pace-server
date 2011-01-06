/*
 *	File: @(#)IPafConnectionProps.java 	Package: com.palladium.paf.mdb.essbase 	Project: Essbase Provider
 *	Created: Aug 10, 2005  			By: Alan Farkas
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

import java.util.Properties;

/**
 * Provides an interface to various Paf connection objects
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public interface IPafConnectionProps {

	public void setConnectionString(String connString);
    public Properties getProperties();
    public void setMetaDataServiceProvider(String mdspClassName);
    public String getMetaDataServiceProvider();
    public void setDataServiceProvider(String mdspClassName);
    public String getDataServiceProvider();
    public void setMdbClassLoader(String mdspClassName);
	public String getMdbClassLoader();
    
}