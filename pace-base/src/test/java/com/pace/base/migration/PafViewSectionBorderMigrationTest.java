/*
 *	File: @(#)PafViewSectionBorderMigrationTest.java 	Package: com.pace.base.migration 	Project: Paf Base Libraries
 *	Created: Aug 19, 2009  		By: jmilliron
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
package com.pace.base.migration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.view.PafBorder;
import com.pace.base.view.PafViewSection;
import com.pace.base.view.ViewTuple;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafViewSectionBorderMigrationTest extends MigrationActionTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {

		super.setUp("./test_files/pace1210.paf");
		
	}
	

	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionBorderMigration#PafViewSectionBorderMigration(com.pace.base.project.XMLPaceProject)}.
	 */
	public void testPafViewSectionBorderMigration() {
		
		MigrationAction action = new PafViewSectionBorderMigration(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionBorderMigration#getStatus()}.
	 */
	public void testGetStatus() {
		
		MigrationAction action = new PafViewSectionBorderMigration(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafViewSection> viewSectionList = pp.getViewSections();
		
		for (PafViewSection viewSection : viewSectionList ) {
			
			if ( viewSection.getRowTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getRowTuples()) {
					
					vt.setBorder(null);
					
				}
				
			}
			
			if ( viewSection.getColTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getColTuples()) {
					
					vt.setBorder(null);
					
				}
				
			}
			
		}
		
		pp.setViewSections(viewSectionList);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		
		
	}

	/**
	 * Test method for {@link com.pace.base.migration.PafViewSectionBorderMigration#run()}.
	 */
	public void testRun() {

		MigrationAction action = new PafViewSectionBorderMigration(pp);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		List<PafViewSection> viewSectionList = pp.getViewSections();
		
		Map<ViewTuple, PafBorder> map = new HashMap<ViewTuple, PafBorder>();
		
		for (PafViewSection viewSection : viewSectionList ) {
			
			if ( viewSection.getRowTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getRowTuples()) {
					
					if ( vt.getBorder() != null ) {
						
						map.put(vt, new PafBorder(vt.getBorder().getBorder()));
						
						assertNull(vt.getDataBorder());
					}
					
					
				}
				
			}
			
			if ( viewSection.getColTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getColTuples()) {
					
					if ( vt.getBorder() != null ) {
						
						map.put(vt, new PafBorder(vt.getBorder().getBorder()));
						
						assertNull(vt.getDataBorder());
					}
					
				}
				
			}
			
		}
		
		action.run();
		
		for (PafViewSection viewSection : viewSectionList ) {
			
			if ( viewSection.getRowTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getRowTuples()) {
					
					assertNull(vt.getBorder());
					
					if ( map.containsKey(vt) ) {
						assertNotNull(vt.getDataBorder());
						assertEquals(map.get(vt).getBorder(), vt.getDataBorder().getBorder());
					}
					
					
				}
				
			}
			
			if ( viewSection.getColTuples() != null ) {
				
				for (ViewTuple vt : viewSection.getColTuples()) {
					
					assertNull(vt.getBorder());
					
					if ( map.containsKey(vt) ) {
						assertNotNull(vt.getDataBorder());
						assertEquals(map.get(vt).getBorder(), vt.getDataBorder().getBorder());
					}
					
				}
				
			}
			
		}
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
	}

}
