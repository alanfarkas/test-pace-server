/*
 *	File: @(#)AbstractCommand.java 	Package: com.pace.ext.cmds 	Project: pace-ext-cmds
 *	Created: May 19, 2009  			By: AFarkas
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2009 Palladium Group, Inc. All rights reserved.
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
package com.pace.ext.cmds;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.pace.base.CustomCommandResult;
import com.pace.base.PafBaseConstants;

/**
 * Common Custom Command Properties & Methods
 *
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class AbstractCommand {

	final String actionParmPrefix = PafBaseConstants.CC_TOKEN_PREFIX_ACTION_PARM;
	final String tokenStartChar = PafBaseConstants.CC_TOKEN_START_CHAR;
	final String tokenEndChar = PafBaseConstants.CC_TOKEN_END_CHAR;
	String defaultCCParm = tokenStartChar + PafBaseConstants.CC_PARM_DEFAULT + tokenEndChar;
	String errMsgBase = "Error in custom command [" + this.getClass().getName() + "] - ";
	String propKey = null;
	CustomCommandResult result = new CustomCommandResult();
	private static Logger logger = Logger.getLogger(AbstractCommand.class);

	
	/**
	 * Get the specified action parameter
	 * 
	 * @param parmName Action parameter name
	 * @param propCatalog Property catalog
	 * @param isRequired Indicates if parameter is required
	 * 
	 * @return String
	 */
	public String getActionParm(String parmName, Properties propCatalog, boolean isRequired) {

		String parmKey = tokenStartChar + actionParmPrefix + parmName + tokenEndChar;
		String parmVal = propCatalog.getProperty(parmKey);
		if (  (parmVal == null || parmVal.equals("")) && isRequired ) {
			String errMsgDtl = "Unable to resolve the [" + parmName + "] property";
			logger.error(errMsgBase + errMsgDtl);
			throw new IllegalArgumentException(errMsgBase + errMsgDtl);
		}
	
		return parmVal;
		
	}


}
