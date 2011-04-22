/*
 *	File: @(#)PafCellNoteExportRequest.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Aug 22, 2007  		By: jmilliron
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

import com.pace.base.comm.PafRequest;
import com.pace.base.db.cellnotes.CellNotesInformation;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafSimpleCellNoteExportRequest extends PafRequest {

	private CellNotesInformation[] cellNoteInformationAr = null;

	/**
	 * @return the cellNoteInformationAr
	 */
	public CellNotesInformation[] getCellNoteInformationAr() {
		return cellNoteInformationAr;
	}

	/**
	 * @param cellNoteInformationAr the cellNoteInformationAr to set
	 */
	public void setCellNoteInformationAr(
			CellNotesInformation[] cellNoteInformationAr) {
		this.cellNoteInformationAr = cellNoteInformationAr;
	}
	
}
