/*
 *	File: @(#)EsbCalcCmd.java 	Package: com.pace.ext.cmds 	Project: PafCustomCommands
 *	Created: May 7, 2006  		By: AFarkas
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
package com.pace.ext.cmds;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.mdb.IPafConnectionProps;
import com.pace.base.state.IPafClientState;
import com.pace.mdb.essbase.EsbData;

/**
 * Common Essbase Custom Command Properties & Methods
 *  
 * @version	x.xx
 * @author AFarkas
 *
 */
public abstract class EssbaseCmd extends AbstractCommand {

	private static Logger logger = Logger.getLogger(EssbaseCmd.class);
	private static final String PROPKEY_DATA_SOURCE_ID = "DATASOURCEID";
	public String dataSourceId = null;

	/**
	 *  Return an Essbase data connection
	 *
	 * @param tokenCatalog Collection of resolved client and application tokens
	 * @param clientState Client state object
	 * 
	 * @return EsbData Essbase data object
	 * @throws PafException
	 */
	public EsbData getEsbDataConnection (Properties tokenCatalog, IPafClientState clientState) throws PafException {

		// Get data source ID. If DEFAULT VALUE is specified then default to the current application's
		// data source ID (TTN-1387).
		String dataSourceId = this.getActionParm(PROPKEY_DATA_SOURCE_ID, tokenCatalog, false);	
		if (dataSourceId.equalsIgnoreCase(defaultCCParm)) {
			dataSourceId = clientState.getApp().getMdbDef().getDataSourceId();
		}

		// Get connection information
		IPafConnectionProps connectionProps = clientState.getDataSources().get(dataSourceId);
		if (connectionProps == null) {
			errMsgBase += "Unable to get the connection properties for the dataSourceID [" + dataSourceId + "]";
			logger.error(errMsgBase);
			throw new IllegalArgumentException(errMsgBase);
		}

		// Create Essbase data object
		EsbData esbData = new EsbData(connectionProps.getProperties(), dataSourceId);
		
		// Return results
		return esbData;
	}

}
