/*
 *	File: @(#)SimpleCellNoteTest.java 	Package: com.palladium.paf.db.cellnotes 	Project: Paf Base Libraries
 *	Created: Sep 17, 2007  		By: jmilliron
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

import java.io.IOException;
import java.util.Date;

import com.palladium.paf.comm.SimpleCoordList;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class SimpleCellNoteTest extends TestCase {
	
	private static final String CREATOR = "javaj";

	private SimpleCellNote simpleCellNote = null;
	
	private static final String APP_NAME = "App1";
	
	private static final String DATA_SOURCE_NAME = "DS1";
	
	private static final String TEXT = "This is test text.";

	//private static SimpleCoordList simpleCoodList = null;
	
	private static String[] axis = new String[] { "dim4","dim2","dim1", "dim3" };
	
	private static String[] coords = new String[] {"abc", "def", "hig", "kdkd"};
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
		simpleCellNote = new SimpleCellNote();
		simpleCellNote.setId(-1);
		simpleCellNote.setApplicationName(APP_NAME);
		simpleCellNote.setDataSourceName(DATA_SOURCE_NAME);
		simpleCellNote.setText(TEXT);
		simpleCellNote.setLastUpdated(new Date());
		simpleCellNote.setCreator(CREATOR);
		
		SimpleCoordList simpleCoodList = new SimpleCoordList();
		simpleCoodList.setAxis(axis );
		simpleCoodList.setCoordinates(coords);
		
		simpleCellNote.setSimpleCoordList(simpleCoodList);
		
		simpleCellNote.setVisible(false);
		
		assertNotNull(simpleCellNote);
		
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.db.cellnotes.SimpleCellNote#generateKey()}.
	 */
	public void testGenerateKey() {
		
		assertNotNull(simpleCellNote.generateKey());
		assertEquals(simpleCellNote.generateKey(), "hig|def|kdkd|abc");
		
		simpleCellNote.setSimpleCoordList(null);
		assertNull(simpleCellNote.generateKey());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.db.cellnotes.SimpleCellNote#compressData()}.
	 */
	public void testCompressData() {
		
		assertNotNull(simpleCellNote.getSimpleCoordList());
		assertEquals(simpleCellNote.isCompressed(), false);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), false);
		assertNotNull(simpleCellNote.getSimpleCoordList().getAxis());
		assertNotNull(simpleCellNote.getSimpleCoordList().getCoordinates());
		assertNull(simpleCellNote.getSimpleCoordList().getCompressedData());
		
		try {
			simpleCellNote.compressData();
		} catch (IOException e) {
			fail(e.getMessage());
		}

		assertEquals(simpleCellNote.isCompressed(), true);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), true);
		assertNull(simpleCellNote.getSimpleCoordList().getAxis());
		assertNull(simpleCellNote.getSimpleCoordList().getCoordinates());
		assertNotNull(simpleCellNote.getSimpleCoordList().getCompressedData());	
		
	}

	/**
	 * Test method for {@link com.palladium.paf.db.cellnotes.SimpleCellNote#isCompressed()}.
	 */
	public void testIsCompressed() {
		
		assertEquals(simpleCellNote.isCompressed(), false);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), false);
		
		try {
			simpleCellNote.compressData();
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		assertEquals(simpleCellNote.isCompressed(), true);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), true);
		
		simpleCellNote.uncompressData();

		assertEquals(simpleCellNote.isCompressed(), false);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), false);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.db.cellnotes.SimpleCellNote#setCompressed(boolean)}.
	 */
	public void testSetCompressed() {

		assertEquals(simpleCellNote.isCompressed(), false);
		
		simpleCellNote.setCompressed(true);
		assertEquals(simpleCellNote.isCompressed(), true);
		
		simpleCellNote.setCompressed(false);
		assertEquals(simpleCellNote.isCompressed(), false);
		
		
	}

	/**
	 * Test method for {@link com.palladium.paf.db.cellnotes.SimpleCellNote#uncompressData()}.
	 */
	public void testUncompressData() {

		testCompressData();
		assertEquals(simpleCellNote.isCompressed(), true);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), true);
		assertNotNull(simpleCellNote.getSimpleCoordList().getCompressedData());
		
		simpleCellNote.uncompressData();
		
		assertEquals(simpleCellNote.isCompressed(), false);
		assertEquals(simpleCellNote.getSimpleCoordList().isCompressed(), false);
		assertNotNull(simpleCellNote.getSimpleCoordList().getAxis());
		assertNotNull(simpleCellNote.getSimpleCoordList().getCoordinates());
		assertNull(simpleCellNote.getSimpleCoordList().getCompressedData());
		assertEquals(simpleCellNote.getSimpleCoordList().getAxis().length, axis.length);
		
		for (int i = 0; i < axis.length; i++ ) {
			
			assertEquals(simpleCellNote.getSimpleCoordList().getAxis()[i], axis[i]);			
		}
		
		assertEquals(simpleCellNote.getSimpleCoordList().getCoordinates().length, coords.length);
		
		for (int i = 0; i < coords.length; i++ ) {
			
			assertEquals(simpleCellNote.getSimpleCoordList().getCoordinates()[i], coords[i]);
			
		}
		
	}

}
