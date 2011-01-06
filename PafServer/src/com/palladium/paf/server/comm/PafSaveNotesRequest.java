/**
 * 
 */
package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.db.cellnotes.SimpleCellNote;

/**
 * @author fskrgic
 *
 */
public class PafSaveNotesRequest extends PafRequest {

	private SimpleCellNote [] addNotes;
	private SimpleCellNote [] updateNotes;
	private SimpleCoordList deleteNoteIntersections;
	
	/**
	 * 
	 */
	public PafSaveNotesRequest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the addnotes
	 */
	public SimpleCellNote [] getAddNotes() {
		return addNotes;
	}

	/**
	 * @param addnotes the addnotes to set
	 */
	public void setAddNotes(SimpleCellNote [] addnotes) {
		this.addNotes = addnotes;
	}

	/**
	 * @return the updateNotes
	 */
	public SimpleCellNote [] getUpdateNotes() {
		return updateNotes;
	}

	/**
	 * @param updateNotes the updateNotes to set
	 */
	public void setUpdateNotes(SimpleCellNote [] updateNotes) {
		this.updateNotes = updateNotes;
	}

	public SimpleCoordList getDeleteNoteIntersections() {
		return deleteNoteIntersections;
	}

	public void setDeleteNoteIntersections(SimpleCoordList deleteNoteIntersections) {
		this.deleteNoteIntersections = deleteNoteIntersections;
	}

}
