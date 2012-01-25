/**
 * 
 */
package com.pace.server;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.pace.base.PafException;
import com.pace.base.comm.SimpleCoordList;
import com.pace.base.db.cellnotes.CellNote;
import com.pace.base.db.cellnotes.CellNoteMapping;
import com.pace.base.db.cellnotes.SimpleCellNote;


/**
 * @author fskrgic
 *
 */
public class CellNoteCache {
	
	private static final Logger logger = Logger.getLogger(CellNoteCache.class);
	
	private ConcurrentHashMap<String, CellNote> cellNotes;
	
	private HashMap<String, Set<String>> unitOfWork;
	
	private String dataSourceId;
	
	private String appId;
	
	public CellNoteCache(HashMap<String, Set<String>> uow, String dataSourceId, String appId) throws PafException {

		logger.debug("Creating new cell note cache.");
		
		cellNotes = new ConcurrentHashMap<String, CellNote>();
		unitOfWork = uow;
		this.dataSourceId = dataSourceId;
		this.appId = appId;
		
		refreshCache();
		
	}

	public SimpleCellNote [] getNotes(SimpleCoordList intersections){
		
		SimpleCellNote [] simpleCellNoteAr = null;
		
		if ( intersections != null ) {
		
			ArrayList<SimpleCellNote> scn = new ArrayList<SimpleCellNote>();
			
			String [] axis = intersections.getAxis();
			
			String [] coordinates = intersections.getCoordinates();
			
			String [] [] coordByDimension = new String [axis.length][coordinates.length/axis.length];
			
			for(int i = 0; i < coordinates.length; i++){
				coordByDimension [i % axis.length][i / axis.length] = coordinates [i];
			}
			
			TreeMap<String, Integer> dimToIntMap = new TreeMap<String, Integer>();
			for(int i = 0; i < axis.length; i++){
				dimToIntMap.put(axis[i], i);
			}
			
			Arrays.sort(axis);
			
			String [] [] coordByDimensionSorted = new String [axis.length][];
			
			for(int i = 0; i < axis.length; i++){
				coordByDimensionSorted [i] = coordByDimension [dimToIntMap.get(axis[i])];
			}
			
			String [] keys = new String [coordinates.length/axis.length];
			
			for(int i = 0; i < coordinates.length/axis.length; i++){
				keys[i] = "";
				for(int j = 0; j < axis.length; j++){
					if(!keys[i].equals("")){
						keys[i] += "|";
					}
					keys[i] += coordByDimensionSorted[j][i];
				}
			}
			
			ArrayList<CellNote> retrievedCellNotes = new ArrayList<CellNote>();
			
			for (String key : keys) {
				
				CellNote note = cellNotes.get(key);
				
				if(note != null){
					
					retrievedCellNotes.add(note);
					
				}
				
			}
			
			for (CellNote note : retrievedCellNotes) {
				
				scn.add(note.getSimpleCellNote(axis));
				
			}
			
			simpleCellNoteAr = scn.toArray(new SimpleCellNote[0]); 
			
			if ( simpleCellNoteAr.length == 0 ) {
				simpleCellNoteAr = null;
			}
					
		}
		
		return simpleCellNoteAr;
	}
	
	public SimpleCellNote [] getAllNotes(String[] axisSeq){
		
		ArrayList<SimpleCellNote> scn = new ArrayList<SimpleCellNote>();
		
		if ( axisSeq != null ) {
		
			//loop thought all cell note values and only return the cell notes valid for the axis seq.
			//the axisSeq must match the number of dims and dim names on the cell note.
			for (CellNote note : cellNotes.values() ) {
				
				
				Set<CellNoteMapping> cellNoteMappingSet = note.getCellNoteMappingSet();
				
				if ( axisSeq.length != cellNoteMappingSet.size()) {
					continue;
				}
				
				Set<String> axisSeqSet = new HashSet<String>(Arrays.asList(axisSeq));
				
				for (CellNoteMapping cellNoteMapping : cellNoteMappingSet ) {
					
					if ( ! axisSeqSet.contains(cellNoteMapping.getDimension().getName()) ) {
						
						continue;
					}
					
				}		
						
				scn.add(note.getSimpleCellNote(axisSeq));
								
			}
		
		}
		
		return scn.toArray(new SimpleCellNote[0]);
		
	}
	
	
	
