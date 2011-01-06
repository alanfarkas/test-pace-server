/*
 *	File: @(#)PafSimpleCellNoteImportRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Aug 24, 2007  		By: jmilliron
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
package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.db.cellnotes.SimpleCellNote;

/**
 * Import Simple Cell Note Request
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafSimpleCellNoteImportRequest extends PafRequest {

	private SimpleCellNote[] simpleCellNotes;

	/**
	 * @return the simpleCellNotes
	 */
	public SimpleCellNote[] getSimpleCellNotes() {
		return simpleCellNotes;
	}

	/**
	 * @param simpleCellNotes the simpleCellNotes to set
	 */
	public void setSimpleCellNotes(SimpleCellNote[] simpleCellNotes) {
		this.simpleCellNotes = simpleCellNotes;
	}
	
}
