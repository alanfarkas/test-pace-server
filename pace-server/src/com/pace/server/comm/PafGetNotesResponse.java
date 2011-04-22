/**
 * 
 */
package com.pace.server.comm;

import com.pace.base.db.cellnotes.SimpleCellNote;

/**
 * @author fskrgic
 *
 */
public class PafGetNotesResponse {
	
	private SimpleCellNote [] notes;

	/**
	 * 
	 */
	public PafGetNotesResponse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the notes
	 */
	public SimpleCellNote[] getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(SimpleCellNote[] notes) {
		this.notes = notes;
	}

}
