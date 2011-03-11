/*
 *	File: @(#)IPafCustomCommand.java 	Package: com.pace.base 	Project: Paf Base Libraries
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
package com.pace.base;

import java.util.Properties;

import com.pace.base.state.IPafClientState;

/**
 * All custom commands implemented to extend the application framework
 * must implement this interface.
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public interface IPafCustomCommand {
    /**
     *	Execute a custom command
     *
 	 * @param clientProps Client state properties
	 * @param clientState Client state object
	 * 
	 * @return CustomdCommandResult 
	 * @throws PafException
     */
    public CustomCommandResult execute(Properties clientProps, IPafClientState clientState) throws PafException;

}