	public void refreshCache() throws PafException{
								
				logger.debug("Refreshing Cache from db.");
		
				CellNote [] cellNotesArray = PafCellNoteManager.getInstance().getCellNotes(appId, dataSourceId, unitOfWork);
				
				logger.debug("\tClearing cache.");
				
				cellNotes.clear();
				
				if (cellNotesArray != null) {
					
					logger.debug("\tRepopulating cache: " + cellNotesArray.length);	
					
					for (CellNote note : cellNotesArray) {
						
						cellNotes.put(note.getKey(), note);
						
					}
					
				} else {
					
					logger.debug("\tRepopulating cache: " + 0);
					
				}
	}
	
	public void processNotes(SimpleCellNote[] simpleCellNotesToSave, SimpleCellNote[] simpleCellNotesToDelete) throws PafException {
		
		logger.debug("DEBUG - Start processNotes(SimpleCellNote[], SimpleCellNote[]) - " + new Date());
		
		CellNote[] cellNotesToSave = null;
						
		if ( simpleCellNotesToSave != null ) {
		
			List<CellNote> cellNotesToSaveList = new ArrayList<CellNote>();
			
			for (SimpleCellNote simpleNote : simpleCellNotesToSave) {
				
				/*
				//clear note note
				simpleNote.setId(-1);
				
				if (cellNotes.containsKey( simpleNote.generateKey() )) {
					
					//get existing note object and update data.
					CellNote updNote = cellNotes.get(simpleNote.generateKey());
					
					updNote.setText(simpleNote.getText());
					
					cellNotesToSaveList.add(updNote);
				}
				else {
										
					cellNotesToSaveList.add(new CellNote(simpleNote));					
				}
				*/
				
				cellNotesToSaveList.add(new CellNote(simpleNote));
				
			}
			
			if ( cellNotesToSaveList.size() > 0 ) {
				
				cellNotesToSave = cellNotesToSaveList.toArray(new CellNote[0]);
				
			}
			
		}
		
		CellNote[] cellNotesToDelete = null;
		
		if ( simpleCellNotesToDelete != null ) {
			
			List<CellNote> cellNotesToDeleteList = new ArrayList<CellNote>();
			
			for (SimpleCellNote note : simpleCellNotesToDelete) {
				
				CellNote aNote = cellNotes.get(note.generateKey());
				
				if ( aNote != null) {
					
					cellNotesToDeleteList.add(aNote);
				
				}
								
			}
			
			if ( cellNotesToDeleteList.size() > 0 ) {
				
				cellNotesToDelete = cellNotesToDeleteList.toArray(new CellNote[0]);
				
			}
			
		}
		
		PafCellNoteManager.getInstance().processCellNotes(cellNotesToSave, cellNotesToDelete);	
		
		if ( cellNotesToSave != null ) {
			
			//2nd add to cell note cache if not there
			for (CellNote note : cellNotesToSave) {			
							
				cellNotes.put(note.getKey(), note);
					
			}
			
		}
			
		//if notes to delete
		if ( cellNotesToDelete != null ) {
			
			//remove notes from cache
			for (CellNote note : cellNotesToDelete) {
				
				cellNotes.remove(note.getKey());
				
			}
			
		}
		
		logger.debug("DEBUG - End processNotes(SimpleCellNotes[], SimpleCellNote[]" + new Date());
		
		
	}
	
	public void saveNotes(SimpleCellNote [] modifiedNotes) throws PafException {
								
		if( modifiedNotes != null ){
			
			ArrayList<CellNote> cellNoteList = new ArrayList<CellNote>();
			
			for (SimpleCellNote simpleNote : modifiedNotes) {
				
				if (cellNotes.containsKey( simpleNote.generateKey() )) {
					
					//get existing note object and update data.
					CellNote updNote = cellNotes.get(simpleNote.generateKey());
					
					updNote.setText(simpleNote.getText());
					
					cellNoteList.add(updNote);
				}
				else {
					// new note
					simpleNote.setId(-1);
					cellNoteList.add(new CellNote(simpleNote));					
				}
				
			}
			
			//1st persist to db
			PafCellNoteManager.getInstance().saveCellNotes(cellNoteList.toArray(new CellNote[0]));
					
			//2nd add to cell note cache
			for (CellNote note : cellNoteList) {
				cellNotes.put(note.getKey(), note);
			}
		}
	}
	
	public void deleteNotes(SimpleCellNote [] deletedNotes) throws PafException {
		
		if ( deletedNotes != null ) {
			
			ArrayList<CellNote> notesToDelete = new ArrayList<CellNote>();
			
			for (SimpleCellNote note : deletedNotes) {
				
				CellNote aNote = cellNotes.remove(note.generateKey());
				
				notesToDelete.add(aNote);
				
			}
			
			PafCellNoteManager.getInstance().deleteCellNotes(notesToDelete.toArray(new CellNote[0]));
	
		}
	}
			
}
