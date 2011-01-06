/*
 *	File: @(#)PafAxisTest.java 	Package: com.palladium.paf.view 	Project: Paf Base Libraries
 *	Created: Dec 17, 2007  		By: jmilliron
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
package com.palladium.paf.view;

import junit.framework.TestCase;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class PafAxisTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#PafAxis()}.
	 */
	public void testPafAxis() {
		
		PafAxis pafAxis = new PafAxis();
		
		assertNotNull(pafAxis);
		
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#PafAxis(int)}.
	 */
	public void testPafAxisInt() {

		PafAxis pafAxis = new PafAxis(2);
		
		assertNotNull(pafAxis);
		assertEquals(2, pafAxis.getValue());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#getValue()}.
	 */
	public void testGetValue() {
		
		PafAxis pafAxis = new PafAxis(0);
		
		assertNotNull(pafAxis);
		assertEquals(0, pafAxis.getValue());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#setValue(int)}.
	 */
	public void testSetValue() {
		
		PafAxis pafAxis = new PafAxis();
		
		assertNotNull(pafAxis);
		
		pafAxis.setValue(100);
		
		assertEquals(PafAxis.ROW, pafAxis.getValue());
		
		pafAxis.setValue(PafAxis.ROW);
		
		assertEquals(PafAxis.ROW, pafAxis.getValue());
		
		pafAxis.setValue(PafAxis.COL);
		
		assertEquals(PafAxis.COL, pafAxis.getValue());
		
		pafAxis.setValue(PafAxis.PAGE);
		
		assertEquals(PafAxis.PAGE, pafAxis.getValue());
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#getPageAxis()}.
	 */
	public void testGetPageAxis() {
		
		PafAxis pafAxis = new PafAxis();
		
		assertEquals(PafAxis.PAGE, pafAxis.getPageAxis());
		
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#getColAxis()}.
	 */
	public void testGetColAxis() {

		PafAxis pafAxis = new PafAxis();
		
		assertEquals(PafAxis.COL, pafAxis.getColAxis());
	}

	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#getRowAxis()}.
	 */
	public void testGetRowAxis() {
		
		PafAxis pafAxis = new PafAxis();
		
		assertEquals(PafAxis.ROW, pafAxis.getRowAxis());
	}

	
	/**
	 * Test method for {@link com.palladium.paf.view.PafAxis#equals(java.lang.Object)}.
	 */
	public void testEqualsObject() {
	
		PafAxis rowPafAxis = new PafAxis(PafAxis.ROW);
		
		assertEquals(rowPafAxis, new PafAxis(PafAxis.ROW));
		
		PafAxis colPafAxis = new PafAxis(PafAxis.COL);
		
		assertEquals(colPafAxis, new PafAxis(PafAxis.COL));
		
		PafAxis pagePafAxis = new PafAxis(PafAxis.PAGE);
		
		assertEquals(pagePafAxis, new PafAxis(PafAxis.PAGE));
		
		assertEquals(rowPafAxis, PafAxis.ROW);
		assertEquals(colPafAxis, PafAxis.COL);
		assertEquals(pagePafAxis, PafAxis.PAGE);
		
	}

}
