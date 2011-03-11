/*
 *	File: @(#)IPafCompressedSingleObj.java 	Package: com.pace.base 	Project: Paf Base Libraries
 *	Created: Jun 9, 2008  		By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base;

import java.io.IOException;

/**
 * Compression interface for an object that is entirely compressible into a string
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public interface IPafCompressedSingleObj extends IPafCompressedObj {

	public void compressData(String dynamicDelimiter) throws IOException;
	public String getCompressedData();
	public void setCompressedData(String compressedData);
	public Integer getDynamicEscapeCount(String delimiter, String escapeChar);

}
