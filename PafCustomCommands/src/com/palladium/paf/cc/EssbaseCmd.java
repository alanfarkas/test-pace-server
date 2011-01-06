/*
 *	File: @(#)EsbCalcCmd.java 	Package: com.palladium.paf.cc 	Project: PafCustomCommands
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
package com.palladium.paf.cc;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.PafException;
import com.palladium.paf.mdb.IPafConnectionProps;
import com.palladium.paf.mdb.essbase.EsbData;
import com.palladium.paf.state.IPafClientState;

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
