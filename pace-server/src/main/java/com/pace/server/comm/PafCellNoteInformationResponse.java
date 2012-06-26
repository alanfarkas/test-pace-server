/*
 *	File: @(#)PafCellNoteInformationResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Aug 21, 2007  		By: jmilliron
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
package com.pace.server.comm;

import com.pace.base.db.cellnotes.CellNotesInformation;

/**
 * Sends client all the cell note information from the db.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafCellNoteInformationResponse {
	
	private CellNotesInformation[] cellNotesInformationAr;

	/**
	 * @return the cellNotesInformationAr
	 */
	public CellNotesInformation[] getCellNotesInformationAr() {
		return cellNotesInformationAr;
	}

	/**
	 * @param cellNotesInformationAr the cellNotesInformationAr to set
	 */
	public void setCellNotesInformationAr(
			CellNotesInformation[] cellNotesInformationAr) {
		this.cellNotesInformationAr = cellNotesInformationAr;
	}

}
