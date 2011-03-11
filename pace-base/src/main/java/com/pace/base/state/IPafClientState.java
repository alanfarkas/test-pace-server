/*
 *	File: @(#)IPafClientState.java 	Package: com.pace.base 	Project: Paf Base Libraries
 *	Created: May 1, 2006  		By: JWatkins
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
package com.pace.base.state;

import java.util.Map;
import java.util.Properties;

import com.pace.base.app.PafApplicationDef;
import com.pace.base.mdb.IPafConnectionProps;
import com.pace.base.view.PafUserSelection;

/**
 * The interface to expose client information to custom functions.
 * Allows a subset of client information to be avaialable to 
 * externally written functions.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public interface IPafClientState {
	String getPaceHome();
	String getTransferDirPath();
	boolean isDebugMode();
    PafApplicationDef getApp();
    String getClientId();
    String getClientIpAddress();
    String getClientVersion();
    String getUserName();
	Properties generateTokenCatalog(Properties props); 
    Map<String, IPafConnectionProps> getDataSources();
    Map<String, PafUserSelection[]> getUserSelections();
}
