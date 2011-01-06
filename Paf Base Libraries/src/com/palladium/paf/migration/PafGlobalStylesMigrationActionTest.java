/*
 *	File: @(#)PafGlobalStylesMigrationActionTest.java 	Package: com.palladium.paf.migration 	Project: Paf Base Libraries
 *	Created: Aug 18, 2009  		By: jmilliron
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
package com.palladium.paf.migration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.palladium.paf.view.PafStyle;


/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class PafGlobalStylesMigrationActionTest extends MigrationActionTestCase {

	/**
	 * Test method for {@link com.palladium.paf.migration.PafGlobalStylesMigrationAction#PafGlobalStylesMigrationAction(com.palladium.paf.project.XMLPaceProject)}.
	 */
	public void testPafGlobalStylesMigrationAction() {
		
		MigrationAction action = new PafGlobalStylesMigrationAction(pp);
		
		assertNotNull(action);
		assertNotNull(action.getXMLPaceProject());
		assertEquals(action.getXMLPaceProject(), pp);
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafGlobalStylesMigrationAction#getStatus()}.
	 */
	public void testGetStatus() {
		
		MigrationAction action = new PafGlobalStylesMigrationAction(pp);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		Map<String, PafStyle> globalStyleMap = pp.getGlobalStyles();
		
		assertTrue(globalStyleMap.size() > 0 );
		
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setBgFillColor("bgFillColor");
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setBgFillColor(null);
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setFontColor("fontColor");
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setFontColor(null);
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		

		
	}

	/**
	 * Test method for {@link com.palladium.paf.migration.PafGlobalStylesMigrationAction#run()}.
	 */
	public void testRun() {
				
		PafGlobalStylesMigrationAction action = new PafGlobalStylesMigrationAction(pp);

		Map<String, String> excelColorMap = action.getExcelColorMap();
		
		List<String> keyList = new ArrayList(excelColorMap.keySet());		
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		Map<String, PafStyle> globalStyleMap = pp.getGlobalStyles();
		
		assertTrue(globalStyleMap.size() > 0 );
				
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setBgFillColor("bgFillColor");
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		int ndx = 0;
		
		for (PafStyle style : globalStyleMap.values()) {
		
			if ( ndx < keyList.size() ) {
				
				style.setBgFillColor(keyList.get(0));
								
			} else {
				
				style.setBgFillColor(keyList.get(keyList.size() - 1));
				
			}
			
			style.setBgHexFillColor(null);
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		globalStyleMap = pp.getGlobalStyles();
		
		for (PafStyle style : globalStyleMap.values()) {
		
			assertNull(style.getBgFillColor());
			assertNotNull(style.getBgHexFillColor());
			assertTrue(excelColorMap.containsValue(style.getBgHexFillColor()));			
			
		}		
		
		for (PafStyle style : globalStyleMap.values()) {
			
			style.setFontColor("fontColor");
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		ndx = 0;
		
		for (PafStyle style : globalStyleMap.values()) {
		
			if ( ndx < keyList.size() ) {
				
				style.setFontColor(keyList.get(0));
								
			} else {
				
				style.setFontColor(keyList.get(keyList.size() - 1));
				
			}
			
			style.setFontHexColor(null);
			
		}
		
		pp.setGlobalStyles(globalStyleMap);
		
		assertEquals(MigrationActionStatus.NotStarted, action.getStatus());
		
		action.run();
		
		assertEquals(MigrationActionStatus.Completed, action.getStatus());
		
		globalStyleMap = pp.getGlobalStyles();
		
		for (PafStyle style : globalStyleMap.values()) {
		
			assertNull(style.getFontColor());
			assertNotNull(style.getFontHexColor());
			assertTrue(excelColorMap.containsValue(style.getFontHexColor()));			
			
		}
		
	}

}
