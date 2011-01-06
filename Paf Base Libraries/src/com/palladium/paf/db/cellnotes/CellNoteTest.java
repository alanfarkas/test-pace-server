/*
 *	File: @(#)CellNoteTest.java 	Package: com.palladium.paf.db.cellnotes 	Project: Paf Base Libraries
 *	Created: Jul 24, 2007  		By: jmilliron
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
package com.palladium.paf.db.cellnotes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.palladium.paf.comm.SimpleCoordList;
import com.palladium.paf.db.Application;
import com.palladium.paf.db.DataSource;
import com.palladium.paf.db.Dimension;

/**
 * Unit Tests for CellNote class.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class CellNoteTest extends TestCase {

	private CellNote globalCellNote = null;
	
	private SimpleCellNote globalSimpleCellNote = null;
	
	private List<String> axesOrDimensionList = new ArrayList(Arrays.asList(new String[] { "Product", "Location", "Version", "Measures"  }));
	
	private List<String> coordinatesOrMembersList = new ArrayList(Arrays.asList(new String[] { "Div09", "Store1", "WP", "SLS_AUR" })); 
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		globalCellNote = createCellNote();
		globalSimpleCellNote = createSimpleCellNote();
		
	}

	/**
	 * 
	 * Creates a cell note and populates with data.
	 *
	 * @return Instance of a cell note.
	 */
	private CellNote createCellNote() {
		
		CellNote cellNote = new CellNote();
		cellNote.setApplication(new Application("App1"));
		cellNote.setDataSource(new DataSource("DS1"));
		cellNote.setText("Cell Note Test");
		cellNote.setCreator("JavaJ");
		cellNote.setLastUpdated(new Date());
		
		Set<CellNoteMapping> mappings = new HashSet<CellNoteMapping>();
						
		mappings.add(new CellNoteMapping(new Dimension(axesOrDimensionList.get(0), true), coordinatesOrMembersList.get(0), cellNote));
		mappings.add(new CellNoteMapping( new Dimension(axesOrDimensionList.get(1), true), coordinatesOrMembersList.get(1), cellNote));
		mappings.add(new CellNoteMapping(new Dimension(axesOrDimensionList.get(2), true), coordinatesOrMembersList.get(2), cellNote));
		mappings.add(new CellNoteMapping(new Dimension(axesOrDimensionList.get(3), true), coordinatesOrMembersList.get(3), cellNote));
		
		cellNote.setCellNoteMappingSet(mappings);
		
		return cellNote;
	}
	
	/**
	 * 
	 *  Creates a SimpleCellNote and populates with data
	 *
	 * @return
	 */
	private SimpleCellNote createSimpleCellNote() {
		
		SimpleCellNote simpleCellNote = new SimpleCellNote();
		simpleCellNote.setApplicationName("App1");
		simpleCellNote.setDataSourceName("DS1");
		simpleCellNote.setText("Cell Note Test");
		simpleCellNote.setCreator("JavaJ");
		simpleCellNote.setLastUpdated(new Date());
		
		SimpleCoordList simpleCoordList = new SimpleCoordList();
		simpleCoordList.setAxis(axesOrDimensionList.toArray(new String[0]));
		simpleCoordList.setCoordinates(coordinatesOrMembersList.toArray(new String[0]));
		simpleCellNote.setSimpleCoordList(simpleCoordList);
		
		return simpleCellNote;
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		globalCellNote = null;
		globalSimpleCellNote = null;
	}


	/**
	 * 
	 *  Creates a cell note using a simple cell note passed in on the constructor.
	 *  
	 *  This test to ensure the attributes match on both.
	 *
	 */
	public void testCellNoteSimpleCellNote() {

		CellNote cellNote = new CellNote(globalSimpleCellNote);
		
		assertNotNull(cellNote);
		assertNotNull(cellNote.getApplication().getName());
		assertEquals(cellNote.getApplication().getName(), globalSimpleCellNote.getApplicationName());
		assertNotNull(cellNote.getDataSource().getName());
		assertEquals(cellNote.getDataSource().getName(), globalSimpleCellNote.getDataSourceName());
		assertEquals(cellNote.getText(), globalSimpleCellNote.getText());
		assertEquals(cellNote.getCreator(), globalSimpleCellNote.getCreator());
		assertEquals(cellNote.getLastUpdated(), globalSimpleCellNote.getLastUpdated());
		
		assertNotNull(cellNote.getCellNoteMappingSet());
		assertEquals(cellNote.getCellNoteMappingSet().size(), axesOrDimensionList.size());
		assertEquals(cellNote.getCellNoteMappingSet().size(), coordinatesOrMembersList.size());
		
		for (CellNoteMapping cellNoteMapping: cellNote.getCellNoteMappingSet()) {
			
			assertNotNull(cellNoteMapping);

			assertNotNull(cellNoteMapping.getDimension());
			
 			if ( ! axesOrDimensionList.contains(cellNoteMapping.getDimension().getName()) ) {
				fail("Cell Note dimension '" + cellNoteMapping.getDimension().getName() + "' not found");
			}
 			
 			if ( ! coordinatesOrMembersList.contains(cellNoteMapping.getMemberName()) ) {
				fail("Cell Note member '" + cellNoteMapping.getMemberName() + "' not found"); 				
 			}
 			
 			
		}
						
		
	}

	/**
	 * 
	 *  Gets an instance of a simple cell note from an existing cell note.
	 *
	 *	This test to ensure the attributes match on both.
	 *
	 */
	public void testGetSimpleCellNote() {
						
		SimpleCellNote simpleCellNote = globalCellNote.getSimpleCellNote();
		
		assertNotNull(simpleCellNote);
		assertEquals(simpleCellNote.getApplicationName(), globalCellNote.getApplication().getName());
		assertEquals(simpleCellNote.getDataSourceName(), globalCellNote.getDataSource().getName());
		assertEquals(simpleCellNote.getText(), globalCellNote.getText());
		assertEquals(simpleCellNote.getCreator(), globalCellNote.getCreator());
		assertEquals(simpleCellNote.getLastUpdated(), globalCellNote.getLastUpdated());
		
		assertNotNull(simpleCellNote.getSimpleCoordList());
		
		String[] axis = simpleCellNote.getSimpleCoordList().getAxis();
		
		assertNotNull(axis);
		assertEquals(axis.length, this.globalCellNote.getCellNoteMappingSet().size());
		
		for (String a : axis) {
			if ( ! this.axesOrDimensionList.contains(a)) {
				fail("Axis '" + a + "' doesn't exists");
			}
		}
		
		String[] coords = simpleCellNote.getSimpleCoordList().getCoordinates();
		
		assertNotNull(coords);
		assertEquals(coords.length, this.globalCellNote.getCellNoteMappingSet().size());

		for (String coord : coords) {
			if ( ! this.coordinatesOrMembersList.contains(coord)) {
				fail("Coordinate '" + coord + "' doesn't exists");
			}
		}
		
		
	}

	/**
	 * Key should be in dimension alphabetic order by member seperated by |'s.
	 */
	public void testGetKey() {

		assertEquals(this.globalCellNote.getKey(), "Store1|SLS_AUR|Div09|WP");
		
	}

}
